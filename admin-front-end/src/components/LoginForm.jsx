import { useState } from "react";
import './css/loginForm.css'

const LoginForm = ()=>{
   
    const [name, setName] = useState("");
    const [password, setPassword] = useState("");


    return (
        <>
        <div className='container'>
            <h1 className='title'>Login</h1>
           <div className='formDiv'>
               <input className="input_name" placeholder="Username" onChange={(e)=>setName(e.target.value)} type="text"/>
               <input className="input_password" placeholder="Password" onChange={(e)=>setPassword(e.target.value)} type="password"/>
           </div>
           <button className="btn_login"> <p className="btn_title">Entrar</p></button>
        </div>
        </>
    )
}


export default LoginForm;