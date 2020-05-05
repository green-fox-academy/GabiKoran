// -  Create an array variable named `animals`
//    with the following content: `["koal", "pand", "zebr"]`
// -  Add all elements an `"a"` at the end

var animals = ["koal", "pand", "zebr"];

animals.map(function(animal) {
    console.log(`${animal}a`);
});

var animals2 = animals.map(function(a){
    return `${a}a`;
});
console.log(animals2);

var animals3 = animals.map(function(a){
    return a += 'ák';
});
console.log(animals3);