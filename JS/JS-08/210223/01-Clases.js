//Crear una clase llamada persona
class Persona {
    //Constructor
    constructor(nombre, apellido) {
        this._nombre = nombre;
        this._apellido = apellido;
    }
    /*Metodos
    saludar() {
        console.log(`Hola soy ${this.nombre} ${this.apellido}`);
    }*/ //Se puede crear un metodo dentro de la clase o fuera de la clase
    set nombre(nombre) {
        this._nombre = nombre;
    } // set se usa para asignar un valor a una propiedad de la clase
    get nombre() {
        return this._nombre;
    } // get se usa para obtener el valor de una propiedad de la clase
    set apellido(apellido) {
        this._apellido = apellido;
    }
    get apellido() {
        return this._apellido;
    }
    nombreCompleto() {
        return this._nombre + ' ' + this._apellido;
    }//Metodo que retorna el nombre completo
    toString() {
        //Se aplica polimorfismo (multiples formas en tiempo de ejecucion)
        //El metodo que se ejecuta depende si es una referencia de tipo padre o de tipo hijo
        return this.nombreCompleto();
    }
}
/*
//Crear un objeto de la clase persona
let persona1 = new Persona("Yael", "Gonzalez");
//Llamar al metodo set nombre
persona1.nombre = "Nictes";
//Llamar al metodo get nombre
console.log(persona1.nombre);
//Llamar al metodo set apellido
persona1.apellido = "Slys";
//Llamar al metodo get apellido
console.log(persona1.apellido);
*/
//El hoinsting es el proceso por el cual las declaraciones de variables y funciones son movidas al inicio del scope en el que se encuentran, por lo tanto, las variables y funciones declaradas con var son movidas al inicio del scope global, y las declaradas con let y const son movidas al inicio del scope en el que se encuentran.
//Clase empleado
class Empleado extends Persona {
    constructor(nombre, apellido, departamento) {
        super(nombre, apellido);//super se usa para llamar al constructor de la clase padre
        this._departamento = departamento;
    }
    set departamento(departamento) {
        this._departamento = departamento;
    }
    get departamento() {
        return this._departamento;
    }

    //Sobreescritura de metodos
    nombreCompleto() {
        return super.nombreCompleto() + ', ' + this._departamento;
    }
}

let persona1 = new Persona('Yael', 'Gonzalez');
console.log(persona1.toString());

//Crear un objeto de la clase empleado
let empleado1 = new Empleado('Yael', 'Gonzalez', 'Sistemas');
//Llamar al metodo
console.log(empleado1);
console.log(empleado1.nombreCompleto());
console.log(empleado1.toString());

//Polimorfismo su definicion es que un objeto puede comportarse de diferentes formas en diferentes momentos del tiempo o en diferentes circunstancias. En otras palabras, un objeto puede tener diferentes formas en diferentes momentos. En JavaScript, polimorfismo se logra mediante la sobrecarga de métodos y la sobrescritura de métodos.