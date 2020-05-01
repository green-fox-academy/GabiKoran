// -  Create (dynamically*) a two dimensional list
//    with the following matrix**. Use a loop!
//
//    0 0 0 1
//    0 0 1 0
//    0 1 0 0
//    1 0 0 0
//
// -  Print this two dimensional list to the console
//
// * size should depend on a variable
// ** Relax, a matrix is just like an array

var size = 4;

var matrixArray = new Array(size);

for (var i = 0; i < size; i++) {
    if (!matrixArray[i]) {
        matrixArray[i] = [];
    }
    for (var j = 0; j < size; j++) {
        if (i === (3 -j)) {
            matrixArray[i][j] = 1;
        } else {
            matrixArray[i][j] = 0;
        }
    }
}

console.log(matrixArray);