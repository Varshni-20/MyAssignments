package day6;

public class JavaConnection extends MySqlConnection {

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
		JavaConnection jc = new JavaConnection();
		jc.connect();
		jc.disconnect();
		jc.executeQuery();
		jc.executeUpdate();

	}

}
