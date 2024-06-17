package Section3_Advanced.Concepts;

public class ConceptUserInput {

    public static void main(String[] args) {
        
        // User input

        // Scanner class, used to get user input, in the form of strings, numbers, etc.
        // import java.util.Scanner;
        // Scanner sc = new Scanner(System.in);
        // int a = sc.nextInt();
        // String s = sc.nextLine();
        // double d = sc.nextDouble();
        // float f = sc.nextFloat();

        // BufferedReader class, used to get user input, in the form of strings, numbers, etc.
        // import java.io.BufferedReader;
        // import java.io.InputStreamReader;
        // BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        // int a = Integer.parseInt(br.readLine());
        // String s = br.readLine();
        // double d = Double.parseDouble(br.readLine());
        // float f = Float.parseFloat(br.readLine());
        // br.close(); // close the BufferedReader, it's important to close the BufferedReader
        // can use try with resources to automatically close the BufferedReader
        // try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
        //     int a = Integer.parseInt(br.readLine());
        // } catch (Exception e) {
        //     e.printStackTrace();
        // }

        // Or can use finally block to close the BufferedReader

        // BufferedReader vs Scanner
        // BufferedReader is faster than Scanner
        // BufferedReader is synchronized, Scanner is not
        // BufferedReader is used for reading streams of characters, Scanner is used for parsing text
        // BufferedReader is used for reading lines of text, Scanner is used for parsing tokens


    }
    
}
