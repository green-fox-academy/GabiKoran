import React from 'react'
// import logo from './logo.svg';
import './App.css'
import Counter from './components/Counter'
import FunctionClick from './components/FunctionClick'
import ClassClick from './components/ClassClick'
import EventBind from './components/EventBind'
// import Greet from './components/Greet'
// import Welcome from './components/Welcome'
// import Hello from './components/Hello'
// import Message from './components/Message'


function App() {
  return (
    <div className="App">
      <EventBind />
      {/* <FunctionClick />
      <ClassClick /> */}
      {/* <Counter /> */}
      {/* <Message></Message> */}
      {/* <Greet name="Bruce" heroName="Batman">
        <p>inner HTML text as children</p>
      </Greet>
      <Greet name="Clark" heroName="Superman">
        <button>Action</button>
      </Greet>
      <Greet name="Diana" heroName="Wonder Woman" />
      <Greet />
      <Welcome name="Bruce" heroName="Batman"></Welcome>
      <Welcome name="Clark" heroName="Superman"></Welcome>
      <Welcome name="Diana" heroName="Wonder Woman"></Welcome> */}
      {/* <Hello /> */}
    </div>
  )
}

export default App;
