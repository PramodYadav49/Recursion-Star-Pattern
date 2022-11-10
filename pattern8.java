package recursivePattern;

public class pattern8 {
	static void row(int i,int j) {
		if(i==0) {
			return;
		}else {
			
			
			row(i-1, j);
			column(j,i);
			System.out.println();
			
		}
	}
	static void column(int j,int i) {
		if(j==0) {
			return;
			
		}else {
			
			if(j<=i) {
				System.out.print("*");
			}else {
				System.out.print(" ");
			}
			column(j-1,i);
			
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		row(5,5);

	}

}
