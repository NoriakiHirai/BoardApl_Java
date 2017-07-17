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

	public String getTitle() {
		return title;
	}

	public String getUser() {
		return user;
	}

	public List<String> Contribution() {
		Boolean ctrbFlag = false;
		String yes = "y";

		List<String> contributions = new ArrayList<>();
		Scanner scanner = new Scanner(System.in);

		while (!ctrbFlag) {
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
}
