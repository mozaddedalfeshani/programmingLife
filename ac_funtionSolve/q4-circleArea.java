import java.util.Scanner;

public class circleArea {
    public static float area(int r){
        return (float) (3.1416*r*r);
    }

    public static void main(String args[]){
        Scanner cin = new Scanner(System.in);
        int r = cin.nextInt();
        System.out.println("The area of r = "+area(r));

    }
}