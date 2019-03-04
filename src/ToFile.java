import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class ToFile {


    public void consoleToFile() {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String input;
        while (true) {
            System.out.print("Input: ('quit' for exit) ");
            input = null;
            try {
                input = bufferedReader.readLine();
            } catch (IOException e) {
                e.printStackTrace();
            }
            if (input.equalsIgnoreCase("quit")) {
                System.out.println("Exit!");
                break;
            }
            Path path = Paths.get("c:/output.txt");

            try (BufferedWriter writer = Files.newBufferedWriter(path)) {
                writer.write(input);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }
}
