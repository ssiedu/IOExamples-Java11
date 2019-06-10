
import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class ObjectInputDemo {
    public static  void main(String args[]) throws Exception {
        
        FileInputStream fis=new FileInputStream("e:/data/studinfo.txt");
        ObjectInputStream ois=new ObjectInputStream(fis);
        Student st=(Student) ois.readObject();
        st.showData();
        ois.close();
        fis.close();
    }
}
