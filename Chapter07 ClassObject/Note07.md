Class：同じタイプ(属性、方法)のObject の集合
Object(Instance)：具体的なClassの実際例
Objectも引用変数

class Cat {
	String name;	->属性
	int age;			->属性(基本変数)
	String[] color;	->属性(引用変数)
	...						->方法
}
属性は代入がない場合、デフォルト値あり、アレイと同じ

Objectを作り方：
<1>
Cat cat1 = new Cat();
<2>
Cat cat1; ->メモリ空間はまだ，cat1->[null]
cat1 = new Cat(); ->メモリ空間があり

cat1.name = "abc";
cat1.age = 5;
cat1.color = "white";

属性、四つアクセス修飾子：protected, public, (default), private
訪問でき		class内部		同じpackage	子クラス		他のpackage
public					Y						Y					Y					Y			
protected			Y						Y					Y					N
default					Y						Y					N					N
private					Y						N					N					N

栈 			スタック					基本変数を保存 
堆 			ヒープ						引用変数を保存
方法区 	メソッドエリア		Class属性方法の情報をロード、メソッド領域

Person p; ->Class[Person]属性方法の情報をロード
p = new Person(); ->メモリのヒープで空間を分配して、初期化代入、pにアドレスを送り
p.name = "...";	->指定初期化

method方法：
class Person {
	String name;
	int age;
	public void speak() {				->voidという意味はreturnがありません
		statements...
	}
	public int getSum(int n1, int n2) {	->returnあり、タイプはint
		...
		return xx;
	}
}

method使い方：
Person p1 = new Person(); ->object p1
p1.speak();
int k = p1.getSum(1, 2);

同じClassでのメソッドを直接に引用でき。Python self.xxxのように要らない
違うClassでのメソッドを引用の場合、Objectを作ってから引用でき
public void m() {
	Person p = new Person();
	p.method;
}

リカージョン:Recursion
methodに自分のmethodを引用します
public void test(int n) {
	if (n > 2) {
		test(n - 1);
	}
	System.out.println(n);
}