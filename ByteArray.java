import java.io.*;

public class ByteArray{
    public static void main(String[] args){
        String originalImagePath = "original.jpg";
        String newImagePath = "copy.jpg";
        
        try{
            ByteArrayOutputStream baos = new ByteArrayOutputStream();
            try (FileInputStream fis = new FileInputStream(originalImagePath)){
                byte[] buffer = new byte[1024];
                int bytesRead;
                while((bytesRead = fis.read(buffer)) != -1){
                    baos.write(buffer, 0, bytesRead);
                }
            }
            byte[] imageBytes = baos.toByteArray();
            
            ByteArrayInputStream bais = new ByteArrayInputStream(imageBytes);
            ByteArrayOutputStream baosCopy = new ByteArrayOutputStream();
            byte[] copyBuffer = new byte[1024];
            int bytesCopied;
            while((bytesCopied = bais.read(copyBuffer)) != -1){
                baosCopy.write(copyBuffer, 0, bytesCopied);
            }
            byte[] copiedBytes = baosCopy.toByteArray();
            
            try(FileOutputStream fos = new FileOutputStream(newImagePath)){
                fos.write(copiedBytes);
            }
            
            File originalFile = new File(originalImagePath);
            File newFile = new File(newImagePath);
            if(originalFile.length() == newFile.length()){
                System.out.println("The new image file is identical to the original image (file sizes match).");
            } else{
                System.out.println("The new image file is not identical to the original image.");
            }
            
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
