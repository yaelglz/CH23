let nameElement = document.getElementById("name");
let changeButton = document.getElementById("change-button");

changeButton.addEventListener("click", function () {
    let inputName = prompt("What is your name?");
    nameElement.innerHTML = `Hello ${inputName}`;
});