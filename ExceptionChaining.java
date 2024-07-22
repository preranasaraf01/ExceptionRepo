package Exce;

import java.io.FileNotFoundException;

class FileProcessingException extends Exception {
    public FileProcessingException(String message, Throwable cause) {
        super(message, cause);
    }
}

public class ExceptionChaining {
	public static void processFile(String filePath) throws FileProcessingException {
        try {
            throw new FileNotFoundException("File not found: " + filePath);
        } catch (FileNotFoundException e) {
            throw new FileProcessingException("Error processing file", e);
        }
    }

    public static void main(String[] args) {
        try {
            processFile("example.txt");
        } catch (FileProcessingException e) {
            System.out.println("FileProcessingException caught: " + e.getMessage());
            System.out.println("Original cause: " + e.getCause());
        }
    }
}