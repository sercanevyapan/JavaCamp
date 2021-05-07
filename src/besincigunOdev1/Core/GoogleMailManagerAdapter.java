package besincigunOdev1.Core;


import besincigunOdev1.googleMail.GoogleMailManager;

public class GoogleMailManagerAdapter implements EmailServices {

	@Override
	public void send(String email, String message) {
		GoogleMailManager amazonMailManager = new GoogleMailManager();
		amazonMailManager.send(message, message);
		
	}

	

}
