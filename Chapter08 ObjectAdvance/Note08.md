IDEAとEclipseと違う：
Eclipse：package生成して後Class.java生成でき；*.class -> bin
IDEA：srcで直接にClass.java生成でき；*.class -> out/production

IDEAとEclipseと同じショートカットキー：
Ctrl + D: 現在の行を削除する
Ctrl + Alt + Down: 現在の行をコピーする
Ctrl + /: コメント
Alt + /: コード補完、模板補完、クラス導入
Ctrl + Click: Method Source

IDEAとEclipseと違うショートカットキー(default)：
										Eclipse					IDEA						Recommend
Auto Import：			Ctrl + Shift + O		Alt + Enter 				Alt + Enter 
Auto Formatting：	Ctrl + Shift + F		Ctrl + Alt + L			Alt + L
Run Program:				Ctrl + F11				Ctrl + Shift + F10	Alt + R
Auto Constructor:		Alt + Shift + S		Alt + insert				Alt + insert
Show Structures:		Ctrl + T					Ctrl + H					Ctrl + H

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
java.util		Scannerとか工具
java.net		WEB開発
java.awt		GUI画面開発

訪問修飾子の権限：
					当前类	同包子类	同包其他类	不同包子类	不同包其他类
private			---->
default		-------------------------->
protected	-------------------------------------->
public			---------------------------------------------------->

private:		自分だけでき
default:		同じpackageででき
protected:	同じpackage+違うpackageの子classででき
public:			すべででき

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

super()							//superclassのコンストラクタ
super.属性　					//superclassの属性を訪問
super.メソッド(paras)	//superclassのメソッドを訪問
superはsuperclassのprivate属性とメソッドを訪問できない
 



