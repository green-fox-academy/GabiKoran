import React, { Component } from "react";

class ConditionalRendering extends Component {
  constructor(props) {
    super(props);

    this.state = {
      isLoggedIn: false,
    };
  }

  render() {
    // aproach 4:
    return this.state.isLoggedIn && <div>Welcome Vishwas</div>;

    // aproach 3:
    // return this.state.isLoggedIn ? (
    //   <div>Welcome Vishwas</div>
    // ) : (
    //   <div>Welcome Guest</div>
    // );

    // aproach 2:
    // let message;
    // if (this.state.isLoggedIn) {
    //   message = <div>Welcome Vishwas</div>;
    // } else {
    //   message = <div>Welcome Guest</div>;
    // }
    // return <div>{message}</div>;

    // aproach 1:
    // if (this.state.isLoggedIn) {
    //   return <div>Welcome Vishwas</div>;
    // } else {
    //   return <div>Welcome Guest</div>;
    // }
  }
}

export default ConditionalRendering;
