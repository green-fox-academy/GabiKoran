function repeatedString(s, n) {
  let sLength = s.length;
  let remainder = n % sLength;
  let quotient = Math.floor(n / sLength);
  let aCounter = 0;
  let aCounterInRemainder = 0;
  for (let i = 0; i < s.length; i++) {
    if (s[i] == "a") {
      if (i < remainder) {
        aCounterInRemainder++;
      }
      aCounter++;
    }
  }
  let result = 0;
  result = quotient * aCounter + aCounterInRemainder;
  return result;
}

const s1 = "aba";
const n1 = 10;
console.log(repeatedString(s1, n1));

const s2 = "a";
const n2 = 1000000000000;
console.log(repeatedString(s2, n2));
