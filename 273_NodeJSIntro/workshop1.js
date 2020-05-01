'use strict';

let triangle = "";
let asterisk = "*";

for (let line = 0; line < 5; line++) {

    for (let character = 0; character < line; character++) {
       
            triangle += asterisk;
        
    }

    triangle += '\n';
    
}

console.log(triangle);

let n = 2;

let s2 = `addText${n}inVariable`;

console.log(s2);