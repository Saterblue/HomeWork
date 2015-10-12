import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
public class Main {
/**
程序已知问题：未使用正则表达式判断（还没学...）,未使用String类自带的切割方法进行切割造成了程序的代码过于臃肿
针对性较强，只适合特定的空格字符文件的切割处理，对于较复杂的文件无法操作；没有增加用户交互功能；未进行异常处理；
该程序代码只能由程序员自己操作.....

*/
	public static void main(String[] arg) throws IOException {
		cutFile();
	}

	public static void cutFile() throws FileNotFoundException, IOException {
		//创建输出流读取用户的文件比如D盘下的Gcd.txt文件
		FileReader fr=new FileReader("D:\\Gcd.txt");
		char[] arr=new char[1024];
		String s="";
		int num=0;
		//将读取的文件存储在String s中
		while((num=fr.read(arr))!=-1) {
			s=s+new String(arr,0,num);
		}
		fr.close();
		
		//设置计数器i,主要是为文件命名；
		int i=0;
		//使用for循环将字符串分割成最后一小串文章
	for(int index=0;;i++){
		//创建输入流，给分割的文件名字统一命名为newFile"i".txt，并存储在D盘下；i为变化的数字(如果需要使用文章开头的文字为目录，需要添加逻辑代码)
		FileWriter fw=new FileWriter("D:\\newFile"+i+".txt");
		//分割字符串的条件是"      "空格，需要根据文件的空格数调整
			index=s.indexOf("               ");
			//如果文件中没有符合空格数的剩余字符串，则表明切割文件完毕，跳出
			if(index==-1) {
				break;
			} else {
				String temp=s.substring(0,index);
			//写入分割文件的前半段文字，给剩余的字符串赋值为s，并进行两段消除空格处理(因为每段文字空格的数量极有可能不一致)
				fw.write(temp);
				s=s.substring(index);
				s=s.trim();
				//关闭输入流，并刷新文件
				fw.close();
			}
	}
	//将最后剩余的部分字符串进行存储，并关闭输入流。
		FileWriter fw1=new FileWriter("D:\\newFile"+i+".txt");
		fw1.write(s);
		fw1.close();
		System.out.println("完成！");
	}
}
