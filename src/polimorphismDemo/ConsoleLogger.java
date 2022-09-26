package polimorphismDemo;

public class ConsoleLogger extends BaseLogger {
	public void log(String message) {
		System.out.println("Console üzerine Loglama :" + message);
	}
}
