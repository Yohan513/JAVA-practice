import java.util.Scanner;

public class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int Score = sc.nextInt();
        
        if(90 <= Score && Score <= 100) {
        	System.out.println("A");
        }
        else if(80 <= Score && Score < 90) {
        	System.out.println("B");
        }
        else if(70 <= Score && Score < 80) {
        	System.out.println("C");
        }
        else if(60 <= Score && Score < 70){
        	System.out.println("D");
        }
        else if(0 <= Score && Score < 60){
        	System.out.println("F");
        }
    }
}
