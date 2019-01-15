public class door
{


public static void random() {
  int a []= new int[100];
  for(int i =0;i<100;i++)
  { 
  double ran= (int)(Math.random() * (0+2));
  int t=(int)ran;
  // System.out.println(t);
  a[i]=t;
  }


  for(int i:a)
  {
    System.out.println(a[i]);
  }
  System.out.println(a.length);
  
// System.out.println("---------End Of Creating Random Values----------");

for(int i:a)
{
  if(i%2==0)
  {
    if(a[i]==0)
    {
      a[i]=1;
    }
  }
  else{
    if(a[i]==1)
    {
      a[i]=0;
    }
  }
}
// System.out.println("------End Of Changing Doors ----");
int c=0;
for(int i:a)
{
  if(a[i]==1)
  {
    c++;
  }
}
   
System.out.println("The No Of Doors open is "+c);
}



public static void main(String args[])
{
  //  System.out.println("Hello World");
  //  lol();
  random();
}
}
