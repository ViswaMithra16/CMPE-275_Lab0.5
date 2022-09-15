package cmpe275.greeter;

import com.google.inject.AbstractModule;
import com.google.inject.name.Names;

public class GreeterModule extends AbstractModule {

	@Override
	protected void configure() {
		bind(Greeter.class)
		.annotatedWith(Names.named("CoolGreeter"))
		.to(CoolGreeter.class);
		bind(Greeter.class)
		.annotatedWith(Names.named("WarmGreeter"))
		.to(WarmGreeter.class);
		bind(String.class)
		.annotatedWith(Names.named("GREETER_NAME"))
		.toInstance("MITHRA");
	}

}
