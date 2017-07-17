package boardApp;

import java.util.ArrayList;
import java.util.List;

public class Main {
	public static void main (String[] args) {
		// インスタンスの作成
		Board myBoard = new Board("news", "user1");
				
		// 投稿の実施
		List<String> contributions = new ArrayList<>();
		contributions = myBoard.Contribution();
		
		// 掲示板を表示
		// タイトル部分の表示
		System.out.println();
		System.out.println("------------------------------");
		System.out.println();
		System.out.println("********************");
		System.out.println(myBoard.getCategory() + Board.title);
		System.out.println("********************");
		
		// 投稿内容部分の表示
		for (int i = 0; i < contributions.size(); ++i) {
			System.out.println((i + 1) + ". " +  myBoard.getUser());
			String s = contributions.get(i);
			System.out.println(s);
			System.out.println();
		}
	}
}
