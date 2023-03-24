
let palabra = prompt("Ingresa una palabra")

function reverseString(str){
    let arrStr = str.split(""); //split divide un objeto de tipo String en un array (vector) de cadenas mediante la separación de la cadena en subcadenas.
    return arrStr.reverse().join("");
}
document.querySelector('#respuesta').innerHTML = reverseString(palabra);
