package boardApp;

public class Contribution {
	/**
	 * �f���̊e�@�\�����������N���X
	 * 
	 * @author guest
	 */
	public static String TITLE = "�f����";
	private final String userName; // ���e��
	private String sentence; // ���e��

	/**
	 * �f���ł̑�����ݒ肷��R���X�g���N�^
	 * 
	 * @param userName ���e��
	 * @param sentence ���e��
	 */
	public Contribution(String userName, String sentence) {
		super();
		this.userName = userName;
		this.sentence = sentence;
	}

	public String getUserName() {
		return userName;
	}
	
	public String getSentence() {
		return sentence;
	}
}
