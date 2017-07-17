package boardApp;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Board {
	/**
	 * 掲示板の各機能を実装したクラス
	 * 
	 * @author guest
	 */
	private final String category; // 掲示板の種別
	public static String TITLE = "掲示板";
	private final String user; // 投稿者

	/**
	 * 掲示版の属性を設定するコンストラクタ
	 * 
	 * @param category 掲示板の種別
	 * @param user 投稿者
	 */
	public Board(String category, String user) {
		super();
		this.category = category;
		this.user = user;
	}
	public String getCategory() {
		return category;
	}

	public String getUser() {
		return user;
	}

	/**
	 * 掲示板への投稿をコンソールから入力させる
	 * 
	 * @return List<String> 投稿内容を格納した配列
	 */
	public List<String> contribution() {
		Boolean ctrbFlag = false;
		String yes = "y";

		List<String> contributions = new ArrayList<>();
		// Scannerクラスを利用して，コンソールの標準入力の内容を取得する
		Scanner scanner = new Scanner(System.in);

		System.out.println(this.category + "掲示板に投稿してください。");
		// 任意の回数、投稿を繰り返す
		while (!ctrbFlag) {
			System.out.println();
			System.out.print("投稿内容 > ");
			String input = scanner.nextLine();
			contributions.add(input);
			
			System.out.print("投稿を続けますか?[y/n] ");
			String ans = scanner.nextLine();
			if (!ans.equals(yes)) {
				ctrbFlag = true;
			}
		}
		scanner.close();
		return contributions;
	}
	
	/**
	 *  投稿された内容を掲示板に表示する
	 *  	
	 * @param board 掲示板(Board)クラスのインスタンスオブジェクト
	 * @param contributions 投稿を格納した配列
	 */
	public void output(Board board, List<String> contributions) {
		// タイトル部分の表示
		System.out.println();
		System.out.println("------------------------------");
		System.out.println();
		System.out.println("********************");
		System.out.println(board.getCategory() + TITLE);
		System.out.println("********************");
		
		// 投稿内容部分の表示
		for (int i = 0; i < contributions.size(); ++i) {
			System.out.println((i + 1) + ". " +  board.getUser());
			String s = contributions.get(i);
			System.out.println(s);
			System.out.println();
		}
	}
}
