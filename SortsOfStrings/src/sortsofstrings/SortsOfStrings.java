package sortsofstrings;

public class SortsOfStrings {


    public static void main(String[] args) {
        String str[] = {"пузырьковая","сортировка", "может", "применяться", "для",
                  "сортировки","массивов","строк!","один","два"};
    int size = 10; //количество сортируемых элементов
    int a,b;
    String t;
    
    
        System.out.println("Исходный массив:");
        for (String str1 : str) {
            System.out.print(" " + str1);
        }
        System.out.println();
    
    

    
        for (a=1;a<str.length;a++) {
      for (b=str.length-1; b>=a;b--) {
        if (str[b-1].compareTo(str[b])>0) {
          t= str[b-1];
          str[b-1] = str[b];
          str[b] = t;
        }
      }
    }
    System.out.println("Отсортированный массив:");
        for (String str1 : str) {
            System.out.print(" " + str1);
        }
        System.out.println();
    }
    
}
