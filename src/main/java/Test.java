import model.User;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import service.UserService;

public class Test {
    public static void main(String[] args) throws Exception {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
        UserService userService = context.getBean(UserService.class);
//        User user = userService.selectUser(1);
//        System.out.println(user);
        userService.updateUser("1111",1);
    }
}
