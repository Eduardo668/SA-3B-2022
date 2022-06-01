import './App.css';
import {useState} from 'react';
import LoginForm from './components/LoginForm'

const API_URL = 'http://localhost:8080/admin/login';

function App() {

  const [accountVerify, setAccountVerify] = useState("");

  const verifyAccountExists = async (name, password)=>{
     
      const adminUser = {
        "admUsername": name,
        "password": password
      }

      const response = await fetch(API_URL, {
        method: "POST",
        headers:{'Content-Type': 'application/json'},
        body: JSON.stringify(adminUser)
      })
      
      const verifyAdmin  = await response.json();

      setAccountVerify(verifyAdmin );

      console.log(verifyAdmin)

      if (verifyAdmin  == false){
        alert("Username or password wrong, Try again!")
      }
      else {
        const adminAccontStorage = localStorage
      }
     
  }
  
  return (
  <>
    {
      !accountVerify ? ( <LoginForm verifyAccount={verifyAccountExists} />):
      (
        <>
             <h1>Test</h1>       
        </>
      )
    }
  
  </>
  )
}

export default App;
