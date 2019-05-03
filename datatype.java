//データ型についてのまとめ

	1.整数	  long,int,short,byte
	2.小数	  double,float
	3.真偽値  boolean
	4.文字    char
	5.文字列  String

1.整数を代入できる型
（コンピュータ内部で準備されるメモリの量に違いがある）

	long worldpeople; worldpeople = 69000000000L;
	int salary;	  sarary = 152000;
	short age;	  age = 18;
	byte glasses; 	  glasses = 2;

	--消費メモリ量の大きさの比較
	long > int > short > byte


2.小数を代入できる型
 (浮動小数点型)

	double height;   height = 171.2;
	float weight;    weight = 67.5F;


	--消費メモリ量の大きさの比較

	double > float


3.真偽についての二者択一の情報を代入できる型
（真偽値型）

	boolean isMarried; isMarried = true;
	boolean result;	   result = false;

4.一文字を格納できる型

	char gender; gender = '男';

5.文字列を格納できる型

	String name; name = "田中太郎";



