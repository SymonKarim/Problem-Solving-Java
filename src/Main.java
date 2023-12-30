//1. Sum of Array Elements: Write a program to find the sum of all elements in an array.
//2. Largest Element in Array: Find and print the largest element in an array.
//3. Even or Odd Numbers: Check if a given number is even or odd using if-else. (also count in an array)
//4. Reverse an Array: Reverse the elements of an array.
//5. Factorial Calculation: Write a program to calculate the factorial of a given number.********* + recursive solution.
//6. Palindrome Check: Check if a given string is a palindrome. (use char string)
//7. Prime Number Check: Determine whether a given number is prime.
//8. Fibonacci Series: Generate and print the first N elements of the Fibonacci series.******** + recursive solution.
//9. Linear Search: Implement a linear search algorithm to find an element in an array. (true or false return type)
//10. Binary Search: Implement binary search for a sorted array.
//11. Duplicate Elements: Find and print duplicate elements in an array. (true or false return type)
//12. Count Vowels and Consonants: Count the number of vowels and consonants in a given string. (a, e, i, o, u)
//13. Multiplication Table: Print the multiplication table for a given number. (2 x 1 = 1, 2 x 2 = 4)
//14. Matrix Addition: Add two matrices and print the result. 5x5 5x5 (return 2d array)
//15. Calculate Average: Calculate the average of elements in an array.
//16. Leap Year Check: Determine whether a given year is a leap year.
//17. Pattern Printing: Print a pattern (e.g., a pyramid) using loops. (google patterns of loop)
//18. String Reversal: Reverse a given string without using built-in functions. apple, elppa
//19. Armstrong Number: Check if a number is an Armstrong number.
//20. Find Minimum and Maximum: Write a program to find the minimum and maximum values in an array.
//21. Calculate the simple interest for given principal, rate of interest, and time.
//22. Write a program to convert temperatures from Celsius to Fahrenheit and vice versa.
//23. Write a program that checks whether the input character is an uppercase letter, lowercase letter, a digit, or a special 24. character.
//24. Write a program to find the second largest number in a given array.
//25. Given a string containing both letters and numbers, find the sum of all the numbers in the string.
import java.util.*;

public class Main {

    public static void main(String[] args) {
//       Scanner input = new Scanner(System.in);
//        int[] arr;
//        System.out.println("Size of the array: ");
//        int size =  input.nextInt();
//        arr = new int[size];
//        for(int i=0;i<size;i++){
//            arr[i] = input.nextInt();
//        }
        int[] arr = {1, 2, 3, 4, 5,6,7,8,9,10,10};
        sumOfTheArray(arr); //1
        largestElementOfArray(arr); //2
        evenOrOddNumbers(arr); //3
        reverseArray(arr); //4
        factorialCalculation(); //5
        palindromeCheck(); //6
        primeNumberCheck(); //7
        fibonacciSeries(); //8
        System.out.println(linearSearch(arr, 5) ? "present in linearSearch" : " not present in linearSearch"); //9
        System.out.println(binarySearch(arr, 5) ? "present in binarySearch" : "not present in binarySearch"); //10
        duplicateElements(arr); //11
        countVowelsAndConsonants(); // 12
        mutiplicationTable(3); //13
        sumof2dArray(); //14
        averageOfArray(arr); //15
        System.out.print("2024 is: ");
        System.out.println(isLeapYear(2024) ? "Leap year" : "Not leap year"); // 16
        displayPattern();//17
        System.out.println("Reverse of Symon is: " + reverseString("Symon")); //18
        System.out.print("153 is: ");
        System.out.println(isArmstrong(153) ? " Armstrong Number" : " Not Armstrong Number");//19
        findMaxMin(arr); //20
        SimpleInterest();//21
        TemperatureConverter(); //22
        CharacterChecker();//23
        SecondLargest();//24
        SumOfNumbersInString();//25



    }

    public static int sumOfTheArray(int[] arr) {
        int sum = 0;
        for (int i : arr) sum += i;
        System.out.println("Sum of the array is: " + sum);
        return sum;
    }

    public static void largestElementOfArray(int[] arr) {
        int max = arr[0];
        for (int i : arr) if (i > max) max = i;
        System.out.println("Max of the array is:" + max);
    }

    public static void evenOrOddNumbers(int[] arr) {
        int even = 0, odd = 0;
        for (int i : arr) {
            if (i % 2 == 1) odd++;
            else even++;
        }
        System.out.println("Number of Even Numbers: " + even);
        System.out.println("Number of Odd Numbers: " + odd);
    }

    public static void reverseArray(int[] arr) {
        int i = 0, n = arr.length, temp;
        int[] reversedArray = arr;
        for (i = 0; i < n / 2; i++) {
            temp = reversedArray[i];
            reversedArray[i] = reversedArray[n - i - 1];
            reversedArray[n - i - 1] = temp;
        }
        System.out.println("Reversed array: ");
        for (int j : reversedArray) System.out.print(" " + j);
        i = 0;
        n = arr.length;
        for (i = 0; i < n / 2; i++) {
            temp = reversedArray[i];
            reversedArray[i] = reversedArray[n - i - 1];
            reversedArray[n - i - 1] = temp;
        }
    }

    public static void factorialCalculation() {
        int n = 5, fact = 1;
//        Scanner input = new Scanner(System.in);
//        n = input.nextInt();
        for (int i = 1; i <= n; i++) {
            fact *= i;
        }
        System.out.println("Factorial of : " + n + " is: " + fact);
        int ans = factorialRecursive(n);
        System.out.println("Factorial(recursive) of : " + n + " is: " + fact);

    }

    public static int factorialRecursive(int num) {
        if (num == 1) return 1;
        return num * factorialRecursive(num - 1);
    }

    public static void palindromeCheck() {
        String str = "radar";
        int i = 0, j = str.length() - 1, ok = 1;
        while (i < j) {
            if (str.charAt(i) != str.charAt(j)) {
                ok = 0;
                break;
            }
            i++;
            j--;
        }
        System.out.println(ok == 1 ? "Palindrome" : "Not Palindrome");
    }

    public static void primeNumberCheck() {
        int n = 43;

        for (int i = 2; i * i <= n; i++) {
            if (n % i == 0) {
                System.out.println(n + " is not prime");
                return;
            }
        }
        System.out.println(n + " is prime");
    }

    public static void fibonacciSeries() {
        int num1 = 0, num2 = 1, sum = 1;
        int n = 10;
        System.out.println("Fibonacci series for N= " + n);
        System.out.print(num1 + " " + num2);
        for (int i = 2; i < n; i++) {
            sum = num1 + num2;
            System.out.print(" " + sum);
            num1 = num2;
            num2 = sum;
        }
        System.out.println("Fibonacci(recursive) series for N= " + n);
        fibonacciSeriesRecursion(n);
        System.out.println("Fibonacci Series of " + n + " numbers: ");
        for (int i = 0; i < n; i++) {
            System.out.print(fibonacciSeriesRecursion(i) + " ");
        }
    }

    public static int fibonacciSeriesRecursion(int num) {
        if (num == 0) return 0;
        if (num == 1) return 1;

        return fibonacciSeriesRecursion(num - 1) + fibonacciSeriesRecursion(num - 2);

    }

    public static boolean linearSearch(int[] arr, int target) {
        System.out.println();
        System.out.println("Linear search for target= " + target);
        for (int j : arr) {
            if (j == target) return true;
        }
        return false;
    }

    public static boolean binarySearch(int[] arr, int target) {
        System.out.println("Binary search for target= " + target);
        int low = 0;
        int high = arr.length - 1;
        while (low <= high) {
            int mid = (low + high) / 2;
            int midVal = arr[mid];
            if (midVal < target) {
                low = mid + 1;
            } else if (midVal > target) {
                high = mid - 1;
            } else {
                return true;
            }
        }
        return false;
    }

    public static void duplicateElements(int[] arr) {
        HashMap<Integer, Integer> vis = new HashMap<Integer, Integer>();

        for (int i : arr) {
            int cnt = 0;
            if (vis.containsKey(i)) {
                cnt = vis.get(i);
            }
            vis.put(i, cnt + 1);
        }

        System.out.print("Main Array: ");
        for(int j: arr) System.out.print(" "+j);
        System.out.println();

        System.out.print("Duplicate items are: ");
        for (int i : vis.keySet()) {
            if (vis.get(i) > 1) {
                System.out.print(i + " ");
            }
        }
        System.out.println();

    }

    public static void countVowelsAndConsonants() {
        String str = "ABCDAEFGEG";
        int vowel = 0, consonant = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == 'A' || str.charAt(i) == 'E' || str.charAt(i) == 'I' || str.charAt(i) == 'O' || str.charAt(i) == 'U')
                vowel++;
            else if (str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) == 'i' || str.charAt(i) == 'o' || str.charAt(i) == 'u')
                vowel++;
            else consonant++;
        }
        System.out.println("Number of Vowels: " + vowel);
        System.out.println("Number of Consonants: " + consonant);
    }

    public static void mutiplicationTable(int value) {
        for (int it = 1; it <= 10; it++) {
            System.out.println(value + " * " + it + " = " + (value * it));
        }
    }

    public static void averageOfArray(int[] arr) {
        int result = sumOfTheArray(arr);
        float avg = (float) result / arr.length;
        System.out.println("Average is: " + avg);
    }

    public static boolean isLeapYear(int year) {
        if (year % 4 == 0) {
            if (year % 100 == 0) return year % 400 == 0;
            else return true;
        } else return false;
    }

    public static String reverseString(String str) {
        String rev = "";
        for (int it = str.length() - 1; it >= 0; it--) {
            rev += str.charAt(it);
        }
        return rev;
    }

    public static void findMaxMin(int[] arr) {
        int min = Integer.MAX_VALUE, max = Integer.MIN_VALUE;
        for (int it = 0; it < arr.length; it++) {
            if (arr[it] > max) {
                max = arr[it];
            }
            if (arr[it] < min) {
                min = arr[it];
            }
        }
        System.out.println("Maximum value is : " + max + "\nMinimum value is : " + min);
    }

    public static boolean isArmstrong(int value) {
        int num = value, sum = 0, dig = 0;

        while (num > 0) {
            num /= 10;
            dig++;
        }
        num = value;
        while (num > 0) {
            int last = num % 10;
            sum += (Math.pow(last, dig));
            num /= 10;
        }
        return value == sum;
    }

    public  static  void sumof2dArray(){
        int[][] matrix1 = {{1, 2, 3, 1, 5}, {2, 5, 9, 3, 5}, {8, 6, 4, 6, 9}, {4, 6, 2, 1, 2}, {2, 8, 1, 4, 2},};
        int[][] matrix2 = {{4, 6, 2, 1, 2}, {2, 8, 1, 4, 2}, {9, 4, 4, 1, 9}, {2, 5, 9, 3, 5}, {8, 6, 4, 6, 9},};
        int row = 5, col = 5;
        for(int i=0;i<row;i++){
            for(int j = 0; j<col;j++){
                matrix1[i][j] += matrix2[i][j];
            }
        }
        System.out.println("Printing sum of matrix1 and matrix2: ");
        for(int i=0;i<row;i++){
            for(int j = 0; j<col;j++){
                System.out.print(" "+  matrix1[i][j]);
            }
            System.out.println();
        }
    }

    public static void displayPattern(){
        System.out.println("printing pattern: ");
        for (int i = 0; i  <  5; i++) {
            // Print spaces
            for (int j = 5; j  >  i; j--) {
                System.out.print(" ");
            }
            // Print asterisks
            for (int k = 0; k  <= i; k++) {
                System.out.print("* ");
            }
            System.out.println();
        }

        for (int i = 0; i  <  5; i++) {
            System.out.print(" ");
            for (int j = 0; j  <  i; j++) {
                System.out.print(" ");
            }
            // Print asterisks
            for (int j = i; j  <  5; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void SimpleInterest(){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter principal amount: ");
        double principal = scanner.nextDouble();

        System.out.print("Enter rate of interest: ");
        double rate = scanner.nextDouble();

        System.out.print("Enter time (in years): ");
        double time = scanner.nextDouble();

        double simpleInterest = (principal * rate * time) / 100;

        System.out.println("Simple Interest: " + simpleInterest);
    }
    public static void TemperatureConverter(){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Choose conversion:");
        System.out.println("1. Celsius to Fahrenheit");
        System.out.println("2. Fahrenheit to Celsius");

        int choice = scanner.nextInt();
        switch (choice){
            case 1 -> {
                System.out.print("Enter temperature in Celsius: ");
                double celsius = scanner.nextDouble();
                double fahrenheit = (celsius * 9 / 5) + 32;
                System.out.println("Temperature in Fahrenheit: " + fahrenheit);
            }
            case 2 -> {
                System.out.print("Enter temperature in Fahrenheit: ");
                double fahrenheit = scanner.nextDouble();
                double celsius = (fahrenheit - 32) * 5 / 9;
                System.out.println("Temperature in Celsius: " + celsius);
            }
            default -> System.out.println("Invalid choice");
        }

    }

    public static void CharacterChecker(){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a String: ");
        String str = scanner.next();

        for(int i=0;i<str.length();i++){
            Character ch = str.charAt(i);
            if (Character.isUpperCase(ch)) {
                System.out.println(ch+ " is Uppercase letter");
            } else if (Character.isLowerCase(ch)) {
                System.out.println(ch+ " is Lowercase letter");
            } else if (Character.isDigit(ch)) {
                System.out.println(ch+ " is Digit");
            } else {
                System.out.println(ch+ " is Special character");
            }
        }
    }
    public static  void SecondLargest(){
        int[] array = {5, 8, 2, 10, 7};

        Arrays.sort(array);
        int secondLargest = array[array.length - 2];

        System.out.println("Second Largest Number: " + secondLargest);
    }
    public  static  void SumOfNumbersInString(){
        String input = "12345";
        int sum = 0;
        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);
            if (Character.isDigit(ch)) {
                sum += Character.getNumericValue(ch);
            }
        }

        System.out.println("Sum of Numbers: " + sum);
    }
}