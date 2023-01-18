package fllespgm;
import java.util.*;
import java.io.*;
public class Filespgm {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the file name to be checked");
        String fname=s.next();
        File f1=new File(fname);
        System.out.println(f1.exists()?"File exists":"File does not exists");
        System.out.println("File path is:");
        System.out.println(f1.getAbsolutePath());
        System.out.println(f1.canRead()?"The file is readable":"The file is not readable");
        f1.setWritable(true);
        System.out.println(f1.canWrite()?"The file is writable":"The file is not writable");
        System.out.println("file size in byte:"+f1.length());
        int index=fname.lastIndexOf(".");
        if(index>0)
                {
                    String type=fname.substring(index+1);
                    System.out.println("File type is"+" "+type);
                    
                }
        else{
            System.out.println("File does not have a type");
        }
    
    
    }
    
}
