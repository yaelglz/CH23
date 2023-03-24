

function calcularFactorial() {
    let numero = prompt("Ingresa un número para calcular su factorial:");

    while (isNaN(numero)) {
        numero = prompt("Error: Ingresa un número válido para calcular su factorial:");
    }

    numero = parseInt(numero);

    let factorial = 1;

    for (let i = 1; i <= numero; i++) {
        factorial *= i;
    }

    console.log(`El factorial de ${numero} es: ${factorial}`);
}


document.querySelector('#respuesta').innerHTML = calcularFactorial();