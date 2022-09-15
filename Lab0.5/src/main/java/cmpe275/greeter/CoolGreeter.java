package cmpe275.greeter;

import com.google.inject.Inject;
import com.google.inject.name.Named;
public class CoolGreeter implements Greeter {

	private final String name;

	@Inject
	public CoolGreeter(@Named("GREETER_NAME") String name) {
		this.name = name;

	}

	public void greet() {
		System.out.println("Hey World. Me " + name);
	}
}
