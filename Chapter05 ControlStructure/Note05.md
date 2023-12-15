If-Else(if)構造：
if (condition) {
	statements...
}
else {
	statements...
}

if (condition) {
	statements...
}
else if {
	statements...
}
...
else {
	statements...
}

ネスト分岐：ネスト分岐は3層を超えないように

Switch-Case構造：
switch (value) {
	case const1:		->定数と定数式だけ
		statements...	->value == const1 の時実行します
		break;				->break忘れば、次の条件を無視して次のコード部分実行続き
	case const2:
		statements...
		break;
	...
	default:				->なくてもいい
		statements...	->以上の条件全て失敗時実行します
		break;
}
valueとconstXは同じデータ種別、あるいは自動的に変えるデータ種別
valueは「byte, short, int, char, enum, String」のみ

for循環：
for (int i = 0; i < 10; i++) {	->statements運行終わってから、i++
	statements...
}

for (int i = 0, j = 0; i < 10; i++, j +=2) {
	statements...
}

int i = 0;
for (; i < 10; ) {
	statements...
	i++;
}

for (; ; ) {
	statements...	->無限循環
}

While循環：
while (condition) {
	statements...
}

Do-While循環：
do{
	statements...
}while(condition); ->注意、運行してから判断します。そして、「;」は必要です