package simplenumbersfrom2to100;

public class SimpleNumbersFrom2To100 {


    public static void main(String[] args) {
    int i,k;
    boolean isSimple;


for (i = 2; i<=100; i++) {
    isSimple = true;
    for (k=2; k<=i;k++) if (((i%k)==0)&&(i!=k)) isSimple = false;
    if (isSimple) System.out.println(i);
    }
    }
}
    
