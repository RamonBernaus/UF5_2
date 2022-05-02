/**/
package equaciograu2;

/**
 *
 * @author Ramon
 */
public class Menú {

    public static void main(String[] args) throws Exception {
        int a =2, b = 5, c = 2;
        EquacioGrau2 e = new EquacioGrau2(a, b, c);
        double b_quadrat = Math.sqrt(b);
        System.out.println(e.arrels(a, b, c));
    }

}
