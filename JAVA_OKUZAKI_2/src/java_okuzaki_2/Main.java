package java_okuzaki_2;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.Scanner;

public class Main {

    // 関数を定義
    public static void calculateAge(String name, String birthDate) {
        // 日付フォーマットを定義
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        
        // 誕生日をLocalDateに変換
        LocalDate birthDay = LocalDate.parse(birthDate, formatter);
        LocalDate today = LocalDate.now();
        
        // 年齢を計算
        Period age = Period.between(birthDay, today);
        
        // 結果を表示
        System.out.println("お名前: " + name + " さん");
        System.out.println("年齢: " + age.getYears() + " 歳");
    }

    public static void main(String[] args) {
        @SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);
        
        while (true) {
            // ユーザーから名前を取得
            System.out.print("お名前を入力してください: ");
            String name = scanner.nextLine();
            
            String birthDate = "";
            while (true) {
                System.out.print("生年月日を入力してください(例：1990-01-31): ");
                birthDate = scanner.nextLine();
                
                try {
                    // 日付フォーマットをチェック
                    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
                    LocalDate.parse(birthDate, formatter);
                    break; // 正しく入力された場合はループを抜ける
                } catch (DateTimeParseException e) {
                    System.out.println("フォーマットが正しくありません。もう一度入力してください。");
                }
            }
            
            // 年齢を計算して表示
            calculateAge(name, birthDate);
            
            // 改行して次の入力を受け付ける
            System.out.println();
        }
    }
}
