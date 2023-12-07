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
mainメソッドを非publicクラスに記述でき、プログラムのエントリーポイントは非publicクラス内のmainメソッドです