import java.io.File;
import java.util.List;

public class FileDeleter {
    public static void deleteFiles(List<String> files) {
        for (String file : files) {
            File f = new File(file);
            if (f.exists()) {
                f.delete();
                System.out.println("Deleted: " + f.getAbsolutePath());
            } else {
                System.out.println("File not found: " + f.getAbsolutePath());
            }
        }
    }
}