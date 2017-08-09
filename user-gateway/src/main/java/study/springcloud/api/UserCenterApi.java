package study.springcloud.api;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import study.springcloud.invoker.UserServiceInvoker;

import javax.annotation.Resource;

/**
 * Created by kim on 2017/8/9.
 */
@RestController
public class UserCenterApi {
    @Resource
    private UserServiceInvoker userServiceInvoker;

    @RequestMapping("/userCenter/user/{id}")
    public String getUserById(@PathVariable("id") Long id){
        return userServiceInvoker.getUserById(id);
    }
}
