package recursivePattern;

public class pattern1 {

	static void row(int i,int j) {
		if(i==0) {
			return;
		}else {
			column(j);
			System.out.println();
			row(i-1, j);
			
		}
	}
	static void column(int j) {
		if(j==0) {
			return;
			
		}else {
			System.out.print("*");
			column(j-1);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		row(5,5);

	}

}
