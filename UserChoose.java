public class UserChoose {
	private static int num;
	public static int show(){
		System.out.println("请选择您要进行的操作：1:用户登录 2:用户注册 0:退出系统");		
		Tools.showLine();
		num=Tools.userChoose();
		return num;
	}
}
