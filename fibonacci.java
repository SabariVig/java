public class fibonacci 
{

    public static void main(String[] args) {

        int t1 = 0, t2 = 1;
        System.out.println("Enter The No Of Elements To Print");
        int n = Integer.parseInt(System.console().readLine()); 

        for (int i = 1; i <= n; i++)
        {
            System.out.print(t1 + " ");
            int sum = t1 + t2;
            t1 = t2;
            t2 = sum;
        }
    }
}