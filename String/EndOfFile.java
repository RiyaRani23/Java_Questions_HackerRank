package String;
import java.util.*;
public class EndOfFile {
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scanner= new Scanner(System.in);
        int line = 0;
      while(scanner.hasNext()){
        String input = scanner.nextLine();
        line++;
        System.out.println(line + " " + input);
    }
    scanner.close();
    }
}

