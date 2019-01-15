// import java.util.*;
import java.io.*;
public class readfile
{
public static void main(String args[]) throws IOException
{
    FileReader fr = new FileReader("/home/sabari/Desktop/java/javawrite.txt");
    int i;
    while ((i=fr.read()) != -1) 
    {
        System.out.print((char)i);

    }
    fr.close();
}
}   




