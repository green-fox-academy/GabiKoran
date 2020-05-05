import React from 'react'

const Hello = () => {
    //WITH JSX:
    // return (
    //     <div>
    //         <h1>Hello Gabi</h1>
    //     </div>
    // )
    
    //WITHOUT JSX:
    return React.createElement(
        'div', 
        null, 
        React.createElement('h1', null, 'Hello Gabi'))
}

export default Hello