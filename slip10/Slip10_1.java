import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Slip10_1 {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("DateBeans.xml");
        DateBean db = (DateBean) context.getBean("dateBean");
        db.displayDate();

        // Close the context to prevent resource leaks
        ((ClassPathXmlApplicationContext) context).close();
    }
}

/*
 * Explanation:
 * This program displays the current date using the Spring Framework.
 * 1. DateBean.java: A class with a displayDate() method that prints the current
 * system date.
 * 2. DateBeans.xml: The Spring configuration file that defines a bean for the
 * DateBean class.
 * 3. Slip10_1.java: The main class that initializes the Spring IoC container
 * (ApplicationContext),
 * retrieves the DateBean instance, and invokes its method.
 * Note: Like Slip 9, this require Spring context and core JARs to be compiled
 * and run.
 */
