import java.util.Scanner;

public class Is_the_point_in_the_circle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);
		System.out.print("Enter point coordinates(x,y): ");
		float x=input.nextInt();
		float y=input.nextInt();
		if(Math.pow((Math.pow(x, 2)+Math.pow(y, 2)),0.5)<=10) {
			System.out.println("Point ("+x+","+y+") in circle");
		}
		else {
			System.out.println("The point ("+x+","+y+") is not in the circle");
		}
	}

}
