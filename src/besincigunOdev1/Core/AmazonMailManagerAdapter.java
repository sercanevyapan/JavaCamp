package besincigunOdev1.Core;

import besincigunOdev1.amazonEmail.AmazonMailManager;

public class AmazonMailManagerAdapter implements EmailServices {

	@Override
	public void send(String email, String message) {
		AmazonMailManager amazonMailManager = new AmazonMailManager();
		amazonMailManager.send(message, message);
		
	}

}
