/*Exercise #1
You have a list of names: var names = ["Maria", "Antony", "Joy", "Juan"]*/

let nombres = ["Maria", "Antony", "Joy", "Juan"];

/*Part 1
Write a function to insert a name to the end of the list. Add your own name to the end of the list.*/
function agregaNom(nombre) {
    nombres.push(nombre);//Push agrega un elemento al final del array
}
agregaNom("Yael");
console.log(nombres);

/* Part 2
Write a function that takes in a name and checks if the list has that name. It should return back a boolean - true/false.*/
let nombres = ["Maria", "Antony", "Joy", "Juan"];
function checkNombre(name) {
    return nombres.includes(name);//Includes verifica si el elemento existe en el array y devuelve un booleano true/false
}
console.log(checkNombre("Yael"));
console.log(checkNombre("Maria"));

/*Part 3
Write a function that takes in a list of names. This function should compare the list taken into the names list you currently have. The function should pass back an array with the names that are in both lists.*/
let nombres = ["Maria", "Antony", "Joy", "Juan",];
let nombres2 = ["Maria", "Ricardo", "Yael", "Juan"];
function comparaNombres() {
    let nombres3 = [];
    for (let i = 0; i < nombres2.length; i++) {
        if (nombres.includes(nombres2[i])) {
            nombres3.push(nombres2[i]);
        }
    }//For recorre el array nombres2 y verifica si el elemento existe en el array nombres, si existe lo agrega al array nombres3
    return nombres3;//Devuelve el array nombres3 con los elementos que existen en ambos arrays 
}
console.log(comparaNombres());

/*Part 4
Write a function that takes in a list of names and returns a list of Integers with the length of the names in the same order as received. Hint use the push function.*/
let nombres = ["Maria", "Antony", "Joy", "Juan"];
function longitudNombres(nombres) {
    let longitudes = []; 
    for (let i = 0; i < nombres.length; i++) { // length devuelve la longitud del array
        longitudes.push(nombres[i].length);
    }//For recorre el array nombres y agrega la longitud de cada elemento al array longitudes
    return longitudes;//Devuelve el array longitudes con las longitudes de los elementos del array nombres
}
console.log(longitudNombres(nombres));

/*Exercise #2 **********************************************************************
What do the following expressions evaluate to?

&& - AND operador lógico, devuelve true si ambos operandos son true, de lo contrario devuelve false
|| - OR operador lógico, devuelve true si al menos uno de los operandos es true, de lo contrario devuelve false
! - NOT operador lógico, devuelve true si el operando es false, de lo contrario devuelve false
*/


console.log(false || (true && false)); //false, por que && tiene mayor jerarquia que || y se evalua primero
console.log(true || (11 + 12)); //true, por que 11 + 12 es true
console.log((31 + 22) || true); //true, por que 53 es true 
console.log(true && (1 + 7)); //true, por que 8 es true
console.log(false && (3 + 4)); //false, por que 3 + 4 es true 
console.log((1 + 2) && true); //true, por que 3 es true 
console.log((32 * 4) >= 129); //false, por que 128 es menor que 129
console.log(false !== !true); //false, la expresión !== devuelve true si los operandos son diferentes y false si son iguales
console.log(true === 4); //false, por que true no es igual a 4
console.log(false === (847 === '847')); //true, por que false es igual a false
console.log(false === (887 == '887')); //false, por que false es igual a true
console.log((!true || (!(100 / 5) === 20) || ((328 / 4) === 82)) || false); //((false || false ||true) || false) = true


/*Exercise#3*************************************************************
Write a function that logs whether a number is between 0 and 25 (inclusive), between 26 and 100 (inclusive), greater than 100, or less than 0.
numberRange(25);   // '25 is between 0 and 25'
numberRange(75);   // '75 is between 26 and 100'
numberRange(125);  // '125 is greater than 100'
numberRange(-25);  // '-25 is less than 0'*/
function rangoNumero(num) {
    if (num >= 0 && num <= 25) {
        console.log(`${num} se encuentra entre 0 y 25`);
    } else if (num >= 26 && num <= 100) {
        console.log(`${num} se encuentra entre 26 y 100`);
    } else if (num > 100) {
        console.log(`${num} es mayor que 100`);
    } else {
        console.log(`${num} es menor que 0`);
    }
}
rangoNumero(25);
rangoNumero(75);
rangoNumero(125);
rangoNumero(-25);



