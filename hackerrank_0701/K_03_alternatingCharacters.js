function alternatingCharacters(s) {
  let deletions = 0;
  for (let i = 0; i < s.length - 1; i++) {
    if (s.charAt(i) == s.charAt(i + 1)) {
      deletions++;
    }
  }
  return deletions;
}

console.log(alternatingCharacters("AABBBABABAAA"));

let text = "     d f g d f g       ";
console.log(text.trim());
