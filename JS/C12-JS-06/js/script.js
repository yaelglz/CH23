/*

Que encontramos en el arbol DOM?

- Nose : Es una unidad mas basica dentro del documento. Puede ser una etiqueta, un texto, un comentario, etc.

    <title> NODO
        Manipulacion del DOM //Es un nodo, pero es hijo del title
    </title>

- Document: Es el nodo raiz del arbol DOM. Es el nodo padre de todos los demas nodos.

- Element: Es un nodo que representa una etiqueta HTML. Puede tener atributos y nodos hijos. <div>, <img>, <p>, etc.

- Attribute: Es un nodo que representa un atributo HTML. Puede tener un valor. <div id="miDiv">, <img src="imagen.jpg">, etc.

- Comment: Es un nodo que representa un comentario HTML. <!-- Este es un comentario -->

Metodos traddicionales (que se usan en versiones antiguas de JS)

        - document.getElementById("id"): (botonSuma)
        - document.getElementsByTagName("tag"): (<button>)
        - document.getElementsByClassName("class"): (.btn)
        - document.querySelector("selector"): 

*/

var elementoID = document.getElementById("botonSuma");
console.log(elementoID);

var elementoTag = document.getElementsByTagName("botonResta");
console.log(elementoTag);
console.log("Este es el primer elemento de mi coleccion de botones " + elementoTag[0]);

var elementoClass = document.getElementsByClassName("boton");
console.log(elementoClass);

/* Metodos recientes    
    - document.querySelector(.botones) //Devuelve el primer elemento que coincida con el selector
    - document.querySelectorAll(".boton") //Devuelve una coleccion de elementos
    var unElemento = document.querySelector(".boton");
    console.log(unElemento);
*/

/*Creacion de nodos
    - document.createElement("tipoNodo"): Crea un nodo de tipo elemento
*/
//Creacion nodo de imagen
const imagenPerrito = document.createElement("img");

//Creamos atributos a la etiqueta img
imagenPerrito.src = "https://mlpnk72yciwc.i.optimole.com/cqhiHLc.IIZS~2ef73/w:auto/h:auto/q:75/https://bleedingcool.com/wp-content/uploads/2021/01/EitJnbZXkAAvp2T-1-copy-77-1.jpg";
imagenPerrito.alt = "Perrito";
imagenPerrito.style.width = "300px";
imagenPerrito.style.borderRadius = "30px";

var textoPerrito = document.createElement("p");
textoPerrito.textContent = "Es mi pokemon favorito";

//Agregamos el nodo a la pagina
document.body.append(imagenPerrito);


//Actualizar nodos
//1. Obtener el nodo a actualizar (outerHTML, innerHTML, textContent, etc)
//2. Actualizar el nodo (innerHTML, textContent, etc)

var resultadoQueCambia = document.getElementById("resultado");
resultadoQueCambia.innerHTML = "Saludos cambie el texto juas juas juas";

//Construir nuestra calculadora
//1. Obtener los elementos del DOM
var input1 = document.getElementById("input1");
var input2 = document.getElementById("input2");
var botonSuma = document.getElementById("botonSuma");
var botonResta = document.getElementById("botonResta");
var botonMultiplicacion = document.getElementById("botonMultiplicacion");
var botonDivision = document.getElementById("botonDivision");
var resultado = document.getElementById("resultado");

//Construimos las funciones de nuestra calculadora
function suma() {
    let valor1 = parseInt(input1.value);// Pido numero1
    let valor2 = parseInt(input2.value);// Pido numero2
    let suma = valor1 + valor2;// Sumo los numeros
    resultado.innerHTML = suma;// Muestro el resultado
}

function resta() {
    let valor1 = parseINT(input1.value); //.value es para obtener el valor de un input
    let valor2 = parseInt(input2.value);
    let resta = valor1 - valor2;
    resultado.innerHTML = resta;
}

function multiplicacion() {
    let valor1 = parseInt(input1.value);
    let valor2 = parseInt(input2.value);
    let multiplicacion = valor1 * valor2;
    resultado.innerHTML = multiplicacion;
}

function division() {
    let valor1 = parseInt(input1.value);
    let valor2 = parseInt(input2.value);
    let division = valor1 / valor2;
    resultado.innerHTML = division;
}

/*Asignamos las funciones a los eventos (addEventListener)
    -node.addEventListener("evento a escuchar", funcion a ejecutar)
        -node (nodo donde se aterriza el evento)
        -addEventListener (palabra reservada para usar el evento)
        -evento a escuchar (click, mouseover, mouseout, etc)
        -funcion a ejecutar (suma, resta, multiplicacion, division)
*/
botonSuma.addEventListener("click", suma);
botonResta.addEventListener("click", resta);
botonMultiplicacion.addEventListener("click", multiplicacion);
botonDivision.addEventListener("click", division);


/* Manipulacion del DOM
    -Metodos para acceder a elementos
        - document.getElementById("id"): (botonSuma)
        - document.getElementsByTagName("tag"): (<button>)
        - document.getElementsByClassName("class"): (.btn)

    -Metodos para crear elementos
        - document.createElement("tipoNodo"): Crea un nodo de tipo elemento
        - document.createTextNode("texto"): Crea un nodo de tipo texto

    -Metodos para insertar elementos
        - append(): Inserta un nodo como ultimo hijo de otro nodo
            (parentElement).append(childElement
        - appendChild(): Inserta un nodo como ultimo hijo de otro nodo
        - insertBefore(): Inserta un nodo antes de otro nodo
        - replaceChild(): Reemplaza un nodo por otro

    -Metodos modificar elementos
        - innerHTML: Modifica el contenido HTML de un elemento
            (node).innerHTML = "Nuevo contenido"
            (node).outerHTML = "Nuevo contenido"
        - textContent: Modifica el contenido de texto de un elemento
        - setAttribute(): Modifica el valor de un atributo
        - removeAttribute(): Elimina un atributo
*/
//Primer paso: Definir con que voy a interacturar(almacenar en variables)
const textoAModificar = document.querySelector("#h1");

//Creo una funcion que cambia el color
function cambiarColor(color) {
    textoAModificar.style.color = color;
}
