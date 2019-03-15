import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanScopeDemoApp {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("beanScopeApplicationContext.xml");
        Animal pet = context.getBean("myPet", Animal.class);
        Animal anotherPet = context.getBean("myPet", Animal.class);
        System.out.println(pet == anotherPet);
    }
}

