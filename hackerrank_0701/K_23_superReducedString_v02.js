function superReducedString(s) {
  let previousLength = s.length;
  let currentLength = 0;
  while (previousLength !== currentLength) {
    previousLength = s.length;
    for (let i = 0; i < s.length; i++) {
      if (s.charAt(i) == s.charAt(i + 1)) {
        if (i === 0) {
          s = s.slice(2);
        } else {
          s = s.slice(0, i).concat(s.slice(i + 2));
        }
        i--;
      }
      currentLength = s.length;
      // console.log(previousLength + " " + currentLength);
    }
  }

  if (s == "") {
    s = "Empty String";
  }
  return s;
}

console.log(superReducedString("aababcdaeefffd"));
console.log(
  superReducedString(
    "zztqooauhujtmxnsbzpykwlvpfyqijvdhuhiroodmuxiobyvwwxupqwydkpeebxmfvxhgicuzdealkgxlfmjiucasokrdznmtlwh"
  )
);

console.log(
  superReducedString(
    "zztqooauhujtmxnsbzpykwlvpfyqijvdhuhiroodmuxiobyvwwxupqwydkpeebxmfvxhgicuzdealkgxlfmjiucasokrdznmtlwh"
  ) ==
    "tqauhujtmxnsbzpykwlvpfyqijvdhuhirdmuxiobyvxupqwydkpbxmfvxhgicuzdealkgxlfmjiucasokrdznmtlwh"
);
