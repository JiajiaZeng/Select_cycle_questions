import java.util.Scanner;

public class Triangle_perimeter {//3-19更新备注顺便把int换成float，最终决定还是不改了，出现了浮点数的相关问题

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);
		System.out.print("Enter the three lengths of the triangle: ");
		int a=input.nextInt();
		int b=input.nextInt();
	    int c=input.nextInt();
	    if(a+b>c&&a+c>b&&b+c>a) {
	    	float C=a+b+c;
	    	System.out.println(C);
	    }
	    else {
	    	System.out.println("Illegal input value!");
	    }
	}

}
