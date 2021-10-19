import java.util.Scanner;

public class Is_the_point_inside_the_triangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);
		System.out.print("Enter point coordinates(x,y): ");
		float x=input.nextFloat();
		float y=input.nextFloat();
		if(x>=0 && y>=0 && 0.5*x+y<=100) {
			System.out.println("The point ("+x+","+y+") is inside the triangle");
		}
		else {
			System.out.println("The point ("+x+","+y+") is not in the triangle");
		}
	}

}
