# 简单工厂模式 - Simple Factory Pattern

## 1. 概述

- 简单工厂模式并不属于GoF 23个经典设计模式，但通常将它作为学习其他工厂模式的基础，它的设计思想很简单，其基本流程如下：
  - 首先将需要创建的各种不同对象（例如各种不同的Chart对象）的相关代码封装到不同的类中，这些类称为具体产品类，而将它们公共的代码进行抽象和提取后封装在一个抽象产品类中，每一个具体产品类都是抽象产品类的子类；
  - 然后提供一个工厂类用于创建各种产品，在工厂类中提供一个创建产品的工厂方法，该方法可以根据所传入的参数不同创建不同的具体产品对象；
  - 客户端只需调用工厂类的工厂方法并传入相应的参数即可得到一个产品对象。
- 简单工厂模式定义如下：
  - 定义一个工厂类，它可以根据参数的不同返回不同类的实例，被创建的实例通常都具有共同的父类。因为在简单工厂模式中用于创建实例的方法是静态(static)方法，因此简单工厂模式又被称为静态工厂方法(Static Factory Method)模式，它属于类创建型模式。
- 简单工厂的要点在于：
  - 简单工厂模式的要点在于：当你需要什么，只需要传入一个正确的参数，就可以获取你所需要的对象，而无须知道其创建细节。

## 2. 结构图

**在简单工厂模式结构图中包含如下几个角色：**

-  **Factory（工厂角色）**
     - **工厂角色即工厂类，它是简单工厂模式的核心，负责实现创建所有产品实例的内部逻辑；**
     -  **工厂类可以被外界直接调用，创建所需的产品对象；**
     -  **在工厂类中提供了静态的工厂方法factoryMethod()，它的返回类型为抽象产品类型Product。**
-  **Product（抽象产品角色）**
       - **它是工厂类所创建的所有对象的父类，封装了各种产品对象的公有方法，它的引入将提高系统的灵活性，使得在工厂类中只需定义一个通用的工厂方法，因为所有创建的具体产品对象都是其子类对象。**
-  **ConcreteProduct（具体产品角色）**
     -  **它是简单工厂模式的创建目标，所有被创建的对象都充当这个角色的某个具体类的实例。每一个具体产品角色都继承了抽象产品角色，需要实现在抽象产品中声明的抽象方法。**

**在简单工厂模式中，客户端通过工厂类来创建一个产品类的实例，而无须直接使用new关键字来创建对象，它是工厂模式家族中最简单的一员。**

**在使用简单工厂模式时，首先需要对产品类进行重构，不能设计一个包罗万象的产品类，而需根据实际情况设计一个产品层次结构，将所有产品类公共的代码移至抽象产品类，并在抽象产品类中声明一些抽象方法，以供不同的具体产品类来实现。**

## 3. 简化

- 为了简化简单工厂模式，可以将抽象产品类和工厂类合并，将静态工厂方法移至抽象产品类中。这种做法在JDK等类库和框架中也广泛存在。

## 4. 总结

简单工厂模式提供了专门的工厂类用于创建对象，将对象的创建和对象的使用分离开，它作为一种最简单的工厂模式在软件开发中得到了较为广泛的应用。

### 4.1. 优点

- 工厂类包含必要的判断逻辑，可以决定在什么时候创建哪一个产品类的实例，客户端可以免除直接创建产品对象的职责，而仅仅“消费”产品，简单工厂模式实现了对象创建和使用的分离。
- 客户端无须知道所创建的具体产品类的类名，只需要知道具体产品类所对应的参数即可，对于一些复杂的类名，通过简单工厂模式可以在一定程度减少使用者的记忆量。
- 通过引入配置文件，可以在不修改任何客户端代码的情况下更换和增加新的具体产品类，在一定程度上提高了系统的灵活性。

### 4.2. 缺点

- 由于工厂类集中了所有产品的创建逻辑，职责过重，一旦不能正常工作，整个系统都要受到影响。
- 使用简单工厂模式势必会增加系统中类的个数（引入了新的工厂类），增加了系统的复杂度和理解难度。
- 系统扩展困难，一旦添加新产品就不得不修改工厂逻辑，在产品类型较多时，有可能造成工厂逻辑过于复杂，不利于系统的扩展和维护。
- 简单工厂模式由于使用了静态工厂方法，造成工厂角色无法形成基于继承的等级结构。

### 4.3. 适用场景

- 工厂类负责创建的对象比较少，由于创建的对象较少，不会造成工厂方法中的业务逻辑太过复杂。
- 客户端只知道传入工厂类的参数，对于如何创建对象并不关心。

## 5. 示例

- 需求

  ```java
  /**
   * 简单工厂模式
   * 
   * <pre>
   * 使用简单工厂模式设计一个可以创建不同几何形状（如圆形、方形和三角形等）的绘图工具，
   * 每个几何图形都具有绘制draw()和擦除erase()两个方法，
   * 要求在绘制不支持的几何图形时，提示一个UnSupportedShapeException。
   * </pre>
   *
   * @author colg
   */
  package cn.colg.learn._01;
  ```

- 抽象产品角色 + 工厂角色

  ```java
  package cn.colg.learn._01;
  
  /**
   * 简化简单工厂模式：抽象产品角色（几何形状） + 工厂类
   *
   * @author colg
   */
  public abstract class AbstractGeometryFactory {
  
      /**
       * 静态工厂方法；返回抽象产品类型
       *
       * @param type
       * @return
       * @author colg
       */
      public static AbstractGeometryFactory getGeometry(String type) {
          AbstractGeometryFactory geometry = null;
          if ("square".equals(type)) {
              geometry = new Square();
          } else if ("triangle".equals(type)) {
              geometry = new Triangle();
          } else if ("circular".equals(type)) {
              geometry = new Circular();
          }
          return geometry;
      }
  
      /**
       * 绘制
       *
       * @author colg
       */
      public abstract void draw();
  
      /**
       * 擦除
       *
       * @author colg
       */
      public abstract void erase();
  }
  ```

- 具体产品角色

  ```java
  package cn.colg.learn._01;
  
  import lombok.extern.slf4j.Slf4j;
  
  /**
   * 具体产品角色 - 圆形
   *
   * @author colg
   */
  @Slf4j
  public class Circular extends AbstractGeometryFactory {
  
      public Circular() {
          log.info("创建圆形");
      }
  
      @Override
      public void draw() {
          log.info("绘制圆形");
      }
  
      @Override
      public void erase() {
          log.info("擦除圆形");
      }
  }
  ```

  ```java
  package cn.colg.learn._01;
  
  import lombok.extern.slf4j.Slf4j;
  
  /**
   * 具体产品角色 - 方形
   *
   * @author colg
   */
  @Slf4j
  public class Square extends AbstractGeometryFactory {
  
      public Square() {
          log.info("创建方形");
      }
  
      @Override
      public void draw() {
          log.info("绘制方形");
      }
  
      @Override
      public void erase() {
          log.info("擦除方形");
      }
  }
  ```

  ```java
  package cn.colg.learn._01;
  
  import lombok.extern.slf4j.Slf4j;
  
  /**
   * 具体产品角色 - 三角形
   *
   * @author colg
   */
  @Slf4j
  public class Triangle extends AbstractGeometryFactory {
  
      public Triangle() {
          log.info("创建三角形");
      }
  
      @Override
      public void draw() {
          log.info("绘制三角形");
      }
  
      @Override
      public void erase() {
          log.info("擦除三角形");
      }
  }
  ```

- 配置文件`config.ini`

  ```ini
  # 几何形状[square=方形, triangle=三角形, circular=圆形]
  learn._01=triangle
  ```

- 工具类

  ```java
  package cn.colg.util;
  
  import cn.hutool.setting.dialect.Props;
  
  /**
   * 配置文件操作类
   *
   * @author colg
   */
  public class IniUtil {
  
      /** 配置文件路径 */
      public static final String PATH = "config.ini";
  
      /**
       * 读取配置文件中的参数
       *
       * @param key 配置文件的key
       * @return
       * @author colg
       */
      public static String getStr(String key) {
          Props props = new Props(PATH);
          return props.getStr(key);
      }
  }
  ```

- 客户端

  ```java
  package cn.colg.learn._01;
  
  import cn.hutool.setting.dialect.Props;
  
  /**
   * 客户端
   *
   * @author colg
   */
  public class Client {
      public static void main(String[] args) {
          AbstractGeometryFactory geometry;
          String type = IniUtil.getStr("learn._01");
          geometry = AbstractGeometryFactory.getGeometry(type);
          geometry.draw();
          geometry.erase();
      }
  }
  ```

- 编译运行

  ```ini
  2018-12-04 23:11:08.302 - INFO [main] cn.colg.learn._01.Triangle  : 创建三角形
  2018-12-04 23:11:08.302 - INFO [main] cn.colg.learn._01.Triangle  : 绘制三角形
  2018-12-04 23:11:08.302 - INFO [main] cn.colg.learn._01.Triangle  : 擦除三角形
  ```
