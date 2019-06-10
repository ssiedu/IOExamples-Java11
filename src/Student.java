
import java.io.Serializable;

public class Student implements Serializable {
    
    private int rno;
    private String name;
    private String branch;
    private int sem;
    
    public void setData(int a, String b, String c, int d){
        rno=a; name=b;
        branch=c; sem=d;
    }
    public void showData(){
        System.out.println(rno+","+name+","+branch+","+sem);
    }
}
