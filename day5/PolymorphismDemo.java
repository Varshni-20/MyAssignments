package day5;

public class PolymorphismDemo {
	public void reportStep(String msg, String status) {
		System.out.println("Message is : " + msg);
		System.out.println("Status is :" + status);

	}

	public void reportStep(String msg, String status, Boolean snap) {
		System.out.println("Message is : " + msg);
		System.out.println("Status is :" + status);
		System.out.println("Is Snap taken :" + snap);

	}

	public static void main(String[] args) {
		PolymorphismDemo p = new PolymorphismDemo();
		p.reportStep("Gayathri ", "online");
		p.reportStep("Pooja  ", "offline", true);

	}

}
