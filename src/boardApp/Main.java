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

		System.out.println("*** ����ۑ�f���ւ悤���� ***");

		// ���[�U�[���̓���
		System.out.println("���[�U�[������͂��Ă��������B");
		System.out.print("���[�U�[��:");
		String userName = scanner.nextLine();

		// ���e���I�u�W�F�N�g���i�[����z��
		// ���ۑ�ł�3���̂ݓ��e���󂯕t����̂ŁA�z��̒�����3�Ƃ���
		ContributionInfo[] ciList = new ContributionInfo[3];
		
		// ���e���̓���
		// ���e����(3��)
		// ���e�����擾���A���e���C���X�^���X���쐬����B
		// �쐬�����C���X�^���X�́A���e���z��ɕێ����Ă����B
		for (int i = 0; i < 3; i++) {
			System.out.println("���e����������ł��������B");
			System.out.print("���e���e > ");
			String sentence = scanner.nextLine();

			// ���e���C���X�^���X�̐���
			ContributionInfo contributionInfo = new ContributionInfo(userName, sentence);
			ciList[i] = contributionInfo;
		}

		///// �f���̕\�� /////
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

		scanner.close();
	}
}
