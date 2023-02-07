import java.util.Map;
import java.io.FileWriter;
import java.io.IOException;

public class WriterJSON extends WriteFile {

    @Override
    public void FileWriter(Map<String, Double> args) {
        try (FileWriter writer = new FileWriter("file.json", false)) {
            writer.append("{\n");
            int count = 1;
            for (Map.Entry<String, Double> entry : args.entrySet()) {
                if (count < args.size()) {
                    writer.append("\"" + entry.getKey() + "\"" + ":" + entry.getValue() + "," + "\n");
                } else {
                    writer.append("\"" + entry.getKey() + "\"" + ":" + entry.getValue() + "\n");
                }
                count++;
            }
            writer.append("}\n");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
