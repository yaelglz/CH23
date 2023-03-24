let numero;

do {
    numero = prompt("Ingrese un número para mostrar la serie de Fibonacci:");
} while (isNaN(numero));

numero = parseInt(numero);

if (numero <= 0) {
    console.error("Error: El número debe ser mayor que cero.");
} else {
    let fibonacci = [0, 1];

    for (let i = 2; i < numero; i++) {
        fibonacci[i] = fibonacci[i - 1] + fibonacci[i - 2];
    }

    console.log(`La serie de Fibonacci de ${numero} números es: ${fibonacci.join(", ")}`);
}

