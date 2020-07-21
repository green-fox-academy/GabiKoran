// Complete the reverseArray function below.
function reverseArray(a) {
  let resultArr = [];
  const length = a.length;
  for (let i = 0; i < length; i++) {
    resultArr.push(a[length - 1 - i]);
  }
  return resultArr;
}

const arr = [1, 4, 3, 2];
console.log(reverseArray(arr));
