// -  Create a variable named `names` with the following content:
//   `["Arthur", "Boe", "Chloe"]`
// -  Swap the first and the third element of `names`

let names = ["Arthur", "Boe", "Chloe"];

let tempItem = names[0];

names[0] = names[2];
names[2] = tempItem;

console.log(names);