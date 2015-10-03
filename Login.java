public class Login {
 //根据用户输入的账号密码进行制定操作跳转
	public static void start(){
		int n=login();
		switch(n){
		case -1:
			System.out.println("无此用户，返回开始菜单...");
			Tools.showLine();
			StartMenu.start();
		break;
		case -2:
			System.out.println("密码错误，返回开始菜单...");
			Tools.showLine();
			StartMenu.start();
		break;
		case 0:
			System.out.println("登录成功，您的权限为普通用户...");
			Tools.showLine();
		break;
		case 1:
			System.out.println("登录成功，您的权限为管理员用户...");
			Tools.showLine();
		break;
		default:
			System.out.println("出现了未知异常，返回开始菜单...");
			Tools.showLine();
			StartMenu.start();
		}
	}
	//检测用户输入的账号密码是否正确，返回一个整数值代表用户登陆状态：-1、无此用户；-2、密码错误；0、普通用户；1、管理员用户
	public static int login(){
		System.out.println("请输入您的用户名：");
		String name=Tools.getInput();
		System.out.println("请输入您的密码：");
		String password=Tools.getInput();
		return UserList.checkUser(name, password);
	}
}
