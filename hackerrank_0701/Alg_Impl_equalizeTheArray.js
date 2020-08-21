function equalizeArray(arr) {
  let arrLength = arr.length;

  // create a hashMap
  let countElements = {};

  // create a new variable - mostCommon item
  let mostCommonValue = 0;

  // count the elements
  for (let i = 0; i < arrLength; i++) {
    if (countElements[arr[i]] == null) {
      countElements[arr[i]] = 1;
    } else {
      countElements[arr[i]]++;
    }
    if (mostCommonValue < countElements[arr[i]]) {
      mostCommonValue = countElements[arr[i]];
    }
  }

  // result = length - mostCommonValue;
  let result = arrLength - mostCommonValue;
  return result;
}

const arr1 = [3, 3, 2, 1, 3];
console.log(equalizeArray(arr1));
