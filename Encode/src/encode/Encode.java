package encode;

public class Encode {

    public static void main(String[] args) {
        String msg = "Helloworld";
        String encmsg = "";
        String decmsg = "";
        int key;
        String keystr = "keytostr";

        key = keystr.hashCode();

        System.out.print("Исходное сообщение: ");
        System.out.println(msg);

        //зашифровать
        for (int i = 0; i < msg.length(); i++) {
            encmsg = encmsg + (char) (msg.charAt(i) ^ key);
        }

        //зашифрованное
        System.out.print("Зашифрованное сообщение: ");
        System.out.println(encmsg);

        //дешифровать
        for (int i = 0; i < msg.length(); i++) {
            decmsg = decmsg + (char) (encmsg.charAt(i) ^ key);
        }

        //расшифрованное
        System.out.print("Дешифрованное сообщение: ");
        System.out.println(decmsg);
    }

}
