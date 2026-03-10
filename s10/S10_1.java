import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class S10_1 {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("DateBeans.xml");
        DateBean db = (DateBean) context.getBean("dateBean");
        db.displayDate();

        
        ((ClassPathXmlApplicationContext) context).close();
    }
}


