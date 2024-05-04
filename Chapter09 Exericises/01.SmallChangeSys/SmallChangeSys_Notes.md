java获取时间及格式化：

import java.util.Date; 		//导入包
Date dt = new Date(); 	//新建Date对象dt
SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm"); //新建时间格式化对象sdf
sdf.format(dt); //返回格式化的时间字符串

Scanner接受char字符使用：next().charAt(0)
