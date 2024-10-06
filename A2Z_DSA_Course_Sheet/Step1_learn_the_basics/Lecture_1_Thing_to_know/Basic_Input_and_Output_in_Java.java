//import Statement for Taking User Input Using BufferedReader.
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
//import Statement for Taking User Input Using Scanner.
import java.util.Scanner;

public class Basic_Input_and_Output_in_Java {

    // This Striver sheet url contain theory of basic input output operation in java.
    String Strivers ="https://takeuforward.org/java/basic-input-and-output-in-java/";
    static void UsingScanner(){
        System.out.println("User Entering value by using Scanner");
        Scanner sc= new Scanner(System.in);
        int x= sc.nextInt();
        System.out.println("User Entered value by using Scanner is = "+x);
    }

    static void UsingBufferedReader() throws IOException {
        System.out.println("User Entering value by using UsingBufferedReader");
        InputStreamReader is = new InputStreamReader(System.in);
        BufferedReader bf = new BufferedReader(is);
        String input = bf.readLine();
        int num = Integer.parseInt(input);
        System.out.println("User Entered value by using the BufferReader is = "+ num);
    }

    public static void main(String[] args) throws IOException {
        UsingScanner();
        UsingBufferedReader();
    }


}
