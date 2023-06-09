import java.util.Random;
import java.util.Scanner;
public class main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		int count = 0;
		Random rand = new Random();
		Scanner s = new Scanner(System.in);
		int input_number;
		int atari_number = rand.nextInt(1001);
		System.out.println(atari_number);
		do {
			
			System.out.print("数字を入力してください=");
			input_number = s.nextInt();
			count++;
		}while((judge(atari_number,input_number)!=0)  );
		
		if(judge(atari_number,input_number)==0) {
			System.out.println("当たりです。！！");
		}
	}
	private static int judge(int atari_num, int input_num) {
		if(atari_num == input_num) {
			return 0;
			}else if(atari_num>input_num) {
			System.out.println("この数字より上です。");
			return 1;
		}
		System.out.println("この数字より下です。");
		return -1;
		
	}

}
