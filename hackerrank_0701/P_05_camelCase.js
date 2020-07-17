function camelcase(s) {
  let numberOfWords = 1;

  for (let i = 0; i < s.length; i++) {
    if (isUpperCase(s.charAt(i))) {
      numberOfWords++;
    }
  }

  return numberOfWords;
}

function isUpperCase(ch) {
  return ch >= "A" && ch <= "Z";
}

console.log(camelcase("camelCase"));
