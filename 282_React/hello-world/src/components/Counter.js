import React, { Component } from 'react'

class Counter extends Component {

    constructor(props) {
        super(props)

        this.state = {
            count: 0
        }
    }

    increment() {
        this.setState(
            {
                // hogy egyforma érték legyen az UI-ben és a console-ban is, 
                // betesszük callback functionként a consloe.log-ot
                // a setState methodba
                count: this.state.count + 1
            },
            () => {
                console.log('Callback value', this.state.count)
                // így már együtt változik az érték az UI-ben kirenderelttel
            }
        )
        console.log(this.state.count)
        // ebben az esetben 1-gyel kisebb a valósnál az érték,
        // mert ezt előbb hajtja végre, mint hogy növelné a setState-tel
        // asynchronous
    }

    render() {
        return (
            <div>
                <div>
                    count - {this.state.count}
                </div>
                <button onClick={() => this.increment()}>
                    Increment
                </button>
            </div>

        )
    }
}

export default Counter
