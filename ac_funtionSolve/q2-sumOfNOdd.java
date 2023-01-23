
import java.util.*;
public class SumOfNOdd {
    //Function that return all odd summation from start to n
    public static int sum(int n){

        int i,sum =0;
        for(i =1;i<=n;i=i+2){
            sum +=i;
        }
        return sum;
    }

    public static void main(String args[]){
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        System.out.println("sum of all odd numbers from 1 to "+ n +" is: "+sum(n));
    }

}