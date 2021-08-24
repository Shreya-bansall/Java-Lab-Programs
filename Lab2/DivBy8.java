package Lab1;

public class DivBy8 {
    public static void main(String args[])
    {
        int sum,n,tmp;
        sum=0;
        n=60;

        while(n<=200)
        {
            tmp=n%8;
            
            if(tmp==0)
            {
                sum+=n;
            }
            n++;
        }
        System.out.println("Sum of all integers divisible by 8 between 60 and 200 is: "+sum);
    }
}