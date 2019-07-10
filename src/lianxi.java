//使用Scanner收集你的身高体重，并计算出你的BMI值是多少
//
//BMI的计算公式是 体重(kg) / (身高*身高)
//
//比如邱阳波的体重是72kg, 身高是1.69，那么这位同学的BMI就是
//72 / (1.69*1.69) = ?
//
//然后通过条件判断BMI的范围，打印出是超重还是正常

import java.util.Scanner;


public class lianxi {
    public static void main(String[] args){
            System.out.println("请输入体重(kg)：");
            Scanner weight=new Scanner(System.in);
            int i=weight.nextInt();
            System.out.println("请输入你的身高（m）：");
            Scanner height=new Scanner(System.in);
            float a=height.nextFloat();
            double BMI=i/(a*a);
            System.out.println("你的BMI值："+BMI);

            if(BMI<18.5)
                System.out.println("体重过轻");
            else if(BMI>=18.5&&BMI<24)
                System.out.println("正常范围");
            else if(BMI>=24&&BMI<27)
                System.out.println("体重过重");
            else if(BMI>=27&&BMI<30)
                System.out.println("轻度肥胖");
            else if (BMI>=30&&BMI<35)
                System.out.println("中度肥胖");
            else if (BMI>=35)
                System.out.println("重度肥胖");


    }

}
