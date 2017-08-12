package boardApp;

import java.util.Scanner;

/**
 * 掲示板への投稿や投稿内容の掲示板への出力を実行するクラス
 * 
 * @author guest
 */
public class Main {

	private static Scanner scanner;

	/**
	 * 掲示板への投稿、およびその出力に関する処理の制御を行う。
	 * 
	 * @param args
	 *            実行時引数。無視される。
	 */
	public static void main(String[] args) {
		scanner = new Scanner(System.in);

		System.out.println("*** 第二回課題掲示板へようこそ ***");

		// ユーザー名の入力
		System.out.println("ユーザー名を入力してください。");
		System.out.print("ユーザー名:");
		String userName = scanner.nextLine();

		// 投稿情報オブジェクトを格納する配列
		// 当課題では3件のみ投稿を受け付けるので、配列の長さは3とする
		ContributionInfo[] ciList = new ContributionInfo[3];
		
		// 投稿文の入力
		// 投稿処理(3件)
		// 投稿文を取得し、投稿情報インスタンスを作成する。
		// 作成したインスタンスは、投稿情報配列に保持しておく。
		for (int i = 0; i < 3; i++) {
			System.out.println("投稿を書き込んでください。");
			System.out.print("投稿内容 > ");
			String sentence = scanner.nextLine();

			// 投稿情報インスタンスの生成
			ContributionInfo contributionInfo = new ContributionInfo(userName, sentence);
			ciList[i] = contributionInfo;
		}

		///// 掲示板の表示 /////
		// タイトル部分の表示
		System.out.println();
		System.out.println("------------------------------");
		System.out.println();
		System.out.println("********************");
		System.out.println("第二回課題" + ContributionInfo.TITLE);
		System.out.println("********************");

		// 投稿内容部分の表示
		for (int i = 0; i < ciList.length; i++) {
			System.out.println((i + 1) + ". " + ciList[i].getUserName());
			System.out.println(ciList[i].getSentence());
			System.out.println();
		}

		scanner.close();
	}
}
