import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter your weight:  ");
        double weight = input.nextDouble();
        System.out.println("enter your height In Metres:  ");
        double height = input.nextDouble();
        //invoking function:
        String res = bmi(weight,height);
        System.out.println(res);
    }









    public  static  String bmi (double weight, double height)
    {


        double res = weight/(height*height);
      String BMI="";
     //validation:
        if (res<18.5)
            System.out.println(" نحيف جدا ");
        else if (res>18.5 && res<24.9)
                System.out.println("وزن طبيعي ");
        else if (res > 25 && res < 29.9)
                System.out.println(" زيادة في الوزن ");
            else if (res > 30 && res < 34.9)
                System.out.println("سمنة ضعيفة  ");
            else if (res > 35 && res < 39.9)
                System.out.println("سمنة متوسطة");
            else if (res >= 40)
                System.out.println(" سمنة مفرطة ");



        return BMI + res;
    }

}