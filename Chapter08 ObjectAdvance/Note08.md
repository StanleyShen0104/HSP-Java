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
Auto Import：		Ctrl + Shift + O		Alt + Enter 			Alt + Enter 
Auto Formatting：	Ctrl + Shift + F		Ctrl + Alt + L			Alt + L
Run Program:		Ctrl + F11				Ctrl + Shift + F10	Alt + R
Auto Constructor:	Alt + Shift + S		Alt + insert			Alt +insert
Show Structures:	Ctrl + T					Ctrl + H					Ctrl + H

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

訪問修飾子の復習：
public:		全部でき
private:		自分だけ
protected:	自分、同じPackage、子Class
default:		自分、同じPackage

自分:					すべで
同じpackage:		privateを除き
他のpackage:		publicだけ
子class:				public、protectedでき

注意、classを声明とき、public、default使いだけ

カプセル化：封装(encapsulation)
内部の実行詳細を隠し、Userは入力と出力に焦点を当てるだけ
データの妥当性検証が可能です

カプセル化step:
属性をprivateする(外から修正られない)
classでpublic setメソッド、private属性を修正と検証でき
classでpublic getメソッド、private属性を読み込みでき
