function differenceCounter(arr1, arr2) {
  let uniqueArray = [];

  for (let i = 0; i < arr1.length; i++) {
    if (!arr2.includes(arr1[i])) {
      uniqueArray.push(arr1[i]);
    }
  }

  for (let i = 0; i < arr2.length; i++) {
    if (!arr1.includes(arr2[i])) {
      uniqueArray.push(arr2[i]);
    }
  }

  return uniqueArray;
}

const array1 = [1, 2, 3, 4];
const array2 = [3, 4, 5, 6, 7, 8];
console.log(differenceCounter(array1, array2));
