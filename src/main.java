import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class main {
    public static void main(String[] args) {

        try (FileInputStream fileInputStream  = new FileInputStream("photo.png");
             FileOutputStream fileOutputStream  = new FileOutputStream("copyphoto.png")) {
            byte[] bytes = new byte[1024];
            int count;
            while ((count=fileInputStream.read(bytes))!=-1){
                fileOutputStream.write(bytes, 0, count);
            }

            System.out.println("Копирование файла произошло успешно.");
        } catch (IOException exception) {
            exception.printStackTrace();
        }
    }
}