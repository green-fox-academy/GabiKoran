var bar = null;
console.log(typeof bar === "object"); // logs true!

bar = 5;
console.log(typeof bar === "object");

bar = { 4: 2, 5: 1 };
console.log(typeof bar === "object");

bar = 4;
console.log(typeof bar === "object");

bar = [1, 3, 5, 8];
console.log(typeof bar === "object");
console.log(
  bar !== null &&
    typeof bar === "object" &&
    toString.call(bar) !== "[object Array]"
);
// or with jQuery
// console.log(bar !== null && typeof bar === "object" && !$.isArray(bar));

// ez még egy jól működő verzió:
// hogy false-t ad null-ra, array-re, function-re, és csak az objectre ad true-t
console.log(bar !== null && bar.constructor === Object);

bar = null;
console.log(bar !== null && typeof bar === "object"); // logs false
