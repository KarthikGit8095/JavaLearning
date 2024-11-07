import java.util.Scanner;

public class typeCasting {
    public static void main(String[] args) {
        //condition
        //the two types should be compatible
        //destination type should be grater than the source type
        Scanner input =new Scanner(System.in);
        //when you enter a integer no for this the output will be in decimal
        float num1 =input.nextFloat();
        int num2 =input.nextInt();
        //when you enter an decimal no for this the output will show error since the decimal value is bigger
        //than the supported output value which is int
        System.out.println("first output "+num1);
        System.out.println("second output "+num2);

        //TYPE CASTING for incompatible datatype /narrowing conversion
        int num = (int)(67.78f);
        System.out.println("3rd output "+num);


    }
}
