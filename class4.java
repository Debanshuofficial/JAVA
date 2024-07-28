import java.util.Scanner;


public class class4 {

    public static void family(String firstName, int age){
        System.out.println("The Name is " + firstName + " Ghosh" + " age is " + age );
    }



    public static void testAge(int age){
        if (age > 18){
            System.out.println("You are "+ age + " Driving Access Granted!");
        }
        else if(age < 18){
            System.out.println("You are "+ age +" Driving Access Denied!");
        }
    }

    public static void main(){
        int a = 1432;


        // System.out.println(a);

        // Scanner takeage = new Scanner(System.in);
        // System.out.print("Enter your age: ");
        // int ag = takeage.nextInt();

        // testAge(ag);

    //   family("Shuvangshu", 18);
    //   family("Debanshu", 21);
    // }
    }
}
