let text = "Hola Mundo";
if (text.includes("n")) {// includes() devuelve true si la cadena de texto incluye la palabra que le pasamos como parámetro
    console.log("La cadena de texto incluye la letra n");;
}else{
    console.log("La cadena de texto no incluye la letra n");
}

/*
let text = "Hola Mundo";
let mensaje = "El texto tiene " + text.length + " caracteres"; // length es una propiedad de la cadena de texto que devuelve el número de caracteres que tiene la cadena de texto (incluyendo espacios)
console.log(mensaje);

let text = "Hola Mundo";
let mensaje = " ";
for (let i = 0; i < text.length; i++) {
    mensaje += text[i] + " ";
}
mensaje = mensaje.trim(); // trim() elimina los espacios en blanco al principio y al final de la cadena de texto
console.log(mensaje);

let text = "Hola Mundo";
let mensaje = text.toUpperCase(); // toUpperCase() convierte la cadena de texto a mayúsculas
console.log(mensaje);

let text = "Hola Mundo";
let palabra = text.substr(5); // substr() devuelve una parte de la cadena de texto
console.log(palabra);

let text = "Hola Mundo";
let palabra = text.substring(5,7); // substring() devuelve una parte de la cadena de texto
console.log(palabra);

let text = "Hola Mundo";
let palabra = text.split(" "); // split() divide una cadena de texto en un array de subcadenas
console.log(palabra[0]+ " / " + palabra[1]); 
*/