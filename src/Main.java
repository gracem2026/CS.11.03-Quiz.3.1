public class Main {

    // Question 1 - calculateGrade
    public static char calculateGrade(int grade){
        if (grade >= 90) return 'A';
        else if (grade >= 80) return 'B';
        else if (grade >= 70) return 'C';
        else if (grade >= 60) return 'D';
        else if (grade >= 50) return 'E';
        else return 'F';
    }
    // Question 2 - fizzBuzz
    public static String fizzBuzz(int number){
        if (number % 3 == 0){
            if (number % 5 == 0) return "fizzbuzz";
            else return "fizz";
        }
        else if(number % 5 == 0){
            return "buzz";
        }
        else return "unlucky";
    }

    // Question 3 - frontBack
    public static String frontBack(String str){
        if (str.length() < 2){
            return str;
        }
        else{
            String firstTwo = str.substring(0, 2);
            return firstTwo + str + firstTwo;
        }
    }

    // Question 4 - twoAsOne
    public static boolean twoAsOne(int a, int b, int c){
        if((a + b) == c || (a + c) == b || (b + c) == a){
            return true;
        }
        else return false;
    }

    // Question 5 - endUp
    public static String endUp(String text){
        if (text.length() <= 3){
            return text.toUpperCase();
        }
        else{
            int lastIndex = text.length() - 1;
            String lastThree = text.substring((lastIndex - 2), lastIndex + 1);
            return text.substring(0, lastIndex - 2) + lastThree.toUpperCase();
        }
    }
}
