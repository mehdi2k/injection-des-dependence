package presentation;



import metier.IMetier;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class presSpringXML {
    public static void main(String[] args) {
    ApplicationContext context=new ClassPathXmlApplicationContext("applicationConext.xml");

    IMetier metier= (IMetier) context.getBean("metier");
    System.out.println(metier.calcul());

    }
}