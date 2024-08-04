package day6;

public abstract class MySqlConnection implements DatabaseConnection {
	public void executeQuery() {
		System.out.println("Query is executed");
	}

}
