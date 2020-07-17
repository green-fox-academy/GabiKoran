function checkMagazineIfWordsExist(magazine, note) {
  let result = "Yes";
  // ha kevesebb szó van, már tudjuk, hogy NO
  if (magazine.length < note.length) {
    result = "No";
  } else {
    // végig iterálunk a note-on
    for (let i = 0; i < note.length; i++) {
      // és ha bármelyik szót nem tartlamazza, akkor szintén NO
      if (!magazine.includes(note[i])) {
        result = "No";
      }
    }
    // minden más esetben marad a YES
  }
  console.log(result);
}

///////////////////////////////////////////
function checkMagazine(magazine, note) {
  let result = "Yes";

  // ha kevesebb szó van, már tudjuk, hogy NO
  if (magazine.length < note.length) {
    result = "No";
  } else {
    // csinálunk egy hashMap-et a note szavaiból
    let noteWordsHashMap = {};
    for (let i = 0; i < note.length; i++) {
      if (noteWordsHashMap[note[i]] == null) {
        noteWordsHashMap[note[i]] = 1;
      } else {
        noteWordsHashMap[note[i]]++;
      }
    }

    // csinálunk egy hashMap-et a magazine szavaiból
    let magazineWordsHashMap = {};
    for (let i = 0; i < magazine.length; i++) {
      if (magazineWordsHashMap[magazine[i]] == null) {
        magazineWordsHashMap[magazine[i]] = 1;
      } else {
        magazineWordsHashMap[magazine[i]]++;
      }
    }

    // menjünk végig a noteHashMap fieldjein,
    let noteKeys = Object.keys(noteWordsHashMap);
    for (let i = 0; i < noteKeys.length; i++) {
      // ha nincs ilyen filedje a magazine-nak, akkor eleve NO
      if (magazineWordsHashMap[noteKeys[i]] == null) {
        result = "No";
      } else if (
        // ha pedig kevesebbet tartalmaz belőle, szintén NO
        magazineWordsHashMap[noteKeys[i]] < noteWordsHashMap[noteKeys[i]]
      ) {
        result = "No";
      }
    }
  }

  // nyomtassuk ki a végeredményt
  console.log(result);
}

// Yes
let magazine1 = ["Give", "me", "one", "grand", "today", "night"];
let note1 = ["Give", "one", "grand", "today"];
// No
let magazine2 = ["no", "but", "yes"];
// No
let magazine3 = ["two", "times", "three", "is", "not", "four"];
let note3 = ["two", "times", "two", "is", "four"];

// checkMagazine(magazine1, note1);
// checkMagazine(magazine2, note1);
checkMagazine(magazine3, note3);
