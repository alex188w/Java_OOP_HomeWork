import java.io.FileWriter;
import java.io.IOException;
import java.util.Map;

public class WriterTXT extends WriteFile {

    @Override
    public void FileWriter(Map<String, Double> args) {
        try (FileWriter writer = new FileWriter("file.txt", false)) {
            for (Map.Entry<String, Double> entry : args.entrySet()) {
                writer.append(entry + "\n");
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
