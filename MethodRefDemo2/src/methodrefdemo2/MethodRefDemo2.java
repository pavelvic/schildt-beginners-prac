package methodrefdemo2;

public class MethodRefDemo2 {

    public static void main(String[] args) {
        boolean result;

        MyIntNum myNum = new MyIntNum(12);
        MyIntNum myNum2 = new MyIntNum(16);

        IntPredicate ip = myNum::isFactor;
        if (ip.test(3)) {
            System.out.println("3 является делителем " + myNum.getNum());
        }

        ip = myNum2::isFactor;
        if (!ip.test(3)) {
            System.out.println("3 не явдяется делителем " + myNum2.getNum());
        }

        ip = myNum::hasCommonFactor;
        if (ip.test(5)) {
            System.out.println(myNum.getNum() + " и аргумент имеют общий делитель");
        } else {
            System.out.println(myNum.getNum() + " и аргумент без общих делителей");
        }

    }

}
