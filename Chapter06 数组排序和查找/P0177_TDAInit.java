public class P0177_TDAInit {
	public static void main(String[] args) {
		
		/*	
			动态生成二维数组方法1：
			int[][] a = new int[长度][长度];
			二维数组的外层数组也就是堆中存放的，是地址
			该地址指向堆中各自的内层数组

			方法2：
			int[][] a;
			a = new int[长度][长度];

			*方法3 列数不确定，应用于内层数组长度并不整齐的情况
			int[][] a = new int[长度][];此步完成时是在堆中已出现外层空间。但值不是地址，都是null
			遍历到该数组时，再使用
			a[x] = new int[y]; 

			静态初始化：很简单大括号套大括号 int[][] a = {{1,2,3},{5,2,1},{3}}
			注意高维数组即使某个元素只有一个值，也需要大括号

		*/
	}
}