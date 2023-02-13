let miVariable = 5;
let miArray1 = [1, 2, 3, 4, 5, 6];
//Los array inician en 0 y terminan en n-1 (n es el tamaño del array)
let miOtroArray = new Array();

console.log("miArray", miArray[3]);


console.log("miArray1", miArray1[1][2]);

//Ciclo for
let miArray = [1, 2, 3, 4, 5, 6];

for (let i = 0; i < 5; i++) {
    console.log("Imprimiendo miArray ->", miArray[i]);
} // For se usa para iterar sobre un array o un objeto.


let miArray2 = [
    [1, 2, 3],
    [4, 5, 6],
    [7, 8, 9]
]; //Array de 2 dimensiones (matriz)

/*for (let i = 0; i < 3; i++) {
    for (let j = 0; j < 3; j++) {
        console.log("miArray2 ->", miArray2[i][j]);
    }
}*/

let matrizR = [
    [], [], []
];
for (let i = 0; i < 3; i++) {
    for (let j = 0; j < 3; j++) {
        matrizR[i][j] = miArray2[i][j] * miArray2[i][j];
    }
    console.log("************************");
    console.log("matrizR-> ", matrizR);
}

//Ciclo while
/*
let variable = 0;
while(condicion) {
    Cuerpo del ciclo
}
*/

let contador = 0;
while (contador < 10) {
    console.log("contador ->", contador);
    contador++;
}

