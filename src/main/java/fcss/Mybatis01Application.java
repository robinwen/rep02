package fcss;

import java.util.Map;
import java.util.TimeZone;
import javax.annotation.PostConstruct;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.aop.framework.AopProxyUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan(basePackages = {"fcss"})
@SpringBootApplication
public class Mybatis01Application implements CommandLineRunner {

    public static void main(String[] args) {
        System.setProperty("db2.jcc.charsetDecoderEncoder", "3");
        SpringApplication.run(Mybatis01Application.class, args);
    }

    @PostConstruct
    public void init() {
        // 設定全域時區
        // TimeZone.setDefault(TimeZone.getTimeZone("UTC"));
        TimeZone.setDefault(TimeZone.getTimeZone("Asia/Taipei"));
    }

    @Autowired
    private ApplicationContext appContext;

    @Override
    public void run(String... strings) {
        Map<String, Object> beans = appContext.getBeansWithAnnotation(Mapper.class);
        beans.forEach((k, v) -> {
            var x = appContext.getBean(k);

            System.out.println(k + " - " + v + " - " + x + " : " + AopProxyUtils.ultimateTargetClass(x));
        });
    }
}
