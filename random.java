import java.util.Random;
public class Random1 {

    public static void main(String args[])
    {
        Random rand=new Random();
        int n= rand.nextInt(100);
        System.out.println("The generated random number is " +n);
    }


}


