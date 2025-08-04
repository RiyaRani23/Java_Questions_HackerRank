package Loop;

import java.util.Scanner;

public class SumOfPattern {
    public static void main(String []argh){
        Scanner in = new Scanner(System.in);
        int t=in.nextInt();
        for(int i = 0; i < t; i++){
            int a = in.nextInt();  // First number
            int b = in.nextInt();  // Second number
            int n = in.nextInt();  // Number of terms

            int sum = a;
            for(int j = 0; j < n; j++) {
                sum += (int)Math.pow(2, j) * b;
                System.out.print(sum + " ");
            }
            System.out.println(); 
        }
        in.close();
    }
}
