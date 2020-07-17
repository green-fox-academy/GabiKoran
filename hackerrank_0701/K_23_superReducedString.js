function superReducedString(s) {
  let result = "";

  // hashMap az input string charactereinek
  let sHashMap = {};
  for (let i = 0; i < s.length; i++) {
    if (sHashMap[s.charAt(i)] == null) {
      sHashMap[s.charAt(i)] = 1;
    } else {
      sHashMap[s.charAt(i)]++;
    }
  }
  // console.log(sHashMap);

  // hashMap value-it kicserélem - %2-re, hogy mennyit törölhetünk
  let characters = Object.keys(sHashMap);
  for (let i = 0; i < characters.length; i++) {
    sHashMap[characters[i]] -= sHashMap[characters[i]] % 2;
  }
  // console.log(sHashMap);

  // végigiterálok a 2. hashMap-en
  //    azon belül pedig while-lal a stringen
  //    az elejétől addig, ameddig törölhetem az adott charactert
  let currentAmount = 0;
  let currentChar = 0;

  // végigiterálok a hashmap-en, hogy milyen betűből hányat akarok törölni
  for (let i = 0; i < characters.length; i++) {
    currentAmount = sHashMap[characters[i]];
    currentChar = characters[i];

    if (currentAmount !== 0) {
      // annyiszor iterálok, ahányat törölni szeretnék
      // console.log(currentAmount);
      // console.log(currentChar);
      for (let j = 0; j < currentAmount; j++) {
        s = s.replace(currentChar, "");
      }
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
