# 工厂方法模式 - Factory Method Pattern

## 1. 概述

- 在工厂方法模式中，我们不再提供一个统一的工厂类来创建所有的产品对象，而是针对不同的产品提供不同的工厂，系统提供一个与产品等级结构对应的工厂等级结构。
- 工厂方法模式定义如下：
  - 定义一个用于创建对象的接口，让子类决定将哪一个类实例化。工厂方法模式让一个类的实例化延迟到其子类。
  - 工厂方法模式又简称为工厂模式(Factory Pattern)，又可称作虚拟构造器模式(Virtual Constructor Pattern)或多态工厂模式(Polymorphic Factory Pattern)。
  - 工厂方法模式是一种类创建型模式。
- 工厂方法模式提供一个抽象工厂接口来声明抽象工厂方法，而由其子类来具体实现工厂方法，创建具体的产品对象。

## 2. 结构图

**在工厂方法模式结构图中包含如下几个角色：**

- **Product（抽象产品）**
  - **它是定义产品的接口，是工厂方法模式所创建对象的超类型，也就是产品对象的公共父类。**
- **ConcreteProduct（具体产品）**
  - **它实现了抽象产品接口，某种类型的具体产品由专门的具体工厂创建，具体工厂和具体产品之间一一对应。**
- **Factory（抽象工厂）**
  - **在抽象工厂类中，声明了工厂方法（Factory Method），用于返回一个产品。抽象工厂是工厂方法模式的核心，所有创建对象的工厂都必须实现该接口。**
- **ConcreteFactory（具体工厂）**
  - **它是抽象工厂类的子类，实现了抽象工厂中定义的工厂方法，并可由客户端调用，返回一个具体产品类的实例。**

**与简单工厂模式相比，工厂方法模式最重要的区别是引入了抽象工厂角色，抽象工厂可以是接口，也可以是抽象类或者具体类。**

## 3. 简化

- 引入重载方法，实现多种创建对象方式
- 简化客户端的使用，隐藏工厂方法，在工厂类中直接调用产品类的业务方法，客户端无需调用工厂方法创建产品
- 抽象工厂改为抽象类

## 4. 总结

工厂方法模式是简单工厂模式的延伸，它继承了简单工厂模式的优点，同时还弥补了简单工厂模式的不足。工厂方法模式是使用频率最高的设计模式之一，是很多开源框架和API类库的核心模式。

### 4.1. 优点

- 在工厂方法模式中，工厂方法用来创建客户所需要的产品，同时还向客户隐藏了哪种具体产品类将被实例化这一细节，用户只需要关心所需产品对应的工厂，无须关心创建细节，甚至无须知道具体产品类的类名。
- 基于工厂角色和产品角色的多态性设计是工厂方法模式的关键。它能够让工厂可以自主确定创建何种产品对象，而如何创建这个对象的细节则完全封装在具体工厂内部。工厂方法模式之所以又被称为多态工厂模式，就正是因为所有的具体工厂类都具有同一抽象父类。
- 使用工厂方法模式的另一个优点是在系统中加入新产品时，无须修改抽象工厂和抽象产品提供的接口，无须修改客户端，也无须修改其他的具体工厂和具体产品，而只要添加一个具体工厂和具体产品就可以了，这样，系统的可扩展性也就变得非常好，完全符合“开闭原则”。

### 4.2. 缺点

- 在添加新产品时，需要编写新的具体产品类，而且还要提供与之对应的具体工厂类，系统中类的个数将成对增加，在一定程度上增加了系统的复杂度，有更多的类需要编译和运行，会给系统带来一些额外的开销。
- 由于考虑到系统的可扩展性，需要引入抽象层，在客户端代码中均使用抽象层进行定义，增加了系统的抽象性和理解难度，且在实现时可能需要用到DOM、反射等技术，增加了系统的实现难度。

### 4.3. 适用场景

- 客户端不知道它所需要的对象的类。在工厂方法模式中，客户端不需要知道具体产品类的类名，只需要知道所对应的工厂即可，具体的产品对象由具体工厂类创建，可将具体工厂类的类名存储在配置文件或数据库中。
- 抽象工厂类通过其子类来指定创建哪个对象。在工厂方法模式中，对于抽象工厂类只需要提供一个创建产品的接口，而由其子类来确定具体要创建的对象，利用面向对象的多态性和里氏代换原则，在程序运行时，子类对象将覆盖父类对象，从而使得系统更容易扩展。

## 5. 示例

- 需求

  ```java
  /**
   * 工厂方法模式
   * 
   * <pre>
   * 使用工厂方法模式设计一个程序来读取各种不同类型的图片格式，针对每一种图片格式都设计一个图片读取器，
   * 如GIF图片读取器用于读取GIF格式的图片、JPG图片读取器用于读取JPG格式的图片。
   * 需充分考虑系统的灵活性和可扩展性。
   * </pre>
   *
   * @author colg
   */
  package cn.colg.learn._01;
  ```

- 抽象产品

  ```java
  package cn.colg.learn._01;
  
  /**
   * 抽象产品 - 图片
   *
   * @author colg
   */
  public interface Image {
  
      /**
       * 读取扩展名
       *
       * @author colg
       */
      void readExtName();
  }
  ```

- 具体产品

  ```java
  package cn.colg.learn._01;
  
  import lombok.extern.slf4j.Slf4j;
  
  /**
   * 具体产品 - GIF图片
   *
   * @author colg
   */
  @Slf4j
  public class GIF implements Image {
  
      @Override
      public void readExtName() {
          log.info("读取GIF扩展名的图片");
      }
  }
  ```

  ```java
  package cn.colg.learn._01;
  
  import lombok.extern.slf4j.Slf4j;
  
  /**
   * 具体产品 - JPG图片
   *
   * @author colg
   */
  @Slf4j
  public class JPG implements Image {
  
      @Override
      public void readExtName() {
          log.info("读取JPG扩展名的图片");
      }
  }
  ```

- 抽象工厂

  ```java
  package cn.colg.learn._01;
  
  /**
   * 抽象工厂 - 图片工厂
   *
   * @author colg
   */
  public abstract class AbstractImageFactory {
  
      /**
       * 使用默认方式读取扩展名
       *
       * @author colg
       */
      public void readExtName() {
          this.createImage().readExtName();
      }
  
      /**
       * 使用参数args方式读取扩展名
       *
       * @param args
       * @author colg
       */
      public void readExtName(String args) {
          this.createImage(args).readExtName();
      }
  
      /**
       * 使用对象obj封装的数据读取扩展名
       *
       * @param obj
       * @author colg
       */
      public void readExtName(Object obj) {
          this.createImage(obj).readExtName();
      }
  
      /**
       * 使用默认方式创建图片
       *
       * @return
       * @author colg
       */
      public abstract Image createImage();
  
      /**
       * 使用参数args创建图片
       *
       * @param args
       * @return
       * @author colg
       */
      public abstract Image createImage(String args);
  
      /**
       * 使用对象obj封装的数据创建图片
       *
       * @param obj
       * @return
       * @author colg
       */
      public abstract Image createImage(Object obj);
  }
  ```

- 具体工厂

  ```java
  package cn.colg.learn._01;
  
  import lombok.extern.slf4j.Slf4j;
  
  /**
   * 具体工厂 - GIF图片工厂
   *
   * @author colg
   */
  @Slf4j
  public class GIFFactory extends AbstractImageFactory {
  
      @Override
      public Image createImage() {
          // 使用默认方式创建图片
          log.info("使用默认方式创建图片");
          return new GIF();
      }
  
      @Override
      public Image createImage(String args) {
          // 使用参数args创建图片
          log.info("使用参数args创建图片");
          return new GIF();
      }
  
      @Override
      public Image createImage(Object obj) {
          // 使用对象obj数据创建图片
          log.info("使用对象obj数据创建图片");
          return new GIF();
      }
  }
  ```

  ```java
  package cn.colg.learn._01;
  
  import lombok.extern.slf4j.Slf4j;
  
  /**
   * 具体工厂 - JPG图片工厂
   *
   * @author colg
   */
  @Slf4j
  public class JPGFactory extends AbstractImageFactory {
  
      @Override
      public Image createImage() {
          // 使用默认方式创建图片
          log.info("使用默认方式创建图片");
          return new JPG();
      }
  
      @Override
      public Image createImage(String args) {
          // 使用参数args创建图片
          log.info("使用参数args创建图片");
          return new JPG();
      }
  
      @Override
      public Image createImage(Object obj) {
          // 使用对象obj数据创建图片
          log.info("使用对象obj数据创建图片");
          return new JPG();
      }
  }
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
  
      /**
       * 该方法用于从ini配置文件中提取具体类名，并返回一个实例对象
       *
       * @param key 配置文件的key
       * @return
       * @author colg
       */
      public static Object getBean(String key) {
          String className = getStr(key);
          Object object = null;
          try {
              // 通过反射创建实例
              object = Class.forName(className).newInstance();
          } catch (InstantiationException | IllegalAccessException | ClassNotFoundException e) {
              e.printStackTrace();
          }
  
          return object;
      }
  }
  ```

- 配置文件`config.ini`

  ```ini
  # 具体工厂全类名 - 图片工厂
  learn._01=cn.colg.learn._01.GIFFactory
  ```

- 客户端

  ```java
  package cn.colg.learn._01;
  
  import cn.colg.util.IniUtil;
  import lombok.extern.slf4j.Slf4j;
  
  /**
   * 客户端
   *
   * @author colg
   */
  @Slf4j
  public class Client {
      public static void main(String[] args) {
          AbstractImageFactory factory;
          factory = (AbstractImageFactory)IniUtil.getBean("learn._01");
          factory.readExtName();
          log.info("-----------------------------------------------------------------");
          factory.readExtName("args");
      }
  }
  ```

- 编译运行

  ```java
  2018-12-08 18:14:39.871 - INFO [           main] cn.colg.learn._01.GIFFactory             : 使用默认方式创建图片
  2018-12-08 18:14:39.872 - INFO [           main] cn.colg.learn._01.GIF                    : 读取GIF扩展名的图片
  2018-12-08 18:14:39.872 - INFO [           main] cn.colg.learn._01.Client                 : -----------------------------------------------------------------------------------
  2018-12-08 18:14:39.872 - INFO [           main] cn.colg.learn._01.GIFFactory             : 使用参数args创建图片
  2018-12-08 18:14:39.872 - INFO [           main] cn.colg.learn._01.GIF                    : 读取GIF扩展名的图片
  ```
