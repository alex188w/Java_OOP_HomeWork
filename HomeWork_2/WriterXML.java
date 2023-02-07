import java.io.FileWriter;
import java.io.IOException;
import java.util.Map;

public class WriterXML extends WriteFile {

    @Override
    public void FileWriter(Map<String, Double> args) {
        try (FileWriter writer = new FileWriter("file.xml", false)) {
            writer.append("<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<table>\n");
            for (Map.Entry<String, Double> entry : args.entrySet()) {
                writer.append(" <student>\n");
                writer.append("     <name>" + entry.getKey() + "</name>\n");
                writer.append("     <grade>" + entry.getValue() + "</grade>\n");
                writer.append(" </student>\n");
            }
            writer.append("</table>\n");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
