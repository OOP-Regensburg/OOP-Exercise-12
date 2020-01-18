import java.io.*;
import java.util.Scanner;

public class Main {
    private static final String FILE_PATH = "data/flights.txt";

    public static void main(String[] args) throws IOException {
        readFlights(loadFile(FILE_PATH));
        initialize();
    }

    private static void initialize() {
    }

    /**
     * Liest die letzte Konsoleneingabe des Nutzers aus
     * @return Nutzereingabe
     */
    private static String readLine() {
        Scanner scanner = new Scanner(System.in);
        return scanner.nextLine();
    }

    /**
     * Lädt die Datei am übergebenen Speicherort in einen BufferedReader
     * @param path
     * @return
     * @throws FileNotFoundException
     */
    private static BufferedReader loadFile(String path) throws FileNotFoundException {
        File file = new File(path);
        FileReader fileReader = new FileReader(file);
        return new BufferedReader(fileReader);
    }

    private static void readFlights(BufferedReader br) throws IOException {
        String line;
        while ((line = br.readLine()) != null) {

        }
    }
}
