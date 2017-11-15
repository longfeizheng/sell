package cn.merryyou.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created on 2017/11/15 0015.
 *
 * @author zlf
 * @email i@merryyou.cn
 * @since 1.0
 */
@RestController
@RequestMapping
public class IndexController {

    @GetMapping(value = {"/", "index"})
    public String index() {
        return "hello world!";
    }
}
