package grid.pointer;

import org.eclipse.jetty.server.Server;
import org.eclipse.jetty.servlet.ServletContextHandler;
import org.eclipse.jetty.servlet.ServletHolder;
import org.glassfish.jersey.server.ResourceConfig;
import org.glassfish.jersey.servlet.ServletContainer;

import grid.pointer.up.Rest;

public class App {

	public static void main(String[] args) throws Exception {

		ResourceConfig config = new ResourceConfig(Rest.class);
		config.packages("jettyjerseytutorial");
		ServletHolder servlet = new ServletHolder(new ServletContainer(config));
		Integer port = Integer.valueOf(System.getenv("PORT"));
		Server server = new Server(port);
		ServletContextHandler context = new ServletContextHandler(server, "/*");
		context.addServlet(servlet, "/*");

		try {
			server.start();
			server.join();
		} finally {
			server.destroy();
		}

	}
}
