package TwopToOne;

import java.util.List;

import jakarta.persistence.*;

@Entity
public class TypeOfShop {

	@Id
	private int shop_id;
	private String shop_type;
	@OneToMany
	private List<Shops> shop;
	public int getShop_id() {
		return shop_id;
	}
	public void setShop_id(int shop_id) {
		this.shop_id = shop_id;
	}
	public String getShop_type() {
		return shop_type;
	}
	public void setShop_type(String shop_type) {
		this.shop_type = shop_type;
	}
	public List<Shops> getShop() {
		return shop;
	}
	public void setShop(List<Shops> shop) {
		this.shop = shop;
	}
	public TypeOfShop(int shop_id, String shop_type, List<Shops> shop) {
		super();
		this.shop_id = shop_id;
		this.shop_type = shop_type;
		this.shop = shop;
	}
	public TypeOfShop() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "TypeOfShop [shop_id=" + shop_id + ", shop_type=" + shop_type + ", shop=" + shop + "]";
	}
	
	
	
}
