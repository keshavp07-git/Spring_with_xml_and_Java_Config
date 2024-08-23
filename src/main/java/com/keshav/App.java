package com.keshav;
import com.keshav.config.AppConfig;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App
{
    public static void main( String[] args )
    {
        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
//        Desktop dt = context.getBean(Desktop.class);
//        dt.compile();

        Alien obj1 =context.getBean(Alien.class);
        System.out.println(obj1.getAge());
        obj1.code();
//
//        Desktop dt = context.getBean(Desktop.class);
//        dt.compile();


//        ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
//        Alien obj1 =context.getBean("alien1", Alien.class);
//        System.out.println(obj1.getAge());
//        obj1.code();
    }
}
