/* Optimizar 
if(GPAacumulativo>2.0){
    if(Unidadestotales>=120){
        console.log("¡Puede graduarse!");
    }
}*/
GPAacumulativo = 2.5;
Unidadestotales = 130;
if (GPAacumulativo > 2.0 && Unidadestotales >= 120) {
    console.log("¡Puede graduarse!");
} else {
    console.log("¡No puede graduarse!");
}//Se agrega el operador lógico && para que se cumplan las dos condiciones

/*Optimizar
if(cspCalificacion>=75){
    console.log("¡Eres elegible para la graduación!");
}
if(progCalificacion>=75){
    console.log("¡Eres elegible para la graduación!");
}*/
cspCalificacion = 80;
progCalificacion = 90;
if (cspCalificacion >= 75 && progCalificacion >= 75) {
    console.log("¡Eres elegible para la graduación!");
} else {
    console.log("¡No eres elegible para la graduación!");
} //Se agrega el operador lógico && para que se cumplan las dos condiciones

/*La posibilidad de acceder a cada caracter en una cadena nos permite lograr efectos interesantes, en el siguiente ejercicio agrega puntos entre las letras, pero no entre las palabras
let texto="Hola Mundo"; // H.o.l.a M.u.n.d.o*/
let texto = "Hola Mundo";
let texto2 = "";
for (let i = 0; i < texto.length; i++) {
    if (texto[i] != " ") {
        texto2 += texto[i] + ".";
    } else {
        texto2 += " ";
    }
} // for para recorrer la cadena y agregarle un punto a cada caracter que no sea un espacio en blanco
console.log(texto2);





