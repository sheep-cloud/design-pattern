/**
 * 外观模式（三）
 * 
 * <pre>
 * 某软件公司欲开发一个可应用于多个软件的文件加密模块，该模块可以对文件中的数据进行加密并将加密之后的数据存储在一个新文件中，
 * 具体的流程包括三个部分，分别是读取源文件、加密、保存加密之后的文件，
 * 其中，读取文件和保存文件使用流来实现，加密操作通过求模运算实现。
 * 这三个操作相对独立，为了实现代码的独立重用，让设计更符合单一职责原则，这三个操作的业务代码封装在三个不同的类中。
 * 
 * 现使用外观模式设计该文件加密模块。
 * 
 * 引入抽象外观类之后，客户端可以针对抽象外观类进行编程，对于新的业务需求，不需要修改原有外观类，
 * 而对应增加一个新的具体外观类，由新的具体外观类来关联新的子系统对象，同时通过修改配置文件来达到不修改任何源代码并更换外观类的目的。
 * </pre>
 *
 * @author colg
 */
package cn.colg.example._03;