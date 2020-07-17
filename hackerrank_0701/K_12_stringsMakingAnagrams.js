function makeAnagram(a, b) {
  const hashMap = {};

  for (let i = 0; i < a.length; i++) {
    if (hashMap[a.charAt(i)] == null) {
      hashMap[a.charAt(i)] = 1;
    } else {
      hashMap[a.charAt(i)]++;
    }
  }

  for (let i = 0; i < b.length; i++) {
    if (hashMap[b.charAt(i)] == null) {
      hashMap[b.charAt(i)] = -1;
    } else {
      hashMap[b.charAt(i)]--;
    }
  }

  let values = [];
  values = Object.values(hashMap);

  let sum = values.reduce(function (sum, current) {
    sum += Math.abs(current);
    return sum;
  }, 0);

  return sum;
}

console.log(makeAnagram("aaaa", "aaaabbbbb"));
