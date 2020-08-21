function queensAttack(n, k, r_q, c_q, obstacles) {
  let result = 0;

  const rowLeftEndpoint = [r_q, 1];
  const rowRightEndpoint = [r_q, n];
  const columnTopEndpoint = [n, c_q];
  const columnBottomEndpoint = [1, c_q];

  const diff = r_q - c_q;
  const sum = r_q + c_q;

  let leftDiagonalTopEndpointRow = 0;
  if (sum > n) {
    leftDiagonalTopEndpointRow = n;
  } else {
    leftDiagonalTopEndpointRow = sum - 1;
  }
  const leftDiagonalBottomEndpointRow = sum - leftDiagonalTopEndpointRow;

  let rightDiagonalLeftEndpointRow = 0;
  if (diff <= 0) {
    rightDiagonalLeftEndpointRow = 1;
  } else {
    rightDiagonalLeftEndpointRow = 1 + diff;
  }

  let rightDiagonalRightEndpointRow = 0;
  if (diff >= 0) {
    rightDiagonalRightEndpointRow = n;
  } else {
    rightDiagonalRightEndpointRow = n + diff;
  }

  let conditionForPosibilities = true;
  let i = 1;

  // result without obstacles
  while (conditionForPosibilities) {
    if (r_q == i || r_q == n - i + 1 || c_q == i || c_q == n - i + 1) {
      result = 3 * (n - 1) + (i - 1) * 2;
      conditionForPosibilities = false;
    }
    i++;
  }
  console.log("the whole posibilities: " + result);

  // köv rész csak, ha vannak obstacles
  if (k != 0) {
    // obstacles-n végigiterálni
    for (let j = 0; j < k; j++) {
      // ugyanabban a sorban van-e mint a királynő
      if (obstacles[j][0] == r_q) {
        if (obstacles[j][1] < c_q) {
          result -= obstacles[j][1];
        } else {
          result -= n - obstacles[j][1] + 1;
        }
        console.log(
          "ugyanabban a sorban: " + result + "\n" + j + ":" + obstacles[j]
        );
      }

      // ugyanabban az oszlopban van-e mint a királynő
      else if (obstacles[j][1] == c_q) {
        if (obstacles[j][0] < r_q) {
          result -= obstacles[j][0];
        } else {
          result -= n - obstacles[j][0] + 1;
        }
      }

      // leftDiagonalban van-e obstacle
      else if (obstacles[j][0] + obstacles[j][1] == sum) {
        if (obstacles[j][0] > r_q) {
          result -= leftDiagonalTopEndpointRow - obstacles[j][0] + 1;
        } else {
          result -= leftDiagonalBottomEndpointRow - obstacles[j][0] + 1;
        }
      }

      // rightDiagonalban van-e obstacle
      else if (obstacles[j][0] - obstacles[j][1] == diff) {
        if (obstacles[j][0] < r_q) {
          result -= obstacles[j][0] - rightDiagonalLeftEndpointRow + 1;
        } else {
          result -= rightDiagonalRightEndpointRow - obstacles[j][0] + 1;
        }
      }
    }
  }
  return result;
}

// console.log(queensAttack(4, 0, 4, 4, []));
// console.log(queensAttack(8, 1, 4, 6, [[5, 6]]));
// console.log(
//   queensAttack(5, 5, 4, 3, [
//     [5, 5],
//     [4, 2],
//     [2, 3],
//     [5, 2],
//     [5, 4],
//   ])
// );
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
