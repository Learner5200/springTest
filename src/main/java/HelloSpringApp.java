import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HelloSpringApp {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        Animal pet = context.getBean("myPet", Animal.class);
        System.out.println(pet.getNoise());
        System.out.println(pet.getDailyFortune());
        context.close();
    }
}
