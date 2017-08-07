package study.springcloud;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class UserController {
  @RequestMapping("/")
  public String home() {
    return "Hello World";
  }

  @RequestMapping("/users")
  public String listUser() {
    return "[{\"id\":1,\"userName\":\"kim\"},{\"id\":2,\"userName\":\"tom\"}]";
  }

}