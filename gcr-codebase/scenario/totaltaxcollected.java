import java.util.Scanner;
public class totaltaxcollected2 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[10];
        for(int i=0;i<10;i++){
            System.out.println("Enter the income of person "+(i+1));
            arr[i] = sc.nextInt();
        }
        int total_tax = 0;
        int tax=0;
        for(int i=0;i<10;i++){
            if(arr[i]<10000){
                tax = arr[i]*5/100;
                total_tax = total_tax+tax;
                System.out.println(arr[i]+ " 5% tax charges "+tax);
            }
            else if(arr[i]>=10000 && arr[i]<=50000){
                tax = arr[i]*15/100;
                total_tax = total_tax+tax;
                System.out.println(arr[i]+ " 15% tax charges "+tax);
            }
            else{
                tax = arr[i]*30/100;
                total_tax = total_tax+tax;
                System.out.println(arr[i]+ " 30% tax charges "+tax);
            }
        }
        System.out.println("Total tax collected by the kingdom is "+total_tax);
    }
}
