// function LiveCoding() {
//     let myArray = ['insecto', 'bootcamp', 'mangos', 'reptil', 'mosca', 'escritorio'];
//     let var1 = prompt('Ingrese una palabra');


// for (i = 0; i < myArray.length; i++) {
//     for ( n = 0; n < myArray[i].length; n++) {
//         for (n=0; n<= var1.length; n++){
//             if (i > n){
//                 return Document.write(n);
//             }
//         }
//     }
// }


// Función que recibe un string y un array de strings, y devuelve un nuevo arreglo
// con las palabras del array que son más largas que el string
function bigWords(str, arr) {
    return arr.filter(word => word.length > str.length); //arr.filter(word => word.length > str.length) retorna un array con las palabras que cumplen la condición
}

// Función que recibe un array de strings y los muestra en una lista en el HTML
function printArray(arr) {
    // Creamos un elemento <ul> para la lista
    const ul = document.createElement("ul"); //document.createElement("ul") crea un elemento ul

    // Recorremos el array y por cada elemento creamos un <li> y lo agregamos al <ul>
    arr.forEach(word => {
        const li = document.createElement("li"); //document.createElement("li") crea un elemento li 
        li.textContent = word;
        ul.appendChild(li); //ul.appendChild(li) agrega un elemento li al elemento ul
    });

    // Agregamos el <ul> al <body> del HTML
    document.body.appendChild(ul);
}

// Función principal que se ejecuta al cargar la página
function LiveCoding() {
    // Array de palabras inicial
    let myArray = ['insecto', 'bootcamp', 'mangos', 'reptil', 'mosca', 'escritorio'];
    // Pedimos al usuario que ingrese una palabra
    let var1 = prompt('Ingrese una palabra');

    // Obtenemos las palabras del array que son más largas que la palabra ingresada
    let bigWordsArray = bigWords(var1, myArray);

    // Mostramos las palabras en el HTML
    printArray(bigWordsArray);
}

// Llamamos a la función principal para que se ejecute al cargar la página
LiveCoding();