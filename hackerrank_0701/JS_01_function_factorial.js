/*
 * Create the function factorial here
 */
var f = [];
function factorial(n) {
  if (n == 0 || n == 1) return 1;
  if (f[n] > 0) return f[n];
  return (f[n] = factorial(n - 1) * n);
}

console.log(factorial(5));

function factorialSimple(n) {
  if (n == 0 || n == 1) return 1;
  let result = 1;
  for (let i = 1; i <= n; i++) {
    result *= i;
  }
  return result;
}

console.log(factorialSimple(4));
