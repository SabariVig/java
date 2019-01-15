public class amstrong
{
public static void main(String args[])
{
    int f,s,l,t1;
    System.out.println("Enter A No");
    int n = Integer.parseInt(System.console().readLine());
    f=(n/10)/10;
    t1=n/10;
    s=t1%10;
    l=n%10;
    // System.out.println(f+"  "+s+"  "+l);
    if(((f*f*f)+(s*s*s)+(l*l*l))==n)
    {
        System.out.println("It Is Amstrong Number");
    }
    else
    {
        System.out.println("It Is Not Amstrong Number");
    }

}
}