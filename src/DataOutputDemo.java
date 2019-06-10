
import java.io.DataOutputStream;
import java.io.FileOutputStream;

public class DataOutputDemo {
    public static void main(String args[]) throws Exception {
        
        int eno=1111;
        double sal=56400.50;
        boolean married=true;

        FileOutputStream fos=new FileOutputStream("e:/data/empinfo.txt");
        DataOutputStream dos=new DataOutputStream(fos);
        dos.writeInt(eno);
        dos.writeDouble(sal);
        dos.writeBoolean(married);
        dos.close();
        fos.close();
        System.out.println("Data Stored");
        
        
        
        
        
    }
}
/*
    DataOutputStream
    --------------------

    void writeByte(byte)
    void writeShort(short)
    void writeInt(int)
    void writeLong(long)
    void writeFloat(float)
    void writeDouble(double)
    void writeBoolean(boolean)













*/