import java.util.Scanner;

public class TEST {

    public static void main(String[] args) {

//        Scanner input=new Scanner(System.in);
//        System.out.println("请输入本次的成绩：");
//        double a=input.nextDouble();
//        System.out.println("请输入上次的成绩：");
//        double b=input.nextDouble();
//        if(a>b){
//            double d=(double) ((a-b)/a)*100;
//            System.out.printf("这次成绩提高%.2f%%",d);
//        }if(a<b){
//            double d=(double)((b-a)/a)*100;
//            System.out.printf("这次成绩退步%.2f%%",d);}
        /*
        * 请用if ... else编写一个程序，用于计算体质指数BMI，并打印结果。

        BMI = 体重(kg)除以身高(m)的平方

        BMI结果：

        过轻：低于18.5
        正常：18.5-25
        过重：25-28
        肥胖：28-32
        非常肥胖：高于32
        * */
        //输入体重
        Scanner input=new Scanner(System.in);
        System.out.println("请输入体重（KG）：");
        int g=input.nextInt();
        //输入身高
        System.out.println("请输入身高(米)：");
        float m=input.nextFloat();
        //算出BMI
        float BMI=g/(m*m);
        System.out.println(BMI);
        //根据BMI判断体脂
        if (BMI<18.5) {
            System.out.println("太轻了");
        }else if (BMI>18.5&&BMI<25){
            System.out.println("正常");
        }else if (BMI>25&&BMI<28){
            System.out.println("过重");
        }else if (BMI>28&&BMI<32){
            System.out.println("肥胖");
        }else if (BMI>32){
            System.out.println("超标了！！！");
        }



    }
}
