package CodeGen;

import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class FileUtil {

    // Write string content to a file
    public static void writeFile(String path, String content) {
        try (FileWriter writer = new FileWriter(path)) {
            writer.write(content);
            System.out.println("✅ File written: " + path);
        } catch (IOException e) {
            System.err.println("❌ Error writing file: " + path);
            e.printStackTrace();
        }
    }

    // Read file content as String
    public static String readFile(String path) {
        try {
            return new String(Files.readAllBytes(Paths.get(path)));
        } catch (IOException e) {
            System.err.println("❌ Error reading file: " + path);
            e.printStackTrace();
            return "";
        }
    }
}
