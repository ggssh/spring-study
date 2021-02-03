import com.ggssh.pojo.Hello;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * 功能描述：
 *
 * @Author: ggssh
 * @Date: 2021/1/31 0031 11:06
 */
public class MyTest {
    public static void main(String[] args) {
        //获取spring的上下文对象
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        //我们的对象现在都在spring中管理的，我们要使用直接取
        Hello hello = (Hello) context.getBean("hello");
        System.out.println(hello.toString());
    }
}
