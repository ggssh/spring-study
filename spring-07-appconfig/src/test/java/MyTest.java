import com.ggssh.config.TestConfig;
import com.ggssh.pojo.User;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * 功能描述：
 *
 * @Author: ggssh
 * @Date: 2021/2/3 0003 11:27
 */
public class MyTest {
    public static void main(String[] args) {

    }

    @Test
    public void test(){
        //如果完全使用了配置类方式去做，我们就只能通过AnnotationConfig上下文来获取容器，通过配置类的class对象加载
        ApplicationContext context = new AnnotationConfigApplicationContext(TestConfig.class);
        User user = (User) context.getBean("getUser");
        System.out.println(user.getName());
    }
}
