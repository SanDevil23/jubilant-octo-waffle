import {useEffect, useState} from 'react';
import Box from '@mui/material/Box';
import { DataGrid } from '@mui/x-data-grid';

import axios from 'axios';

const columns = [
  { field: 'id', headerName: 'ID', width: 90 },
  {
    field: 'transactionName',
    headerName: 'Transaction',
    width: 150,
    editable: true,
  },
  {
    field: 'category',
    headerName: 'Category',
    width: 150,
    editable: true,
  },
  {
    field: 'amount',
    headerName: 'Amount',
    type: 'number',
    width: 110,
    editable: true,
  },
];

// const rows = axios.get("http://localhost:8080/data");

export default function ExpenseGrid() {
  
  const [rows, setRows] = useState([]);
  
  const getData = async() => {
      const data = await axios.get("http://localhost:8080/data");
      console.log(data.data);


      // Transform the data to match the table's expected column names
      const transformedData = data.data.map(item => ({
        id: item.itid,                                        // Renaming 'itid' to 'id'
        transactionName: item.transactionName,
        category: item.category,
        amount: item.amount                                                    // Map other properties if needed
      }));
      
      setRows(transformedData);
  }

  useEffect(() => {
    getData();
  }, [])
  


  return (
    <Box sx={{ height: 400, width: '100%' }}>
      <DataGrid
        rows={rows}
        columns={columns}
        initialState={{
          pagination: {
            paginationModel: {
              pageSize: 5,
            },
          },
        }}
        pageSizeOptions={[5]}
        checkboxSelection
        disableRowSelectionOnClick
      />
    </Box>
  );
}
