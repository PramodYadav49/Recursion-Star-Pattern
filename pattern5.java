package recursivePattern;

import java.util.Scanner;

public class pattern5 {
	static void row(int i,int j,int n) {
	if(i==0) {
		return;
	}else {
		
		row(i-1,j,n);
		column(i,j,n,1);
		System.out.println();
	}
}
static void column(int i,int j,int n,int temp) {
	if(j==0) {
		return;
	}
	else {	if(j>=n+1-i && j<=n-1+i && temp==1) {
			System.out.print("*");
			temp=0;
		}else {
			System.out.print(" ");
			temp=1;
		}
		column(i,j-1,n,temp);
			
	
	}
}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("    *    ");
		System.out.println("   * *   ");
		System.out.println("  * * *  ");
		System.out.println(" * * * * \n\n");
		System.out.println("Enter the row of the pattern");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		
				
		
		
		row(n,n*2-1,n);

	}

}
