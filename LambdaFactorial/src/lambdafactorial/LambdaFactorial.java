
package lambdafactorial;



public class LambdaFactorial {


    public static void main(String[] args) {
        MyFunc<Integer> getFact = (n) -> {
        int result = 1;
        for (int i = 2; i<=n;i++) result = result*i;
        return result;
        };
        System.out.println(getFact.func(5));
    }
    
}
