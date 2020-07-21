// function countWorksWithS(s) {
//   let wordsArray = s.split(" ");
//   let countOFWordsWithS = 0;
//   for (let i = 0; i < wordsArray.length; i++) {
//     if (
//       wordsArray[i].charAt(wordsArray[i].length - 1) == "s" ||
//       wordsArray[i].slice(wordsArray[i].length - 2) == "s," ||
//       wordsArray[i].slice(wordsArray[i].length - 2) == "s."
//     ) {
//       countOFWordsWithS++;
//     }
//   }
//   return countOFWordsWithS;
// }

// function countWorksWithS(s) {
//   let wordsArray = s.split(" ");
//   let countOFWordsWithS = 0;
//   for (let i = 0; i < wordsArray.length; i++) {
//     if (
//       wordsArray[i].endsWith("s") ||
//       wordsArray[i].endsWith("s,") ||
//       wordsArray[i].endsWith("s.")
//     ) {
//       countOFWordsWithS++;
//     }
//   }
//   return countOFWordsWithS;
// }

// function countWorksWithS(s) {
//   let stringWithoutSpace = s.replace(/[^a-zA-Z ]/g, "");
//   console.log(stringWithoutSpace);
//   let wordsArray = stringWithoutSpace.split(" ");
//   let countOFWordsWithS = 0;
//   for (let i = 0; i < wordsArray.length; i++) {
//     if (wordsArray[i].endsWith("s")) {
//       countOFWordsWithS++;
//     }
//   }
//   return countOFWordsWithS;
// }

function countWorksWithS(s) {
  let sWithoutPunctuation = s.replace(/[^a-zA-Z ]/g, "");
  let wordsArray = sWithoutPunctuation.split(" ");
  let count = 0;
  for (let i = 0; i < wordsArray.length; i++) {
    if (wordsArray[i].match(/s$/)) {
      count++;
    }
  }
  return count;
}

const input1 = "alas salap kals, iuezr kalas. hamas, lkjhljhs";
console.log(countWorksWithS(input1));
