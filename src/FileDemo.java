
import java.io.File;


public class FileDemo {

    public static void main(String[] args) {

        
        //File f=new File("c:/program files");
        File f=new File("e:/prog11/Circle.java");
        long val=f.lastModified();
        java.util.Date dt=new java.util.Date(val);
        System.out.println(val);
        System.out.println(dt);
        
        /*
        String s[]=f.list();
        for(String tmp:s){
            System.out.println(tmp);
        }
        */
        
        
        //boolean res=f.isHidden();
        //boolean res=f.exists();
        //boolean res=f.canWrite();
        //System.out.println(res);
        
        //long val=f.length();
        //System.out.println(val);
        
        
        
    }

}
/*
    Methods of File Class
    -----------------------

    long length()
    boolean exists()
    boolean isFile()
    boolean isDirectory()
    boolean canWrite()
    boolean isHidden()
    String[] list()
    long lastModified()

    boolean mkdir()
    










*/