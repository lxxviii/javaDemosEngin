package polimorphismDemo;

public class EmailLogger extends BaseLogger {
	public void log(String message) {
		System.out.println("Email üzerine Loglama :" + message);
	}

}
