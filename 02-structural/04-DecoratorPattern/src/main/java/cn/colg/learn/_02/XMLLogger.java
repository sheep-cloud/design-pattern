package cn.colg.learn._02;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import cn.hutool.json.JSONObject;
import cn.hutool.json.JSONUtil;

/**
 * 具体装饰类 - XMLLogger
 *
 * @author colg
 */
public class XMLLogger extends AbstractLoggerDecorator {

    public XMLLogger(Logger logger) {
        super(logger);
    }

    @Override
    public void debug(String msg) {
        super.debug(this.toXmlStr(msg));
    }

    private String toXmlStr(String msg) {
        JSONObject jsonObject = new JSONObject();
        jsonObject.put("msg", msg);
        return JSONUtil.toXmlStr(jsonObject);
    }

    /**
     * 内部工厂类
     *
     * @author colg
     */
    public static class XMLLoggerFactory {

        /**
         * 返回JSONLogger对象
         *
         * @param clazz
         * @return
         * @author colg
         */
        public static XMLLogger getLogger(Class<?> clazz) {
            return new XMLLogger(LoggerFactory.getLogger(clazz));
        }
    }
}
