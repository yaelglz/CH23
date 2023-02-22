//Prueba efectiva
/*const indexTest = require("../calculadora");Importamos el modulo calculadora, forma antigua ecma5*/
import { indexTest } from "../calculadora";//importamos el modulo calculadora, forma ecma6
test('Test suma', () => {
    const r = indexTest.suma(1, 2);
    expect (r).toBe(3); //expect nos ayuda a evaluar el resultado de la prueba unitaria.
});
test.todo('Test resta');
test.todo('Test multiplicacion');
test.todo('Test division');