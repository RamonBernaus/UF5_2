/*1. Una classe anomenada “EquacioGrau2” que al constructor rep els termes a, b i c de
l'equació. */
package equaciograu2;

/**
 *
 * @author Ramon
 */
public class EquacioGrau2 {

    public EquacioGrau2(int a, int b, int c) {

    }

    private double sol1, sol2;

    public void setsol1(double sol1) {
        this.sol1 = sol1;
    }

    public void setsol2(double sol2) {
        this.sol2 = sol2;
    }

    public double getsol1() {
        return sol1;
    }

    public double getsol2() {
        return sol2;
    }

    public String arrels(int a, int b, int c) throws Exception {
        String str = " ";
        double b_quadrat = Math.sqrt(b * b - 4 * a * c);
        sol1 = (-b + (b_quadrat)) / (2 * a);
        sol2 = (-b - (b_quadrat)) / (2 * a);
        if (a == 0) {
            PrimerCoeficientZeroException ex = new PrimerCoeficientZeroException();
            throw ex;
        } else if (b * b < 4 * a * c) {
            NoArrelsRealsException exept = new NoArrelsRealsException();
            throw exept;
        } else {
getsol1();
getsol2();
}
        return str;
    }

    public class PrimerCoeficientZeroException extends Exception {

        PrimerCoeficientZeroException() {
            super("Error el primer coeficient 'a' es igual a 0");
        }
    }

    public class NoArrelsRealsException extends Exception {

        NoArrelsRealsException() {
            super("Error la arrel mo es una arrel real");
        }
    }
}
