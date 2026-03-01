import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Slip9_2 {
    public static void main(String[] args) {
        // Load the Spring XML configuration
        ApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");

        // Retrieve the bean from the context
        MessageBean obj = (MessageBean) context.getBean("helloBean");

        // Display the message
        obj.displayMessage();

        // Close the context to prevent resource leaks
        ((ClassPathXmlApplicationContext) context).close();
    }
}

/*
 * Explanation:
 * This program demonstrates a basic Spring Core (Inversion of Control)
 * implementation.
 * 1. MessageBean.java: A simple POJO with a 'message' property and a display
 * method.
 * 2. Beans.xml: A configuration file where we define the bean and inject the
 * value
 * "If you can't explain it simply..." into the 'message' property.
 * 3. Slip9_2.java: The main class that uses ApplicationContext to load the
 * configuration and manage the bean's lifecycle.
 * By using Spring, we move the configuration details (like the actual message)
 * out of the Java code and into an external XML file.
 */
