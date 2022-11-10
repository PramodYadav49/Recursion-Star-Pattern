package recursivePattern;

public class pattern3 {
static void row(int i,int j) {
	if(i==0) {
		return;
	}else {
		
		row(i-1,j);
		column(i,j);
		System.out.println();
	}
}
static void column(int i,int j) {
	if(j==0) {
		return;
	}
	else {
		column(j-1,i);
			
		if(j<=i) {
			System.out.print("*");
		}else {
			System.out.print(" ");
		}
	}
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		row(5,9);

	}

}
