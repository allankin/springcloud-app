package study.springcloud.invoker;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by kim on 2017/8/9.
 */
@FeignClient(name= "user-service")
public interface UserServiceInvoker {
    @RequestMapping("/user/{id}")
    String getUserById(@PathVariable(value = "id") Long id);
}
