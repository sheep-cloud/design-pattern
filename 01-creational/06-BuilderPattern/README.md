# 建造者模式 - Builder Pattern

## 1. 概述

建造者模式是较为复杂的创建型模式，它将客户端与包含多个组成部分（或部件）的复杂对象的创建过程分离，客户端无须知道复杂对象的内部组成部分与装配方式，只需要知道所需建造者的类型即可。

它关注如何一步一步创建一个的复杂对象，不同的具体建造者定义了不同的创建过程，且具体建造者相互独立，增加新的建造者非常方便，无须修改已有代码，系统具有较好的扩展性。

- 建造者模式定义如下：
  - 将一个复杂对象的构建与它的表示分离，使得同样的构建过程可以创建不同的表示。建造者模式是一种对象创建型模式。
  - 建造者模式一步一步创建一个复杂的对象，它允许用户只通过指定复杂对象的类型和内容就可以构建它们，用户不需要知道内部的具体构建细节。

## 2. 结构图

**在建造者模式结构图中包含如下几个角色：**

- **Builder（抽象建造者）**
  - **它为创建一个产品Product对象的各个部件指定抽象接口，在该接口中一般声明两类方法**
    - **一类方法是buildPartX()，它们用于创建复杂对象的各个部件；**
    - **另一类方法是getResult()，它们用于返回复杂对象。**
  - **Builder既可以是抽象类，也可以是接口。**
- **ConcreteBuilder（具体建造者）**
  - **它实现了Builder接口，实现各个部件的具体构造和装配方法，定义并明确它所创建的复杂对象，也可以提供一个方法返回创建好的复杂产品对象。**
- **Product（产品角色）**
  - **它是被构建的复杂对象，包含多个组成部件，具体建造者创建该产品的内部表示并定义它的装配过程。**
- **Director（指挥者）**
  - **指挥者又称为导演类，它负责安排复杂对象的建造次序，指挥者与抽象建造者之间存在关联关系，可以在其construct()建造方法中调用建造者对象的部件构造与装配方法，完成复杂对象的建造。**
  - **客户端一般只需要与指挥者进行交互，在客户端确定具体建造者的类型，并实例化具体建造者对象（也可以通过配置文件和反射机制），然后通过指挥者类的构造函数或者Setter方法将该对象传入指挥者类中。**

**在建造者模式的定义中提到了复杂对象，那么什么是复杂对象？简单来说，复杂对象是指那些包含多个成员属性的对象。**

## 3. 简化

- 省略Director（指挥者）
  - 为了简化系统结构，可以将Director和抽象建造者Builder进行合并，在Builder中提供逐步构建复杂产品对象的construct()方法。
  - 还有一种更简单的处理方法，可以将construct()方法的参数去掉，直接在construct()方法中调用buildPartX()方法
- 加入钩子方法
  - 钩子方法的返回类型通常为boolean类型，方法名一般为isXXX()，钩子方法定义在抽象建造者类中。可以更加精细地控制产品的创建过程。

## 4. 总结

建造者模式的核心在于如何一步步构建一个包含多个组成部件的完整对象，使用相同的构建过程构建不同的产品，在软件开发中，如果我们需要创建复杂对象并希望系统具备很好的灵活性和可扩展性可以考虑使用建造者模式。

### 4.1. 优点

- 在建造者模式中，客户端不必知道产品内部组成的细节，将产品本身与产品的创建过程解耦，使得相同的创建过程可以创建不同的产品对象。
- 每一个具体建造者都相对独立，而与其他的具体建造者无关，因此可以很方便地替换具体建造者或增加新的具体建造者，用户使用不同的具体建造者即可得到不同的产品对象。由于指挥者类针对抽象建造者编程，增加新的具体建造者无须修改原有类库的代码，系统扩展方便，符合“开闭原则”
- 可以更加精细地控制产品的创建过程。将复杂产品的创建步骤分解在不同的方法中，使得创建过程更加清晰，也更方便使用程序来控制创建过程。

### 4.2. 缺点

- 建造者模式所创建的产品一般具有较多的共同点，其组成部分相似，如果产品之间的差异性很大，例如很多组成部分都不相同，不适合使用建造者模式，因此其使用范围受到一定的限制。
- 如果产品的内部变化复杂，可能会导致需要定义很多具体建造者类来实现这种变化，导致系统变得很庞大，增加系统的理解难度和运行成本。

### 4.3. 适用场景

- 需要生成的产品对象有复杂的内部结构，这些产品对象通常包含多个成员属性。
- 需要生成的产品对象的属性相互依赖，需要指定其生成顺序。
- 对象的创建过程独立于创建该对象的类。在建造者模式中通过引入了指挥者类，将创建过程封装在指挥者类中，而不在建造者类和客户类中。
- 隔离复杂对象的创建和使用，并使得相同的创建过程可以创建不同的产品。

## 5. 示例（极简版）

- 需求

  ```java
  /**
   * 建造者模式
   * 
   * <pre>
   * 软件公司欲开发一个视频播放软件，为了给用户使用提供方便，该播放软件提供多种界面显示模式，如完整模式、精简模式、记忆模式。
   * 在不同的显示模式下主界面的组成元素有所差异：
   * 在完整模式下将显示菜单、播放列表、主窗口、控制条等，
   * 在精简模式下只显示主窗口和控制条，
   * 在记忆模式下将显示主窗口、控制条、收藏列表等。
   * 尝试使用建造者模式设计该软件。
   * </pre>
   *
   * @author colg
   */
  package cn.colg.learn._02;
  ```

- 抽象建造者

  ```java
  package cn.colg.learn._02;
  
  /**
   * 抽象建造者
   *
   * @author colg
   * @param <T> 建造对象类型
   */
  public interface Builder<T> {
  
      /**
       * 构建对象
       *
       * @return 被构建的对象
       * @author colg
       */
      T build();
  }
  ```

- 产品角色

  ```java
  package cn.colg.learn._02;
  
  import lombok.Getter;
  import lombok.Setter;
  import lombok.ToString;
  import lombok.experimental.Accessors;
  
  /**
   * 产品角色 - 视频播放软件
   *
   * @author colg
   */
  @Getter
  @Setter
  @ToString
  @Accessors(chain = true)
  public class Video {
  
      /** 菜单 */
      private String menu;
      /** 播放列表 */
      private String playList;
      /** 主窗口 */
      private String mainWindow;
      /** 控制条 */
      private String controlStrip;
      /** 收藏列表 */
      private String favoritesList;
  }
  ```

- 具体建造者

  ```java
  package cn.colg.learn._02.mode;
  
  import cn.colg.learn._02.Builder;
  import cn.colg.learn._02.Video;
  
  /**
   * 具体建造者 - 完整模式
   *
   * @author colg
   */
  public class FullModeBuilder implements Builder<Video> {
  
      @Override
      public Video build() {
          return new Video().setMenu("菜单")
                            .setPlayList("播放列表")
                            .setMainWindow("主窗口")
                            .setControlStrip("控制条");
      }
  }
  ```

  ```java
  package cn.colg.learn._02.mode;
  
  import cn.colg.learn._02.Video;
  import cn.hutool.core.lang.Builder;
  
  /**
   * 具体建造者 - 记忆模式
   *
   * @author colg
   */
  public class MemoryModeBuilder implements Builder<Video> {
  
      @Override
      public Video build() {
          return new Video().setMainWindow("主窗口")
                            .setControlStrip("控制条")
                            .setFavoritesList("收藏列表");
      }
  }
  ```

  ```java
  package cn.colg.learn._02.mode;
  
  import cn.colg.learn._02.Builder;
  import cn.colg.learn._02.Video;
  
  /**
   * 具体建造者 - 精简模式
   *
   * @author colg
   */
  public class MiniModeBuilder implements Builder<Video> {
  
      @Override
      public Video build() {
          return new Video().setMainWindow("主窗口")
                            .setControlStrip("控制条");
      }
  }
  ```

- 配置文件

  ```ini
  learn._02=cn.colg.learn._02.mode.MiniModeBuilder
  ```

- 客户端

  ```java
  package cn.colg.learn._02;
  
  import cn.colg.util.IniUtil;
  import lombok.extern.slf4j.Slf4j;
  
  /**
   * 客户端
   *
   * @author colg
   */
  @Slf4j
  public class Client {
      @SuppressWarnings("unchecked")
      public static void main(String[] args) {
          Builder<Video> builder = (Builder<Video>)IniUtil.getBean("learn._02");
          Video video = builder.build();
          log.info("video : {}", video);
      }
  }
  ```

- 编译运行

  ```java
  2018-12-08 19:13:46.909 - INFO [           main] cn.colg.learn._01.Client                 : video : Video(menu=null, playList=null, mainWindow=主菜单, controlStrip=控制条, favoritesList=null)
  ```
