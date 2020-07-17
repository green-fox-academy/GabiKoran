function miniMaxSum(arr) {
  let sortedArr = arr.sort(function (a, b) {
    return a - b;
  });

  let minimumSum = 0;
  let maximumSum = 0;

  for (let i = 0; i < arr.length - 1; i++) {
    minimumSum += sortedArr[i];
    maximumSum += sortedArr[i + 1];
  }

  return minimumSum + " " + maximumSum;
}

const arr1 = [1, 2, 3, 4, 5];
const arr2 = [5, 8, 10, 1, 2];

console.log(miniMaxSum(arr1));
console.log(miniMaxSum(arr2));
