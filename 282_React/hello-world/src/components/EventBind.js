import React, { Component } from 'react'

class EventBind extends Component {

    constructor(props) {
        super(props)
    
        this.state = {
             message: 'Hello'
        }
    }
    
    clickHandler() {
        this.setState({
            message: 'Good buy!'
        })
        // console.log(this)
    }

    render() {
        return (
            <div>
                <div>{this.state.message}</div>
               <button onClick={() => this.clickHandler()}>Click</button>
               {/* <button onClick={this.clickHandler.bind(this)}>Click</button>  */}
            </div>
        )
    }
}

export default EventBind
