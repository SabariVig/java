public class palindrome
{
    public static String palin(String  n) 
    {
        int f=0;
        for(int i=0;i<n.length();i++)
        {   
            if(n.charAt(i)!=n.charAt(n.length()-(i+1)))
            {
                f++;
            }
        }
        if(f<1)
        {
            return "It Is Palindrome";
        }
        else{
            return "It Is Not Palindrome";
        }
        
    }
public static void main(String args[])throws Exception
{
    System.out.println("Enter A Number Or A String");
    String n = System.console().readLine();
    palin(n);
    System.out.println(palin(n));
}
}