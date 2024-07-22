package Exce;

import java.io.IOException;

public class MultiCatchBlock {
    public static void processFile(String filePath) throws IOException, IllegalArgumentException {
        if (filePath == null) {
            throw new IllegalArgumentException("File path cannot be null");
        }
        if (!filePath.endsWith(".txt")) {
            throw new IOException("Unsupported file type");
        }
        
    }

    public static void main(String[] args) {
        try {
            processFile(null);
        } catch (IOException | IllegalArgumentException e) {
            System.out.println("Exception caught: " + e.getMessage());
        }
    }
}