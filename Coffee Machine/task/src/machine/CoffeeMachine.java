package machine;
import java.util.Arrays;
import java.util.Scanner;
public class CoffeeMachine {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Write how many ml of water the coffee machine has:");
        int water=sc.nextInt();
        System.out.println("Write how many ml of milk the coffee machine has:");
        int milk=sc.nextInt();
        System.out.println("Write how many grams of coffee beans the coffee machine has:");
        int beans=sc.nextInt();
        System.out.println("Write how many cups of coffee you will need:");
        int cup=sc.nextInt();
        int w=water/200;
        int m=milk/50;
        int b=beans/15;
        int[] a=new int[3];
        a[0]=w;
        a[1]=m;
        a[2]=b;
        Arrays.sort(a);
        System.out.println(a[0]);

        if (a[0]>=cup){
            System.out.println("Yes, I can make that amount of coffee");
        }
        else if (a[0]<cup){
            System.out.println("Yes, I can make that amount of coffee (and even "+a[0]+" more than that)");
        }
        else {
            System.out.println("No, I can make only "+0+" cup (s) of coffee");
        }

    }
}
