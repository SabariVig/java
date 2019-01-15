public class prime
{
public static void main(String args[])
{
    int f=0;
    System.out.println("Enter A Number");
        int n = Integer.parseInt(System.console().readLine());
    for(int i=1;i<n;i++)
    {
        if(n%i==0)
        {
            f++;
        }
    }
    if(f==1)
    {
        System.out.println("It Is Prime");
    }
    else{
        System.out.println("Not Prime");
    }
}
}