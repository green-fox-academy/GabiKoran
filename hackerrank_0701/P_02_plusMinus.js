function plusMinus(arr) {
  let positive = 0;
  let negative = 0;
  let zeros = 0;

  for (let i = 0; i < arr.length; i++) {
    if (arr[i] > 0) {
      positive++;
    } else if (arr[i] < 0) {
      negative++;
    } else {
      zeros++;
    }
  }

  function round(num) {
    let result = Math.round(num * 1000000) / 1000000;
    return result.toFixed(6);
  }

  console.log(round(positive / arr.length));
  console.log(round(negative / arr.length));
  console.log(round(zeros / arr.length));
}

plusMinus([1, 2, 3, -1, -2, -3, 0, 0]);
