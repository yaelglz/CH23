/*
if(condition){
    Bloque de codigo
}
*/

let edad = parseInt(prompt("Ingrese su edad"));

if (edad <= 17) {
    document.write("<h2>Tas chikito</h2>");
} else if (edad == 18) {
    document.write("<h2>Eres mayor de edad</h2>");
} else if (edad > 18) {
    document.write("<h2>Tas ruko</h2>");
} else {
    document.write("<h2>Este no es numero valido</h2>");
}

//(5 == "5") -> true (compara solo el valor)
//(5 === "5") -> false (compara el valor y el tipo de dato)