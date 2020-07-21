function getIndexDifference(arr) {
  // console.log(Number.MAX_VALUE);
  // console.log(Number.MAX_SAFE_INTEGER);
  let minimumValue = Number.MAX_SAFE_INTEGER;
  let minimumIndex;
  let maximumValue = Number.MIN_SAFE_INTEGER;
  let maximumIndex;

  for (let i = 0; i < arr.length; i++) {
    if (arr[i] > maximumValue) {
      maximumValue = arr[i];
      maximumIndex = i;
    }
    if (arr[i] < minimumValue) {
      minimumValue = arr[i];
      minimumIndex = i;
    }
  }

  let difference = Math.abs(minimumIndex - maximumIndex);
  return difference;
}

const inputArr = [-567, 231, 12, 987698769, 1, 2];
console.log(getIndexDifference(inputArr));
