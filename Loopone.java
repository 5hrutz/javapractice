import java.util.Scanner;
class Loopone{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the starting value:");
        int Start = scan.nextInt();
        System.out.println("Enter the ending value:");
        int End = scan.nextInt();

        for(int value = Start; value <= End; value++){
            System.out.println("Table of : " + value);
            for(int table = 1; table <= 10; table++){
                System.out.println(value + " x " + table + " = " + (value * table));
            }
            System.out.println();
        }
        scan.close();
    }
    
}
    

