function queensAttack(n, k, r_q, c_q, obstacles) {
  const diff = r_q - c_q;
  const sum = r_q + c_q;

  const positionLevel = getPositionLevel(n, r_q, c_q);

  const allAttackableCells = getAllAttackableCells(n, positionLevel);

  let obstructedAttacks = 0;
  if (k != 0) {
    obstructedAttacks = getObstructedAttacks(
      sum,
      diff,
      n,
      k,
      r_q,
      c_q,
      obstacles
    );
  }
  let result = allAttackableCells - obstructedAttacks;
  return result;
}

function getPositionLevel(n, r_q, c_q) {
  let posLevel = n;
  const distances = [r_q, n - r_q + 1, c_q, n - c_q + 1];

  for (let i = 0; i < distances.length; i++) {
    if (distances[i] < posLevel) {
      posLevel = distances[i];
    }
  }
  return posLevel;
}

function getAllAttackableCells(n, positionLevel) {
  return 3 * (n - 1) + (positionLevel - 1) * 2;
}

function getEndLeftTopRow(sum, n) {
  let endLeftTopRow = 0;
  if (sum > n) {
    endLeftTopRow = n;
  } else {
    endLeftTopRow = sum - 1;
  }
  return endLeftTopRow;
}

function getEndLeftBottomRow(diff) {
  let endLeftBottomRow = 0;
  if (diff <= 0) {
    endLeftBottomRow = 1;
  } else {
    endLeftBottomRow = 1 + diff;
  }
  return endLeftBottomRow;
}

function getEndRightTopRow(diff, n) {
  let endRightTopRow = 0;
  if (diff >= 0) {
    endRightTopRow = n;
  } else {
    endRightTopRow = n + diff;
  }
  return endRightTopRow;
}

function getObstructedAttacks(sum, diff, n, k, r_q, c_q, obstacles) {
  const endLeftTopRow = getEndLeftTopRow(sum, n);
  const endRightBottomRow = sum - endLeftTopRow;
  const endLeftBottomRow = getEndLeftBottomRow(diff);
  const endRightTopRow = getEndRightTopRow(diff, n);

  let biggestObstLeftBottomRow = endLeftBottomRow - 1;
  let biggestObstLeftColumn = 0;
  let biggestObstLeftTopRow = endLeftTopRow + 1;
  let biggestObstTopRow = n + 1;
  let biggestObstRightTopRow = endRightTopRow + 1;
  let biggestObstRightColumn = n + 1;
  let biggestObstRightBottomRow = endRightBottomRow - 1;
  let biggestObstBottomRow = 0;

  // obstacles-n végigiterálni
  for (let j = 0; j < k; j++) {
    //ugyanabban a sorban van-e mint a királynő és nagyobb akadály-e, mint a korábbi
    if (obstacles[j][0] == r_q) {
      if (obstacles[j][1] < c_q && obstacles[j][1] > biggestObstLeftColumn) {
        biggestObstLeftColumn = obstacles[j][1];
      } else if (
        obstacles[j][1] > c_q &&
        obstacles[j][1] < biggestObstRightColumn
      ) {
        biggestObstRightColumn = obstacles[j][1];
      }
    }

    // ugyanabban az oszlopban van-e mint a királynő és nagyobb akadály-e, mint a korábbi
    else if (obstacles[j][1] == c_q) {
      if (obstacles[j][0] < r_q && obstacles[j][0] > biggestObstBottomRow) {
        biggestObstBottomRow = obstacles[j][0];
      } else if (obstacles[j][0] > r_q && obstacles[j][0] < biggestObstTopRow) {
        biggestObstTopRow = obstacles[j][0];
      }
    }

    // leftDiagonalban van-e obstacle és nagyobb akadály-e, mint a korábbi
    else if (obstacles[j][0] + obstacles[j][1] == sum) {
      if (obstacles[j][0] > r_q && obstacles[j][0] < biggestObstLeftTopRow) {
        biggestObstLeftTopRow = obstacles[j][0];
      } else if (
        obstacles[j][0] < r_q &&
        obstacles[j][0] > biggestObstRightBottomRow
      ) {
        biggestObstRightBottomRow = obstacles[j][0];
      }
    }
    // rightDiagonalban van-e obstacle és nagyobb akadály-e, mint a korábbi
    else if (obstacles[j][0] - obstacles[j][1] == diff) {
      if (obstacles[j][0] < r_q && obstacles[j][0] > biggestObstLeftBottomRow) {
        biggestObstLeftBottomRow = obstacles[j][0];
      } else if (
        obstacles[j][0] > r_q &&
        obstacles[j][0] < biggestObstRightTopRow
      ) {
        biggestObstRightTopRow = obstacles[j][0];
      }
    }
  }
  const obstV_LB = biggestObstLeftBottomRow - endLeftBottomRow + 1;
  let obstructedAttacks =
    obstV_LB +
    biggestObstLeftColumn +
    (endLeftTopRow - biggestObstLeftTopRow + 1) +
    (n - biggestObstTopRow + 1) +
    (endRightTopRow - biggestObstRightTopRow + 1) +
    (n - biggestObstRightColumn + 1) +
    biggestObstRightBottomRow -
    endRightBottomRow +
    1 +
    biggestObstBottomRow;
  return obstructedAttacks;
}

console.log(queensAttack(4, 0, 4, 4, []));
console.log(queensAttack(8, 1, 4, 6, [[5, 6]]));
console.log(
  queensAttack(5, 5, 4, 3, [
    [5, 5],
    [4, 2],
    [2, 3],
    [5, 2],
    [5, 4],
  ])
);
console.log(
  queensAttack(5, 3, 4, 3, [
    [5, 5],
    [4, 2],
    [2, 3],
  ])
);
console.log(
  queensAttack(100, 100, 48, 81, [
    [54, 87],
    [64, 97],
    [42, 75],
    [32, 65],
    [42, 87],
    [32, 97],
    [54, 75],
    [64, 65],
    [48, 87],
    [48, 75],
    [54, 81],
    [42, 81],
    [45, 17],
    [14, 24],
    [35, 15],
    [95, 64],
    [63, 87],
    [25, 72],
    [71, 38],
    [96, 97],
    [16, 30],
    [60, 34],
    [31, 67],
    [26, 82],
    [20, 93],
    [81, 38],
    [51, 94],
    [75, 41],
    [79, 84],
    [79, 65],
    [76, 80],
    [52, 87],
    [81, 54],
    [89, 52],
    [20, 31],
    [10, 41],
    [32, 73],
    [83, 98],
    [87, 61],
    [82, 52],
    [80, 64],
    [82, 46],
    [49, 21],
    [73, 86],
    [37, 70],
    [43, 12],
    [94, 28],
    [10, 93],
    [52, 25],
    [50, 61],
    [52, 68],
    [52, 23],
    [60, 91],
    [79, 17],
    [93, 82],
    [12, 18],
    [75, 64],
    [69, 69],
    [94, 74],
    [61, 61],
    [46, 57],
    [67, 45],
    [96, 64],
    [83, 89],
    [58, 87],
    [76, 53],
    [79, 21],
    [94, 70],
    [16, 10],
    [50, 82],
    [92, 20],
    [40, 51],
    [49, 28],
    [51, 82],
    [35, 16],
    [15, 86],
    [78, 89],
    [41, 98],
    [70, 46],
    [79, 79],
    [24, 40],
    [91, 13],
    [59, 73],
    [35, 32],
    [40, 31],
    [14, 31],
    [71, 35],
    [96, 18],
    [27, 39],
    [28, 38],
    [41, 36],
    [31, 63],
    [52, 48],
    [81, 25],
    [49, 90],
    [32, 65],
    [25, 45],
    [63, 94],
    [89, 50],
    [43, 41],
  ])
);
