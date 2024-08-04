package day6;

public class Execution implements DatabaseConnection {

	@Override
	public void connect() {
		System.out.println("Connected");

	}

	@Override
	public void disconnect() {

		System.out.println("Disconnected");
	}

	@Override
	public void executeUpdate() {
		System.out.println("Executed and Updated");

	}

	public static void main(String[] args) {
		Execution e = new Execution();
		e.connect();
		e.disconnect();
		e.executeUpdate();

	}

}
