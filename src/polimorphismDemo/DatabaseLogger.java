package polimorphismDemo;

public class DatabaseLogger extends BaseLogger {
	public void log(String message) {
		System.out.println("Database üzerine Loglama :" + message);
	}
}
