let persona = {
    nombre: 'Yael',
    apellido: 'Gonzalez',
    nombreCompleto: function(){
        return 'El nombre es ' + this.nombre + ' ' + this.apellido;
    }
}
console.log(persona.nombreCompleto());
console.log(persona.nombre);
console.log(persona.apellido);
console.log(persona);
