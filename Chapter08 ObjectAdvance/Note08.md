IDEAとEclipseと違う：
Eclipse：package生成して後Class.java生成でき；*.class -> bin
IDEA：srcで直接にClass.java生成でき；*.class -> out/production

IDEAとEclipseと同じショートカットキー：
Ctrl + D: 現在の行を削除する
Ctrl + Alt + Down: 現在の行をコピーする
Ctrl + /: コメント
Ctrl + Click: Method Source
Alt + /: コード補完、模板補完、クラス導入
Alt + 方向: コードを移し


IDEAとEclipseと違うショートカットキー(default)：
										Eclipse				IDEA					  Recommend
Auto Import：			Ctrl + Shift + O		Alt + Enter 				Alt + Enter 
Auto Formatting：		Ctrl + Shift + F		Ctrl + Alt + L				Alt + L
Run Program:			Ctrl + F11				Ctrl + Shift + F10		Alt + R
Auto Constructor:		Alt  + Shift + S		Alt + insert				Alt + insert
Show Structures:		Ctrl + T					Ctrl + H						Ctrl + H

導入Package:
package xxx.packname;
packageの本質はfolder、だから違うpackagesで同名Classが存在でき
同じpackageは同じfolderでfiles、内外層folderのfilesがそうではない
packageは目下JavaFile帰属のpackageを声明ため、各Fileは一つあるのみ。最初に置かなければならない

導入Packageでのクラス:
import java.util.Scanner; //Scannerクラスのみ
import java.util.*; //util全部のクラス

packageの命名規則：
字母、数字、_、.　のみ
でも、数字を始めダメ	//demo.12a ダメ
キーワードできない		//demo.class.a ダメ

packageの命名規範：みんなは小文字

javaで常用のpackage:
java.lang	自動導入(System...Math...)
java.util		Scannerとかみたいな工具
java.net		WEB開発
java.awt		GUI画面開発

訪問修飾子の権限：
					当前类	同包子类	同包其他类	不同包子类	不同包其他类
private			---->
default			------------------------->
protected		------------------------------------->
public			-------------------------------------------------->

private:		自分だけでき
default:		同じpackageででき
protected:	同じpackage+違うpackageの子classででき
public:		すべででき

注意、classを声明とき、public、default使いだけ

カプセル化：封装(encapsulation)
内部の実行詳細を隠し、Userは入力と出力に焦点を当てるだけ
データの妥当性検証が可能です

カプセル化step:
属性をprivateする(外から修正られない)
classでpublic setメソッド、private属性を修正と検証でき
classでpublic getメソッド、private属性を読み込みでき

インヘリタンス：继承(Inheritance)
Subclass:サブクラス(子クラス)
Superclass:スーパークラス(父クラス)
SubclassはSuperclassから属性とメソッドをインヘリタンスする

class XXX extends FatherName {
}

SubclassはSuperclassの訪問修飾子規則を適用

SubclassとSuperclassコンストラクタの関係
Subclassコンストラクタがあるか、ないかと問わず、Superclassコンストラクタも自動的に実行
Superclass無パラメーターのコンストラクタがある場合、自動的に実行のはこれです
Superclass無パラメーターのがない、でも他のがある場合、Subclassコンストラクタでsuper命令で目指す必要がある
super()とthis()はコンストラクタの最初に置かなければなりません。だから、二つは同時に使えない

super()							//superclassの無パラメーターのコンストラクタ
super(paras)					//superclassの有パラメーターのコンストラクタ
super.属性　					//superclassの属性を訪問
super.メソッド(paras)	//superclassのメソッドを訪問
superはsuperclassのprivate属性とprivateメソッドを訪問できない

super使用细节：
分工明确，子父类属性在各自类内进行初始化，由子类中使用super调用父类构造器实现
子父类属性和方法在没有重名的情况下，可以不使用super，this直接用名称访问
实质：this从本类开始查找；super从父类开始查找

override方法重写:
子类的一个方法和父类(可跨级)的某个方法的名称、形参列表，返回类型一样。那么子类该方法重写了父类方法
其中：名称，形参列表必须完全一样。返回类型可以是相同或同向子类的关系（public String -> public Object)
重载的子类方法，不能缩小父类方法的访问权限（public > protected > default > private)

Polymorphic多态
方法的多态：方法重载Overload&方法重写override

对象的多态：
1、一个对象的编译类型和运行类型可以不一致。父类的引用可以指向子类的一个对象。例如：Animal ani = new Dog(); 其中Dog是子类（父类引用指向了子类的一个对象，且可跨级）
2、编译类型在定义对象时，就确定了，不能改变
3、运行类型可以后续再改变。例如：ani = new Cat(); ani仍然是Animal类的编译类型，但运行类型从Dog变为了Cat
*总的来看编译类型看“=”左边，运行类型看“=”右边
4、对象多态方法的调用优先级：运行类型>父类>高级父类
5、对象多态属性的调用优先级：编译类型
6、子类可以按照权限直接调用父类成员，称之为向上转型
7、父类不可以直接调用子类成员，需要特殊方法，称为向下转型

多态的向下转型(父类强转子类)：
Animal ani = new Cat();向上转型
Cat cat = (Cat) ani; 父类Animal编译类型强转子类Cat的编译类型
*向下转型多用于调用子类独有方法时，因为不强转编译器无法查找到该方法
注意1：只能强转父类的引用，不能强转父类的对象，例如：Cat cat = (Cat)new Animal() 则不可以
注意2：向下转型(强转)前务必先引用继承的关系。向上转型
注意3：若不存在父子继承关系，则无法强转

instanceof：判断对象的运行类型是否是某类或其子类
aa instanceof AA -> boolean

(非常重要)java的动态绑定机制DynamicBinding
方法有动态绑定机制，绑定在运行类型上，因此方法中再调用的其他方法，也是执行所绑定的运行类型的类方法。如果没有则再向父类寻找
属性没有动态绑定机制，因此就近取。如果没有则再向父类寻找

多态的应用场景：
1、多态数组：数组的定义类型为父类类型，里面实际保存的元素是子类类型。遍历之后配合instanceof+强转执行各自子类的独有方法(详见案例polyarr_.PolyArray.java)

2、多态参数：
类中定义方法的参数时，实际上是定义的是参数的编译类型。因此方法多态可以增加代码复用性(详见视频投喂案例)
public class Animal {
	public void feed(Animal ani, Food food) {
		System.out.println("master" + name + "to" + ani.getName() + "eat" + food.getName());
	}
}
调用Animal对象的feed方法时，可直接把子类Dog，Cat，Rice，Fish等的对象直接作为feed的参数传入。不需要把参数的编译类型在定义feed方法的时候每个情况都列举出来。因此可以大幅增加代码的简洁性

一般jdk原码会自动配置好，手动修改jdk原码source的方法：
1、IDEA：File->Project Structure->SDKs->SourcePath->+ jdk根目录src文件夹内javafx-src.zip ,src.zip
2、Eclipse：https://blog.csdn.net/weixin_61344527/article/details/134158714

Object.equals：
“==”判断基本数据类型时，比较的是值；判断引用数据类型时，比较的是地址是否相等
equals只能判断引用类型，Object中的equals方法本身是判断的是地址是否相等。但Object的子类例如integer，String类中的equals方法是父类的override，用于判断内容是否相等

Object.hashCode基础：
1、提高具有哈希结构的容器效率
2、两个引用，如果指向同一个对象，则哈希值是一样的。指向不同对象则哈希值是不一样的
3、哈希值返回的是基于地址计算的整数结果

Object.toString：
返回全类名(包名+类名)@转为16进制的HashCode
return getClass().getName() + "@" + Integer.toHexString(hashCode())
toString重写很常用，因此有快捷键，和构造器一样
使用print方法直接打印对象时，会默认调用toString方法，如果有重写则按照重写的来

Object.finalize：
对象的垃圾回收。对象被回收时，先自动调用Object.finalize方法，之后再进行回收。
Object.finalize方法本质上是一个空方法，什么都没有实现。子类可以通过重写此方法，以添加更多其他功能
JVM垃圾回收机制：当对象没有任何引用时(但非立即)。例如将对象引用置空 xxx = null;

注意：置空之后，JVM有自身的垃圾回收算法来决定何时回收。因此不会立刻回收该垃圾，所以被重写的finalize中的代码块也不会立刻被执行
如果想立即执行回收，需要使用System.gc()主动触发垃圾回收机制

断点调试：
在某行设置一个断点，调试时，运行到断点行代码块即停住(断点行不执行)。然后分步往下调试。逐步调试过程中：
1、可以看到各个变量的当前值
2、调试到出错行即显示错误，停下。

断点调试中，是以对象的运行类型来执行的。例如：
A extends B; B b = new A(); b.xx(); 此时debug的对象b就是运行类型A类


断点调试快捷键	IDEA			Eclipse		统一后
开始Debug：		
跳入方法体：		F7				F5				F7	
逐步调试：			F8				F6				F8
跳出方法体：		Shift+F8	F7				Shift+F8
到下一个断点：	F9				F8				F9

跳入的方法体是高亮行的，也就是尚未被执行的
后续断点可以在debug过程中，动态植入新的
