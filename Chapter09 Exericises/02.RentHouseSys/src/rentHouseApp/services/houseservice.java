package rentHouseApp.services;

import rentHouseApp.models.house;

public class houseservice {

	// 1、该类响应HV类的调用
	// 2、完成对房屋信息的增删改查
	// 3、创建列表保存所有house对象
	private house[] hlist;

	public houseservice(int size) {
		hlist = new house[size];
		hlist[0] = new house(1, "塔楼", "111", "纽约", 2000, "已出租");
	}
	
	

	public house[] getHlist() {
		return hlist;
	}

	public void setHlist(house[] hlist) {
		this.hlist = hlist;
	}

}