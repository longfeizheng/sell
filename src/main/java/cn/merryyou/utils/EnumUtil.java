package cn.merryyou.utils;

import cn.merryyou.emum.CodeEnmu;

/**
 * Created on 2017/11/8 0008.
 *
 * @author zlf
 * @email i@merryyou.cn
 * @since 1.0
 */
public class EnumUtil {
    public static <T extends CodeEnmu> T getByCode(Integer code, Class<T> enumClass) {
        for (T each : enumClass.getEnumConstants()) {
            if (code.equals(each.getCode())) {
                return each;
            }
        }
        return null;
    }
}
