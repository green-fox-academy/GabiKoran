function gemstones(arr) {
  // megkeresem a legkevesebb ásványt tartalmazó követ
  let mineralLength = 100;
  let simpliestStone = "";
  for (let i = 0; i < arr.length; i++) {
    if (arr[i].length < mineralLength) {
      mineralLength = arr[i].length;
      simpliestStone = arr[i];
    }
  }

  // kirakom hashmapba a köveket,a miket a legrövidebb tartalmaz
  let mineralsHashMap = {};
  for (let i = 0; i < simpliestStone.length; i++) {
    if (mineralsHashMap[simpliestStone[i]] == null) {
      mineralsHashMap[simpliestStone[i]] = 0;
    }
  }

  // végigiterálok az összes kövön,
  // ha van neki, növelek egyet a hozzá tartozó értéken, de csak 1*
  let mineralsArray = Object.keys(mineralsHashMap);
  for (let i = 0; i < arr.length; i++) {
    for (let j = 0; j < mineralsArray.length; j++) {
      if (arr[i].includes(mineralsArray[j])) {
        mineralsHashMap[mineralsArray[j]]++;
      }
    }
  }
  console.log(simpliestStone);
  console.log(mineralsHashMap);

  //ki kell gyűjteni azokat az elemeket, amikhez az arr.length szám tartozik
  // mert az szerepel mindegyikben
  // egészen pontosan összeadni őket
  let gemstonesNum = 0;
  for (let i = 0; i < mineralsArray.length; i++) {
    if (mineralsHashMap[mineralsArray[i]] == arr.length) {
      gemstonesNum++;
    }
  }

  return gemstonesNum;
}

const stones1 = ["abcdde", "baccd", "eeabg"];

console.log(gemstones(stones1));
