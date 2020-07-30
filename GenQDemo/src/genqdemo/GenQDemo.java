package genqdemo;

public class GenQDemo {

    public static void main(String[] args) {
        //очередь для хранения целых чисел
        Integer iStore[] = new Integer[10];
        GenQueue<Integer> q = new GenQueue<>(iStore);
        Integer iVal;
        System.out.println("Демонстрация очереди чисел типа ");

        try {
            for (int i = 0; i < 5; i++) {
                System.out.println("Добавление " + i + " в очедерь q");
                q.put(i);

            }

        } catch (QueueFullException exc) {
            System.out.println(exc);
        }
        System.out.println();

        try {
            for (int i = 0; i < 5; i++) {
                System.out.print("Получение след числа типа Integer из очереди q: ");
                iVal = q.get();
                System.out.println(iVal);
            }
        } catch (QueueEmptyException exc) {
            System.out.println(exc);
        }

        System.out.println();

        Double dStore[] = new Double[10];
        GenQueue<Double> q2 = new GenQueue<>(dStore);

        Double dVal;
        System.out.println("Демонстрация очереди типа Double");

        try {
            for (int i = 0; i < 5; i++) {
                System.out.println("Добавление " + (double) i / 2 + " в очередь q2");
                q2.put((double) i / 2);
            }
        } catch (QueueFullException exc) {
            System.out.println(exc);
        }
        System.out.println();

        try {
            for (int i = 0; i < 5; i++) {
                System.out.print("Получение следующего числа типа Double из очереди q2 ");

                dVal = q2.get();
                System.out.println(dVal);

            }
        } catch (QueueEmptyException exc) {
            System.out.println(exc);
        }

        System.out.println();
        System.out.println("проверка динамической очереди");
        
        Double dynStore[] = new Double[10];
        GenDynQueue<Double> qDyn = new GenDynQueue<>(dynStore);
        try {
            for (double i = 0; i < 30; i=i+0.1) {
                System.out.println("Добавление " + i + " в очедерь qDyn");
                qDyn.put(i);

            }

        } catch (QueueFullException exc) {
            System.out.println(exc);
        }

    }

}
