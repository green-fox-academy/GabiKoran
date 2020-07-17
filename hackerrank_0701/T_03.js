function getMostCommon(arr) {
  let hashMap = {};
  let sum = 0;

  for (let i = 0; i < arr.length; i++) {
    sum = 0;
    for (let j = 0; j < arr[i].length; j++) {
      sum += arr[i][j];
    }
    if (hashMap[sum] == null) {
      hashMap[sum] = 1;
    } else {
      hashMap[sum]++;
    }
  }

  let mostOftenValue = 0;
  let mostOftenValueEvents = 0;
  let sums = Object.keys(hashMap);
  for (let i = 0; i < sums.length; i++) {
    if (hashMap[sums[i]] > mostOftenValueEvents) {
      mostOftenValueEvents = hashMap[sums[i]];
      mostOftenValue = sums[i];
    }
  }

  return mostOftenValue;
}

arr1 = [
  [1, 2, 5],
  [4, 5, 6],
  [7, 8, 9],
  [3, 4, 1],
];

console.log(getMostCommon(arr1));
