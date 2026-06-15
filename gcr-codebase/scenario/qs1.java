import java.util.Scanner;

public class pq1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String name=sc.next();
        int age=sc.nextInt();
        int rank=sc.nextInt();
        int salary=sc.nextInt();
        Double fee=sc.nextDouble();
        int bonus= (int)(salary*0.12);
        System.out.println("WELCOME TO CODING GUILD");
        System.out.println("Name            : " + name);
        System.out.println("Age             : " + age);
        System.out.println("Rank            : " + rank);
        System.out.println("Salary          : ₹" + salary);
        System.out.println("Membership Fees : ₹" + fee);
        System.out.println("Annual Bonus    : ₹" + bonus);
        System.out.println("Welcome, " + name + "! We're glad to have you.");
    }
}