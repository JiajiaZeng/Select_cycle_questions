import java.util.Scanner;

public class Is_the_point_inside_the_rectangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);
		System.out.print("Enter point coordinates(x,y): ");
		float x=input.nextFloat();
		float y=input.nextFloat();
		if(Math.abs(x)<=5 && Math.abs(y)<=2.5) {
			System.out.println("Point ("+x+","+y+") is in rectangle");
		}
		else {
			System.out.println("The point ("+x+","+y+") is not in the rectangle");
		}
	}

}
