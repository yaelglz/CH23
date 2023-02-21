class OperacionesAritmeticas { //Declaracion CAMEL CASE, se usa para clases y objetos. inicia con mayuscula
    numero0 = 0; //Declaracion SNAKE CASE, se usa para variables y funciones. inicia con minuscula
    numero1 = 0;

    constructor(valor0, valor1) {
        this.numero0 = valor0;
        this.numero1 = valor1;
    }

    sumar() {
        return this.numero0 + this.numero1;
    }
}

let obj1;
obj1 = new OperacionesAritmeticas();
console.log(obj1.numero0);

let obj2 = new OperacionesAritmeticas();
console.log(obj2.sumar(5, 6));

let obj3 = new OperacionesAritmeticas();
obj3.numero0 = 10;
obj3.numero1 = 20;
console.log(obj3.sumar(obj3.numero0, obj3.numero1));

let obj4 = new OperacionesAritmeticas(8, 6); //Se le pasan los valores a los parametros del constructor
console.log("---->" + obj4.sumar());

//Que es un objeto?
//Es una coleccion de propiedades, y una propiedad es una asociacion entre un nombre (o clave) y un valor.