import java.util.Scanner;
public class Tools {
	//获取用户输出的字符串
	public static String getInput() {
		Scanner sc=new Scanner(System.in);
		String input=sc.next();
		return input;
	} 
	//获取用户输入的整数
	public static int getInt(){
		boolean is=true;
		while(is) {
			try {
				Scanner sc=new Scanner(System.in);
				int num=sc.nextInt();
				is=false;
				return num;
			}
			catch(Exception e) {
				System.out.println("您的输入有误！请重新输入");
			}
		}
		return -1;
	}
	
	//华丽的分割线
	public static void showLine() {
	System.out.println("---------------------------------------------------------");
	}
	//获取用户输入，返回输入值，如果为0,1,2返回相应的整数，如果不为0,1,2,重新输入..
	public static int userChoose() {
		boolean is=true;
		while(is){
			int num=getInt();
			switch(num){
			case 0:is=false;return 0;
			case 1:is=false;return 1;
			case 2:is=false;return 2;
			default:System.out.println("您的输入有误，请重新输入！");
			}
		}
		return -1;
	}
}
