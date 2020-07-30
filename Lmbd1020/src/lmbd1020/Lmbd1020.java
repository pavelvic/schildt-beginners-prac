
package lmbd1020;


public class Lmbd1020 {


    public static void main(String[] args) {
        //boolean is1020;
        MyValue is1020 = (n) -> (n>=10) && (n<=20);
       if (is1020.test(15)) System.out.println(">=10 и <=20");
    }
    
}
