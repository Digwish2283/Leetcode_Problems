package Juspay;
import java.util.*;

public class Principal{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        TreeSet list=new TreeSet<>();
        for(int i=0;i<n;i++)
            list.add(sc.nextInt());

        System.out.println(Math.abs(n-list.size()));
    }
}