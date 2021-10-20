import java.util.Scanner;

public class Two_rectangles3_28 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);
		//矩形1的中心点以及宽高
		System.out.print("Enter r1's center x-,y- coordinates,width,and height: ");
		float x1=input.nextFloat();
		float y1=input.nextFloat();
		float w1=input.nextFloat();
		float h1=input.nextFloat();
		//矩形2的中心点以及宽高
		System.out.print("Enter r2's center x-,y- coordinates,width,and height: ");
		float x2=input.nextFloat();
		float y2=input.nextFloat();
		float w2=input.nextFloat();
		float h2=input.nextFloat();
		//w1>w2,h1>h2
		if(w1>w2 && h1>h2) {
			//矩形2在矩形1里
			if(Math.abs(x1-x2)+w2/2<w1 && Math.abs(y1-y2)+h2/2<h1) {
				System.out.println("r2 is inside r1");
			}
			//矩形不重叠
			else if(Math.abs(x1-x2)>w1/2+w2/2 || Math.abs(y1-y2)>h1/2+h2/2) {
				System.out.println("r2 does not overlap r1");
			}
			//矩形重叠
			else {
				System.out.println("r2 overlaps r1");
			}
		}
		//w1>w2,h1<h2或者w1<w2,h1>h2
		else if((w1>w2 && h1<h2) || (w1<w2 && h1>h2)) {
			//矩形不重叠
			if(Math.abs(x1-x2)>w1/2+w2/2 || Math.abs(y1-y2)>h1/2+h2/2) {
				System.out.println("r2 does not overlap r1");
			}
			//矩形重叠
			else {
				System.out.println("r2 overlaps r1");
			}
		}
		//w1<w2,h1<h2
		else {
			//矩形1在矩形2里
			if(Math.abs(x1-x2)+w1/2<w2 && Math.abs(y1-y2)+h1/2<h2) {
				System.out.println("r2 is inside r1");
			}
			//矩形不重叠
			else if(Math.abs(x1-x2)>w1/2+w2/2 || Math.abs(y1-y2)>h1/2+h2/2) {
				System.out.println("r2 does not overlap r1");
			}
			//矩形重叠
			else {
				System.out.println("r2 overlaps r1");
			}
		}
	}

}
