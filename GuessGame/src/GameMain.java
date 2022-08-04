import java.util.Scanner;
class Rectangle{
    int length;
    int breath;

    public Rectangle(int length , int breath){
        this.length = length;
        this.breath = breath;

    }

}

public class GameMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of length:");
        int length = sc.nextInt();
        System.out.println("Enter the value of Breath:");
        int breath = sc.nextInt();
        int result = length * breath;
        Rectangle c = new Rectangle(length , breath);
        System.out.println("Area will be:"+ result);



    }
}

