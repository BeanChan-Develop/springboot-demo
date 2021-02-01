package beanchan.cn.springbootdemo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Classname HelloController
 * @Author ChenBin
 * @Description
 * @CreateDate 2021/1/29 1:39 PM
 */
@RestController
public class HelloController {
    @GetMapping("/hello")
    public String hello(){
        return "打工都是人上人";
    }
}
