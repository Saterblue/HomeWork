//商品列表基类,拥有商品添加数量，减少数量，计算列表总额的功能
public class GoodsList {
		private  Goods[] list=new Goods[10];
		public GoodsList(){
			list[0]=new Goods(1,"芒果",50,0);
			list[1]=new Goods(2,"苹果",30,0);
			list[2]=new Goods(3,"樱桃",80,0);
			list[3]=new Goods(4,"橙子",40,0);
			list[4]=new Goods(5,"柠檬",25,0);
			list[5]=new Goods(6,"桃子",65,0);
			list[6]=new Goods(7,"葡萄",90,0);
			list[7]=new Goods(8,"石榴",85,0);
			list[8]=new Goods(9,"木瓜",35,0);
			list[9]=new Goods(10,"榴莲",90,0);
		}
		public void addList(int id,int counts) {
			list[id-1].setCounts((list[id-1].getCounts()+counts));
		}
		public void decreaseList(int id,int counts){
			addList(id,-counts);
		}
		public void showList(){
			System.out.println("编号\t名称\t价格"+"\t数量");
			for(int i=0;i<list.length;i++){
				list[i].show();
			}
		}
		public int getListSum(){
			int sum=0;
			for(int i=0;i<list.length;i++) {
				sum+=list[i].getSum();
			}
			return sum;
		}
}
