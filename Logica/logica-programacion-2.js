/*var celsius;
var farenheit = celsius * 9/5 + 32;
var kelvin = celsius + 273.15

function convertir(){
    celsius = document.querySelector.valor('#c');
    return celsius
    alert("Tu temperatura en farenheit: " + farenheit);


}*/


function convertir() {

    var celsius = parseFloat(document.querySelector('#cel').value);
    var fahrenheit = (celsius * 1.8) + 32;
    var kelvin = celsius + 273.15;

    document.querySelector('#fah').textContent = fahrenheit.toFixed(2);
    document.querySelector('#kel').textContent = kelvin.toFixed(2);
}