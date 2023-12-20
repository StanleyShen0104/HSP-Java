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