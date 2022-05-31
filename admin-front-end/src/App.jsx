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
      
       const verify  = await response.json();

      setAccountVerify(verify);
      console.log(verify)
      if (verify == false){
        alert("Username or password wrong, Try again!")
      }
     
  }
  
  return (
  <>
   <LoginForm verifyAccount={verifyAccountExists} />
  </>
  )
}

export default App;
