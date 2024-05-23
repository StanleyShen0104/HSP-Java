----------零钱通笔记----------
判断值相等使用过关斩将法

java获取时间及格式化：
import java.util.Date; 		//导入包
Date dt = new Date(); 	//新建Date对象dt
SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm"); //新建时间格式化对象sdf
sdf.format(dt); //返回格式化的时间字符串

Scanner接受char字符使用：next().charAt(0)


----------租房系统笔记----------
类分层关系：界面层，业务层，工具层，模型层
当调用的方法是静态方法时(static)，可以直接通过类名调用，不需要先实例化