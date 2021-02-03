import com.kuang.pojo.User;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * 功能描述：
 *
 * @Author: ggssh
 * @Date: 2021/2/2 0002 15:23
 */
public class MyTest {
    public static void main(String[] args) {

    }
    @Test
    public void test(){
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        User user = context.getBean("user",User.class);
        System.out.println(user.name);
    }
}
