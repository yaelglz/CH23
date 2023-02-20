const myURL = document.URL.toString(); // URL de la página actual (string), toStrin() nos devuelve un string.
const promesa = fetch(myURL); // fetch() es una función que devuelve una promesa 
promesa.then(resultado => console.log(resultado), // then() es un método de la promesa que recibe una función callback que se ejecuta cuando la promesa se resuelve. La función callback recibe como parámetro el resultado de la promesa.
e => console.log(`Error Callback ${e}`)); // Error Callback:  TypeError: Failed to fetch

/* Ejemplo

// Se declara la variable url que contiene la URL donde se obtendrán los datos
let url = "url";
// Se llama a la función fetch para obtener los datos, devuelve una promesa para utilizarlos
fetch(url)
// Se utilizan bloques then, primero se convierte la respuesta a formato json
.then(response=>response.json())
// Luego se llama a la función showData pasandole los datos convertidos a json
.then(data=>showData(data));
// Al final se maneja un mensaje de error en caso de no cumplirse la promesa inicial
.then(error=>console.log(error));

// La función showData recibe los datos y los utiliza para construir una tabla
const showData=(data)=>{
    console.log(data);
    let body="";
    Cada fila se construye con un ciclo for que itera sobre cada dato
    for(var i=0, i<data.lenght;i++)
    body+=<tr>
    <td>${data[i].id}</td>
    <td>${data[i].name}</td>
    <td>${data[i].email}</td>
    </tr>
}
// La tabla se agrega al elemento HTML mediante innerHTML
document.getElementById("data").innerHTML=body
}
*/