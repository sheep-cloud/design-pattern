# 装饰模式 - Decorator Pattern

## 1. 概述

装饰模式可以在不改变一个对象本身功能的基础上给对象增加额外的新行为，在现实生活中，这种情况也到处存在，例如一张照片，我们可以不改变照片本身，给它增加一个相框，使得它具有防潮的功能，而且用户可以根据需要给它增加不同类型的相框，甚至可以在一个小相框的外面再套一个大相框。

装饰模式是一种用于替代继承的技术，它通过一种无须定义子类的方式来给对象动态增加职责，使用对象之间的关联关系取代类之间的继承关系。在装饰模式中引入了装饰类，在装饰类中既可以调用待装饰的原有类的方法，还可以增加新的方法，以扩充原有类的功能。

- 装饰模式定义如下：
  - 动态地给一个对象增加一些额外的职责，就增加对象功能来说，装饰模式比生成子类实现更为灵活。装饰模式是一种对象结构型模式。
  - 在装饰模式中，为了让系统具有更好的灵活性和可扩展性，我们通常会定义一个抽象装饰类，而将具体的装饰类作为它的子类。

## 2. 结构图

**在装饰模式结构图中包含如下几个角色：**

- **Component（抽象构件）**
  - **它是具体构件和抽象装饰类的共同父类，声明了在具体构件中实现的业务方法，它的引入可以使客户端以一致的方式处理未被装饰的对象以及装饰之后的对象，实现客户端的透明操作。**
- **ConcreteComponent（具体构件）**
  - **它是抽象构件类的子类，用于定义具体的构件对象，实现了在抽象构件中声明的方法，装饰器可以给它增加额外的职责（方法）。**
- **Decorator（抽象构件装饰类）**
  - **它也是抽象构件类的子类，用于给具体构件增加职责，但是具体职责在其子类中实现。它维护一个指向抽象构件对象的引用，通过该引用可以调用装饰之前构件对象的方法，并通过其子类扩展该方法，以达到装饰的目的。**
- **ConcreteDecorator（具体装饰类）**
  - **它是抽象装饰类的子类，负责向构件添加新的职责。每一个具体装饰类都定义了一些新的行为，它可以调用在抽象装饰类中定义的方法，并可以增加新的方法用以扩充对象的行为。**

**由于具体构件类和装饰类都实现了相同的抽象构件接口，因此装饰模式以对客户透明的方式动态地给一个对象附加上更多的责任，换言之，客户端并不会觉得对象在装饰前和装饰后有什么不同。装饰模式可以在不需要创造更多子类的情况下，将对象的功能加以扩展。**

## 3. 简化

- 透明装饰模式
  - 在透明装饰模式中，要求客户端完全针对抽象编程，装饰模式的透明性要求客户端程序不应该将对象声明为具体构件类型或具体装饰类型，而应该全部声明为抽象构件类型。对于客户端而言，具体构件对象和具体装饰对象没有任何区别。
  - 透明装饰模式可以让客户端透明地使用装饰之前的对象和装饰之后的对象，无须关心它们的区别，此外，还可以对一个已装饰过的对象进行多次装饰，得到更为复杂、功能更为强大的对象。
- 半透明装饰模式
  - 透明装饰模式的设计难度较大，而且有时我们需要单独调用新增的业务方法。为了能够调用到新增方法，我们不得不用具体装饰类型来定义装饰之后的对象，而具体构件类型还是可以使用抽象构件类型来定义，这种装饰模式即为半透明装饰模式，也就是说，对于客户端而言，具体构件类型无须关心，是透明的；
  - 半透明装饰模式可以给系统带来更多的灵活性，设计相对简单，使用起来也非常方便；但是其最大的缺点在于不能实现对同一个对象的多次装饰，而且客户端需要有区别地对待装饰之前的对象和装饰之后的对象

## 4. 总结

装饰模式降低了系统的耦合度，可以动态增加或删除对象的职责，并使得需要装饰的具体构件类和具体装饰类可以独立变化，以便增加新的具体构件类和具体装饰类。

在软件开发中，装饰模式应用较为广泛，例如在JavaIO中的输入流和输出流的设计、javax.swing包中一些图形界面构件功能的增强等地方都运用了装饰模式。

### 4.1. 优点

- 对于扩展一个对象的功能，装饰模式比继承更加灵活性，不会导致类的个数急剧增加。
- 可以通过一种动态的方式来扩展一个对象的功能，通过配置文件可以在运行时选择不同的具体装饰类，从而实现不同的行为。
- 可以对一个对象进行多次装饰，通过使用不同的具体装饰类以及这些装饰类的排列组合，可以创造出很多不同行为的组合，得到功能更为强大的对象。
- 具体构件类与具体装饰类可以独立变化，用户可以根据需要增加新的具体构件类和具体装饰类，原有类库代码无须改变，符合“开闭原则”。

### 4.2. 缺点

- 使用装饰模式进行系统设计时将产生很多小对象，这些对象的区别在于它们之间相互连接的方式有所不同，而不是它们的类或者属性值有所不同，大量小对象的产生势必会占用更多的系统资源，在一定程序上影响程序的性能。
- 装饰模式提供了一种比继承更加灵活机动的解决方案，但同时也意味着比继承更加易于出错，排错也很困难，对于多次装饰的对象，调试时寻找错误可能需要逐级排查，较为繁琐。

### 4.3. 适用场景

- 在不影响其他对象的情况下，以动态、透明的方式给单个对象添加职责。
- 当不能采用继承的方式对系统进行扩展或者采用继承不利于系统扩展和维护时可以使用装饰模式。
- 不能采用继承的情况主要有两类：
  - 第一类是系统中存在大量独立的扩展，为支持每一种扩展或者扩展之间的组合将产生大量的子类，使得子类数目呈爆炸性增长；
  - 第二类是因为类已定义为不能被继承（如Java语言中的final类）。

## 5. 示例

- 需求

  ```java
  /**
   * 装饰模式
   * 
   * <pre>
   * 软件公司欲开发了一个数据加密模块，可以对字符串进行加密。
   * 最简单的加密算法通过对字母进行移位来实现，同时还提供了稍复杂的逆向输出加密，还提供了更为高级的MD5加密。
   * 用户先使用最简单的加密算法对字符串进行加密，如果觉得还不够可以对加密之后的结果使用其他加密算法进行二次加密，当然也可以进行第三次加密。
   * 试使用装饰模式设计该多重加密系统。
   * </pre>
   *
   * @author colg
   */
  package cn.colg.learn._01;
  ```

- 抽象构件

  ```java
  package cn.colg.learn._01;
  
  /**
   * 抽象构件
   *
   * @author colg
   */
  public abstract class AbstractComponent {
  
      /**
       * 对字符串进行加密
       *
       * @param data 字符串
       * @return 加密后的数据
       * @author colg
       */
      public abstract String crypoto(String data);
  }
  ```

- 具体构件

  ```java
  package cn.colg.learn._01;
  
  import cn.hutool.core.util.StrUtil;
  import lombok.extern.slf4j.Slf4j;
  
  /**
   * 具体构件类 - 位移
   *
   * @author colg
   */
  @Slf4j
  public class Displacement extends AbstractComponent {
  
      /**
       * 对字符串进行位移加密
       *
       * @param data
       * @return
       */
      @Override
      public String crypoto(String data) {
          log.info("对字符串进行位移加密 : {}", data);
          return this.displacement(data, 3, true);
      }
  
      /**
       * 对字符串进行位移
       *
       * @param data 字符串
       * @param moveLength 移动距离
       * @param isMoveRight true：右移；false：左移
       * @return 位移后的字符串
       * @author colg
       */
      private String displacement(String data, int moveLength, boolean isMoveRight) {
          if (StrUtil.isBlank(data) || moveLength <= 0) {
              return data;
          }
  
          int len = data.length();
          if (moveLength > len) {
              // 循环位移，当越界时循环
              moveLength = moveLength % len;
          }
          if (moveLength == len) {
              // 当位移位数与字符串长度一样
              return data;
          }
  
          StringBuilder sb = new StringBuilder(len);
          if (isMoveRight) {
              // 右移
              sb.append(data.substring(len - moveLength))
                .append(data.substring(0, len - moveLength));
          } else {
              // 左移
              sb.append(data.substring(moveLength))
                .append(data.substring(0, moveLength));
          }
  
          return sb.toString();
      }
  }
  ```

- 抽象装饰类

  ```java
  package cn.colg.learn._01;
  
  /**
   * 抽象构件装饰类
   *
   * @author colg
   */
  public abstract class AbstractComponentDecorator extends AbstractComponent {
  
      /** 维持对抽象构件类型成员的引用；构造注入 */
      private AbstractComponent abstractComponent;
  
      public AbstractComponentDecorator(AbstractComponent abstractComponent) {
          this.abstractComponent = abstractComponent;
      }
  
      @Override
      public String crypoto(String data) {
          return abstractComponent.crypoto(data);
      }
  }
  ```

- 具体装饰类

  ```java
  package cn.colg.learn._01;
  
  import cn.hutool.core.util.StrUtil;
  import lombok.extern.slf4j.Slf4j;
  
  /**
   * 具体构件装饰类 - 逆向
   *
   * @author colg
   */
  @Slf4j
  public class Reverse extends AbstractComponentDecorator {
  
      public Reverse(AbstractComponent abstractComponent) {
          super(abstractComponent);
      }
  
      @Override
      public String crypoto(String data) {
          String result = super.crypoto(data);
          log.info("对字符串进行逆向加密 : {}", result);
          return StrUtil.reverse(result);
      }
  }
  ```

  ```java
  package cn.colg.learn._01;
  
  import cn.hutool.crypto.SecureUtil;
  import lombok.extern.slf4j.Slf4j;
  
  /**
   * 具体构件装饰类 - MD5
   *
   * @author colg
   */
  @Slf4j
  public class Md5 extends AbstractComponentDecorator {
  
      public Md5(AbstractComponent abstractComponent) {
          super(abstractComponent);
      }
  
      @Override
      public String crypoto(String data) {
          String result = super.crypoto(data);
          log.info("对字符串进行MD5加密 : {}", result);
          return SecureUtil.md5(result);
      }
  }
  ```

  ```java
  package cn.colg.learn._01;
  
  import cn.hutool.crypto.SecureUtil;
  import lombok.extern.slf4j.Slf4j;
  
  /**
   * 具体构件装饰类 - Sha1
   *
   * @author colg
   */
  @Slf4j
  public class Sha1 extends AbstractComponentDecorator {
  
      public Sha1(AbstractComponent abstractComponent) {
          super(abstractComponent);
      }
  
      @Override
      public String crypoto(String data) {
          String result = super.crypoto(data);
          log.info("对字符串进行SHA1加密 : {}", result);
          return SecureUtil.sha1(result);
      }
  }
  ```

- 客户端

  ```java
  package cn.colg.learn._01;
  
  import lombok.extern.slf4j.Slf4j;
  
  /**
   * 客户端
   *
   * @author colg
   */
  @Slf4j
  public class Client {
      public static void main(String[] args) {
          // 受用抽象构件类型定义
          AbstractComponent dis, reverse, md5;
          // 定义具体构件
          dis = new Displacement();
          String data = "abcdefg";
          log.info("一次加密（位移） : {}", dis.crypoto(data));
          log.info("-----------------------------------------------------------------");
  
          // 二次加密
          reverse = new Reverse(dis);
          log.info("二次加密（逆向） : {}", reverse.crypoto(data));
          log.info("-----------------------------------------------------------------");
  
          // 三次加密
          md5 = new Md5(reverse);
          log.info("三次加密（md5） : {}", md5.crypoto(data));
          log.info("-----------------------------------------------------------------");
  
          // 四次加密
          AbstractComponent sha1 = new Sha1(md5);
          log.info("四次加密（sha1） : {}", sha1.crypoto(data));
      }
  }
  ```

- 编译运行

  ​	

  ```java
  2018-12-08 21:12:49.602 - INFO [           main] cn.colg.learn._01.Displacement           : 对字符串进行位移加密 : abcdefg
  2018-12-08 21:12:49.609 - INFO [           main] cn.colg.learn._01.Client                 : 一次加密（位移） : efgabcd
  2018-12-08 21:12:49.609 - INFO [           main] cn.colg.learn._01.Client                 : --------------------------------------------------------------------------------
  2018-12-08 21:12:49.610 - INFO [           main] cn.colg.learn._01.Displacement           : 对字符串进行位移加密 : abcdefg
  2018-12-08 21:12:49.610 - INFO [           main] cn.colg.learn._01.Reverse                : 对字符串进行逆向加密 : efgabcd
  2018-12-08 21:12:49.613 - INFO [           main] cn.colg.learn._01.Client                 : 二次加密（逆向） : dcbagfe
  2018-12-08 21:12:49.613 - INFO [           main] cn.colg.learn._01.Client                 : --------------------------------------------------------------------------------
  2018-12-08 21:12:49.613 - INFO [           main] cn.colg.learn._01.Displacement           : 对字符串进行位移加密 : abcdefg
  2018-12-08 21:12:49.613 - INFO [           main] cn.colg.learn._01.Reverse                : 对字符串进行逆向加密 : efgabcd
  2018-12-08 21:12:49.613 - INFO [           main] cn.colg.learn._01.Md5                    : 对字符串进行MD5加密 : dcbagfe
  2018-12-08 21:12:49.623 - INFO [           main] cn.colg.learn._01.Client                 : 三次加密（md5） : 1060301888f86ae3517603923d074537
  2018-12-08 21:12:49.623 - INFO [           main] cn.colg.learn._01.Client                 : --------------------------------------------------------------------------------
  2018-12-08 21:12:49.623 - INFO [           main] cn.colg.learn._01.Displacement           : 对字符串进行位移加密 : abcdefg
  2018-12-08 21:12:49.623 - INFO [           main] cn.colg.learn._01.Reverse                : 对字符串进行逆向加密 : efgabcd
  2018-12-08 21:12:49.623 - INFO [           main] cn.colg.learn._01.Md5                    : 对字符串进行MD5加密 : dcbagfe
  2018-12-08 21:12:49.624 - INFO [           main] cn.colg.learn._01.Sha1                   : 对字符串进行SHA1加密 : 1060301888f86ae3517603923d074537
  2018-12-08 21:12:49.624 - INFO [           main] cn.colg.learn._01.Client                 : 四次加密（sha1） : c2ffa105f688e5e5db6a1fe6340c4ed639841fef
  ```
