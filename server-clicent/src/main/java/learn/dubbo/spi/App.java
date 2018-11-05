package learn.dubbo.spi;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by JAVA on 2018/8/12.
 */
public class App {

    public static void main(String[] args) {




        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext
                (new String[] {"dubbo-client.xml"});
    }


}
