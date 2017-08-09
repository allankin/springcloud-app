package study.springcloud;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import study.springcloud.listener.ServiceListener;

import javax.annotation.Resource;


@RestController
public class UserController {
  @Resource
  private ServiceListener serviceListener;
  @RequestMapping("/")
  public String home() {
    return "Hello World";
  }

  @RequestMapping("/users")
  public String listUser() {
    return "[{\"id\":1,\"userName\":\"kim\"},{\"id\":2,\"userName\":\"tom\"}]";
  }

  @RequestMapping("/user/{id}")
  public String getUserById(@PathVariable(value = "id") Long id){
    return "{\"id\":1,\"userName\":\"kim\",\"port\":"+serviceListener.getPort()+"}";
  }

}