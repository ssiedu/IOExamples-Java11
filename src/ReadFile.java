
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ReadFile {

    public static void main(String args[]) throws IOException {

        FileInputStream fis=null;
        
        try{

            fis = new FileInputStream("e:/data/info.txt");
            while (true) {
                int n = fis.read();
                if (n == -1) {
                    break;
                }
                System.out.print((char) n);
            }
        } catch (Exception e) {
            System.out.println("Something Wrong");
        } finally{
            fis.close();
        }
    }
}
/*
    Input
*/
