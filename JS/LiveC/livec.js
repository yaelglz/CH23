function bigWords(str, arr) {
    return arr.filter(word => word.length > str.length);
}

function printArray(arr) {
    const ul = document.createElement("ul");
    arr.forEach(word => {
        const li = document.createElement("li");
        li.textContent = word;
        ul.appendChild(li);
    });
    document.body.appendChild(ul);
}

const myArray = ['insecto', 'bootcamp', 'mangos', 'reptil', 'mosca', 'escritorio'];

const bigWordsArray = bigWords('bocina', myArray);
console.log(bigWordsArray); // Output - ['insecto', 'bootcamp', 'escritorio']

printArray(bigWordsArray);
// Output - <li>insecto</li> <li>bootcamp</li> <li>escritorio</li>