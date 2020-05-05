// -  Create an array variable named `animals`
//    with the following content: `["koal", "pand", "zebr"]`
// -  Add all elements an `"a"` at the end

let animals = ["koal", "pand", "zebr"];

animals.map(function(animal) {
    console.log(`${animal}a`);
});

let animals2 = animals.map(function(a){
    return `${a}a`;
});
console.log(animals2);

let animals3 = animals.map(function(a){
    return a += 'ák';
});
console.log(animals3);