package recursivePattern;

public class pattern10 {
	static void row(int i,int j) {
		if(i==0) {
			return;
		}else {
			
			
			row(i-1, j);
			column(j,i,1);
			System.out.println();
			
		}
	}
	static void column(int j,int i,int x) {
		if(j==0) {
			return;
			
		}else {
			if(j>=6-i&&j<=4+i) {
				if(j==5) {
					System.out.print(0);
				}
				
				
				if(j>5) {
					System.out.print(1);
				}
				if(j<5){
					System.out.print(2);
				}
			
				
			}
			else {
				System.out.print(" ");
			}
		}
			
			column(j-1,i,x);
			
		
	}
		
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		row(5,9);

	}
}
