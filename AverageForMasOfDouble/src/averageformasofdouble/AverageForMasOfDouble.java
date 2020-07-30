
package averageformasofdouble;

class AvDoub {
double mas[];

    public AvDoub(double[] mas) {
        this.mas = mas;
    }

double average () {
double sum = 0;
for (double x : mas) {sum+=x;}
return sum / mas.length;
}

}

public class AverageForMasOfDouble {


    public static void main(String[] args) {
    double mas[] = {1.0,2.6,5.0};
    AvDoub chis = new AvDoub(mas);
        System.out.println(chis.average());    
        
    
    
    }
    
}
