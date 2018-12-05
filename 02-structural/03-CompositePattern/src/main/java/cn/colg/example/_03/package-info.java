/**
 * 组合模式（三）
 * 
 * <pre>
 * 由于在本实例中使用了组合模式，在抽象构件类中声明了所有方法，包括用于管理和访问子构件的方法，如add()方法和remove()方法等，因此在ImageFile等叶子构件类中实现这些方法时必须进行相应的异常处理或错误提示。
 * 在容器构件类Folder的killVirus()方法中将递归调用其成员对象的killVirus()方法，从而实现对整个树形结构的遍历。
 * </pre>
 *
 * @author colg
 */
package cn.colg.example._03;