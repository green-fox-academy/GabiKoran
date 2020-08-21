function queensAttack(n, k, r_q, c_q, obstacles) {
  let conditionForPosibilities = true;
  let i = 1;
  let result = 0;

  // result without obstacles
  while (conditionForPosibilities) {
    if (r_q == i || r_q == n - i + 1 || c_q == i || c_q == n - i + 1) {
      result = 3 * (n - 1) + (i - 1) * 2;
      conditionForPosibilities = false;
    }
    i++;
  }
  console.log("the whole posibilities: " + result);

  // végigiterálni az obstacle-ökön és csökkenteni a result-ot ez alapján
  let conditionForObstacles = true;

  for (let j = 0; j < k; j++) {
    // ugyanabban a sorban van-e obstacle
    let l = 1;
    if (obstacles[j][0] == r_q) {
      while (conditionForObstacles) {
        if (obstacles[j][1] == l || obstacles[j][1] == n - l + 1) {
          result -= l;
          conditionForObstacles = false;
        }
        l++;
      }
    }
    console.log("minus same row's possibilities: " + result);
    // ugyanabban a oszlopban van-e obstacle
    let m = 1;
    if (obstacles[j][1] == c_q) {
      let conditions3 = true;
      while (conditions3) {
        if (obstacles[j][0] == m || obstacles[j][0] == n - m + 1) {
          result -= m;
          conditions3 = false;
        }
        m++;
      }
    }
    console.log("minus same column's possibilities: " + result);
    // az egyik átlóban van-e:

    // a másik átlóban van-e
  }

  return result;
}

console.log(queensAttack(4, 0, 4, 4, []));
console.log(queensAttack(8, 1, 4, 6, [[5, 6]]));
console.log(
  queensAttack(5, 3, 4, 3, [
    [5, 5],
    [4, 2],
    [2, 3],
  ])
); // 8-at ad, pedig 10 a helyes megoldás
