package enumdemo;

public class EnumDemo {

    public static void main(String[] args) {

        for (Tools tls : Tools.values()) {
            System.out.println(tls.name() + " " + tls.ordinal() + " " + tls.getMas());

        }
    }

}
