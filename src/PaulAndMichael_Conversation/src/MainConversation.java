
public class MainConversation {

	public void paulsPart() {
		System.out.println("Hello michael!");
	}

	public void MichaelsResponce() {
		System.out.println("get lost, your just a scrub");
	}

	public void TomPart() {
		System.out.println("Yay for scrubs!");
		System.out.println("They are cool");
	}

	public static void main(String[] args) {
		MainConversation convo = new MainConversation();
		convo.paulsPart();
		convo.MichaelsResponce();
		convo.TomPart();
	}

}
