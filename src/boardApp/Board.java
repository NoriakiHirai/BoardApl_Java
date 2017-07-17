package boardApp;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Board {
	private final String category;
	public static String title = "掲示板";
	private final String user;

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

	public List<String> Contribution() {
		Boolean ctrbFlag = false;
		String yes = "y";

		List<String> contributions = new ArrayList<>();
		Scanner scanner = new Scanner(System.in);

		System.out.println(this.category + "掲示板に投稿してください。");
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
	
	public void Output(Board board, List<String> contributions) {
		// 掲示板の表示
		// タイトル部分の表示
		System.out.println();
		System.out.println("------------------------------");
		System.out.println();
		System.out.println("********************");
		System.out.println(board.getCategory() + title);
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
