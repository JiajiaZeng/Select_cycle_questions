import java.util.Random;
import java.util.Scanner;

public class lottery {//3-15����һ�±�ע

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner input=new Scanner(System.in);
		int n=randInt(0,1000);//�����޸ģ���������00X�����
		System.out.print("Enter a number: ");
		int num=input.nextInt();
		int nOne=n/100;    //����������ĸ���ʮ��λ
		int nTwo=n/10%10;
		int nThree=n%10;
		int n1=num/100;    //������ֵ�İ�ʮ��λ
		int n2=num/10%10;
		int n3=num%10;
		int n132=nOne*100+nThree*10+nTwo;    //������ֵ������ϵ�ʣ���������
		int n213=nTwo*100+nOne*10+nThree;
		int n231=nTwo*100+nTwo*10+nOne;
		int n312=nThree*100+nOne*10+nTwo;
		int n321=nThree*100+nTwo*10+nOne;
		if(num==n) {
			System.out.println("$10000");
		}
		else if(num==n132||num==n213||num==n231||num==n312||num==n321) {
			System.out.println("$3000");
		}
		else if(n1==nOne||n1==nTwo||n1==nThree||n2==nOne||n2==nTwo||n2==nThree||n3==nOne||n3==nTwo||n3==nThree) {
			System.out.println("$1000");
		}
		else {
			System.out.println("no money");
		}
	}
	
	public static int randInt(int min, int max) {    //�����������

	    // NOTE: Usually this should be a field rather than a method
	    // variable so that it is not re-seeded every call.
	    Random rand = new Random();

	    // nextInt is normally exclusive of the top value,
	    // so add 1 to make it inclusive
	    int randomNum = rand.nextInt((max - min) + 1) + min;

	    return randomNum;
	}

}
