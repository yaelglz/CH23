import React from 'react'

export const SegundoCompenente = ({nombre, apellido, info}) => {
    return (
        <div>
            SegundoCompenente
            <li>
                {nombre} {} {apellido}
            </li>
            <li>
                {info.lugar}
            </li>
            <li>
                {info.hobbies}
            </li>

        </div>
    )
} // rafc 
