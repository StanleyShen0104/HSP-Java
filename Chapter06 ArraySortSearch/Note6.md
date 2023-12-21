arrayアレイ：
複数の同じデータ種別のを保存します
<1>
double[] xx = {3, 5, 1.1};
double xx[] = {3, 5, 1.1};
<2>
double xx[] = new double[length]; ->空いているアレイ
<3>
double xx[]; ->名前あり、メモリ空間まだです
...
xx = new double[length]; ->メモリ空間あり

xx[index]; 訪問あるいは書き直します
xx.length; arrayの長さ

自動的に変換できないデータ種別のは入れられない
int[] a = {1.1, 1, 2}; -> ダメ
double[] a = {1, 2, 3}; -> OK

アレイの中で引用変数もできます。String,インスタンス,他のアレイ
もしアレイ作った後で、値代入されていなければ、デフォルト値があり：
0, 0.0 
char \u000
bool false
string null

アレイは相対引用です

バブルソート：n個の要素に対しては、n-1回だけのLoopが十分です

多次元アレイ：
<1>
double[][] xx = {{3, 5}, {1, 1}};
double xx[][] = {{3, 5}, {1,1}};
<2>
double[][] xx = new double[length1][length2];
<3>
double[][] xx;
...
xx = new double[length1][length2];

<4>内層アレイの長さが違いとき
int[][] xx = new int[length1][　];　->内層アレイのメモリ空間はまだです
for (int i = 0; i < xx.length; i++) {
	xx[i] = new int[...];	->内層アレイのメモリ空間があり
}

