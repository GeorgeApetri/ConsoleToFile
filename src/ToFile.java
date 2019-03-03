import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class ToFile {

    public String input;

    public void writeToFile() {
        Path path = Paths.get("c:/output.txt");

        try (BufferedWriter writer = Files.newBufferedWriter(path)) {
            writer.write(input);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void setInput(String input) {
        this.input = input;
    }
}
