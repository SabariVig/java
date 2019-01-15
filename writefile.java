// import java.util.*;
import java.io.*;
public class writefile
{
public static void main(String args[]) throws IOException
{
    FileWriter fw=new FileWriter("javawrite.txt");
    System.out.println("Enter Input");
    String sc = System.console().readLine();
    fw.write(sc);
    fw.close();
}
}   