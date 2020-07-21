let hashMap = {};
hashMap[1] = 1;
hashMap[2] = 2;

console.log(hashMap);

hashMap[1] = null;

console.log(hashMap);

hashMap[2] = undefined;

console.log(hashMap);

delete hashMap[2];

console.log(hashMap);

const arrToSort = [-56, 9000, 1, 55, 5, 10, 555, 100, 1000];
console.log(
  arrToSort.sort((a, b) => {
    return a - b;
  })
);
