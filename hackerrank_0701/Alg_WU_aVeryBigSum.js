function aVeryBigSum(ar) {
  return ar.reduce((sum, current) => {
    sum += current;
    return sum;
  }, 0);
}
