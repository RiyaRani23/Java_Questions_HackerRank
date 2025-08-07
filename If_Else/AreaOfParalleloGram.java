 package If_Else;

import java.util.Scanner;

class AreaOfParalleloGram {
     static int B;
    static int H;
    static boolean flag=false;
    static{
    Scanner sc= new Scanner(System.in);
    B = sc.nextInt();
    H=sc.nextInt();
    if(B > 0 && H > 0) flag = true;
    else 
      System.out.println("java.lang.Exception: Breadth and height must be positive");
     sc.close();
    }

public static void main(String[] args){
		if(flag){
			int area=B*H;
			System.out.print(area);
		}
      
    } 
} 