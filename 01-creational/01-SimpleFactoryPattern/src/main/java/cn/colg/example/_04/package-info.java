/**
 * 简单工厂模式（四）
 * 
 * <pre>
 * 方案的改进
 *  
 *  在创建具体Chart对象时，每更换一个Chart对象都需要修改客户端代码中静态工厂方法的参数，客户端代码将要重新编译，这对于客户端而言，违反了“开闭原则”。
 *  
 *  将静态工厂方法的参数存储在XML或properties格式的配置文件中，如下config.properties所示：chartType=histogram
 *  
 * </pre>
 *
 * @author colg
 */
package cn.colg.example._04;