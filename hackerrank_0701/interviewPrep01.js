var a = 2,
  b = { c: 4 };
var x = a,
  y = b;
//x = 2 primitive
//y = b = { c: 4 }
x = 5;
// x = 5 primitive
y.c = 6;
//y = b = { c: 6}

console.log(a + b.c);
//2 + 6 = 8
