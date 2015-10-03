public class Regist {
	private static int index=0;
	private static String name;
	private static String password;
	private static String repasswd;
	private Regist(){}
	//注册功能,注册后返回到登陆界面
	public static void start() {
		System.out.println("请输入您要注册的用户名：");
		name=Tools.getInput();
		index=UserList.searchList(name);
		if(index>-1) {
			System.out.println("用户已存在！注册失败，返回开始菜单...！");
			Tools.showLine();
			StartMenu.start();
		}else{
			System.out.println("请输入您要的密码");
			password=Tools.getInput();
			System.out.println("请再输入一遍您的密码");
			repasswd=Tools.getInput();
			if(password.equals(repasswd)) {
				UserList.addUser(-index, name, password);
				System.out.println("注册成功！返回开始菜单...");
				Tools.showLine();
				StartMenu.start();
			}
			else {
				System.out.println("密码不一致，注册失败！返回开始菜单...");
				Tools.showLine();
				StartMenu.start();
			}
		}
	}
}
