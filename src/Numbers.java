import java.util.Scanner;

public class Numbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the array length ");
        int arrayLength = input.nextInt();
        int numbers [] = new int[arrayLength];

        int sum = 0;
        int sub =0;
        System.out.println("Enter the numbers ");
        for(int i =0; i<arrayLength;i++ ) {
            numbers[i] = input.nextInt();
            sum =numbers[i]+sum;

        }
//        for(int i=0;i<arrayLength;i--)
//            sub =numbers[i]-sub;

        int average = sum/arrayLength;
        int count =0;
        for(int i =0;i<arrayLength;i++){
            if(numbers[i]>average){
                count++;
            }
        }

        System.out.println("The average is "+average);
        System.out.println("The number above average are "+count);
    }
}
