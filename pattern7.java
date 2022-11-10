package recursivePattern;

import java.util.Scanner;

public class pattern7 {
	static void row(int i,int j,int n) {
	if(i==0) {
		return;
	}else {
		
		row(i-1,j,n);
		column(i,j,n);
		System.out.println();
	}
}
static void column(int i,int j,int n) {
	if(j==0) {
		return;
	}
	else {
		column(i,j-1,n);
		if(i<=n/2+1) {
			{
		if(j>=n/2+2-i && j<=n/2+i) {
			System.out.print("*");
		}else {
			System.out.print(" ");
		}}}
		else {
			if(j>=i-3 && j<=11-i) {
				System.out.print("*");
				
			}else {
				System.out.print(" ");
			}
			
		}
	}
}

	public static void main(String[] args) {

				
		
		
		row(7,7,7);

	}

}
