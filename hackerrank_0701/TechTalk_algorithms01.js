// O(n)
function initArray(n) {
  return new Array(n).fill(0);
}

function executeQueries(array, queries) {
  for (let i = 0; i < queries.length; i++) {
    for (let j = queries[i][0] - 1; j < queries[i][1]; j++) {
      array[j] += queries[i][2];
    }
  }
  return array;
}

// O(n)
function findMax(array) {
  return array.reduce((max, e) => (e > max ? e : max), 0);
}
// O(n))
function findMaxver2(array) {
  let max = 0;
  for (let i = 0; i < array.length; i++) {
    if (array[i] > max) {
      max = array[i];
    }
  }
  return max;
}
// O(nlogn)
function findMaxver1(array) {
  return array.sort((a, b) => b - a)[0];
}

function manipulateArrey(n, queries) {
  const array = initArray(n);
  const sumArray = executeQueries(array, queries);
  const max = findMax(sumArray);
  return max;
}

const n = 10;
const queries = [
  [1, 5, 3],
  [4, 8, 7],
  [6, 9, 1],
  [5, 10, 2],
];
console.log(manipulateArrey(n, queries));
