import { useState, useEffect } from 'react'
import heroImg from './assets/hero.png'
import reactLogo from './assets/react.svg'
import viteLogo from './assets/vite.svg'
import './App.css'

function App() {
  const [results, setResults] = useState(0);
  useEffect(() => {

  })

   const tothelogic = async() =>{

      const response = await fetch('http://localhost:8080/hitthelogic',{
      method: "POST",
      headers:{
        "Content-Type": "application/json"
      },
      body: JSON.stringify({
        pointTotal: document.getElementById('pointTotal').value})

      });
      
      
      const data = await response.json();      //const data = await response.json();

      console.log(data);

      setResults(data);
  };

  return (
    <>
    <div>
      <h1>Enter the point total (of one team):</h1>
      <input type="text" placeholder='Point Total' id="pointTotal"/>
      <button onClick={tothelogic}>Calculate</button>
    </div>

    <h2>{results[results.length - 1]}</h2>
     
    </>
  )
}

export default App
