function putUniqueElementsOfArrayToArray(arr1, arr2, uniqueArray) {
  for (let i = 0; i < arr1.length; i++) {
    if (!arr2.includes(arr1[i])) {
      uniqueArray.push(arr1[i]);
    }
  }
  return uniqueArray;
}

function differenceCounter(arr1, arr2) {
  let uniqueArray = [];

  uniqueArray = putUniqueElementsOfArrayToArray(arr1, arr2, uniqueArray);
  uniqueArray = putUniqueElementsOfArrayToArray(arr2, arr1, uniqueArray);

  return uniqueArray;
}

const array1 = [1, 2, 3, 4];
const array2 = [3, 4, 5, 6, 7, 8];
console.log(differenceCounter(array1, array2));
