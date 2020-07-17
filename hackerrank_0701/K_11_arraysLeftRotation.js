function rotLeft(a, d) {
  let rotatedArr = [];
  for (let i = 0; i < a.length; i++) {
    rotatedArr.push(a[(i + d) % a.length]);
  }
  return rotatedArr;
}

console.log(rotLeft([1, 2, 3, 4, 5], 3));
