package Complex;

import java.io.FileWriter;
import java.io.IOException;


public class Logger implements iLoggable {


    @Override
    public void log(String message) {
        try {
            FileWriter writer = new FileWriter("log.txt", true); // true - для добавления записи в конец файла, а не перезаписи
            writer.write(message + "\n");
            writer.close();
        } catch (IOException e) {
            System.err.println("Ошибка записи в лог: " + e.getMessage());
        }

    }
}