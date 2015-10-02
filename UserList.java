public class UserList {
  public static User[] arr=new User[99];
	private static UserList list=new UserList();
	private UserList(){
		arr[0]=new User("Admin","Admin");
		arr[0].setLevel(1);
	}
//添加新用户，如果用户列表已满，扩充用户列表
	public static void addUser(int index,String name,String password){
		if(index==arr.length) {
			User[] temp=new User[index+1];
			for(int i=0;i<index;i++){
				temp[i]=arr[i];
			}
			temp[index]=new User(name,password);
			arr=temp;
		}
		else {
			arr[index]=new User(name,password);
		}
	}
/*查看用户是否存在
 返回值为负数且小于arr.length，遍历到null之前无此用户，返回-arr.length，整个表格所有数据内都无此用户
 返回值>-1 则证明存在此用户，返回值为该用户的脚标index  
*/
	public static int searchList(String name) {
		for(int i=0;i<arr.length;i++) {
			if(arr[i]==null) {
				return -i; //无此用户，可以注册
			}
			else{
				if(name.equals(arr[i].getName())) {
					return i; //已经存在的用户
				}
			}
		}
		return -arr.length; //用户列表全查完，无此用户（用户列表已满）
	}
/*验证用户名和密码,返回用户的等级
返回的是-1，则没有该用户，返回-2表明密码不匹配
返回0表示普通用户，返回1表示管理员用户
*/
	public static int checkUser(String name,String password){
		int index=searchList(name);
		if(index<0){
			return -1;//无此用户
		}
		else{
			if(!password.equals(arr[index].getPassword())) {
				return -2;
			}
			return arr[index].getLevel();
		}
	}
}
