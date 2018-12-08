package cn.colg.example._02;

import java.util.ArrayList;
import java.util.List;

import cn.hutool.core.util.RandomUtil;

/**
 * 单例 - 负载均衡服务器
 * 
 * <pre>
 * 单例类，真实环境下该类将非常复杂，包括大量初始化的工作和业务方法，考虑到代码的可读性和易理解性，只列出部分与模式相关的核心代码
 * </pre>
 *
 * @author colg
 */
public class LoadBalancer {

    /** 私有静态成员变量，存储唯一实例 */
    private static LoadBalancer instance = null;

    /** 服务器集合 */
    private List<String> serverList = new ArrayList<>();

    /** 私有构造函数 */
    private LoadBalancer() {}

    /**
     * 共有静态成员方法，返回唯一实例
     *
     * @return
     * @author colg
     */
    public static LoadBalancer getLoadBalancer() {
        if (instance == null) {
            instance = new LoadBalancer();
        }
        return instance;
    }

    /**
     * 添加服务器
     *
     * @param server
     * @author colg
     */
    public LoadBalancer addServer(String server) {
        serverList.add(server);
        return instance;
    }

    /**
     * 删除服务器
     *
     * @param server
     * @author colg
     */
    public LoadBalancer removeServer(String server) {
        serverList.remove(server);
        return instance;
    }

    /**
     * 随机获取服务器
     *
     * @return
     * @author colg
     */
    public String getRandomServer() {
        int randomInt = RandomUtil.randomInt(serverList.size());
        return serverList.get(randomInt);
    }

    /** 当前请求下标；设置初始请求下标为0 */
    private int index = 0;

    /**
     * 轮询获取服务器
     *
     * @return
     * @author colg
     */
    public String getSortServer() {
        String server = serverList.get(index);
        index++;
        if (index == serverList.size()) {
            index = 0;
        }
        return server;
    }
}
