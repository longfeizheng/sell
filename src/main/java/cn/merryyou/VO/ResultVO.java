package cn.merryyou.VO;

import lombok.Data;

/**
 * Created on 2017/11/5 0005.
 * HTTP请求返回的最外层对象
 *
 * @author zlf
 * @email i@merryyou.cn
 * @since 1.0
 */
@Data
public class ResultVO<T> {
    /**
     * 错误码
     */
    private Integer code;

    /**
     * 提示信息
     */
    private String msg;

    /**
     * 具体内容
     */
    private T data;
}
