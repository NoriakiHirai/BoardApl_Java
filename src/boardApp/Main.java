package boardApp;

public class Main {
	public static void main (String[] args) {
		// インスタンスの作成
		Board myBoard = new Board("news", "user1");
		
		// 投稿の実施
		myBoard.Contribution();
		
		// 掲示板を表示
		// タイトル部分の表示
		System.out.println("********************");
		System.out.println(myBoard.getCategory() + Board.title);
		System.out.println("********************");
		
		// 投稿内容部分の表示
		
	}
}
