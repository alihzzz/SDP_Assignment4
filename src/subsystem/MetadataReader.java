package subsystem;

public class MetadataReader {

    public String readFormat(String fileName) {
        int dotIndex = fileName.lastIndexOf('.');
        if (dotIndex == -1 || dotIndex == fileName.length() - 1) {
            throw new IllegalArgumentException("File has no extension: " + fileName);
        }
        String format = fileName.substring(dotIndex + 1).toLowerCase();
        System.out.println("[MetadataReader] " + fileName + " -> format: " + format);
        return format;
    }
}