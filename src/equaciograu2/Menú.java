/**/
package equaciograu2;

import java.util.Scanner;

/**
 *
 * @author Ramon
 */
public class Menú {

    public static void main(String[] args) throws Exception {
        Scanner s = new Scanner(System.in);
        int a = 1, b = 1, c = 1;
        boolean comprovar = true;
        while (comprovar) {
            try {
                System.out.println("Quin es el primer terme de l'equacio? ");
                a = Integer.parseInt(s.next());
                System.out.println("Quin es el segon terme de l'equacio? ");
                b = Integer.parseInt(s.next());
                System.out.println("Quin es el tercer terme de l'equacio? ");
                c = Integer.parseInt(s.next());
                break;
            } catch (NumberFormatException e) {
                System.out.println("NumberFormatException occured");
                System.out.println("Torna-ho a probar");
            }
        }
        EquacioGrau2 e = new EquacioGrau2(a, b, c);
        System.out.println(e.arrels(a, b, c));
    }
//El programa detecta si fiquem un 0a l'hora de dividir, si coloquem una lletra en lloc de un numero, i si l'arrel no te resultat
}
