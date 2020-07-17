function correct(s) {
  console.log(s);
  for (let i = 0; i < s.length; i++) {
    if (s.charAt(i) == "-") {
      if (s.charAt(i - 1) != " ") {
        s = s.slice(0, i) + " " + s.slice(i);
        i++;
      }
      if (s.charAt(i + 1) != " ") {
        console.log(s);
        s = s.slice(0, i + 1) + " " + s.slice(i + 1);
        console.log(s);
      }
    }
    // ha 0. character -
  }
  return s;
}

// console.log(correct("itt nem volt- itt volt"));

exports.data = correct();
