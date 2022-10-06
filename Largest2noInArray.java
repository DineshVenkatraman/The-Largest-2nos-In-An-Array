import java.util.*;
public class Largest2noInArray {

            int i,j,a,n;
        Scanner sd = new Scanner(System.in);
        public void Larg()
        {
            System.out.println("Enter the no of limit : ");
            n=sd.nextInt();
            int num[]=new int[n];
            System.out.println("Enter the Elements : ");
            for(i=0;i<n;i++)
            {
                num[i]=sd.nextInt();
            }
            for(i=0;i<n;i++)
            {
                for(j=i+1;j<n;j++)
                {
                    if(num[i]>num[j])
                    {
                        a=num[i];
                        num[i]=num[j];
                        num[j]=a;
                    }
                }
            }

            System.out.println("The ascending order : ");
            for(i=0;i<n;i++)
            {
                System.out.println(num[i]);
            }
            int larg1,larg2,temp;
            larg1=num[0];
            larg2=num[1];
            if(larg1<larg2)
            {
                temp=larg1;
                larg1=larg2;
                larg2=temp;
            }
            for(i=2;i<n;i++)
            {
                if(num[i]>larg1)
                {
                    larg2=larg1;
                    larg1=num[i];
                }
                else if(num[i]>larg2 && num[i]!=larg1)
                {
                    larg2=num[i];
                }
            }
            System.out.println("The first large is :"+larg1);
            System.out.println("The Second large is :"+larg2);
        }
}
