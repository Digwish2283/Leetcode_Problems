package Juspay;
import java.util.*;
public class Vampire
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int  n=sc.nextInt();
        String str=sc.next();
        char arr[]=str.toCharArray();
        int a[]=new int[arr.length];
        for(int i=0;i<a.length;i++)
            a[i]=Integer.parseInt(arr[i]+"");

        Arrays.sort(a);
        int sum=0;
        for(int i=0;i<a.length;i++) {
            sum = sum + a[i];
        }
        int sumA=0;
        int sumB=sum;
        ArrayList subsetA=new ArrayList();
        for(int i=a.length-1;i>=0;i--) {
        sumA = sumA+a[i];
        sumB = sumB-a[i];
        subsetA.add(a[i]);
            if (sumA>sumB){
                break;
            }
        }

        Iterator itr=subsetA.iterator();
        while(itr.hasNext())
        {

            System.out.print((Integer)itr.next());
        }
    }
}