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
		scanner = new Scanner(System.in);

		// ���[�U�[�����擾����
		String userName = requestUserInfo();

		// ���e�����i�[����z��
		// ���ۑ�ł�3���̂ݓ��e���󂯕t����̂ŁA�z��̒�����3�Ƃ���
		String[] sentenceList = new String[3];

		// ���e���I�u�W�F�N�g���i�[����z��
		// ���ۑ�ł�3���̂ݓ��e���󂯕t����̂ŁA�z��̒�����3�Ƃ���
		ContributionInfo[] ciList = new ContributionInfo[3];

		// ���e����(3��)
		// ���e�����擾���A���e���C���X�^���X���쐬����B
		// �쐬�����C���X�^���X�́A���e���z��ɕێ����Ă����B
		for (int i = 0; i < 3; i++) {
			sentenceList[i] = requestContribution();
			// ���e���C���X�^���X�̐���
			ContributionInfo contributionInfo = new ContributionInfo(userName, sentenceList[i]);
			ciList[i] = contributionInfo;
		}
		

		// �f����������
		showBoard(ciList);

		scanner.close();
	}

	/**
	 * �f���A�v���̏��������Ƃ��āA���[�U�[�̖��O���R���\�[������擾����
	 * 
	 * @param sc
	 *            �X�L���i�[�I�u�W�F�N�g
	 * @return userName ���[�U�[��
	 */
	private static String requestUserInfo() {
		System.out.println("*** ����ۑ�f���ւ悤���� ***");

		// ���[�U�[���̓���
		System.out.println("���[�U�[������͂��Ă��������B");
		System.out.print("���[�U�[��:");
		String userName = scanner.nextLine();

		return userName;
	}

	/**
	 * �f���ւ̓��e���R���\�[��������͂�����
	 * 
	 * @return sentence ���e��
	 */
	private static String requestContribution() {
		// ���e���̓���
		System.out.println("���e����������ł��������B");
		System.out.print("���e���e > ");
		String sentence = scanner.nextLine();

		return sentence;
	}

	/**
	 * �f���𐶐����A���e���ꂽ���e���f���ɕ\������
	 * 
	 * @param ciList
	 *            ���e���I�u�W�F�N�g�̔z��
	 */
	private static void showBoard(ContributionInfo[] ciList) {
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
