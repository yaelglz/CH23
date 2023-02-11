//Scope
division(10, 2);

//Pesar a futuro
// agregarCarritoCompras();
// borrarCarrito();
// agregarProductor();
// pagar();

/*
let f = function () {
    let v1 = parseInt(prompt("Ingrese el primer valor: "));
    let v2 = parseInt(prompt("Ingrese el segundo valor: "));
    let resul = (v1 + v2);
    return resul;
}

let s = function () {
    let valor1 = parseFloat(prompt("Ingrese el primer valor: "));
    let valor2 = parseFloat(prompt("Ingrese el segundo valor: "));
    let resul = (valor1 - valor2);
    return resul;
}


let t = function () {
    let valor1 = parseFloat(prompt("Ingrese el primer valor: "));
    let valor2 = parseFloat(prompt("Ingrese el segundo valor: "));
    let resul = (valor1 * valor2);
    return resul;
}


let z = function () {
    let valor1 = parseFloat(prompt("Ingrese el primer valor: "));
    let valor2 = parseFloat(prompt("Ingrese el segundo valor: "));
    if (valor2 === 0) {
        return "Error: no se puede dividir por cero.";
    }
    let resul = (valor1 / valor2);
    return resul;
}*/


/* 
Por que son importantes las funciones?
- Nos permite reutilizar codigo en lugar de escribirlo varias veces. Podemos llamar nuestra funcion en distintos lugares de nuestro programa, y así lo usamos cuando lo necesitamos sin necesidad de escribirlo de nuevo.
- Nos permite modularizar nuestro codigo, esto es, dividir nuestra aplicacion en partes mas pequeñas e independientes. Así mejoramos el entendimiento y comprensión del código.
- Mantienen su propio espacio, y las variable que se encuentran dentro de una funcion no se pueden acceder fuera de ella (scope).
- Por que podemos probar pequeñas partes de nuestro programa de forma aislada. (Debugging)
*/

/*
Cosas importantes para tener en cuenta al crear funciones:

-Nombre que sea descriptivo y evoque al funcionamiento de ese bloque de codigo.
-Datos de entrada (parametros)
-Procesos o instrucciones a ejecutar
-Datos de salida (return)
*/

//Funcion Directa
function agregarCarritoCompras() {
    //Lo que hace mi funcion
}

//Invocar o llamar a la funcion
agregarCarritoCompras();

//Funcion anonima
let x = function () {
    let valor1 = 5;
    let valor2 = 7;
    let suma = valor1 + valor2;
    console.log("Esta funcion anomima suma: " + suma);
}

x();

//Funcion

function division(parametro1, parametro2) {
    let resultado = parametro1 / parametro2;
    console.log("El resultado de la division es: " + resultado);
}

division(10, 2);

//Hoisiting
/*console.log(edad);
let edad = "25";*/

/*
Tipos de funciones:
    -Funciones directas - nombre (comunes)
    -Funciones anonimas - no tienen nombre (se guardan en variables)
    -Funciones como metodos (para especificar que hace mi objeto)
    -Funciones como constructores (para construir o crear objetos)
*/

//Funciones flecha
/*Sintaaxis de un funcion flecha
let nombreFuncion = (parametros) => {codigo a ejecutar} */

//Funcion directa
function suma(a,b){
    let sum1 = a + b;
    console.log(sum1);
}

//Funcion flecha
const suma1 = (a,b) => a + b;

//Funcion flecha con mas lineas de codigo
const sumarYMultiplicar = (a,b) => {
    const suma = a + b;
    const resultado = suma * 2;
    console.log(resultado);
}

/* 
Return

La sentencia return finaliza la ejecucion de la funcion, y especifica un valor para ser devuelto a quien llama a la funcion. O lo que es lo mismo, usamos return para finalizar y tambien para poder asignar el resultado a una variable.

SI NO USAMOS EL RETURN, LA FUNCION NUNCA TERMINA, Y SI QUEREMOS USAR EL RESULTADO PARA ALGO DESPUES, NO SE PODRA PORQUE NO SE ESTA ASIGNANDO NADA
*/

function areaCuadrado(){
    let lado = 5;
    let area = lado * lado;
    console.log("El area de mi cuadrado es: " + area);
    return area;
}

areaCuadrado();

let resultadoDeMiFuncion = areaCuadrado();
console.log("El resultado de mi funcion cuadrado es: ",  resultadoDeMiFuncion);