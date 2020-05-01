// -  Create a variable named `names` with the following content:
//   `["Arthur", "Boe", "Chloe"]`
// -  Swap the first and the third element of `names`

var names = ["Arthur", "Boe", "Chloe"];

var tempItem = names[0];

names[0] = names[2];
names[2] = tempItem;

console.log(names);