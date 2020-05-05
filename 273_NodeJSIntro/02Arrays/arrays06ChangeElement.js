// -  Create an array named `numbers` with the following content: `[1, 2, 3, 8, 5, 6]`
// -  Change the 8 to 4 with the `.map` method
// -  Print the fourth element as a test

var numbers = [1, 2, 3, 8, 5, 6];

var numbers2 = numbers.map(function(i){
    if (i === 8){
        return 4;
    } else {
        return i;
    }
});

numbers = numbers2;

console.log(numbers[3]);

numbers.forEach(function(i){
    console.log(i);
});