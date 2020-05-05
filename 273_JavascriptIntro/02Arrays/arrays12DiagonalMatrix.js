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

let size = 4;

let matrixArray = [];

for (let i = 0; i < size; i++) {
    // if (!matrixArray[i]) {
    if (matrixArray[i] == null) {
        matrixArray[i] = [];
    }
    for (let j = 0; j < size; j++) {
        if (i === (size - 1 - j)) {
            matrixArray[i][j] = 1;
        } else {
            matrixArray[i][j] = 0;
        }
    }
}

console.log(matrixArray);