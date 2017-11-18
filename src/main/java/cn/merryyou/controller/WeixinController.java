package cn.merryyou.controller;

import cn.merryyou.config.WechatAccountConfig;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * Created on 2017/11/15 0015.
 *
 * @author zlf
 * @email i@merryyou.cn
 * @since 1.0
 */
@RestController
@RequestMapping("/weixin")
@Slf4j
public class WeixinController {

    @Autowired
    private WechatAccountConfig accountConfig;

    /** 不使用SDK获得微信openid(请使用urlEncode对链接进行处理)
     *
     * https://open.weixin.qq.com/connect/oauth2/authorize?appid=wxb962cbf908779e5e&redirect_uri=http%3A%2F%2Fmerryyou.mynatapp.cc%2Fsell%2Fweixin%2Fauth&response_type=code&scope=snsapi_userinfo&state=http%3A%2F%2Fimmoc.com&connect_redirect=1#wechat_redirect
     *
     * @param code
     */
    @GetMapping("/auth")
    public void auth(@RequestParam("code") String code) {
        log.info("进入auth方法");
        log.info("code={}", code);

        String url = "https://api.weixin.qq.com/sns/oauth2/access_token?appid=wxb962cbf908779e5e&secret=01d65e5f44d6e2d777996dc60e94ea58&code=" + code + "&grant_type=authorization_code";

        RestTemplate restTemplate = new RestTemplate();
        String response = restTemplate.getForObject(url, String.class);
        log.info("response={}", response);
    }
}
