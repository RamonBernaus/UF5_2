/*1. Una classe anomenada “EquacioGrau2” que al constructor rep els termes a, b i c de
l'equació. */
package equaciograu2;

/**
 *
 * @author Ramon
 */
public class EquacioGrau2 {
    
    public EquacioGrau2(int a, int b, int c){
        
    }
    
    private double sol1,sol2;
    
    public void setsol1(double sol1){
        this.sol1 = sol1;
    }
    public void setsol2(double sol2){
        this.sol2 = sol2;
    }
    public double getsol1(){
    return sol1;    
    }
    public double getsol2(){
    return sol2;    
    }
    
    public double arrels(int a, int b, int c) throws Exception{
        double b_quadrat = Math.sqrt(b*b-4*a*c);
        double resultat_pos = (-b+(b_quadrat))/(2*a);
        setsol1(resultat_pos);
        double resultat_neg = (-b-(b_quadrat))/(2*a);
        setsol2(resultat_neg);
    if (a == 0){
        throw new Exception();
    }    
        return 0;
    }
    
}
