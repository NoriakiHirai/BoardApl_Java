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

		// ユーザー名を取得する
		String userName = requestUserInfo();

		// 投稿文を格納する配列
		// 当課題では3件のみ投稿を受け付けるので、配列の長さは3とする
		String[] sentenceList = new String[3];

		// 投稿情報オブジェクトを格納する配列
		// 当課題では3件のみ投稿を受け付けるので、配列の長さは3とする
		ContributionInfo[] ciList = new ContributionInfo[3];

		// 投稿処理(3件)
		// 投稿文を取得し、投稿情報インスタンスを作成する。
		// 作成したインスタンスは、投稿情報配列に保持しておく。
		for (int i = 0; i < 3; i++) {
			sentenceList[i] = requestContribution();
			// 投稿情報インスタンスの生成
			ContributionInfo contributionInfo = new ContributionInfo(userName, sentenceList[i]);
			ciList[i] = contributionInfo;
		}
		

		// 掲示板生成処理
		showBoard(ciList);

		scanner.close();
	}

	/**
	 * 掲示板アプリの初期処理として、ユーザーの名前をコンソールから取得する
	 * 
	 * @param sc
	 *            スキャナーオブジェクト
	 * @return userName ユーザー名
	 */
	private static String requestUserInfo() {
		System.out.println("*** 第二回課題掲示板へようこそ ***");

		// ユーザー名の入力
		System.out.println("ユーザー名を入力してください。");
		System.out.print("ユーザー名:");
		String userName = scanner.nextLine();

		return userName;
	}

	/**
	 * 掲示板への投稿をコンソールから入力させる
	 * 
	 * @return sentence 投稿文
	 */
	private static String requestContribution() {
		// 投稿文の入力
		System.out.println("投稿を書き込んでください。");
		System.out.print("投稿内容 > ");
		String sentence = scanner.nextLine();

		return sentence;
	}

	/**
	 * 掲示板を生成し、投稿された内容を掲示板に表示する
	 * 
	 * @param ciList
	 *            投稿情報オブジェクトの配列
	 */
	private static void showBoard(ContributionInfo[] ciList) {
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
	}
}
