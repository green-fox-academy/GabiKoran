"use strict";
(function () {
  var a = (b = 3);
})();

//a undefined, b = 3

console.log("a defined? " + (typeof a !== "undefined"));
console.log("b defined? " + (typeof b !== "undefined"));
// console.log(a);
console.log(b);
