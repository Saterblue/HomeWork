//开始界面
public class StartMenu {
	private static int num;
	public static void start(){
		SystemName.show();
		System.out.println("请选择您要进行的操作：1:用户登录 2:用户注册 0:退出系统");		
		Tools.showLine();
		num=Tools.userChoose();
		switch(num){
		case 1:Login.start();
		break;
		case 2:Regist.start();
		break;
		case 0:exit();
		break;
		default:
			System.out.println("未知错误，程序结束");
		}
	}
	private static void exit(){}
}
