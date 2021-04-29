package ucuncugunOdev1Polimorfizm;

public class FileLogger extends BaseLogger {
	public void log(String message) {
		System.out.println("Logged to file : "+message);
	}
}
