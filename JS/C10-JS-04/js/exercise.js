//Exercise 1
let personas =['Sofía', 'David', 'Juan'];
personas.push('Sara', 'Agustin'); //Agrega elementos al final del array
let primeraPersona = personas.shift(); //Elimina el primer elemento del array
console.log('Persona llamada:', primeraPersona);
console.log('Personas en la fila: ', personas);
personas.splice(1, 0, 'Renata'); //splice(posicion, cantidad de elementos a eliminar, elemento a insertar)
personas.push('Elena');
console.log('Personas en la fila: ', personas);


//Exercise 2
let asterisco = '*';
for (let i = 0; i < 5; i++) {
    console.log(asterisco);
    asterisco += '*';
}


//Exercise 3
//Repeatedly print the value of the variable xValue, decreasing it by 0.5 each time, as long as xValue remains positive.
let xValue = 10;
while (xValue > 0) {
    console.log(xValue);
    xValue -= 0.5;
}

//Print all the odd numbers between 1 - 100.
for (let i = 1; i <= 100; i++) {
    if (i % 2 != 0) { //Si el resto de la división es distinto de 0, es impar
        console.log(i);
    }
}

//Write a method with a while loop to print 1 through n in square brackets. For example, if n = 6 print [1] [2] [3] [4] [5] [6]

let n = 6;
let i = 1;
while (i <= n) {
    console.log(`[${i}]`);
    i++;
}




