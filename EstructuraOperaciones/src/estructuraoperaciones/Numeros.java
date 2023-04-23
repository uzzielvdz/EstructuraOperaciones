
package estructuraoperaciones;

import java.util.Scanner;

public class Numeros {
    Scanner leer = new Scanner(System.in);
    
    public void Entrada (){
        System.out.println("Ingrese un primer numero");
        double val1 = leer.nextDouble();
        
        System.out.println("Ingrese un segundo numero");
        double val2 = leer.nextDouble();
        
        System.out.println("¿Qué operación desea realizar con esos numeros?");
        System.out.println("1. Suma");
        System.out.println("2. Resta");
        System.out.println("3.División");
        System.out.println("4.Multiplicación");
        
        int menu = leer.nextInt();
        
        if (menu == 1){
        OperacionesBasicas.Suma(val1, val2);
        } else if (menu == 2) {
          OperacionesBasicas.Resta(val1, val2);
          } else if ( menu == 3) {
            OperacionesBasicas.División(val1, val2);
          } else if (menu == 4) {
             OperacionesBasicas.Multiplicación(val1, val2);
          } else {
              System.out.println("ingrese un valor correcto");
          }
    }
}
