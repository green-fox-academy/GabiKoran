function twoStrings(s1, s2) {
  let result = "NO";
  for (let i = 0; i < s1.length; i++) {
    if (s2.includes(s1.charAt(i))) {
      result = "YES";
    }
  }
  return result;
}

function twoStringsWithMap(s1, s2) {
  let result = "NO";
  let s1Array = s1.split("");
  s1Array.map((char) => {
    if (s2.includes(char)) {
      result = "YES";
    }
  });
  return result;
}

console.log(twoStringsWithMap("hello", "world"));
