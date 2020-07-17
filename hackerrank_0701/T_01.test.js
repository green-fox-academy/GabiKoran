const correct = require("./T_01.js");

test("correct should insert a space", () => {
  const input = "itt nem volt- itt volt";

  const result = correct(input);

  expect(result).toEqual("itt nem volt - itt volt");
});
