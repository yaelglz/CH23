// Traductor de números a días de la semana

//Funcion con if
function traductor() {
    let diaNumero = prompt("Ingrese el número del día de la semana (0-6)");
    if (diaNumero == 0) {
        document.write("Domingo");
    } else if (diaNumero === 1) {
        document.write("Lunes");
    } else if (diaNumero === 2) {
        document.write("Martes");
    } else if (diaNumero === 3) {
        document.write("Miercoles");
    } else if (diaNumero === 4) {
        document.write("Jueves");
    } else if (diaNumero === 5) {
        document.write("Viernes");
    } else if (diaNumero === 6) {
        document.write("Sabado");
    } else {
        document.write("Numero invalido");
    }
}
traductor();


//Funcion con array
/*function traductor1() {
    let diaNumero = prompt("Ingrese el número del día de la semana (0-6)");
    let diasSemana = ["domingo", "lunes", "martes", "miércoles", "jueves", "viernes", "sábado"];

    if (diaNumero >= 0 && diaNumero <= 6) {
        document.write(`El día correspondiente es: ${diasSemana[diaNumero]}`);
    } else {
        document.write("Número de día inválido");
    }
}
traductor1();
*/


//Operadores logicos (&&, ||, !)
// && -> AND (y) -> true si todos los valores son true 
// || -> OR (o) -> true si al menos un valor es true 
// ! -> NOT (no) -> invierte el valor de la variable (true -> false, false -> true)