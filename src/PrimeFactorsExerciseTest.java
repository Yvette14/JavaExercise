import java.util.ArrayList;
import java.util.List;

class PrimeFactors{
    public List<Integer> factorsPrinter(int n){
        List<Integer> factors = new ArrayList<Integer>();
        for(int x = 2;x<=n;x++){
            if(n%x==0){
                factors.add(x);
                n /= x;
            }
        }
        return factors;
    }
}

public class PrimeFactorsExerciseTest {
    public static void main(String[] args){
        PrimeFactors primeFactors = new PrimeFactors();
        System.out.print(primeFactors.factorsPrinter(30));
    }
}
