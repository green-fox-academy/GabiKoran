function jumpingOnClouds(c) {
  let result = c.length - 1;
  for (let i = 0; i < c.length - 1; i++) {
    if (c[i] == 1) {
      result--;
    } else if (
      i < c.length - 2 &&
      c[i] == 0 &&
      c[i + 1] == 0 &&
      c[i + 2] == 0
    ) {
      result--;
      i++;
    }
  }
  return result;
}

const c1 = [0, 1, 0, 0, 0, 1, 0];
console.log(jumpingOnClouds(c1));
const c2 = [0, 0, 0, 0, 1, 0];
console.log(jumpingOnClouds(c2));
const c3 = [0, 0, 0, 0, 1, 0, 0, 0, 1, 0];
console.log(jumpingOnClouds(c3));
const c4 = [
  0,
  1,
  0,
  0,
  0,
  0,
  0,
  1,
  0,
  1,
  0,
  0,
  0,
  1,
  0,
  0,
  1,
  0,
  1,
  0,
  0,
  0,
  0,
  1,
  0,
  0,
  1,
  0,
  0,
  1,
  0,
  1,
  0,
  1,
  0,
  1,
  0,
  0,
  0,
  1,
  0,
  1,
  0,
  0,
  0,
  1,
  0,
  1,
  0,
  1,
  0,
  0,
  0,
  1,
  0,
  1,
  0,
  0,
  0,
  1,
  0,
  1,
  0,
  0,
  0,
  1,
  0,
  0,
  1,
  0,
  1,
  0,
  1,
  0,
  1,
  0,
  1,
  0,
  1,
  0,
  1,
  0,
  0,
  1,
  0,
  1,
  0,
  1,
  0,
  1,
  0,
  0,
  0,
  0,
  0,
  0,
  1,
  0,
  0,
  0,
];
console.log(jumpingOnClouds(c4));
