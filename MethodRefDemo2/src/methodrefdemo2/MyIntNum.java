package methodrefdemo2;

public class MyIntNum {

    private int v;

    public MyIntNum(int x) {
        v = x;
    }

    int getNum() {
        return v;
    }

    boolean isFactor(int n) {
        return (v % n) == 0;
    }

    boolean hasCommonFactor(int n) {
        for (int i = 2; i < Math.min(v, n); i++) {
            if (((v & i) == 0) & ((n % i) == 0)) {
                return true;
            }
        }
        return false;
    }

}
