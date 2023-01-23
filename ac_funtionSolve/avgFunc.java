import java.util.Scanner;
import java.util.*;
public class Main {
    public static int avg(int a, int b,int c) {
        return (a+b+c)/3;
    }
    public static void main(String args[]){
        Scanner cin = new Scanner(System.in);
        int a = cin.nextInt();
        int b = cin.nextInt();
        int c = cin.nextInt();

        System.out.println("Answer = "+avg(a,b,c));
        }
    }
