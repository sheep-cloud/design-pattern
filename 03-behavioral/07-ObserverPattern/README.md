# 观察者模式 - Observer Pattern

## 1. 概述

观察者模式是使用频率最高的设计模式之一，它用于建立一种对象与对象之间的依赖关系，一个对象发生改变时将自动通知其他对象，其他对象将相应作出反应。

在观察者模式中，发生改变的对象称为观察目标，而被通知的对象称为观察者，一个观察目标可以对应多个观察者，而且这些观察者之间可以没有任何相互联系，可以根据需要增加和删除观察者，使得系统更易于扩展。

- 观察者模式定义如下： 
  - 定义对象之间的一种一对多依赖关系，使得每当一个对象状态发生改变时，其相关依赖对象皆得到通知并被自动更新。
  - 观察者模式的别名包括发布-订阅（Publish/Subscribe）模式、模型-视图（Model/View）模式、源-监听器（Source/Listener）模式或从属者（Dependents）模式。
  - 观察者模式是一种对象行为型模式。
- 观察者模式结构中通常包括观察目标和观察者两个继承层次结构

## 2. 结构图

**在观察者模式结构图中包含如下几个角色：**

- **Subject（目标）**
  - **目标又称为主题，它是指被观察的对象。**
  - **在目标中定义了一个观察者集合，一个观察目标可以接受任意数量的观察者来观察，它提供一系列方法来增加和删除观察者对象，同时它定义了通知方法notify()。**
  - **目标类可以是接口，也可以是抽象类或具体类。**
- **ConcreteSubject（具体目标）**
  - **具体目标是目标类的子类，通常它包含有经常发生改变的数据，当它的状态发生改变时，向它的各个观察者发出通知；**
  - **同时它还实现了在目标类中定义的抽象业务逻辑方法（如果有的话）。**
  - **如果无须扩展目标类，则具体目标类可以省略。**
- **Observer（观察者）**
  - **观察者将对观察目标的改变做出反应，观察者一般定义为接口，该接口声明了更新数据的方法update()，因此又称为抽象观察者。**
- **ConcreteObserver（具体观察者）**
  - **在具体观察者中维护一个指向具体目标对象的引用，它存储具体观察者的有关状态，这些状态需要和具体目标的状态保持一致；**
  - **它实现了在抽象观察者Observer中定义的update()方法。**
  - **通常在实现时，可以调用具体目标类的attach()方法将自己添加到目标类的集合中或通过detach()方法将自己从目标类的集合中删除。**

**观察者模式描述了如何建立对象与对象之间的依赖关系，以及如何构造满足这种需求的系统。观察者模式包含观察目标和观察者两类对象，一个目标可以有任意数目的与之相依赖的观察者，一旦观察目标的状态发生改变，所有的观察者都将得到通知。作为对这个通知的响应，每个观察者都将监视观察目标的状态以使其状态与目标状态同步，这种交互也称为发布-订阅(Publish-Subscribe)。观察目标是通知的发布者，它发出通知时并不需要知道谁是它的观察者，可以有任意数目的观察者订阅它并接收通知。** 

​	

## 3. 简化

## 4. 总结

观察者模式是一种使用频率非常高的设计模式，无论是移动应用、Web应用或者桌面应用，观察者模式几乎无处不在，它为实现对象之间的联动提供了一套完整的解决方案，凡是涉及到一对一或者一对多的对象交互场景都可以使用观察者模式。

观察者模式广泛应用于各种编程语言的GUI事件处理的实现，在基于事件的XML解析技术（如SAX2）以及Web事件处理中也都使用了观察者模式。

### 4.1. 优点

- 观察者模式可以实现表示层和数据逻辑层的分离，定义了稳定的消息更新传递机制，并抽象了更新接口，使得可以有各种各样不同的表示层充当具体观察者角色。
- 观察者模式在观察目标和观察者之间建立一个抽象的耦合。观察目标只需要维持一个抽象观察者的集合，无须了解其具体观察者。由于观察目标和观察者没有紧密地耦合在一起，因此它们可以属于不同的抽象化层次。
- 观察者模式支持广播通信，观察目标会向所有已注册的观察者对象发送通知，简化了一对多系统设计的难度。
- 观察者模式满足“开闭原则”的要求，增加新的具体观察者无须修改原有系统代码，在具体观察者与观察目标之间不存在关联关系的情况下，增加新的观察目标也很方便。

### 4.2. 缺点

- 如果一个观察目标对象有很多直接和间接观察者，将所有的观察者都通知到会花费很多时间。
- 如果在观察者和观察目标之间存在循环依赖，观察目标会触发它们之间进行循环调用，可能导致系统崩溃。
- 观察者模式没有相应的机制让观察者知道所观察的目标对象是怎么发生变化的，而仅仅只是知道观察目标发生了变化。

### 4.3. 适用场景

- 一个抽象模型有两个方面，其中一个方面依赖于另一个方面，将这两个方面封装在独立的对象中使它们可以各自独立地改变和复用。
- 一个对象的改变将导致一个或多个其他对象也发生改变，而并不知道具体有多少对象将发生改变，也不知道这些对象是谁。
- 需要在系统中创建一个触发链，A对象的行为将影响B对象，B对象的行为将影响C对象……，可以使用观察者模式创建一种链式触发机制。

## 5. 示例

- 需求

  ```java
  /**
   * 观察者模式
   * 
   * <pre>
   * 软件公司欲开发一款实时在线股票软件，该软件需提供如下功能：
   *  当股票购买者所购买的某支股票价格变化幅度达到5%时，系统将自动发送通知（包括新价格）给购买该股票的所有股民。
   *  
   * 试使用观察者模式设计并实现该系统。
   * </pre>
   *
   * @author colg
   */
  package cn.colg.learn._01;
  ```

- 目标类

  ```java
  package cn.colg.learn._01;
  
  import java.util.ArrayList;
  import java.util.List;
  
  import lombok.Getter;
  import lombok.Setter;
  import lombok.ToString;
  import lombok.experimental.Accessors;
  import lombok.extern.slf4j.Slf4j;
  
  /**
   * 目标类 - 股票
   *
   * @author colg
   */
  @Getter
  @Setter
  @ToString
  @Accessors(chain = true)
  @Slf4j
  public abstract class AbstractStock {
  
      /** 股票名称 */
      protected String name;
      /** 股票价格 */
      protected double price;
      /** 股票涨幅后的价格 */
      protected double gainPrice;
  
      /** 存储所有股民 */
      protected List<Observer> obs = new ArrayList<>();
  
      /**
       * 添加股民
       *
       * @param o
       * @return
       * @author colg
       */
      public AbstractStock addObserver(Observer o) {
          if (!obs.contains(o)) {
              log.info("添加股民 : {}", o.getName());
              obs.add(o);
          }
          return this;
      }
  
      /**
       * 删除股民
       *
       * @param o
       * @return
       * @author colg
       */
      public AbstractStock deleteObserver(Observer o) {
          log.info("删除股民 : {}", o.getName());
          obs.remove(o);
          return this;
      }
  
      /**
       * 通知所有股民
       * 
       * <pre>
       * notify() 关键字无法使用
       * </pre>
       *
       * @author colg
       */
      public abstract void notifyObserver(AbstractStock abstractStock);
  }
  ```

- 具体目标类

  ```java
  package cn.colg.learn._01;
  
  /**
   * 具体目标类
   *
   * @author colg
   */
  public class Stock extends AbstractStock {
  
      @Override
      public void notifyObserver(AbstractStock abstractStock) {
          for (Observer observer : obs) {
              observer.show(abstractStock);
          }
      }
  }
  ```

- 观察者类

  ```java
  package cn.colg.learn._01;
  
  /**
   * 抽象观察者
   *
   * @author colg
   */
  public interface Observer {
  
      /**
       * 获取名称
       *
       * @return
       * @author colg
       */
      String getName();
  
      /**
       * 设置名称
       *
       * @param name
       * @author colg
       */
      void setName(String name);
  
      /**
       * 声明响应方法
       *
       * @param abstractStock
       * @author colg
       */
      void updata(AbstractStock abstractStock);
  
      /**
       * 显示涨幅后的股票信息
       *
       * @param abstractStock
       * @author colg
       */
      void show(AbstractStock abstractStock);
  }
  ```

- 具体观察者类

  ```java
  package cn.colg.learn._01;
  
  import lombok.Getter;
  import lombok.Setter;
  import lombok.ToString;
  import lombok.extern.slf4j.Slf4j;
  
  /**
   * 具体观察者 - 股民
   *
   * @author colg
   */
  @Getter
  @Setter
  @ToString
  @Slf4j
  public class ShareHolder implements Observer {
  
      /** 股民名称 */
      private String name;
  
      public ShareHolder(String name) {
          this.name = name;
      }
  
      @Override
      public void updata(AbstractStock abstractStock) {
          // 当股票购买者所购买的某支股票价格变化幅度达到5%时，系统将自动发送通知（包括新价格）给购买该股票的所有股民。
          double price = abstractStock.getPrice();
          // 涨
          double rise = price * 1.05;
          // 跌
          double fall = price / 1.05;
          if (abstractStock.getGainPrice() < fall || abstractStock.getGainPrice() > rise) {
              abstractStock.notifyObserver(abstractStock);
          }
      }
  
      @Override
      public void show(AbstractStock abstractStock) {
          log.info("通知 : {}， {} 股票价格变化幅度达到5%", this.name, abstractStock.getName());
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
          // 定义股票
          AbstractStock stock = new Stock().setName("国寿周周盈")
                                           .setPrice(15)
                                           .setGainPrice(16);
          
          // 定义股民
          Observer o1, o2, o3;
          o1 = new ShareHolder("Jack");
          o2 = new ShareHolder("Rose");
          o3 = new ShareHolder("Tom");
          
          // 添加股民
          stock.addObserver(o1)
               .addObserver(o2);
          o1.updata(stock);
          log.info("-----------------------------------------------------------------");
          
          stock.addObserver(o3)
               .deleteObserver(o1);
          o3.updata(stock);
      }
  }
  ```

- 编译运行

  ```java
  2018-12-09 19:03:11.324 - INFO [           main] cn.colg.learn._01.AbstractStock          : 添加股民 : Jack
  2018-12-09 19:03:11.328 - INFO [           main] cn.colg.learn._01.AbstractStock          : 添加股民 : Rose
  2018-12-09 19:03:11.329 - INFO [           main] cn.colg.learn._01.ShareHolder            : 通知 : Jack， 国寿周周盈 股票价格变化幅度达到5%
  2018-12-09 19:03:11.329 - INFO [           main] cn.colg.learn._01.ShareHolder            : 通知 : Rose， 国寿周周盈 股票价格变化幅度达到5%
  2018-12-09 19:03:11.329 - INFO [           main] cn.colg.learn._01.Client                 : -----------------------------------------------------------------------------------
  2018-12-09 19:03:11.329 - INFO [           main] cn.colg.learn._01.AbstractStock          : 添加股民 : Tom
  2018-12-09 19:03:11.329 - INFO [           main] cn.colg.learn._01.AbstractStock          : 删除股民 : Jack
  2018-12-09 19:03:11.329 - INFO [           main] cn.colg.learn._01.ShareHolder            : 通知 : Rose， 国寿周周盈 股票价格变化幅度达到5%
  2018-12-09 19:03:11.329 - INFO [           main] cn.colg.learn._01.ShareHolder            : 通知 : Tom， 国寿周周盈 股票价格变化幅度达到5%
  ```
