import java.util.Scanner;



class Question3 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter your name");
        String name = scan.nextLine();
        System.out.println("Please enter an adjective");
        String adj = scan.nextLine();

        System.out.println("My name is "+ name + ". i am "+ adj);
    }
}