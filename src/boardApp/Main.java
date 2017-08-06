package boardApp;

import java.util.Scanner;

/**
 * �f���ւ̓��e�Ⓤ�e���e�̌f���ւ̏o�͂����s����N���X
 * 
 * @author guest
 */
public class Main {
	
	private static Scanner scanner; 
	/**
	 * �f���ւ̓��e�A����т��̏o�͂Ɋւ��鏈���̐�����s���B
	 * 
	 * @param args
	 *            ���s�������B���������B
	 */
	public static void main(String[] args) {
		// �X�L���i�[�I�u�W�F�N�g�̐������s���B
		// ��xInputStream��close����ƁA�ēxopen����͖̂������ۂ��B
		// ���̂��߁A�e���\�b�h��scanner�I�u�W�F�N�g���쐬���AInputStream��
		// open/close���s���̂ł͂Ȃ��A�ŏ���scanner�I�u�W�F�N�g���쐬���A
		// ����������񂵂āAmain���\�b�h�̍Ō��close������B
		scanner = new Scanner(System.in);

		// ���[�U�[�����擾����
		String userName = boardInit(scanner);

		// ���e���I�u�W�F�N�g���i�[����z��
		// ���ۑ�ł�3���̂ݓ��e���󂯕t����̂ŁA�z��̒�����3�Ƃ���
		ContributionInfo[] ciList = new ContributionInfo[3];

		// ���e����(3��)
		for (int i = 0; i < 3; i++) {
			ciList[i] = readInput(scanner, userName);
		}
		// �f����������
		createBoard(ciList);

		scanner.close();
	}

	/**
	 * �f���A�v���̏��������Ƃ��āA���[�U�[�̖��O���R���\�[������擾����
	 * 
	 * @param sc
	 *            �X�L���i�[�I�u�W�F�N�g
	 * @return userName ���[�U�[��
	 */
	private static String boardInit(Scanner sc) {
		System.out.println("*** ����ۑ�f���ւ悤���� ***");

		// ���[�U�[���̓���
		System.out.println("���[�U�[������͂��Ă��������B");
		System.out.print("���[�U�[��:");
		String userName = sc.nextLine();

		return userName;
	}

	/**
	 * �f���ւ̓��e���R���\�[��������͂�����
	 * 
	 * @param sc
	 *            �X�L���i�[�I�u�W�F�N�g
	 * @param userName
	 *            ���[�U�[��
	 * @return contributionInfo ���e���e��ێ������I�u�W�F�N�g
	 */
	private static ContributionInfo readInput(Scanner sc, String userName) {
		// ���e���̓���
		System.out.println("���e����������ł��������B");
		System.out.print("���e���e > ");
		 String sentence = sc.nextLine();

		// ���e���C���X�^���X�̐���
		ContributionInfo contributionInfo = new ContributionInfo(userName, sentence);

		return contributionInfo;
	}

	/**
	 * �f���𐶐����A���e���ꂽ���e���f���ɕ\������
	 * 
	 * @param ciList
	 *            ���e���I�u�W�F�N�g�̔z��
	 */
	private static void createBoard(ContributionInfo[] ciList) {
		// �^�C�g�������̕\��
		System.out.println();
		System.out.println("------------------------------");
		System.out.println();
		System.out.println("********************");
		System.out.println("����ۑ�" + ContributionInfo.TITLE);
		System.out.println("********************");

		// ���e���e�����̕\��
		for (int i = 0; i < ciList.length; i++) {
			System.out.println((i + 1) + ". " + ciList[i].getUserName());
			System.out.println(ciList[i].getSentence());
			System.out.println();
		}
	}
}
