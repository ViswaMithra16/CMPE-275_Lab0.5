package cmpe275.greeter;

import com.google.inject.Inject;
import com.google.inject.name.Named;

public class WarmGreeter implements Greeter {
	
	private final String name;
	
	@Inject
	public WarmGreeter(@Named("GREETER_NAME")String name) {
		this.name=name;
		
	}


	public void greet() {
		System.out.println("Hello, my dear World. I am "+name+". Nice to see you!");
		
	}
	

}
