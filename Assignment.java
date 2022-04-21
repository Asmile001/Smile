import java.util.Scanner;

public class class2 {

    public static void main(String[] arg) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a");
        int a = scan.nextInt();
        System.out.println(" Enter b");
        int b = scan.nextInt();
        System.out.println("Enter c");
        int c = scan.nextInt();
        if (a > b && a > c) {

            System.out.println(" A is greater");
        }
        else if(b>a && b>c){
            System.out.println("B is greater");
            }
            else
        {
                System.out.println("C is greater");
            }

        }
    }



