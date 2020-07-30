package bubble;

public class Bubble {

    public static void main(String[] args) {
        int nums[] = {99, -10, 100123, 18, -978,
            5623, 463, -9, 287, 49};
        int size = 10; //количество сортируемых элементов
        int a, b, t;

        System.out.println("Исходный массив:");
        for (int i = 0; i < size; i++) {
            System.out.print(" " + nums[i]);
        }
        System.out.println();

        for (a = 1; a < size; a++) {
            for (b = size - 1; b >= a; b--) {
                if (nums[b - 1] > nums[b]) {
                    t = nums[b - 1];
                    nums[b - 1] = nums[b];
                    nums[b] = t;
                }
            }
        }
        System.out.println("Отсортированный массив:");
        for (int i = 0; i < size; i++) {
            System.out.print(" " + nums[i]);
        }
        System.out.println();
    }

}
