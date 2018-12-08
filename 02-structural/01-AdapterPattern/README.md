# 适配器模式 - Adapter Pattern

## 1. 概述

与电源适配器相似，在适配器模式中引入了一个被称为适配器(Adapter)的包装类，而它所包装的对象称为适配者(Adaptee)，即被适配的类。适配器的实现就是把客户类的请求转化为对适配者的相应接口的调用。也就是说：当客户类调用适配器的方法时，在适配器类的内部将调用适配者类的方法，而这个过程对客户类是透明的，客户类并不直接访问适配者类。因此，适配器让那些由于接口不兼容而不能交互的类可以一起工作。

适配器模式可以将一个类的接口和另一个类的接口匹配起来，而无须修改原来的适配者接口和抽象目标类接口。

- 适配器模式定义如下：
  - 将一个接口转换成客户希望的另一个接口，使接口不兼容的那些类可以一起工作，其别名为包装器(Wrapper)。适配器模式既可以作为类结构型模式，也可以作为对象结构型模式。
- 注：在适配器模式定义中所提及的接口是指广义的接口，它可以表示一个方法或者方法的集合。
- 适配器模式可分为对象适配器和类适配器两种
  - 在对象适配器模式中，适配器与适配者之间是关联关系；
  - 在类适配器模式中，适配器与适配者之间是继承（或实现）关系。
- 缺省适配器模式的定义如下：
  - 当不需要实现一个接口所提供的所有方法时，可先设计一个抽象类实现该接口，并为接口中每个方法提供一个默认实现（空方法），那么该抽象类的子类可以选择性地覆盖父类的某些方法来实现需求，它适用于不想使用一个接口中的所有方法的情况，又称为单接口适配器模式。

## 2. 结构图

**在对象适配器模式结构图中包含如下几个角色：**

- **Target（目标抽象类）**
  - **目标抽象类定义客户所需接口，可以是一个抽象类或接口，也可以是具体类。**
- **Adapter（适配器类）**
  - **适配器可以调用另一个接口，作为一个转换器，对Adaptee和Target进行适配，适配器类是适配器模式的核心，在对象适配器中，它通过继承Target并关联一个Adaptee对象使二者产生联系。**
- **Adaptee（适配者类）**
  - **适配者即被适配的角色，它定义了一个已经存在的接口，这个接口需要适配，适配者类一般是一个具体类，包含了客户希望使用的业务方法，在某些情况下可能没有适配者类的源代码。**

**在缺省适配器模式中，包含如下三个角色：**

- **ServiceInterface（适配者接口）**
  - **它是一个接口，通常在该接口中声明了大量的方法。**
- **AbstractServiceClass（缺省适配器类）**
  - **它是缺省适配器模式的核心类，使用空方法的形式实现了在ServiceInterface接口中声明的方法。**
  - **通常将它定义为抽象类，因为对它进行实例化没有任何意义。**
- **ConcreteServiceClass（具体业务类）**
  - **它是缺省适配器类的子类，在没有引入适配器之前，它需要实现适配者接口，因此需要实现在适配者接口中定义的所有方法，而对于一些无须使用的方法也不得不提供空实现。**
  - **在有了缺省适配器之后，可以直接继承该适配器类，根据需要有选择性地覆盖在适配器类中定义的方法。**

## 3. 简化

## 4. 总结

适配器模式将现有接口转化为客户类所期望的接口，实现了对现有类的复用，它是一种使用频率非常高的设计模式，在软件开发中得以广泛应用，在Spring等开源框架、驱动程序设计（如JDBC中的数据库驱动程序）中也使用了适配器模式。

### 4.1. 优点

- 将目标类和适配者类解耦，通过引入一个适配器类来重用现有的适配者类，无须修改原有结构。
- 增加了类的透明性和复用性，将具体的业务实现过程封装在适配者类中，对于客户端类而言是透明的，而且提高了适配者的复用性，同一个适配者类可以在多个不同的系统中复用。
- 灵活性和扩展性都非常好，通过使用配置文件，可以很方便地更换适配器，也可以在不修改原有代码的基础上增加新的适配器类，完全符合“开闭原则”。

### 4.2. 缺点

- 对于Java、C#等不支持多重类继承的语言，一次最多只能适配一个适配者类，不能同时适配多个适配者；
- 适配者类不能为最终类，如在Java中不能为final类，C#中不能为sealed类；
- 在Java、C#等语言中，类适配器模式中的目标抽象类只能为接口，不能为类，其使用有一定的局限性。

### 4.3. 适用场景

- 系统需要使用一些现有的类，而这些类的接口（如方法名）不符合系统的需要，甚至没有这些类的源代码。
- 想创建一个可以重复使用的类，用于与一些彼此之间没有太大关联的一些类，包括一些可能在将来引进的类一起工作。

## 5. 示例

- 目标抽象/接口/类

  ```java
  package cn.colg.learn._01;
  
  /**
   * 目标接口 - 数据库操作
   *
   * @author colg
   */
  public interface DbOperation {
  
      /**
       * 添加数据
       *
       * @param data
       * @author colg
       */
      void add(String data);
  }
  ```

- 适配者类

  ```java
  package cn.colg.learn._01;
  
  import cn.hutool.crypto.SecureUtil;
  
  /**
   * 适配者类 - 加密（第三方系统）
   *
   * @author colg
   */
  public class Crypoto {
  
      /**
       * MD5加密，生成16进制MD5字符串
       *
       * @param data 数据
       * @return MD5字符串
       * @author colg
       */
      public String md5(String data) {
          return SecureUtil.md5(data);
      }
  
      /**
       * SHA1加密，生成16进制SHA1字符串
       *
       * @param data 数据
       * @return SHA1字符串
       * @author colg
       */
      public String sha1(String data) {
          return SecureUtil.sha1(data);
      }
  }
  ```

- 适配器类

  ```java
  package cn.colg.learn._01;
  
  import lombok.extern.slf4j.Slf4j;
  
  /**
   * 适配器类 - 数据库操作1
   *
   * @author colg
   */
  @Slf4j
  public class DbOperation01Adapter implements DbOperation {
      
      /** 定义适配者类对象 */
      private Crypoto crypoto = new Crypoto();
  
      @Override
      public void add(String data) {
          log.info("添加的数据 : {}", data);
          data = crypoto.md5(data);
          log.info("加密后的数据 ： {}", data);
      }
  }
  ```

  ```java
  package cn.colg.learn._01;
  
  import lombok.extern.slf4j.Slf4j;
  
  /**
   * 适配器类 - 数据库操作2
   *
   * @author colg
   */
  @Slf4j
  public class DbOperation02Adapter implements DbOperation {
  
      /** 定义适配者类对象 */
      private Crypoto crypoto = new Crypoto();
  
      @Override
      public void add(String data) {
          log.info("添加的数据 : {}", data);
          data = crypoto.sha1(data);
          log.info("加密后的数据 ： {}", data);
      }
  }
  ```

- 配置文件`config.ini`

  ```ini
  # 全类名
  learn._01=cn.colg.learn._01.DbOperation01Adapter
  ```

- 客户端

  ```java
  package cn.colg.learn._01;
  
  import cn.colg.util.IniUtil;
  
  /**
   * 客户端
   *
   * @author colg
   */
  public class Client {
      public static void main(String[] args) {
          DbOperation dbOperation = (DbOperation)IniUtil.getBean("learn._01");
          dbOperation.add("Colg");
      }
  }
  ```

- 编译运行

  ```java
  2018-12-08 19:45:55.953 - INFO [           main] cn.colg.learn._01.DbOperation01Adapter   : 添加的数据 : Colg
  2018-12-08 19:45:55.964 - INFO [           main] cn.colg.learn._01.DbOperation01Adapter   : 加密后的数据 ： 48f98ed8ed88574b2838c7e2510cbe84
  ```
