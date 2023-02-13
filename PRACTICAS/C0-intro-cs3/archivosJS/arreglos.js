let miVariable = 34;

let miArreglo = []; //declaración literal
let miArreglo01 = new Array(); //declaracion por instancia

let miArreglo02 = [1,2,3,4];
console.log("Dato de miArreglo en el indice 0 - ", miArreglo02[0]);
console.log("Dato de miArreglo en el indice 0 - ", miArreglo02[1]);
console.log("Dato de miArreglo en el indice 0 - ", miArreglo02[2]);
console.log("Dato de miArreglo en el indice 0 - ", miArreglo02[3]);
console.log("El tamaño o numero de elementos del arreglo02 es - ", miArreglo02.length);

let miArreglo03 = ["Hola","que","tal"];
console.log(miArreglo03[0]);
console.log(miArreglo03[1]);
console.log(miArreglo03[2]);
console.log("El tamaño o numero de elementos del arreglo03 es - ", miArreglo03.length);

let miArreglo04 = [{nombre:"Yael"},{apellido:"Gonzalez"},{edad:25}]; //arreglo por objetos
console.log("Elemento del arreglo de tipo objeto miArreglo04 - ", miArreglo04[0].nombre);
console.log("Elemento del arreglo de tipo objeto miArreglo04 - ", miArreglo04[1].apellido);
console.log("Elemento del arreglo de tipo objeto miArreglo04 - ", miArreglo04[2].edad);
console.log("El tamaño o numero de elementos del arreglo04 es - ", miArreglo04.length);

let nuevoArreglo00 = [3,6,1,4];
console.log("Orden de mi arregloNuevo con sort: ", nuevoArreglo00.sort());
console.log("Orden de mi arregloNuevo metodo pop: ", nuevoArreglo00.pop());
console.log("Orden de mi arregloNuevo metodo push: ", nuevoArreglo00.push(10));
console.log("Orden de mi arregloNuevo metodo reverse: ", nuevoArreglo00.reverse());

let otroArreglo = ["que","hola","tal","como"];
console.log("Orden de mi otroNuevo con sort: ", otroArreglo.sort());
console.log("Orden de mi otroloNuevo metodo pop: ", otroArreglo.pop());
console.log("Orden de mi otroNuevo metodo push: ", otroArreglo.push("estas","holaaaa"));
console.log("Orden de mi otroNuevo metodo reverse: ", otroArreglo.reverse());

console.log("javascript"[2]); //arreglo de cadena de caracteres
console.log("javascript".length);

let matriz = [
              [1,2,3],
              [4,5,6],
              [7,8,9]
            ]; //matriz(arreglos dentro de arreglos ¿) )
console.log("Tamaño:", matriz.length);
console.log(matriz[1][1]);
console.log(matriz[2][1]);
console.log(matriz[0][2]);