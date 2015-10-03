//商品列表
public class ShopList {
	public static GoodsList shopList=new GoodsList();
	private static ShopList sp=new ShopList();
	//初始化商品列表，数量为100;
	private  ShopList(){
		for(int i=1;i<11;i++){
			shopList.addList(i, 100);
		}
	}
}
