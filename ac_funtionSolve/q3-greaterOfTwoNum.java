import java.util.Scanner;

public class greaterOfTwoNum {
    public static int bigNum(int a, int b){
        if(a>b){
            return a;
        }
        else{
            return b;
        }
        

    }

    public static void main(String args[]){
        Scanner cin = new Scanner(System.in);
        int a =cin.nextInt();
        int b = cin.nextInt();
        System.out.println("Bigger Number Between "+ a+ " and "+b+" is " + bigNum(a,b));

    }
}