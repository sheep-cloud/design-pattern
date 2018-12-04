/**
 * 简单工厂模式（三）
 * 
 * <pre>
 * 完整解决方案
 * 
 *  为了将Chart类的职责分离，同时将Chart对象的创建和使用分离，使用简单工厂模式对图表库进行重构
 * 
 *  Chart接口充当抽象产品类，其子类HistogramChart、PieChart和LineChart充当具体产品类，ChartFactory充当工厂类
 * </pre>
 *
 * @author colg
 */
package cn.colg.example._03;