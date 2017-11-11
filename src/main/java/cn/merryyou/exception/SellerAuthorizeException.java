package cn.merryyou.exception;

import cn.merryyou.emum.ResultEnum;
import lombok.Data;

/**
 * Created on 2017/11/11 0011.
 *授权异常类
 * @author zlf
 * @email i@merryyou.cn
 * @since 1.0
 */
@Data
public class SellerAuthorizeException extends RuntimeException{
    private Integer code;

    public SellerAuthorizeException(ResultEnum resultEnum) {
        super(resultEnum.getMessage());
        this.code = resultEnum.getCode();
    }

    public SellerAuthorizeException(Integer code,String message){
        super(message);
        this.code = code;
    }
}
