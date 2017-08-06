package boardApp;

import java.util.Scanner;

/**
 * �f���ւ̓��e(contribution)�Ⓤ�e���e�̌f���ւ̏o�͂����s����N���X
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
		Contribution[] ctbList = new Contribution[3];

		// ���e����(3��)
		for (int i = 0; i < 3; i++) {
			ctbList[i] = readInput(scanner, userName);
		}
		// �f����������
		createBoard(ctbList);

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
	 * @return contribution ���e���e��ێ������I�u�W�F�N�g
	 */
	private static Contribution readInput(Scanner sc, String userName) {
		// ���e���̓���
		System.out.println("���e����������ł��������B");
		System.out.print("���e���e > ");
		 String sentence = sc.nextLine();

		// ���e���C���X�^���X�̐���
		Contribution contribution = new Contribution(userName, sentence);

		return contribution;
	}

	/**
	 * �f���𐶐����A���e���ꂽ���e���f���ɕ\������
	 * 
	 * @param ctbList
	 *            ���e���I�u�W�F�N�g�̔z��
	 */
	private static void createBoard(Contribution[] ctbList) {
		// �^�C�g�������̕\��
		System.out.println();
		System.out.println("------------------------------");
		System.out.println();
		System.out.println("********************");
		System.out.println("����ۑ�" + Contribution.TITLE);
		System.out.println("********************");

		// ���e���e�����̕\��
		for (int i = 0; i < ctbList.length; i++) {
			System.out.println((i + 1) + ". " + ctbList[i].getUserName());
			System.out.println(ctbList[i].getSentence());
			System.out.println();
		}
	}
}
