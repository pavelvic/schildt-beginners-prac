package copyfile;

import java.io.*;

public class CopyFile {

    public static void CopyF(String nameoffile, String nameofcopyfile) {
        //область переменных
        int ch; //очередной символ
        FileInputStream file = null; //поток для чтения исходного файла
        FileOutputStream copyfile = null; //поток для записи в целевой файл

        //тело
        //открыть файлы (проверив существуют ли они, обработать исключения)
        try {
            file = new FileInputStream(nameoffile);
            copyfile = new FileOutputStream(nameofcopyfile);

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
        } finally {
            //блок закрытия файлов (переделать на трай с ресурсами)
            try {
                if (file != null) {
                    file.close(); //закрывать только если файл вообще открывался
                }
            } catch (IOException exc) {
                System.out.println("Ошибка закрытия входного файла " + exc);
            }

            try {
                if (copyfile != null) {
                    copyfile.close(); //закрывать только если файл вообще открывался
                }
            } catch (IOException exc) {
                System.out.println("Ошибка закрытия выходного файла " + exc);
            }
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
