import React from 'react';
// import logo from './logo.svg';
import './App.css';
import Greet from './components/Greet'
import Welcome from './components/Welcome'
// import Hello from './components/Hello'

function App() {
  return (
    <div className="App">
      <Greet name="Bruce" heroName="Batman">
        <p>inner HTML text as children</p>
      </Greet>
      <Greet name="Clark" heroName="Superman">
        <button>Action</button>
      </Greet>
      <Greet name="Diana" heroName="Wonder Woman" />
      <Greet />
      <Welcome name="Bruce" heroName="Batman"></Welcome>
      <Welcome name="Clark" heroName="Superman"></Welcome>
      <Welcome name="Diana" heroName="Wonder Woman"></Welcome>
      {/* <Hello /> */}
    </div>
  );
}

export default App;
