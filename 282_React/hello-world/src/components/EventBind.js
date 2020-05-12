import React, { Component } from 'react'

class EventBind extends Component {

    constructor(props) {
        super(props)
    
        this.state = {
             message: 'Hello'
        }

        // this.clickHandler = this.clickHandler.bind(this)
    }

    // clickHandler(){ // verzió 1, 2, 3
    //     this.setState({
    //         message: 'Good buy!'
    //     })
    //     // console.log(this)
    // }
    
    clickHandler = () => { // verzió 4.
        this.setState({
            message: 'Good buy!'
        })
        // console.log(this)
    }

    render() {
        return (
            <div>
                <div>{this.state.message}</div>
               {/* <button onClick={() => this.clickHandler()}>Click</button> */} {/* verzió 2. */}
               {/* <button onClick={this.clickHandler.bind(this)}>Click</button>  */} {/* verzió 1. */}
               <button onClick={this.clickHandler}>Click</button>  {/* verzió 3. és 4. */}
            </div>
        )
    }
}

export default EventBind
