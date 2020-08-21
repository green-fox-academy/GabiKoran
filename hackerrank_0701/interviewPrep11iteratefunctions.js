for (var i = 0; i < 5; ++i) {
  setTimeout(function () {
    console.log(i);
  }, 100);
}

var callbacks = [];
for (var i = 0; i < 5; ++i) {
  callbacks.push(function () {
    console.log(i);
  });
}
callbacks[3]();

callbacks[4]();
