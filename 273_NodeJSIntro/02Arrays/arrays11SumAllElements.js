// - Create a variable named `numbers`
//   with the following content: `[54, 23, 66, 12]`
// - Print the sum of the elements

let numbers = [54, 23, 66, 12];

function getSum(array){
    let sum = 0;    
   for (let index = 0; index < array.length; index++) {
       sum += array[index];
   }
    return sum;
}

function getSumWithForEach(array){
    let sum = 0;
    array.forEach(function(i) {
        sum += i;
    })
    return sum;
}

let sumWithReduce = numbers.reduce(function(sum,current){
    sum += current;
    return sum;
},0);

console.log(getSum(numbers));
console.log(getSumWithForEach(numbers));
console.log(sumWithReduce);

