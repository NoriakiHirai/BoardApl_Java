package boardApp;

public class Contribution {
	/**
	 * Œf¦”Â‚ÌŠe‹@”\‚ğÀ‘•‚µ‚½ƒNƒ‰ƒX
	 * 
	 * @author guest
	 */
	public static String TITLE = "Œf¦”Â";
	private final String userName; // “ŠeÒ
	private String sentence; // “Še•¶

	/**
	 * Œf¦”Å‚Ì‘®«‚ğİ’è‚·‚éƒRƒ“ƒXƒgƒ‰ƒNƒ^
	 * 
	 * @param userName “ŠeÒ
	 * @param sentence “Še•¶
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
