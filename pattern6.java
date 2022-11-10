package recursivePattern;

import java.util.Scanner;

public class pattern6 {
	static void row(int i,int j,int n,char c) {
	if(i==0) {
		return;
	}else {
		
		row(i-1,j,n,c);
		column(i,j,n,c);
		System.out.println();
		
	}
}
static void column(int i,int j,int n,char c) {
	if(j==0) {
		return;
	}
	else {if(j>=n+1-i && j<=n-1+i) {
			System.out.print(c);
			c++;
		}else {
			System.out.print(" ");
		}
		column(i,j-1,n,c);
			
		
	}
}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		
				
		
		
		row(n,n*2-1,n,'a');

	}

}
