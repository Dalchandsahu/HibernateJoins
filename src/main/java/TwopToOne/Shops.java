package TwopToOne;

import jakarta.persistence.*;

@Entity
public class Shops {

	@Id
	private int Shop_id;
	private String Shop_name;
	private String Shop_city;
	@ManyToOne
	private TypeOfShop type;
	public int getShop_id() {
		return Shop_id;
	}
	public void setShop_id(int shop_id) {
		Shop_id = shop_id;
	}
	public String getShop_name() {
		return Shop_name;
	}
	public void setShop_name(String shop_name) {
		Shop_name = shop_name;
	}
	public String getShop_city() {
		return Shop_city;
	}
	public void setShop_city(String shop_city) {
		Shop_city = shop_city;
	}
	public TypeOfShop getType() {
		return type;
	}
	public void setType(TypeOfShop type) {
		this.type = type;
	}
	public Shops(int shop_id, String shop_name, String shop_city, TypeOfShop type) {
		super();
		Shop_id = shop_id;
		Shop_name = shop_name;
		Shop_city = shop_city;
		this.type = type;
	}
	public Shops() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Shops [Shop_id=" + Shop_id + ", Shop_name=" + Shop_name + ", Shop_city=" + Shop_city + ", type=" + type
				+ "]";
	}
	
	
}
