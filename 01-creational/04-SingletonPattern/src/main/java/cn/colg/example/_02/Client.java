package cn.colg.example._02;

import lombok.extern.slf4j.Slf4j;

/**
 * 客户端
 *
 * @author colg
 */
@Slf4j
public class Client {
    public static void main(String[] args) {
        // 创建4个LoadBalancer对象
        LoadBalancer balancer1, balancer2, balancer3, balancer4;
        balancer1 = LoadBalancer.getLoadBalancer();
        balancer2 = LoadBalancer.getLoadBalancer();
        balancer3 = LoadBalancer.getLoadBalancer();
        balancer4 = LoadBalancer.getLoadBalancer();

        // 判断服务器负载均衡器是否相同
        if (balancer1 == balancer2 && balancer2 == balancer3 && balancer3 == balancer4) {
            log.info("服务器负载均衡器具有唯一性！");
        }

        // 增加服务器
        balancer1.addServer("Server 1")
                 .addServer("Server 2")
                 .addServer("Server 3")
                 .addServer("Server 4");
        
        // 模拟客户端请求的分发
        int reqCount = 10;
        for (int i = 0; i < reqCount; i++) {
            // 随机获取服务器
            String server = balancer1.getRandomServer();
            log.info("分发请求至服务器: {}", server);
        }
        
        log.info("----------------------------------------------------------------------------------------------------");
        for (int i = 0; i < reqCount; i++) {
            // 轮询获取服务器
            String server = balancer1.getSortServer();
            log.info("分发请求至服务器: {}", server);
        }
    }
}
