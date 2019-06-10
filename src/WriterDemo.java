
import java.io.FileWriter;

public class WriterDemo {
    public static void main(String args[]) throws Exception {
        
        FileWriter writer=new FileWriter("e:/data/sample.txt");
        writer.write("some data");
        writer.write("stored in a file");
        writer.write("using writeer");
        writer.close();
        System.out.println("data stored");
        
    }
}
