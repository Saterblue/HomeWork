//商品类，拥有计算总价和显示商品属性的功能
public class Goods {
	private int id;
	private String name;
	private int price;
	private int counts;
	public Goods(int id, String name, int price, int counts) {
		this.id = id;
		this.name = name;
		this.price = price;
		this.counts = counts;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public int getCounts() {
		return counts;
	}
	public void setCounts(int counts) {
		this.counts = counts;
	}
	public int getSum() {
		return price*counts;
	}
	public void show() {
		System.out.println(id+"\t"+name+"\t"+price+"\t"+counts);
	}
}
