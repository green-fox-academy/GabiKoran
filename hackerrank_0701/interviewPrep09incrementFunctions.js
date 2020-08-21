let number = 5;

function increment(n) {
  n++;
}

increment(number);

console.log(number);

let person = { age: 5 };

function incrementAge(person) {
  person.age++;
}

incrementAge(person);

console.log(person.age);

let arr = ["str"];
arr[123] = false;

console.log(arr.length);
console.log(arr);
console.log(arr[123]);
