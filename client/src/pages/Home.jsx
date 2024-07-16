import React from 'react'
// import AppBar from '../components/AppBar'
import TopBar from '../components/TopBar'
import ExpenseGrid from '../components/ExpenseGrid'

const Home = () => {
  return (
    <div>
        {/* topbar */}
        <TopBar/>
        <div>
          <h1>Home - Expense Tracker</h1>

        </div>

        <ExpenseGrid/>
    </div>
  )
}

export default Home
