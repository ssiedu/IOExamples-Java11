
import java.io.FileInputStream;

public class ReadMultiple {
    public static void main(String args[]) throws Exception {
        FileInputStream fis=new FileInputStream("e:/data/info.txt");
        //I want to read 10 bytes directly
        
        int val=fis.available();
        System.out.println(val);
        
        byte b[]=new byte[val];
        
        fis.read(b);
        
        //converting a byte array to a string
        
        String s=new String(b);
        
        System.out.println(s);
        
        
        
        
        
        
        
        
        
    }
}
