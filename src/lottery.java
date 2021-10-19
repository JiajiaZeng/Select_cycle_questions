import java.util.Random;
import java.util.Scanner;

public class lottery {//3-15更新一下备注

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner input=new Scanner(System.in);
		int n=randInt(99,1000);
		System.out.print("Enter a number: ");
		int num=input.nextInt();
		int nOne=n%100;    //随机生成数的个十百位
		int nTwo=n/10%10;
		int nThree=n/100;
		int n1=num%100;    //输入数值的个十百位
		int n2=num/10%10;
		int n3=num/100;
		int n132=n1*100+n3*10+n2;    //输入数值排列组合的剩下五种情况
		int n213=n2*100+n1*10+n3;
		int n231=n2*100+n3*10+n1;
		int n312=n3*100+n1*10+n2;
		int n321=n3*100+n2*10+n1;
		if(num==n) {
			System.out.println("$10000");
		}
		else if(num==n132||num==n213||num==n231||num==n312||num==321) {
			System.out.println("$3000");
		}
		else if(n1==nOne||n1==nTwo||n1==nThree||n2==nOne||n2==nTwo||n2==nThree||n3==nOne||n3==nTwo||n3==nThree) {
			System.out.println("$1000");
		}
		else {
			System.out.println("no money");
		}
	}
	
	public static int randInt(int min, int max) {    //随机生成整数

	    // NOTE: Usually this should be a field rather than a method
	    // variable so that it is not re-seeded every call.
	    Random rand = new Random();

	    // nextInt is normally exclusive of the top value,
	    // so add 1 to make it inclusive
	    int randomNum = rand.nextInt((max - min) + 1) + min;

	    return randomNum;
	}

}
