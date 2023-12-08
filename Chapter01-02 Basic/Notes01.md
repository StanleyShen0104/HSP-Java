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


