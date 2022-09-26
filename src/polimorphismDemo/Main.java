package polimorphismDemo;

public class Main {

	public static void main(String[] args) {
		// TODO Polimorphism

		// EmailLogger emailLogger = new EmailLogger();
		// emailLogger.Log(", main üzerinden loglandı");
		
//		BaseLogger[] loggers = new BaseLogger[] { new EmailLogger(), new DatabaseLogger(), new FileLogger(), new ConsoleLogger() };
//
//		for (BaseLogger logger : loggers) {
//			logger.Log("Loglama İşlemi Yapıldı");
//		}
		
		CustomerManager customerManager = new CustomerManager(new EmailLogger());
		customerManager.add();
	}
}
