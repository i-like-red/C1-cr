import java.util.Scanner;

public class task1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("输入体重（KG）: ");
        double m = in.nextDouble();
        System.out.print("输入身高（M): ");
        double h = in.nextDouble();
        double BMI = m/(h*h);
        if(BMI < 18.5)
            System.out.println("过低");

        if(BMI >= 18.5 && BMI <25)
            System.out.println("正常");

        if(BMI >= 25 && BMI <25)
            System.out.println("过重");

        if(BMI >= 28 && BMI <32)
            System.out.println("肥胖");

        if(BMI >= 32)
            System.out.println("非常肥胖");

    }
}
