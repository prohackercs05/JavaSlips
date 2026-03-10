import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class S9_2 {
    public static void main(String[] args) {
        
        ApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");

        
        MessageBean obj = (MessageBean) context.getBean("helloBean");

        
        obj.displayMessage();

        
        ((ClassPathXmlApplicationContext) context).close();
    }
}


