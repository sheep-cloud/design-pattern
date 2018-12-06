package cn.colg.learn._02;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import cn.hutool.json.JSONObject;
import cn.hutool.json.JSONUtil;

/**
 * 具体装饰类 - JSONLogger
 * 
 * <pre>
 * 将msg转换为JSON格式
 * </pre>
 *
 * @author colg
 */
public class JSONLogger extends AbstractLoggerDecorator {

    public JSONLogger(Logger logger) {
        super(logger);
    }

    @Override
    public void debug(String msg) {
        super.debug(this.toJsonStr(msg));
    }

    private String toJsonStr(String msg) {
        JSONObject jsonObject = new JSONObject();
        jsonObject.put("msg", msg);
        return JSONUtil.toJsonStr(jsonObject);
    }

    /**
     * 内部工厂类
     *
     * @author colg
     */
    public static class JSONLoggerFactory {

        /**
         * 返回JSONLogger对象
         *
         * @param clazz
         * @return
         * @author colg
         */
        public static JSONLogger getLogger(Class<?> clazz) {
            return new JSONLogger(LoggerFactory.getLogger(clazz));
        }
    }

}
