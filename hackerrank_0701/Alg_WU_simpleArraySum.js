function simpleArraySum(arr) {
  return arr.reduce((sum, current) => {
    sum += current;
    return sum;
  }, 0);
}

console.log(simpleArraySum([1, 2, 3, 4, 10, 11]));
