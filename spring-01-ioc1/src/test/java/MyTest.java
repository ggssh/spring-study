import com.ggssh.dao.UserDaoImpl;
import com.ggssh.dao.UserDaoMysqlImpl;
import com.ggssh.service.UserService;
import com.ggssh.service.UserServiceImpl;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * 功能描述：
 *
 * @Author: ggssh
 * @Date: 2021/1/30 0030 22:43
 */
public class MyTest {
    public static void main(String[] args) {
        //获取ApplicationContext 拿到spring的容器
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        UserServiceImpl userServiceImpl = (UserServiceImpl) context.getBean("UserServiceImpl");
        userServiceImpl.getUser();
    }
}
