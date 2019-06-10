
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class ObjectOutputDemo {
    public static void main(String args[]) throws Exception {
        
        Student s1=new Student();
        s1.setData(111, "AAA", "CS", 4);
        s1.showData();
        //storing the above object to a file (studinfo.txt)
        //for writing an object use ObjectOutputStream
        FileOutputStream fos=new FileOutputStream("e:/data/studinfo.txt");
        ObjectOutputStream oos=new ObjectOutputStream(fos);
        oos.writeObject(s1);
        
        oos.close(); fos.close();
        
        System.out.println("Object Stored");
        
        
    }
}
