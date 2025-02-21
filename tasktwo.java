import java.util.Scanner;
public class tasktwo {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the first number:");
        int num1 = scan.nextInt();
        System.out.println("Enter the second number:");
        int num2 = scan.nextInt();

        System.out.println("Select the operation:");
        System.out.println("1. ADDITION");
        System.out.println("2. SUBTRACTION");
        System.out.println("3. MULTIPLICATION");
        System.out.println("4. DIVISION");
        System.out.println("Choose the operation of your choice:");
        int choice = scan.nextInt();

        if(choice == 1){
            int result = num1 + num2;
            System.out.println(result);

        }
        else if(choice == 2){
            int result = num1-num2;
            System.out.print(result);
        }
        else if(choice == 3){
            int result = num1 *num2;
            System.out.println(result);
        }
        else{
            System.out.println("YOUR CHOICE IS INVALID:");
        }

        scan.close();












        
    }
    
}

