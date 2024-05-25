package rentHouseApp.menu;

import rentHouseApp.services.houseservice;
import rentHouseApp.utils.Utility;

public class houseview {
	// 该类显示界面，接收用户输入，调用HS类完成对房屋信息的各种操作
	private boolean cond = true;
	houseservice hs = new houseservice(1);

	public void showmenu() {
		do {
			System.out.println("---------房屋出租系统---------");
			System.out.println("\t1 新增房源\n\t2 查找房屋\n\t3 删除房屋\n\t4 修改房屋信息\n\t5 房屋列表\n\t6 退\t出");
			System.out.print("请输入编号:");
			switch (Utility.readMenuSelection()) {
			case '1':
				break;
			case '2':
				break;
			case '3':
				break;
			case '4':
				break;
			case '5':
				
				break;
			case '6':
				exit();
				break;
			}
		} while (cond);
	}

	public void listhouse() {
		System.out.println("-----------房屋列表-----------");
		System.out.println("编号\t\t房主\t\t电话\t\t地址\t\t月租\t\t状态");
		
		int range = hs.getHlist().length;
		for (int i = 0; i < range; i++) {
			System.out.println(hs.getHlist()[i].toString());
		}
	}

	public void exit() {
		System.out.print("是否确定要退出Y/N:");
		if (Utility.readChar() == 'Y') {
			setCond(false);
			System.out.println("----------系统已退出!----------");
		}
	}

	public boolean isCond() {
		return cond;
	}

	public void setCond(boolean cond) {
		this.cond = cond;
	}
}
