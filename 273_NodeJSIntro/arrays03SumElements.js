// - Create a variable named `numbers`
//   with the following content: `[54, 23, 66, 12]`
// - Print the sum of the second and the third element

var numbers = [54, 23, 66, 12];

function getSum(array){
    let sum = 0;    
   for (let index = 0; index < array.length; index++) {
       sum += array[index];
   }
    return sum;
}

function getSumWithForEach(array){
    var sum = 0;
    array.forEach(function(i) {
        sum += i;
    })
    return sum;
}

var sumWithReduce = numbers.reduce(function(prev,next){
    prev += next;
    return prev;
},0);

console.log(getSum(numbers));
console.log(getSumWithForEach(numbers));
console.log(sumWithReduce);

