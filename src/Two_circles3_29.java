import java.util.Scanner;

public class Two_circles3_29 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner input=new Scanner(System.in);
        //圆1
        System.out.print("Enter circle1's center x-,y-coordinates,and radius: ");
        float x1=input.nextFloat();
        float y1=input.nextFloat();
        float r1=input.nextFloat();
        //圆2
        System.out.print("Enter circle2's center x-,y-coordinates,and radius: ");
        float x2=input.nextFloat();
        float y2=input.nextFloat();
        float r2=input.nextFloat();
        
        //圆2在圆1里
        if(r1>r2 && Math.pow(Math.pow(x1-x2,2)+Math.pow(y1-y2,2),0.5)<=Math.abs(r1-r2)) {
        	System.out.println("circle2 is inside circle1");
        }
        //圆1在圆2里
        else if(r1<r2 && Math.pow(Math.pow(x1-x2,2)+Math.pow(y1-y2,2),0.5)<=Math.abs(r1-r2)) {
        	System.out.println("circle1 is inside circle2");
        }
      //重叠
        else if(Math.pow(Math.pow(x1-x2,2)+Math.pow(y1-y2,2),0.5)<=r1+r2) {
        	System.out.println("circle2 overlaps circle1");
        }
        //不重叠
        else {
        	System.out.println("circle2 does not overlap circle1");
        }
        input.close();
	}

}
