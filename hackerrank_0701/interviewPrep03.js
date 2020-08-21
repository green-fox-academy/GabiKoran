var callbacks = [];
for (var i = 0; i < 5; ++i) {
  callbacks.push(function () {
    console.log(i);
  });
  console.log(callbacks);
}
callbacks[3]();
