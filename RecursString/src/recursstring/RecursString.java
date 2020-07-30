package recursstring;

public class RecursString {


public void showrevstr (String s) {
    if (s.length()==0) return;
    System.out.print(s.charAt(s.length()-1));
    showrevstr(s.substring(0, s.length()-1));
}

    public static void main(String[] args) {
        RecursString str = new RecursString();
        str.showrevstr("abcdefg");
        System.out.println();

    }
    
}
