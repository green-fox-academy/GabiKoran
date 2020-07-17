function countingValleys(n, s) {
  let altitude = 0;
  let previousAltitude = 0;
  let valleys = 0;
  for (let i = 0; i < n; i++) {
    if (s.charAt(i) === "D") {
      previousAltitude = altitude;
      altitude--;
    } else {
      previousAltitude = altitude;
      altitude++;
    }
    if (previousAltitude == -1 && altitude == 0) {
      valleys++;
    }
  }
  return valleys;
}

let land1 = "DDDDUDUDUDUUUU";
console.log(countingValleys(land1.length, land1));
