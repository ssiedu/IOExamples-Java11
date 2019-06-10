
import java.io.FileOutputStream;

public class WriteData {
    public static void main(String args[]) throws Exception {
        
        FileOutputStream fos=new FileOutputStream("e:/data/output.txt");
        
        String s="this data will be stored to a file";
        byte b[]=s.getBytes();
        //fos.write(b); // writes the complete array
        
        fos.write(b,5,15);
        
        
        
        
        /*
        fos.write(97);
        fos.write(98);
        fos.write(99);
        fos.write(100);
        */
        fos.close();
        System.out.println("DATA STORED");
        
        
        
    }
    
}
/*
    write(int)
    write(byte[])
    write(byte[],int,int)
*/