//  write a program to get the number from the user and print whether it is positive or negative 
import java.util.Scanner;
class day3{
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        System.out.println("enter the number?");
        int n = scan.nextInt();
        if(n>0){
            System.out.println("the number is positive");
        }
        else{
            System.out.println("the number is negative");

        }
    }
    
}