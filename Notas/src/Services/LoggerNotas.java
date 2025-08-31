package Services;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.time.LocalDateTime;

public class LoggerNotas {
    private static final String LOG_FILE = "Notas_log.txt";

    public static void registrar (String mensagem) {
        try (FileWriter fw = new FileWriter(LOG_FILE, true);
             PrintWriter pw = new PrintWriter(fw)){
            pw.println(LocalDateTime.now() + " - " + mensagem);
        }catch (IOException e){
            System.err.println("Erro ao registrar o log: " + e.getMessage());
        }
    }
}
