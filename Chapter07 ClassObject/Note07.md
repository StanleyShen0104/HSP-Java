Class：同じタイプ(属性、方法)のObject の集合
Object(Instance)：具体的なClassの実際例
Objectも引用変数

class Cat {
	String name;	->属性
	int age;			->属性(基本変数)
	String[] color;	->属性(引用変数)
	...					->方法
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


栈 		スタック					基本変数を保存 
堆 		ヒープ						引用変数を保存
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

オーバーロード Overload:
Classで同じ名前のMethodはでき
でも、パラメーターのデータ種別、あるいは数量は違わなければなりません
注意、パラメーター名前だけ違うのはオーバーロードではない
注意、returnのデータ種別と違うのはオーバーロードではない
System.out.print(1	); ->int
System.out.print(1.1); ->double
System.out.print("1"); ->String
...

パラメーターの数量は固定ではない：
public int sum(int... nums) {	
	//一つ以上のパラメーターを受け入れ
	//nums を アレーとして使われます
	//
}

パラメーターの種別はアレーもできますけど、ちょっと違う：
int[] arr = {1, 2, 3};
sum(arr);
public int sum(int... nums) {
	System.out.println(nums.length); -> 「3」と表示し、「1」ではない
}

普通パラメーターを加える場合は最後に置いてなければなりません
public int sum(double n1, boolean n2, int... nums) {
	//すなわち、非固定パラメーターは一つだけ
}

グローバル変数：Classの属性
ローカル変数：Method中の変数、コードブロック中の変数

グローバル変数はデフォルト値があるため、値を代入せずに直接使用できます
その反面、ローカル変数はそうではない、例えば：
class XX {
	int a; a->0
	public void xx() {
		int b; b->uninitialize
	}
}
グローバル変数はアクセス修飾子が使われ。ローカル変数そうではない


コンストラクタ：构造器constructor
Objectを生成の時に、自動的に引用されます
パラメーターはnew Objectの時に入れます
returnはないけれども、void/intとか、絶対に要らない

例えば：
Person p = new Person("XX", 19);

class Person {
	String name;
	int age;
	//constructor
	public Person(String str, int num) {
		//名前とClassのと同じ
		name = str;
		age = num;
	}
}

注意、コンストラクタのオーバーロードもできます。
定義のコンストラクタはデフォルトのを差し換えます。例えば
public Dog(String name) {
}
...
Dog d = new Dog(paras); 
//parasは必要だ、non-paraのDog()は差し替えられました、もう使わなかった。
//ならでは、再度オーバーロード

メモリでObject作成プロセス：
1）メソッド領域でClass情報の読み込み
2）ヒープでアドレスとスベースを生成
3）イニシャル：ディフォルト値を生成、属性値を代入
4）イニシャル：定義のコンストラクタがあったら、値を代入
5）アドレスをスタックでの変数にあげます

thisは同じ名前のclass属性とローカル変数を区別でき
public void print(String name, int age) {
	this.name =name;
	this.age = age;
}

コンストラクタconstructorを引用方：this(para)。
コンストラクタ引用thisは、他のコンストラクタのオーバーロードを引用のみ
コンストラクタ引用thisは、行頭に置かなければなりません

class T {
	public T() {
		this("jack", 100);　//行頭
		...
	}
	public T(String name, int age) {
		System.out.print();
	}
}
