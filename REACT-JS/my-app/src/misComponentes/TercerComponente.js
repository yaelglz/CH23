import React from 'react'
const productos = [
    { titulo: "Cebolla", esFruta: false, id: 3 },
    { titulo: "Libro", esFruta: false, id: 1 },
    { titulo: "Manzana", esFruta: true, id: 2 },
    { titulo: "Pera", esFruta: true, id: 3 },
]
function TercerComponente() {
    const lista = productos.map(producto => <li key={producto.id}> {producto.titulo} </li>)
    return (
        <div>
            <h1>TercerComponente</h1>
            <h2>Playing with map()</h2>
            <ol>
                {lista}
            </ol>
        </div>

    )
}

export default TercerComponente