import java.io.*;
import java.util.Scanner;

public class Input {
    public static void main(String[] args) throws IOException {
        BufferedReader r=new BufferedReader(new InputStreamReader(System.in));
        //bufferedreader is faster than scanner

        Scanner sc=new Scanner(System.in);
        //basic result but slow due to post processing of input

        System.out.println("enter an string ");
        String s= r.readLine();
        System.out.println("you entered "+s);

        int i= Integer.parseInt(r.readLine());
        System.out.println("you entered "+i);

        //these are the input streams used to scan user input

        System.out.println("enter an string ");
        String sec= sc.nextLine();
        System.out.println("you entered "+sec);

        int num= sc.nextInt();
        System.out.println("you entered "+num);


        //command line argument
        //steps in cmd to follow
        //CD into your project folder
        //type javac filename with java extention ->enter
        //type java filename give input next to it whatever you are testing it for -->enter
        //result ;

        //prefix and postfix
        int x=10;
        int z=x++;
        System.out.println(z+""+x);
        int z1= ++x;
        System.out.println(z1+""+x);








    }
}
