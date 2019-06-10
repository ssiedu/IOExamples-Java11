
import java.io.FileReader;


public class ReaderDemo {

    public static void main(String[] args) throws Exception {
        FileReader reader=new FileReader("e:/data/sample.txt");
        char ch[]=new char[20];
        reader.read(ch);
        for(char tmp:ch){
            System.out.print(tmp);
        }
        reader.close();
    }
}
