function diagonlaDifference(arr) {
  let diagonalLeft = 0;
  let diagonalRight = 0;
  let result = 0;
  for (let i = 0; i < arr.length; i++) {
    for (let j = 0; j < arr.length; j++) {
      if (i === j) {
        diagonalLeft += arr[i][j];
      }
      if (j === arr.length - i - 1) {
        diagonalRight += arr[i][j];
      }
    }
  }
  result = diagonalLeft - diagonalRight;
  if (result < 0) {
    result *= -1;
  }
  return result;
}

let arrA = [
  [11, 2, 4],
  [4, 5, 6],
  [10, 8, -12],
];
console.log(diagonlaDifference(arrA));
