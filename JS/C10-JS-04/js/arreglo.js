let lista = [12, 5, 80, 34, 7];
lista.sort(
    function (a, b) {
        return a - b; // Ordena de menor a mayor los números de un arreglo de números. Si se quiere ordenar de mayor a menor, se cambia el signo de la resta. Si se quiere ordenar de la A a la Z, se cambia el orden de las variables a y b. Si se quiere ordenar de la Z a la A, se cambia el orden de las variables a y b y se cambia el signo de la resta.
    } 
);
console.log(lista);


lista.sort(); // Sort es una función que nos permite ordenar los elementos de un arreglo de menor a mayor o de mayor a menor dependiendo del tipo de dato que contenga el arreglo (números, letras, etc.) y de la forma en que se escriban (mayúsculas, minúsculas, etc.). En este caso se ordena de menor a mayor.
console.log(lista);

lista.reverse(); // Reverse es una función que nos permite invertir el orden de los elementos de un arreglo.
console.log(lista);

let remover = lista.splice(1, 2); // Splice es una función que nos permite eliminar un elemento de un arreglo, en este caso se elimina el elemento de la posición 1 y 2.
console.log(remover);
console.log(lista);
lista.splice(2, 0, 100, 200); // Splice es una función que nos permite insertar un elemento en un arreglo, en este caso se insertan los números 100 y 200 en la posición 2.
console.log(lista);

lista.shift(); // Shift es una función que nos permite eliminar el primer elemento de un arreglo.
console.log(lista);

lista.pop(); // Pop es una función que nos permite eliminar el último elemento de un arreglo.
console.log(lista);

let masE = lista.concat(100, 200, 300); // Concat es una función que nos permite concatenar dos arreglos, en este caso se concatena el arreglo lista con los números 100, 200 y 300.
console.log(masE);

lista.push(100); // Push es una función que nos permite agregar un elemento al final del arreglo.
console.log(lista);

let msj = lista.join("-"); // Join es una función que nos permite unir todos los elementos de un arreglo en un string, en este caso se usa el guión como separador.
console.log(msj);

let listaNueva = lista.slice(1, 3); // Slice es una función que nos permite extraer un subconjunto de un arreglo, en este caso extrae desde la posición 1 hasta la 3, pero no incluye la 3, es decir, extrae la posición 1 y 2. Si no se especifica el segundo parámetro, extrae hasta el final del arreglo.
console.log(listaNueva);

console.log(lista.length); // Length es una propiedad que nos dice cuantos elementos tiene el arreglo

for (let i = 0; i < lista.length; i++) {
    console.log("---->", lista[i]);
}// For es una estructura de control que nos permite repetir un bloque de código un número determinado de veces. En este caso se usa para recorrer el arreglo lista.
console.log(lista);
