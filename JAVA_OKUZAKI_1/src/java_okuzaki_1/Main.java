package java_okuzaki_1;

public class Main {

	public static void main(String[] args) {
	    practice1();// 各practiceメソッドを呼び出して出力します
	    practice2();
	    practice3();
	    practice4();
	    practice5();
	    practice6();
	    practice7();
	    practice8();
	    practice9();
	    practice10();
	    practice11();
	    practice12();
	    practice13();
	    practice14();
	    practice15();
	    practice16();
	    practice17();
	    practice18();
	    practice19();
	    practice20();
	    practice21();
	    practice22();
	    practice23();
	    practice24();
	  }
	
	static void practice1() {
		System.out.println("// practice 1 - printとprintlnメソッドの出力練習 //");
		
		System.out.print("printメソッドです。");// printは改行なし
		System.out.println("printlnメソッドです。");// printlnは改行あり
		System.out.println("printlnメソッドです。");
		System.out.println("");
		System.out.print("printメソッドは次のStringを続けて出力し、");
		System.out.println("printlnは改行が挿入されます。");
		System.out.print("Hello World!");
		System.out.println("\n");
	}
	
	static void practice2() {
		System.out.println("// practice 2 - println内の演算練習 //");
		
		System.out.println(12345);// 数字をそのまま出力
		System.out.println(100 + 100);// 100 + 100 の和を出力
		System.out.println(200 * 50);// 200 * 50 の積を出力
		System.out.println("100 + 100");// 二重引用符で囲むと演算されずStringとして出力されます
		System.out.println("\n");
	}
	
	static void practice3() {
		System.out.println("// practice 3 - String型とInt型の宣言について //");
		
	    String name = "Okuzaki";// String型の変数nameを宣言し、値Okuzakiを格納します
	    System.out.println(name);// 変数nameの内容を出力します
	    int myNum = 30;// Int型の変数myNumを宣言し、値30を格納します
	    System.out.println(myNum);//変数myNumの値を出力します
	    myNum = 20;  // 先程のmyNumに値20を格納します
	    System.out.println(myNum); // 後から入れた値20が出力されます
	    final int myNumEx = 30;// 型の前にfinalと書くと、上書きを防止できます
	    System.out.println(myNumEx);// 変数myNumExの値を出力します
		System.out.println("\n");
	}
	
	static void practice4() {
		System.out.println("// practice 4 - テキストと変数の複合出力 //");
		
		String firstName = "Okuzaki";// String型の変数firstNameを宣言し、値Okuzakiを格納します
		String lastName = "Kyohei";// String型の変数lastNameを宣言し、値Kyoheiを格納します
		String fullName = firstName + lastName;//変数fullNameに、firstNameとlastNameの値を繋げて格納します
		System.out.println(fullName);// 変数firstNameとlastNameの値を繋げてテキストとして出力します
	    System.out.println(firstName + lastName);// 変数firstNameとlastNameの値を繋げてテキストとして出力します
	    System.out.println("Okuzaki " + lastName);// テキストと変数lastNameの値を繋げて出力します
	    System.out.println(firstName.concat(lastName));// concatメソッドを使用して連結することも可能です
	    int x = 30;
	    int y = 50;
	    System.out.println(x + y);// Int型の場合、値の演算結果が出力されます
		System.out.println("\n");
	}
	
	static void practice5() {
		System.out.println("// practice 5 - 多くの変数を宣言する //");
		
		int x = 5;
		int y = 6;
		int z = 50;
		System.out.println(x + y + z); // Int型のx,y,zの値を演算して出力します
		int a = 5, b = 6, c = 50;
		System.out.println(a + b + c); // このように簡単に書くこともできます
		int e, d, f;
		e = d = f = 50;
		System.out.println(e + d + f); // 行で複数の変数に同じ値を代入することもできます
		System.out.println("\n");
	}
	
	static void practice6() {
		System.out.println("// practice 6 - プリミティブデータ型 //");
		
		byte byteNum = 100;     // -128から127までの整数を格納できます
		short shortNum = 5000;    // -32768から32767までの整数を格納できます
	    int intNum = 5;               //  -2147483648から2147483647までの整数を格納できます
	    long longNum = 15000000000L;    // -9223372036854775808から9223372036854775807までの整数を格納できます。末尾に「L」を付ける必要があることに注意
	    float floatNum = 5.99f;    // 浮動小数点数を含む値を格納できます。値の末尾は浮動小数点数の場合は末尾に「f」を付ける必要があることに注意
	    double doubleNum = 19.99d;    // 浮動小数点数を含む値を格納できます。値の末尾は浮動小数点数の場合は末尾に「d」を付ける必要があることに注意
	    /* floatまたはdoubleを使用する場合には
	    浮動小数点値の精度は、値の小数点以下の桁数を示します。floatの精度は10進数でわずか6桁または7桁ですが、double変数の精度は約15桁です。したがって、ほとんどの計算ではdoubleを使用する方が安全です。 */
	    char myLetter = 'D';         // 単一の文字を格納するために使用されます。文字は、'A'や'c' のように一重引用符で囲む必要があります
	    boolean myBool = true;       // ブール値 true / false を格納できます
	    String myText = "Hello";     // 一連の文字(テキスト)を格納するために使用されます  文字列値は二重引用符で囲む必要があります
	    System.out.println(byteNum);   // 以下、各変数の値を出力
	    System.out.println(shortNum);
	    System.out.println(intNum);
	    System.out.println(longNum);
	    System.out.println(floatNum);
	    System.out.println(doubleNum);
	    System.out.println(myLetter);
	    System.out.println(myBool);
	    System.out.println(myText);
		System.out.println("\n");
	}
	
	static void practice7() {
		System.out.println("// practice 7 - キャスト型について //");
		
	    int firstInt = 12345;
	    double firstDouble = firstInt; // サイズの小さい型をサイズの大きい型に渡すと、ワイドニングキャストが自動的に行われます。
	    System.out.println(firstInt);
	    System.out.println(firstDouble);
        double secondDouble = 1.2345d;
        int secondInt = (int) secondDouble; // キャストの絞り込みは、値の前の括弧内にタイプを配置して手動で行う必要があります。
        System.out.println(secondDouble);
        System.out.println(secondInt);
		System.out.println("\n");
	}
	
	static void practice8() {
	    System.out.println("// practice 8 - 演算子 //");
	    
	    System.out.println("## 算術演算子 ##");
	    int a = 5;
	    int b = 3;
	    System.out.println(a + b); // a と b の加算結果を表示
	    System.out.println(a - b); // a から b を引いた結果を表示
	    System.out.println(a * b); // a と b の乗算結果を表示
	    System.out.println(a / b); // a を b で割った結果を表示
	    System.out.println(a % b); // a を b で割った余りを表示
	    ++a; // a を 1 増やす
	    System.out.println(a); // a の値を表示
	    --b; // b を 1 減らす
	    System.out.println(b); // b の値を表示
	    System.out.println("");
	    System.out.println("## 代入演算子 ##");
	    int c = 5;
	    c += 3; // c に 3 を加算
	    System.out.println(c); // c の値を表示
	    int d = 5;
	    d -= 3; // d から 3 を減算
	    System.out.println(d); // d の値を表示
	    int e = 5;
	    e *= 3; // e に 3 を乗算
	    System.out.println(e); // e の値を表示
	    double f = 5; // 変数 f に 5 を代入（浮動小数点数）
	    f /= 3; // f を 3 で除算
	    System.out.println(f);
	    int g = 5;
	    g %= 3; // g を 3 で割った余りを g に代入
	    System.out.println(g);
	    int h = 5;
	    h &= 3; // h と 3 の AND 演算結果を h に代入
	    System.out.println(h);
	    int i = 5;
	    i |= 3; // i と 3 の OR 演算結果を i に代入
	    System.out.println(i);
	    int j = 5; // 変数 j に 5 を代入
	    j ^= 3; // j と 3 の XOR 演算結果を j に代入
	    System.out.println(j);
	    int k = 5; // 変数 k に 5 を代入
	    k >>= 3; // k を 3 ビット右シフト
	    System.out.println(k);
	    int l = 5; // 変数 l に 5 を代入
	    l <<= 3; // l を 3 ビット左シフト
	    System.out.println(l);
	    System.out.println("");
	    System.out.println("## 比較演算子 ##");
	    int m = 5; // 変数 m に 5 を代入
	    int n = 3; // 変数 n に 3 を代入
	    System.out.println(m == n); // m と n が等しいなら true、それ以外なら false を返す
	    System.out.println(m != n); // m と n が等しくなければ true、それ以外なら false を返す
	    System.out.println(m > n); // m が n より大きいなら true、それ以外なら false を返す
	    System.out.println(m >= n); // m が n 以上なら true、それ以外なら false を返す
	    System.out.println("");
	    System.out.println("## 論理演算子 ##");
	    int o = 5; // 変数 o に 5 を代入
	    System.out.println(o > 3 && o < 10); // o が 3 より大きく 10 未満なら true、それ以外なら false を返す
	    System.out.println(o > 3 || o < 4); // o が 3 より大きいか または 4 未満なら true、それ以外なら false を返す
	    System.out.println(!(o > 3 && o < 10)); // o が 3 より大きく 10 未満ではないなら true、それ以外なら false を返す
		System.out.println("\n");
	}
	
	static void practice9() {
		System.out.println("// practice 9 - 文字列 //");
		
	    String greeting = "Hello";
	    System.out.println(greeting);// 変数 greeting を 出力
	    String txt = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
	    System.out.println("この文字列の長さは、" + txt.length() + "です。");// テキストと 変数 txt の文字列長を組み合わせて出力
	    String txt2 = "Hello World";
	    System.out.println(txt2.toUpperCase());   // 変数 txt2 の値を全て大文字で出力
	    System.out.println(txt2.toLowerCase());   // 変数 txt2 の値を全て小文字で出力
	    String txt3 = "こんにちは 今日も 良い天気 ですね。";
	    System.out.println(txt3.indexOf("良い天気")); // 変数 txt3 の値中、"良い天気"の文字列が初めて出てくる位置を出力(スペースを含んで数える)
		System.out.println("\n");
	}
	
	static void practice10() {
		System.out.println("// practice 10 - 数値と文字列 //");
		
//		警告！
//		Javaでは、+加算と連結の両方に演算子を使用します。
//		数字が追加されます。文字列が連結されます。
	    int a = 10;
	    int b = 20;
	    int c = a + b;
	    System.out.println(c); // 変数 a b 共にInt型であるため、値の和が出力されます
	    String d = "10";
	    String e = "20";
	    String f = d + e;
	    System.out.println(f); // String型を連結すると、結果は文字列連結になります
	    String g = "10";
	    int h = 20;
	    String i = g + h;
	    System.out.println(i); // Int型とString型が複合すると、結果は文字列連結になります
		System.out.println("\n");
	}
	
	static void practice11() {
		System.out.println("// practice 11 - 特殊文字 //");
		
		// バックスラッシュは\になることもある
	    String txt1 = "こんにちは \"今日も\" 良い天気"; // バックスラッシュエスケープ文字でダブルクウォートを表示
	    System.out.println(txt1);
	    String txt2 = "こんにちは \'今日も\' 良い天気"; // バックスラッシュエスケープ文字でシングルクウォートを表示
	    System.out.println(txt2);
	    String txt3 = "こんにちは \\今日も\\ 良い天気"; // バックスラッシュエスケープ文字で\を表示
	    System.out.println(txt3);
	    String txt4 = "こんにちは \n今日も 良い天気"; // \nで改行 New Line の意
	    System.out.println(txt4);
	    String txt5 = "こんにちは \r今日も 良い天気"; // \nで行頭復帰 Carriage Return の意
	    System.out.println(txt5);
	    String txt6 = "こんにちは \t今日も 良い天気"; // \tでインデント Tab の意
	    System.out.println(txt6);
	    String txt7 = "こんにちは \b今日も 良い天気"; // \bでバックスペースを可視化 Back Space の意
	    System.out.println(txt7);
	    String txt8 = "こんにちは \f今日も 良い天気"; // \fでフォームフィードを可視化 Form Feed の意
	    System.out.println(txt8);
		System.out.println("\n");
	}
	
	static void practice12() {
		System.out.println("// practice 12 - Math クラス //");
		
	    System.out.println(Math.max(5, 10)); // x y の最大値を出力する
	    System.out.println(Math.min(5, 10)); // x y の最小値を出力する
	    System.out.println(Math.sqrt(100)); // 平方根を出力する
	    System.out.println(Math.abs(-4.7)); // xの絶対(正)値を返します
	    System.out.println(Math.random());  // 0.0(両端を含む) から1.0(両端を含まない)までの乱数を返します
	    int randomNum = (int)(Math.random() * 101); // 0から100までの乱数のみが必要な場合は、次の式を使用できます
	    System.out.println(randomNum);
		System.out.println("\n");
	}
	
	static void practice13() {
		System.out.println("// practice 13 - Math クラス //");
		
	    System.out.println(Math.max(5, 10)); // x y の最大値を出力する
	    System.out.println(Math.min(5, 10)); // x y の最小値を出力する
	    System.out.println(Math.sqrt(100)); // 平方根を出力する
	    System.out.println(Math.abs(-4.7)); // xの絶対(正)値を返します
	    System.out.println(Math.random());  // 0.0(両端を含む) から1.0(両端を含まない)までの乱数を返します
	    int randomNum = (int)(Math.random() * 101); // 0から100までの乱数のみが必要な場合は、次の式を使用できます
	    System.out.println(randomNum);
		System.out.println("\n");
	}
	
	static void practice14() {
		System.out.println("// practice 14 - ブール値 //");
		
		// ブール型はbooleanキーワードで宣言され、trueまたはfalseの値のみを取ることができます。
	    boolean isJavaFun = true;
	    boolean areYouAngry = false;    
	    System.out.println(isJavaFun);
	    System.out.println(areYouAngry);
	    
	    // practice 8 の論理演算子と内容が重複するため、そちらを参照 //
	    
	    int myAge = 25;
	    int votingAge = 18;
	    // 変数 myAge と voting Age を比較し、 myAge が votingAge 以上ならif文を、そうでなければelse文を実行する
	    if (myAge >= votingAge) {
	      System.out.println("あなたは投票可能な年齢です。");
	    } else {
	      System.out.println("あなたは投票可能な年齢ではありません。");
	    }
		System.out.println("\n");
	}
	
	static void practice15() {
		System.out.println("// practice 15 - if...else //");
		
		// if
		int x = 20;
		int y = 18;
		if (x > y) {
		System.out.println("x は y より大きい"); // ifメソッドの判定が true の場合テキストを出力する
	    }  
	    
		// if と else
	    int time = 20;
	    if (time < 18) {
	      System.out.println("こんにちは."); // ifメソッドの判定が true の場合 if ブロックのコードを実行する
	    } else {
	      System.out.println("こんばんは."); // false の場合、else ブロックのコードを実行する
	    }
	    
	    // else if
	    if (time < 10) {
	      System.out.println("おはようございます"); // ifメソッドの判定が true の場合 if ブロックのコードを実行する
	    } else if (time < 18) {
	      System.out.println("こんにちは."); // false なら else if メソッドに進み、true の場合 else if ブロックのコードを実行する
	    }  else {
	      System.out.println("こんばんは"); // false なら else ブロックのコードを実行する
	    }

		System.out.println("\n");
	}
	
	static void practice16() {
		System.out.println("// practice 16 - if...else  (三項演算子) //");
		
//		3つのオペランドで構成されるため、三項演算子と呼びます
//		構文：
//			variable = (condition) ? expressionTrue :  expressionFalse;
	    int time = 20;
	    if (time < 18) {
	      System.out.println("こんにちは");
	    } else {
	      System.out.println("こんばんは");
	    }
	    // 下記の記述で、簡単に同じ結果を出力できます //
	    int time2 = 20;
	    String result;
	    result = (time2 < 18) ? "こんにちは" : "こんばんは"; // 条件 / trueの場合 / falseの場合
	    System.out.println(result);
		System.out.println("\n");
	}
	
	static void practice17() {
		System.out.println("// practice 17 - switch ステートメント //");
		
	    int day = 4;
	    switch (day) {
	      case 1:
	        System.out.println("月曜日"); // 変数 day の値と case の値を比較し、一致したら出力する
	        break; 							// break で switchブロックから抜け出す
	      case 2: 							// 以降、条件に一致するまで走査していく
	        System.out.println("火曜日");
	        break;
	      case 3:
	        System.out.println("水曜日");
	        break;
	      case 4:
	        System.out.println("木曜日");
	        break;
	      case 5:
	        System.out.println("金曜日");
	        break;
	      case 6:
	        System.out.println("土曜日");
	        break;
	      case 7:
	        System.out.println("日曜日");
	        break;
	    }
	    
//		defaultを使った方法	    
	    switch (day) {
	    case 6:
		    System.out.println("今日は土曜日です");
		    break;
		    case 7:
		    System.out.println("今日は日曜日です");
		    break;
		    default:
		    System.out.println("お仕事ご苦労さまです"); // どの定数にも一致しない時、大文字・小文字が不一致の場合実行する
	    }												// break は不要
		System.out.println("\n");
	}
	
	static void practice18() {
		System.out.println("// practice 18 - While ループ //");
		
//		変数(i)が5未満である限り、ループ内のコードが何度も実行
		int i = 0;
		while (i < 5) {			// while 条件を満たさなくなるまで繰り返す
			System.out.println(i); // while 条件を満たす場合、変数 i の値を出力
			i++; 					// 変数 i に 1 加算
			}						// ループ先頭に戻る
		System.out.println("");
//		Do/Whileループ
//		条件がtrueかどうかを確認する前にコードブロックを1回実行し、条件がtrueである限りループを繰り返します。
	    int j = 0;
	    do {						//  while の条件判定の前に実行する
	    	System.out.println(j);  // 変数 j の値を
	    	j++;					// 変数 j に 1 加算する
	    }
	    while (j < 5);				// while 条件の判定を行い、満たす場合 do ブロックのコードに戻る
		System.out.println("\n");
	}
	
	static void practice19() {
		System.out.println("// practice 19 - For ループ //");
		
//		コードブロックをループする回数が正確にわかっている場合は、"while"ループの代わりにforループを使います。
//		構文：
//		for (statement 1; statement 2; statement 3) {
//			// 実行するコードを書く
//			}
	    for (int i = 0; i < 5; i++) { 	// 変数 i の初期値は 0			条件を満たす場合は変数 i に 1 加算して、ブロックのコードを実行する
	        System.out.println(i);		
	      }  							// 条件を満たさなくなるまでループする
		System.out.println("");
		
//	    偶数を繰り返し出力するパターン
	    for (int i = 0; i <= 10; i = i + 2) {	// 変数 i の初期値は 0			条件を満たす場合は変数 i に 2 加算して、ブロックのコードを実行する
	        System.out.println(i);
	      }  							// 条件を満たさなくなるまでループする
		System.out.println("");
	    
//	    ネストされたループ
//	    ループを別のループ内に配置することもできます。
//	    「内側のループ」は、「外側のループ」の反復ごとに1回実行されます。
	    // Outer loop.		"Inner loop"の条件を抜け次第戻って来る
	    for (int i = 1; i <= 2; i++) {			// 変数 i の初期値は 1			条件を満たす場合は変数 i に 1 加算して、ブロックのコードを実行する
	      System.out.println("Outer: " + i);	// 条件を満たす場合、テキストを出力してから"Inner loop"に移行する
	      
	      // Inner loop.		"Outer loop" 1度につき3度実行する
	      for (int j = 1; j <= 3; j++) {		// 変数 i の初期値は 1			条件を満たす場合は変数 i に 1 加算して、ブロックのコードを実行する
	        System.out.println(" Inner: " + j); // 条件を満たす場合、テキストを出力してから"Inner loop"の判定に戻る		条件外なら Outer loop に戻る
	      }
	    } 
		System.out.println("\n");
	}
	
	static void practice20() {
		System.out.println("// practice 20 - For Each ループ //");
		
//		"for-each"ループは、配列要素をループするためにのみ使用されます。
//		構文：
//		for (type variableName : arrayName) {
//			// 実行するコードを書く
//			}
	    String[] cars = {"Volvo", "BMW", "Ford", "Mazda"};	// String型の配列に値を連続して格納する
	    for (String i : cars) {								// for each 文を使って、配列carsの各要素を順に取り出す
	      System.out.println(i);							// 現在の配列インデックスの値を出力
	    }    												// for each 文の先頭に戻る
		System.out.println("\n");
	}
	
	static void practice21() {
		System.out.println("// practice 21 - Break と Continue //");
		
//		breakはループから抜け出すために使えます。
		for (int i = 0; i < 10; i++) {		// 変数 i の初期値は 0			条件を満たす場合は変数 i に 1 加算して、ブロックのコードを実行する
			   if (i == 4) {				// if 文の条件を満たす場合、ブロックのコードを実行する		条件外ならfor 文に戻る
			     break;						// for ループから抜け出す
			 }
			   System.out.println(i);		// 変数 i の値を出力する
			}
		System.out.println("");
		
//		continueステートメントは、指定された条件が発生した場合に(ループ内の)1つの反復を中断し、ループ内の次の反復を続行します。
		for (int i = 0; i < 10; i++) {		// 変数 i の初期値は 0			条件を満たす場合は変数 i に 1 加算して、ブロックのコードを実行する
			  if (i == 4) {					// if 文の条件を満たす場合、1つ目のブロックのコードを実行する		条件外なら2つ目のブロックへ
			     continue;					// for ループの先頭に戻る
			  }
			  System.out.println(i);		// 変数 i の値を出力する
			}								// for ループの先頭に戻る
		System.out.println("");
		
//		Whileループでbreak
		int i = 0;					// 変数 i の初期値は 0
		while (i < 10) {			// while ループ		条件を満たす場合ブロックのコードを実行する
		  System.out.println(i);		// 変数 i の値を出力する
		  i++;							// 変数 i の値に 1 加算する
		  if (i == 4) {					// if 文の条件を満たす場合、1つ目のブロックのコードを実行する		条件外なら2つ目のブロックへ
		    break;						// while ループから抜け出す
		   }							
		}								// while ループの先頭に戻る
		System.out.println(i);			// 変数 i の値を出力する
		System.out.println("");
		
//		Whileループでcontinue
		int j = 0;					// 変数 j の初期値は 0
		while (j < 10) {			// while ループ		条件を満たす場合ブロックのコードを実行する
		   if (j == 4) {			// if 文の条件を満たす場合、1つ目のブロックのコードを実行する		条件外なら2つ目のブロックへ
		     j++;					// 変数 j の値に 1 加算する
		    continue;				// while ループの先頭に戻る
		  }
		  System.out.println(j);	// 変数 j の値を出力する
		  j++;						// 変数 j の値に 1 加算する
		}							// while ループの先頭に戻る
		System.out.println("\n");
	}
	
	static void practice22() {
		System.out.println("// practice 22 - 配列 //");
		
//		配列は、値ごとに個別の変数を宣言するのではなく、1つの変数に複数の値を格納するために使用されます。
//		配列を宣言するには、角括弧で変数の型を定義します。
//		構文：
//			String[] cars = {"Volvo", "BMW", "Ford", "Mazda"};
//			int[] myNum = {10, 20, 30, 40};
		
//		配列の要素にアクセスする
		String[] cars = {"Volvo", "BMW", "Ford", "Mazda"}; // String型の配列 cars を宣言	値を連続して入れていく
		System.out.println(cars[0]);						// 配列インデックス 0 番目の値を出力（先頭が0であることに注意)
		System.out.println("");
		
//		配列要素を変更する
		String[] cars2 = {"Toyota", "Nissan", "Honda", "Mazda"}; // String型の配列 cars2 を宣言		値を連続して入れていく
		cars2[0] = "Mitsubishi";									// 配列インデックス 0 番目の値を変更
		System.out.println(cars2[0]); 						// 配列インデックス 0 番目の値を出力
		System.out.println("");
		
//		配列の長さ
//		配列の要素数を調べるには、lengthプロパティを使用します。
		String[] cars3 = {"Ferrari", "Lamborghini", "Mercedes-Benz", "Aston Martin"}; // String型の配列 cars3 を宣言		値を連続して入れていく
		System.out.println(cars3.length);					// 配列 cars3 の要素数を出力
		System.out.println("\n");
	}
	
	static void practice23() {
		System.out.println("// practice 23 - 配列ループ //");
		
//		配列要素をループすることができますforループして、lengthプロパティを使用して、ループを実行する回数を指定します。
		String[] cars = {"Volvo", "BMW", "Ford", "Mazda"};	// String型の配列 cars を宣言	値を連続して入れていく
		for (int i = 0; i < cars.length; i++) {				// 変数 i の初期値は 0		条件(i が配列の要素数を超えるまで) 変数 i に 1 加算して、ブロックのコードを実行する
		   System.out.println(cars[i]);						// 配列[i]番目の要素の値を出力する
		}													// for ループの先頭に戻る
		System.out.println("");
//		For-Each を使用した配列のループ
//		構文：
//			for (type variable : arrayname) {		
//			   	実行するコードを書く
//				}
		String[] cars2 = {"Toyota", "Nissan", "Honda", "Mazda"}; // String型の配列 cars2 を宣言		値を連続して入れていく
		for (String i : cars2) {								// String型の変数 i に、for each 文を使って配列carsの各要素を順に代入
		   System.out.println(i);								// 現在の変数 i の値を出力する
		}														// for ループの先頭に戻る
		System.out.println("\n");
	}

	static void practice24() {
		System.out.println("// practice 24 - 多次元配列 //");
//		多次元配列は配列の配列です。
//		多次元配列は、データを表形式 (行と列からなるテーブルなど) として格納する場合に便利です。
//		2 次元配列を作成するには、各配列を独自のセット内に追加します。中括弧:
//		例：
//			int[][] myNumbers = { {1, 2, 3, 4}, {5, 6, 7} };
//		マイナンバーズ要素として 2 つの配列を持つ配列になりました。
		int[][] myNumbers = { {1, 2, 3, 4}, {5, 6, 7} }; // マイナンバーズ配列 配列の中に配列をもつ形
		System.out.println(myNumbers[1][2]); // 2番目の配列の中の、3番目の要素の値を出力（先頭を0として数える点に注意）
		System.out.println("");
		
//		要素の値を変更することもできます
		int[][] myNumbers2 = { {1, 2, 3, 4}, {5, 6, 7} }; // マイナンバーズ配列 配列の中に配列をもつ形
		myNumbers2[1][2] = 9;							// 2番目の配列の中の、3番目の要素の値に9を代入
		System.out.println(myNumbers2[1][2]);			 // 2番目の配列の中の、3番目の要素の値を出力
		System.out.println("");

//		多次元配列のループ
//		1段目のループで配列を選択し、2段目のループでその配列の中身を出し尽くしたら、1段目のループに戻る
        int[][] myNumbers3 = { {1, 2, 3, 4}, {5, 6, 7} }; // マイナンバーズ配列 配列の中に配列をもつ形
        for (int i = 0; i < myNumbers3.length; ++i) {		// 変数 i の初期値は 0			条件を満たす場合は変数 i に 1 加算して、ブロックのコードを実行する
            for(int j = 0; j < myNumbers3[i].length; ++j) {	// 変数 j の初期値は 0			条件を満たす場合は変数 j に 1 加算して、ブロックのコードを実行する
                System.out.println(myNumbers3[i][j]);		// [i]番目の配列の中の、[j]番目の要素の値を出力
            }
        }
		System.out.println("\n");
	}
}

