
import java.io.FileInputStream;

public class SkipDemo {
public static void main(String args[]) throws Exception {
    
        FileInputStream fis=new FileInputStream("e:/data/info.txt");
        
        System.out.println((char)fis.read());//A->B
        System.out.println((char)fis.read());//B->C
        System.out.println((char)fis.read());//C->D
        fis.skip(3);//D,E,F->G
        System.out.println((char)fis.read());//G->H
        System.out.println((char)fis.read());//H->I
        System.out.println((char)fis.read());//I->J
        System.out.println((char)fis.read());//J->K
        fis.skip(2);//K,L->M
        System.out.println((char)fis.read());//M
        
        
        
        
        
        
        
        
    }    
}
