package copyfilesymbolstream;

import java.io.*;

public class CopyFileSymbolStream {

    public static void CopyF(String nameoffile, String nameofcopyfile) {
        //область переменных
        int ch; //очередной символ
        //тело
        //открыть файлы (проверив существуют ли они, обработать исключения)
        try (FileReader file = new FileReader(nameoffile);
                FileWriter copyfile = new FileWriter(nameofcopyfile)) {
            // копирование
            do {
                ch = file.read();
                if (ch == 32) {
                    ch = 45; //заменяем все пробелы на дефисы в выходном файле, используем коды Unicode
                }
                if (ch != -1) {
                    copyfile.write(ch); //избавились от артефакта в конце файла лишнего символа
                }
            } while (ch != -1);
        } //исключение при открытии файла
        catch (FileNotFoundException exc) {
            System.out.println(exc);
        } //исключение при попытке записи-чтения
        catch (IOException exc) {
            System.out.println(exc);
        }
    }

    public static void main(String[] args) {
        //проверяем, что программе передаются имена обоих файлов
        if (args.length != 2) {
            System.out.println("Использование: CopyFile 'исходный файл.txt' 'его копия.txt'. \n Запукайте заново.");
            return;
        }
        //копируем с помощью отдельного универсального метода
        CopyF(args[0], args[1]);
    }

}
