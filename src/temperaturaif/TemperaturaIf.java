package temperatura;

import java.util.Scanner; 

public class TemperaturaIf {

    //'void' NO devuelve nada. El método public static void main es un método especial, es el que permite ejecutar el código de un programa, o aplicación.
    //método estático accesible desde fuera de la clase. Solo con llamar a la clase se ejecutará el método main. 'Void' significa 'nada'. Este método siempre devuelve 'void'.
    public static void main(String[] args) { 
        
        //Lee la entrada del usuario y lo almacena en la variable consola
        Scanner consola = new Scanner(System.in); //instanciar la clase con el '= new ...' 
        
        int temperatura;

        //Imprime el mensaje introducido por el usuario
        System.out.println("Introduzca la temperatura: ");
        
        temperatura = consola.nextInt();
        
        if(temperatura > 25){
             System.out.println("La temperatura es de: " + temperatura + "ºC. " + "Ir a la playa");
        }else if (temperatura <= 25 && temperatura >= 15){
            System.out.println("La temperatura es de: " + temperatura + "ºC. " + "Ir a la montaña");
        }else if (temperatura < 5){
            System.out.println("La temperatura es de: " + temperatura + "ºC. " + "Ir a esquiar");
        }else{
            System.out.println("La temperatura es de: " + temperatura + "ºC. " + "Quedarse en casa");
        }
        
    }
}
