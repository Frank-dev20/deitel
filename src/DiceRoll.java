import java.security.SecureRandom;
import java.util.Arrays;
import java.util.Scanner;

public class DiceRoll {
    public static void main(String[] args) {
//        SecureRandom diceRandom = new SecureRandom();
//        int[] numberOfOccurrence = new int[7];
//        for(int numberOfRoll =1; numberOfRoll <=60000; numberOfRoll++){
//            ++numberOfOccurrence[diceRandom.nextInt(7)];
//
//        }
//        System.out.printf("%s%20s%n ", "face", "numberOfOccurrence" );
//        for(int face =1; face <= numberOfOccurrence.length-1; face++){
//            System.out.printf("%3d%15d%n ", face, numberOfOccurrence[face]);
//        }
//        int [] grades = {2,4,2,5,6,3,4};
//        String name = "39287376298";
//        char[] letters = name.toCharArray();
//        int length = name.length();
//        for(int counter = 0; length>counter;length++) {
//
//        }

//        int max [] = new int[0];
//        int myList[];
//        for(int i =1; i< max.length;i++){
//            if(myList[1]>max){
//                max =myList[i]
//            }
//        }

//        int arrays[][] ={{1,2,3,4},{2,3,4,6}};
//        System.out.println("Values in arrays by rows and column are ");
//        for(int row =0; row< arrays.length;row++){
//            for(int column = 0; column< arrays[row].length;column++){
//                System.out.printf("%d ", arrays[row][column]);
//            }
//            System.out.println();
//        }

        String [] months = {"January", "February", "March", "April","May", "June","July","August","September","October","November","December"};
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number to select month");
        int monthNumber = input.nextInt();

        System.out.println("The month is " +months[monthNumber]);
    }
}
