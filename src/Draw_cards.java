import java.util.Random;

public class Draw_cards {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int num=randInt(1,13);
        int color=randInt(1,4);//1��Clubs��÷����2��Diamonds�췽�飬3��Hearts���ģ�4��Spades����
        String number;
        String colour;
        if(color==1) {//���жϻ�ɫ
        	colour="Clubs";
        }
        else if(color==2) {
        	colour="Diamonds";
        }
        else if(color==3) {
        	colour="Hearts";
        }
        else {
        	colour="Spades";
        }
        
        
        if(num==1) {//���жϴ�С
        	number="Ace";
        }
        else if(num==11) {
        	number="Jack";
        }
        else if(num==12) {
        	number="Queen";
        }
        else if(num==13) {
        	number="King";
        }
        else {
        	number=String.valueOf(num);//����������תΪ�ַ�������
        }
        
        System.out.println("The card you picked is "+number+" of "+colour);
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
