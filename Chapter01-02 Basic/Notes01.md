Javaファイルはコンパイルされて、classファイルが生成されます。そして、classファイルは異なるオペレーティングシステムのJVMによって、クロスプラットフォームの特性が実現されます

解釈型言語のclassファイルは、解釈器を使用して実行する必要がありますが、コンパイル型言語は直接実行できます。例えば、C、C++などです

コンパイル：javac
実行：java
JDK(java development kit)=JRE+java開発ツール
JRE(java runtime enviroment)=JVM+javaコアクラスライブラリ

//public 共有クラス
public class hello{
	//mainメソッドを記述して
	public static void main(String[] args){
		System.out.println("hello,world");
	}
}

Java言語は大文字と小文字を区別します
メソッドの各文の終了に「；」必要があります
1つのファイルには1つだけのpublicクラスしか存在できない、かつファイルは同じ名前である必要があります
複数の非publicクラスが存在でき、コンパイル後に複数のclassファイルが生成されます
mainメソッドを非publicクラスに記述でき

エスケープ文字：
System.out.println("北京\t上海\t天津"); Tab位置合わせ
System.out.println("北京\n上海"); 改行
System.out.println("北京\\上海"); 一つの「\」
System.out.println("北京\\\\上海"); 二つの「\」
System.out.println("北\"京上\"海"); 「"…"」や「'…'」
System.out.println("韩顺平教育\r北京");
北京平教育 シフト後に置換する
System.out.println("韩顺平教育\r\n北京");
韩顺平教育
北京
シフト後に改行し、その後に置換します

//単一行コメント
/*	複数行コメント
	複数行コメント	*/
/**
	* @author ドキュメンテーションコメント 1
	* @version ドキュメンテーションコメント 2
	* @... https://www.runoob.com/java/java-documentation.html
*/

Java ドキュメントの生成
javadoc -d [save address] -[author] -[version] filename.java


Javaコード規約：
classのコメント、Javadocで
非javadocコメントはコードの保守担当者へ向け
Tab で後方に移動し、Shift+Tab で前方に移動
数字と演算子の左右にスペースを追加する
UTF-8をデフォルト使用します

「cd ..\」親ディレクトリに戻ります
「cd /D E:\...」異なるドライブのアドレス切り替え
「cd \」rootに帰ります

変数
int a = 1;
int a; a = 1;

int -> 4 bytes
double -> 8 bytes
変数＝名前＋数値＋データ種別

+
データ型が数字の場合、加算演算子を使用します
データ型が少なくとも一つが文字列の場合、連結演算子を使用します
100 + 3 + "h" -> 103h
"h" + 100 + 3 -> h1003

データ型：
１、基本データ型
		1）数値型
				整数型：byte[1], short[2], int[4], long[8]
				小数型：float[4], double[8]
		2）キャラクタ型：char[2] 単一のキャラクタ
		3）ブーリアン型：boolean[1] true, false
２、参照データ型
		1）クラス型
		2）インターフェイス型
		3）アレイ型
注意：String(複数のキャラクタ)はクラス型
範囲：-2^(8*n-1) ~ 2^(8*n-1)-1
1byteは8bits構成されます、始めのは「+-」です

小数 = Sign＋Exponent＋Mantissa。Mantissa部分はなくす可能があったから、小数はみんな近似値

手動で入力された整数はデフォルトでint型となるため、変換必要があります
long a1 = 2L(l)

手動で入力された小数はデフォルトでdouble型となるため、変換必要があります
float a1 = 2.1F(f)

小数が関与する演算結果は依然として近似値であり、だから2つの小数を等しいかどうか比較しない方が良いです
double a1 = 8.1 / 3  != 2.7

char c1 = 'a';
char c1 = '\t';
char c1 = '韩';
char c1 = 97;	数字97に対応する文字を出力（unicode）
「"…"」と「'…'」は違います。「"…"」はString
char型の文字は数学演算に参加できます

unicode[2,2]はASCII[1]を拡張して作られました
UTF-8[1,3]はunicodeをアップグレードします

Javaでは、0と非0をfalseとtrueに代用することはできません

基本データ型の変換（重要）
ルール：精度の低い型は、自動的に精度の高い型に変換できます
byte -> short -> int -> long -> float -> double
char -> int -> long -> float -> double
注意1：long型は8bytesで、float型よりも小さいですが、実際にはfloat型の範囲がlong型よりも広いです。
注意2：byte[1]はchar[2]に自動変換できない、またchar[2]もshort[2]に自動変換できません

複数のデータ型が一緒に演算される場合、Javaはまず自動的に最も高い精度のデータ型に変換し、その後に計算が行われます
byte、short、charが一緒に演算される場合、Javaはまず自動的にintデータ型に変換し、その後に計算が行われます
booleanは自動的に変換できません

強制データ型の変換（重要）
ルール：精度の高い型は、強制的に精度の低い型に変換できます。
精度損失やデータオーバーフローの可能性があります
int i = (int)1.9; i -> 1 精度損失
byte j = (byte)2000; j -> -48 データオーバーフロー

charはintの定数值を保存できますが、変数はできません、強制データ型の変換が要ります
char c1 = 100; ok
int i = 1;
char c2 = (char)i; ok 
