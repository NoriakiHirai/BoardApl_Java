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
		
		// 投稿内容の出力		
		myBoard.Output(myBoard, contributions);
	}
}
