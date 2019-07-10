import java.util.Scanner;
public class Prime_LCMHCF {

    void lcmhcf(int n1,int n2)
    {
        int temp,hcf;
        int x=n1,y=n2;
        if(n1>n2)
        {
            while(n2!=0)
            {
                temp=n2;
                n2=n1%n2;
                n1=temp;
            }
            hcf=n1;
        }
        else
        {
            while(n1!=0)
            {
                temp=n1;
                n1=n2%n1;
                n2=temp;
            }
            hcf=n2;
        }
        int lcm=(x*y)/hcf;
        System.out.println("The LCM is "+lcm+" and HCF is "+hcf);
    }

    void prime_numbers(int n,int n1)
    {

        for(int i=n;i<n1;i++)
        {
            int c=0;
            for(int j=2;j*j<=i;j++)
            {
                if((i%j)==0)
                {
                    c=2;
                    break;
                }
            }
            if(c==0)
            {
                System.out.println(i);
            }

        }
    }

    public static void main(String args[])
    {
        Prime_LCMHCF p=new Prime_LCMHCF();
        Scanner sc=new Scanner(System.in);
        System.out.println("Choose what you want to perform:- ");
        System.out.println("1.Prime number in a specific range "+"\n"+"2.LCM and HCF of two numbers.");
        int n=sc.nextInt();
        int n1,n2;
        switch(n)
        {
            case 1:System.out.println("Enter the starting point ");
                 n1=sc.nextInt();
                 System.out.println("Enter the ending point ");
                 n2=sc.nextInt();
                p.prime_numbers(n1,n2);
                break;
            case 2:
                System.out.println("Enter the first Number ");
                n1=sc.nextInt();
                System.out.println("Enter the second Number ");
                n2=sc.nextInt();
                p.lcmhcf(n1,n2);

        }

    }


}
