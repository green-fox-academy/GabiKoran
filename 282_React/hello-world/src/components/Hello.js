import React from 'react'

const Hello = () => {
    //WITH JSX:
    // return (
    //     <div className='dummyClass'>
    //         <h1>Hello Gabi</h1>
    //     </div>
    // )

    //WITHOUT JSX:
    return React.createElement(
        'div', 
        {id: 'hello', className: 'dummyClass'}, 
        React.createElement('h1', null, 'Hello Gabi'))
}

export default Hello