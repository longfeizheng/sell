package cn.merryyou.controller;

import cn.merryyou.service.WebSocket;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 * Created on 2017/11/18 0018.
 *
 * @author zlf
 * @email i@merryyou.cn
 * @since 1.0
 */
@Controller
@RequestMapping("/webSocket")
public class WebSocketController {

    @Autowired
    public WebSocket webSocket;

    @GetMapping("/test")
    public ModelAndView testSocket() {
        return new ModelAndView("/socket/test");
    }

    @GetMapping("/order")
    public void order() {
        webSocket.sendMessage("有新订单");
    }

}
