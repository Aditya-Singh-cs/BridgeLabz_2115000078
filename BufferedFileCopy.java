import java.io.*;

public class BufferedFileCopy {
    private static final int BUFFER_SIZE = 4096; 

    public static void main(String[] args) {
        String sourceFile = "Source.txt"; 
        String bufferedCopy = "buffered_copy.txt";
        String unbufferedCopy = "unbuffered_copy.txt";

        long bufferedTime = copyFileBuffered(sourceFile, bufferedCopy);
        long unbufferedTime = copyFileUnbuffered(sourceFile, unbufferedCopy);

        System.out.println("Buffered Stream Copy Time: " + bufferedTime + " ns");
        System.out.println("Unbuffered Stream Copy Time: " + unbufferedTime + " ns");
    }

    private static long copyFileBuffered(String source, String destination) {
        long startTime = System.nanoTime();
        try (BufferedInputStream bis = new BufferedInputStream(new FileInputStream(source));
             BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream(destination))) {
            byte[] buffer = new byte[BUFFER_SIZE];
            int bytesRead;
            while ((bytesRead = bis.read(buffer)) != -1) {
                bos.write(buffer, 0, bytesRead);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return System.nanoTime() - startTime;
    }

    private static long copyFileUnbuffered(String source, String destination) {
        long startTime = System.nanoTime();
        try (FileInputStream fis = new FileInputStream(source);
             FileOutputStream fos = new FileOutputStream(destination)) {
            int data;
            while ((data = fis.read()) != -1) {
                fos.write(data);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return System.nanoTime() - startTime;
    }
}
