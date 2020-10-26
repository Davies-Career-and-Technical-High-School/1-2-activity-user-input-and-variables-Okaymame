import java.util.Scanner; 



class Question2 {
    public static void main(String[] args) {

        Scanner scan = new Scanner (System.in);


        System.out.println("Please enter 3 names");

        String name1 = scan.nextLine();
        String name2 = scan.nextLine();
        String name3 = scan.nextLine();

        System.out.println(name3 + " "+ name2+ " "+ name1);


    }
}