# 桥接模式 - Bridge Pattern

## 1. 概述

桥接模式是一种很实用的结构型设计模式，如果软件系统中某个类存在两个独立变化的维度，通过该模式可以将这两个维度分离出来，使两者可以独立扩展，让系统更加符合“单一职责原则”。

与多层继承方案不同，它将两个独立变化的维度设计为两个独立的继承等级结构，并且在抽象层建立一个抽象关联，该关联关系类似一条连接两个独立继承结构的桥，故名桥接模式。

桥接模式用一种巧妙的方式处理多层继承存在的问题，用抽象关联取代了传统的多层继承，将类之间的静态继承关系转换为动态的对象组合关系，使得系统更加灵活，并易于扩展，同时有效控制了系统中类的个数。

- 桥接定义如下：
  - 将抽象部分与它的实现部分分离，使它们都可以独立地变化。
  - 它是一种对象结构型模式，又称为柄体(Handle and Body)模式或接口(Interface)模式。
  - 桥接模式的结构与其名称一样，存在一条连接两个继承等级结构的桥。

## 2. 结构图

**在桥接模式结构图中包含如下几个角色：**

- **Abstraction（抽象类）**
  - **用于定义抽象类的接口，它一般是抽象类而不是接口，其中定义了一个Implementor（实现类接口）类型的对象并可以维护该对象，它与Implementor之间具有关联关系，它既可以包含抽象业务方法，也可以包含具体业务方法。**
- **RefinedAbstraction（扩充抽象类）**
  - **扩充由Abstraction定义的接口，通常情况下它不再是抽象类而是具体类，它实现了在Abstraction中声明的抽象业务方法，在RefinedAbstraction中可以调用在Implementor中定义的业务方法。**
- **Implementor（实现类接口）**
  - **定义实现类的接口，这个接口不一定要与Abstraction的接口完全一致，事实上这两个接口可以完全不同，一般而言，Implementor接口仅提供基本操作，而Abstraction定义的接口可能会做更多更复杂的操作。**
  - **Implementor接口对这些基本操作进行了声明，而具体实现交给其子类。通过关联关系，在Abstraction中不仅拥有自己的方法，还可以调用到Implementor中定义的方法，使用关联关系来替代继承关系。**
- **ConcreteImplementor（具体实现类）**
  - **具体实现Implementor接口，在不同的ConcreteImplementor中提供基本操作的不同实现，在程序运行时，ConcreteImplementor对象将替换其父类对象，提供给抽象类具体的业务操作方法。**

**桥接模式是一个非常有用的模式，在桥接模式中体现了很多面向对象设计原则的思想，包括“单一职责原则”、“开闭原则”、“合成复用原则”、“里氏代换原则”、“依赖倒转原则”等。熟悉桥接模式有助于我们深入理解这些设计原则，也有助于我们形成正确的设计思想和培养良好的设计风格。**

**在使用桥接模式时，我们首先应该识别出一个类所具有的两个独立变化的维度，将它们设计为两个独立的继承等级结构，为两个维度都提供抽象层，并建立抽象耦合。**

**通常情况下，我们将具有两个独立变化维度的类的一些普通业务方法和与之关系最密切的维度设计为“抽象类”层次结构（抽象部分），而将另一个维度设计为“实现类”层次结构（实现部分）。**

## 3. 简化

## 4. 总结

桥接模式是设计Java虚拟机和实现JDBC等驱动程序的核心模式之一，应用较为广泛。在软件开发中如果一个类或一个系统有多个变化维度时，都可以尝试使用桥接模式对其进行设计。桥接模式为多维度变化的系统提供了一套完整的解决方案，并且降低了系统的复杂度。

### 4.1. 优点

- 分离抽象接口及其实现部分。桥接模式使用“对象间的关联关系”解耦了抽象和实现之间固有的绑定关系，使得抽象和实现可以沿着各自的维度来变化。所谓抽象和实现沿着各自维度的变化，也就是说抽象和实现不再在同一个继承层次结构中，而是“子类化”它们，使它们各自都具有自己的子类，以便任何组合子类，从而获得多维度组合对象。
- 在很多情况下，桥接模式可以取代多层继承方案，多层继承方案违背了“单一职责原则”，复用性较差，且类的个数非常多，桥接模式是比多层继承方案更好的解决方法，它极大减少了子类的个数。
- 桥接模式提高了系统的可扩展性，在两个变化维度中任意扩展一个维度，都不需要修改原有系统，符合“开闭原则”。

### 4.2. 缺点

- 桥接模式的使用会增加系统的理解与设计难度，由于关联关系建立在抽象层，要求开发者一开始就针对抽象层进行设计与编程。
- 桥接模式要求正确识别出系统中两个独立变化的维度，因此其使用范围具有一定的局限性，如何正确识别两个独立维度也需要一定的经验积累。

### 4.3. 适用场景

- 如果一个系统需要在抽象化和具体化之间增加更多的灵活性，避免在两个层次之间建立静态的继承关系，通过桥接模式可以使它们在抽象层建立一个关联关系。
- “抽象部分”和“实现部分”可以以继承的方式独立扩展而互不影响，在程序运行时可以动态将一个抽象化子类的对象和一个实现化子类的对象进行组合，即系统需要对抽象化角色和实现化角色进行动态耦合。
- 一个类存在两个（或多个）独立变化的维度，且这两个（或多个）维度都需要独立进行扩展。
- 对于那些不希望使用继承或因为多层继承导致系统类的个数急剧增加的系统，桥接模式尤为适用。

## 5. 示例

- 需求

  ```java
  /**
   * 桥接模式
   * 
   * <pre>
   * 软件公司欲开发一个数据转换工具，可以将数据库中的数据转换成多种文件格式，例如txt、xml、pdf等格式，同时该工具需要支持多种不同的数据库。
   * 试使用桥接模式对其进行设计。
   * </pre>
   *
   * @author colg
   */
  package cn.colg.learn._01;
  ```

- 数据对象

  ```java
  package cn.colg.learn._01;
  
  import lombok.Getter;
  import lombok.Setter;
  import lombok.ToString;
  import lombok.experimental.Accessors;
  
  /**
   * 数据对象；模拟数据库中的数据
   *
   * @author colg
   */
  @Getter
  @Setter
  @ToString
  @Accessors(chain = true)
  public class Data {
  
      /** 数据库类型 */
      private String dbType;
  
      /** 数据库名称 */
      private String schema;
  
      /** 文件格式 */
      private String extName;
  }
  ```

- 实现类接口

  ```java
  package cn.colg.learn._01;
  
  /**
   * 实现类接口 - 抽象数据库实现类
   *
   * @author colg
   */
  public interface Db {
  
      /**
       * 转换数据库中的数据
       *
       * @param data
       * @author colg
       */
      void convert(Data data);
  }
  ```

- 具体实现类

  ```java
  package cn.colg.learn._01;
  
  import lombok.extern.slf4j.Slf4j;
  
  /**
   * 具体实现类 - MySQL数据库
   *
   * @author colg
   */
  @Slf4j
  public class MySqlDb implements Db {
  
      @Override
      public void convert(Data data) {
          log.info("MySql数据库数据转换 : {}", data.setDbType("MySql"));
      }
  }
  ```

  ```java
  package cn.colg.learn._01;
  
  import lombok.extern.slf4j.Slf4j;
  
  /**
   * 具体实现类 - Oracle数据库
   *
   * @author colg
   */
  @Slf4j
  public class OracleDb implements Db {
  
      @Override
      public void convert(Data data) {
          log.info("Oracle数据库数据转换 : {}", data.setDbType("Oracle"));
      }
  }
  ```

- 抽象类

  ```java
  package cn.colg.learn._01;
  
  import lombok.Setter;
  
  /**
   * 抽象类 - 抽象文件类
   *
   * @author colg
   */
  @Setter
  public abstract class AbstractFile {
  
      /** 定义实现类接口对象 */
      protected Db db;
  
      /**
       * 解析数据
       *
       * @param data
       * @author colg
       */
      public abstract void parseData(Data data);
  }
  ```

- 扩充抽象类

  ```java
  package cn.colg.learn._01;
  
  /**
   * 扩充抽象类 - pdf文件
   *
   * @author colg
   */
  public class Pdf extends AbstractFile {
  
      @Override
      public void parseData(Data data) {
          db.convert(data.setExtName(".pdf"));
      }
  }
  ```

  ```java
  package cn.colg.learn._01;
  
  /**
   * 扩充抽象类 - txt文件
   *
   * @author colg
   */
  public class Txt extends AbstractFile {
  
      @Override
      public void parseData(Data data) {
          db.convert(data.setExtName(".txt"));
      }
  }
  ```

  ```java
  package cn.colg.learn._01;
  
  /**
   * 扩充抽象类
   *
   * @author colg
   */
  public class Xml extends AbstractFile {
  
      @Override
      public void parseData(Data data) {
          db.convert(data.setExtName(".xml"));
      }
  }
  ```

- 配置文件`config.ini`

  ```ini
  # 扩充抽象类
  learn._01_RefinedAbstraction=cn.colg.learn._01.Xml
  # 具体实现类
  learn._01_ConcreteImplementor=cn.colg.learn._01.MySqlDb
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
          AbstractFile file = (AbstractFile)IniUtil.getBean("learn._01_RefinedAbstraction");
          Db db = (Db)IniUtil.getBean("learn._01_ConcreteImplementor");
          file.setDb(db);
          file.parseData(new Data().setSchema("桥接模式"));
      }
  }
  ```

- 编译运行

  ```ini
  2018-12-06 01:02:47.338 - INFO [           main] cn.colg.learn._01.MySqlDb                : MySql数据库数据转换 : Data(dbType=MySql, schema=桥接模式, extName=.xml)
  ```
