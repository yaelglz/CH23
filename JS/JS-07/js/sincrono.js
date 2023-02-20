//Javascript Sincrono (Bloqueante)
alert("Cohorte 23");
console.log("Hola buen dia");
alert("Dia del michi");
console.log("Adios");

/*setTimeout(
    function(){
        console.log("Hola mundo, con retraso de 3 segundos");
    }, 3000
);
console.log("Sorpresa!");*/ 

const myCallback = () => console.log("Hola mundo, con retraso de 3 segundos");
setTimeout(myCallback, 3000);
console.log("Sorpresa!"); // Primero se ejecuta esta linea y luego la de arriba porque es asincrono y no bloqueante.