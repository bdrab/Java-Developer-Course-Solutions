import exercise_40.Car;
import exercise_40.Ford;
import exercise_40.Mitsubishi;
import exercise_41.DeluxeBurger;
import exercise_41.Hamburger;

import java.io.Serial;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

//        System.out.println(sumOdd(1,11));
//        System.out.println(Math.abs(-2));
//        System.out.println(isPalindrome(9));
//        System.out.println(FirstLastDigitSum(1244));
//        System.out.println(hasSameLastDigit(10,10,10));
//        System.out.println(getGreatestCommonDivisor(45, 90));
//        System.out.println(isPerfectNumber(-1));
//        System.out.println(getDigitCount(3));
//        numberToWords(100);
//        inputThenPrintSumAndAverage();
//        System.out.println(Math.sqrt(2));
        Hamburger ham = new DeluxeBurger();
        ham.addHamburgerAddition1("Tomato", 123);
        System.out.println("Total Burger price is " + ham.itemizeHamburger());

    }

    public static int getBucketCount(double width,double height,double areaPerBucket,int extraBuckets){
        if(width<=0||height<=0||areaPerBucket<=0||extraBuckets<0) return -1;
        return (int)Math.ceil((height*width)/areaPerBucket)-extraBuckets;
    }

    public static int getBucketCount(double width,double height,double areaPerBucket){
        if(width<=0||height<=0||areaPerBucket<=0) return -1;
        return (int)Math.ceil((height*width)/areaPerBucket);
    }

    public static int getBucketCount(double area,double areaPerBucket){
        if(area<=0||areaPerBucket<=0) return -1;
        return (int)Math.ceil(area/areaPerBucket);
    }

    public static void inputThenPrintSumAndAverage(){
        int numberCounter = 0;
        int sum = 0;
        long avg = 0;
        boolean endOfLoop = false;
        Scanner scanner = new Scanner(System.in);

        do{
            String userInput = scanner.nextLine();

            try{
                int number = Integer.parseInt(userInput);
                sum += number;
                numberCounter ++;
            }catch(NumberFormatException a){
                endOfLoop = true;
            }




            System.out.println("hi");
        }while(!endOfLoop);

        if(numberCounter > 0) {
            avg = Math.round((double)sum / numberCounter);
        }
        System.out.println("SUM = " +sum+" AVG = " + avg);


    }

    public static void numberToWords(int number){
        if(number < 0){
            System.out.print("Invalid Value");
        }

        int reversedNumber = reverse(number);
        int loopCounter = getDigitCount(number);
        int currentLetter = 0;

        for(int i =0; i < loopCounter; i++){
            switch (reversedNumber % 10) {
                case 0 -> System.out.print("Zero ");
                case 1 -> System.out.print("One ");
                case 2 -> System.out.print("Two ");
                case 3 -> System.out.print("Three ");
                case 4 -> System.out.print("Four ");
                case 5 -> System.out.print("Five ");
                case 6 -> System.out.print("Six ");
                case 7 -> System.out.print("Seven ");
                case 8 -> System.out.print("Eight ");
                case 9 -> System.out.print("Nine ");
                default -> {
                }
            }
            reversedNumber = reversedNumber / 10;
        }
        System.out.println();

    }

    public static int reverse(int number){
        int reversedNumber = 0;
        while(number != 0){
            reversedNumber = 10 * reversedNumber + number % 10;
            number = number / 10;
        }
        return reversedNumber;
    }

    public static int getDigitCount(int number){
        if(number < 0){
            return -1;
        }
        int digitCounter = 1;
        while(number > 9){
            digitCounter ++;
            number = number / 10;
        }
        return digitCounter;
    }

    public static boolean isPerfectNumber(int number){
        if(number < 0){
            return false;
        }

        int numberWhile = number - 1;
        int sum = 0;
        while(numberWhile > 0 ){

            if(number % numberWhile ==0){
                sum += numberWhile;
            }
            numberWhile --;
        }
        return sum == number;
    }

    public static int getGreatestCommonDivisor(int first, int second){
        int greatestDivisor = 0;
        if (first < 10 || second < 10){
            return -1;
        }
        int divisor = first;

        while (divisor > 0){
            if((first % divisor == 0) && (second % divisor == 0)){
                greatestDivisor = divisor;

                break;
            }
            divisor --;
        }


        return greatestDivisor;
    }

    public static boolean hasSameLastDigit(int number1, int number2, int number3){
        if(number1 < 10 || number2 < 10 || number3 < 10|| number1 > 1000|| number2 > 1000|| number3 > 1000){
            return false;
        }
        number1 %= 10;
        number2 %= 10;
        number3 %= 10;
        return ((number1 == number2) || (number1 == number3) || (number2 == number3));


    }

    public static int FirstLastDigitSum(int number){
        number = Math.abs(number);
        int numberToWhile = number;
        int reversedNumber = 0;
        int lastDigit = 0;

        while(numberToWhile > 0){
            lastDigit = numberToWhile % 10;
            numberToWhile = numberToWhile / 10;
            reversedNumber = 10 * reversedNumber + lastDigit;
        }


        return (lastDigit + (number % 10));
    }

    public static boolean isPalindrome(int number){
        number = Math.abs(number);
        int numberToWhile = number;
        int reversedNumber = 0;
        int lastDigit = 0;



        while(numberToWhile > 0){

            lastDigit = numberToWhile % 10;
            numberToWhile = numberToWhile / 10;
            reversedNumber = 10 * reversedNumber + lastDigit;
        }
        if (reversedNumber == number)
            return true;
        return false;

    }

    public static boolean isOdd(int number){
        if (number <= 0){
            return false;
        }
        if (number % 2 == 0){
            return false;
        }
        return true;
    }

    public static int sumOdd(int start, int stop){
        int sum = 0;

        if((start < 0) || (stop < 0)||(stop < start)){
            return -1;
        }

        for(int i = start; i <= stop; i ++ ){
            System.out.println(i);
            if(isOdd(i)){
                sum += i;
            }
        }
        return sum;
    }
}
