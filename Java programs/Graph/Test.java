package Graph;

public class Test {
    

    public static void main(String args[])
    {
        int n=373;
        int m=n,k=0,c=0,i=0,a=0,f=0,b=0;
        for(i=1;i<=n;i++)
        {
            if(n%i==0)
            c++;
        }
        while(n>0)
        {
            n=n/10;
            k++;
        }
        if(c==2)
        {
            while(m>0)
            {
                m=m/10;
                a=m;
                for(i=1;i<=a;i++)
                {
                    if(a%i==0)
                    f++;
                }
                if(f==2)
                b++;
                f=0;
            }
        }
        if(b==k)
        System.out.println("Absolute Prime");
        else
        System.out.println("Not a Prime Number");
    }
}          
    

