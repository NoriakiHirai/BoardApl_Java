package boardApp;

import java.util.ArrayList;
import java.util.List;

/**
 * 掲示板への投稿(contribution)や投稿内容の掲示板への出力を実行するクラス
 * 
 * @author guest
 */
public class Main {
	/**
	 * 掲示板インスタンスの作成、掲示板への投稿、およびその出力を行う。
	 * 
	 * @param args 実行時引数。無視される。
	 */
	public static void main (String[] args) {
		// インスタンスの作成
		Board myBoard = new Board("news", "user1");
				
		// 投稿の実施
		List<String> contributions = new ArrayList<>();
		contributions = myBoard.contribution();
		
		// 投稿内容の出力		
		myBoard.output(myBoard, contributions);
	}
}
