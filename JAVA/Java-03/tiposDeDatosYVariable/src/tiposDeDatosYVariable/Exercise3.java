package tiposDeDatosYVariable;
public class Exercise3 {

	public static void main(String[] args) {
		/*Verificar si un número es par y positivo:*/
        int num = 6;
        if(num % 2 == 0 && num > 0){
                System.out.println("\nEl numero es par y positivo");
        }else{
            System.out.println("El numero no es par o positivo");
        }
        /*Verificar si un número está dentro de un rango específico*/
        int num2 = 10;
        if(num2 >= 0 && num2 <= 10){
            System.out.println("El numero esta en un rango de 0 a 10");
        }else if(num2 > 10 && num2 <= 20){
            System.out.println("el numero esta en un rango de 11 a 20");
        }else{
            System.out.println("El numero esta mas arriba de 20");
        }
        
        /*Verificar si una cadena es igual a otra o no*/
        String cadena1 = "Hola";
        String cadena2 = "hola";
        if(cadena1.equals(cadena2)){
            System.out.println("Las cadenas son iguales");
        }else{
            System.out.println("Las cadenas no son iguales");
        }
	}

}
