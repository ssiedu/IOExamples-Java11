
import java.io.File;
import java.io.IOException;

public class FileTest {
    public static void main(String args[]) throws IOException{
        
        File f=new File("e:/data/myfile.bmp");
        boolean res=f.createNewFile();
        
        /*
        File f1=new File("e:/data/info.txt");
        File f2=new File("e:/data/test.txt");
        boolean res=f2.renameTo(f1);
        */
        
        
        //File f=new File("e:/data/aaa");
        //boolean res=f.delete();
        //boolean res=f.mkdir();
        if(res==true){
            System.out.println("Operation Success");
        }else{
            System.out.println("Operation Failed");
        }
        
        
    }
}
/*
    boolean mkdir()
    boolean delete()
    boolean renameTo(File)
    boolean createNewFile()
    
*/