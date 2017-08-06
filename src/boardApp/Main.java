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
		// スキャナーオブジェクトの生成を行う。
		// 一度InputStreamをcloseすると、再度openするのは無理っぽい。
		// そのため、各メソッドでscannerオブジェクトを作成し、InputStreamの
		// open/closeを行うのではなく、最初にscannerオブジェクトを作成し、
		// それを引き回して、mainメソッドの最後にcloseさせる。
		scanner = new Scanner(System.in);

		// ユーザー名を取得する
		String userName = boardInit(scanner);

		// 投稿情報オブジェクトを格納する配列
		// 当課題では3件のみ投稿を受け付けるので、配列の長さは3とする
		ContributionInfo[] ciList = new ContributionInfo[3];

		// 投稿処理(3件)
		for (int i = 0; i < 3; i++) {
			ciList[i] = readInput(scanner, userName);
		}
		// 掲示板生成処理
		createBoard(ciList);

		scanner.close();
	}

	/**
	 * 掲示板アプリの初期処理として、ユーザーの名前をコンソールから取得する
	 * 
	 * @param sc
	 *            スキャナーオブジェクト
	 * @return userName ユーザー名
	 */
	private static String boardInit(Scanner sc) {
		System.out.println("*** 第二回課題掲示板へようこそ ***");

		// ユーザー名の入力
		System.out.println("ユーザー名を入力してください。");
		System.out.print("ユーザー名:");
		String userName = sc.nextLine();

		return userName;
	}

	/**
	 * 掲示板への投稿をコンソールから入力させる
	 * 
	 * @param sc
	 *            スキャナーオブジェクト
	 * @param userName
	 *            ユーザー名
	 * @return contributionInfo 投稿内容を保持したオブジェクト
	 */
	private static ContributionInfo readInput(Scanner sc, String userName) {
		// 投稿文の入力
		System.out.println("投稿を書き込んでください。");
		System.out.print("投稿内容 > ");
		 String sentence = sc.nextLine();

		// 投稿情報インスタンスの生成
		ContributionInfo contributionInfo = new ContributionInfo(userName, sentence);

		return contributionInfo;
	}

	/**
	 * 掲示板を生成し、投稿された内容を掲示板に表示する
	 * 
	 * @param ciList
	 *            投稿情報オブジェクトの配列
	 */
	private static void createBoard(ContributionInfo[] ciList) {
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
