package cn.merryyou.config;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import java.util.Map;

/**
 * Created on 2017/11/15 0015.
 *
 * @author zlf
 * @email i@merryyou.cn
 * @since 1.0
 */
@Data
@Component
@ConfigurationProperties(prefix = "wechat")
public class WechatAccountConfig {

    /**
     * 公众平台Id
     */
    private String mpAppId;

    /**
     * 公众平台密匙
     */
    private String mpAppScret;

    /**
     * 开放平台ID
     */
    private String openAppId;

    /**
     * 开放平台密匙
     */
    private String openAppScret;


    /**
     * 商户号
     */
    private String mchId;

    /**
     * 商户密钥
     */
    private String mchKey;

    /**
     * 商户证书路径
     */
    private String keyPath;

    /**
     * 微信支付异步通知地址
     */
    private String notifyUrl;

    /**
     * 微信模板ID
     */
    private Map<String ,String > templateId;


}
