# 组合模式 - Composite Pattern

## 1. 概述

对于树形结构，当容器对象（如文件夹）的某一个方法被调用时，将遍历整个树形结构，寻找也包含这个方法的成员对象（可以是容器对象，也可以是叶子对象）并调用执行，牵一而动百，其中使用了递归调用的机制来对整个结构进行处理。由于容器对象和叶子对象在功能上的区别，在使用这些对象的代码中必须有区别地对待容器对象和叶子对象，而实际上大多数情况下我们希望一致地处理它们，因为对于这些对象的区别对待将会使得程序非常复杂。组合模式为解决此类问题而诞生，它可以让叶子对象和容器对象的使用具有一致性。

- 组合模式定义如下：
  - 组合多个对象形成树形结构以表示具有“整体—部分”关系的层次结构。
  - 组合模式对单个对象（即叶子对象）和组合对象（即容器对象）的使用具有一致性，组合模式又可以称为“整体—部分”(Part-Whole)模式，它是一种对象结构型模式。
- 在组合模式中引入了抽象构件类Component，它是所有容器类和叶子类的公共父类，客户端针对Component进行编程。

## 2. 结构图

**在组合模式结构图中包含如下几个角色：**

- **Component（抽象构件）**
  - **它可以是接口或抽象类，为叶子构件和容器构件对象声明接口，在该角色中可以包含所有子类共有行为的声明和实现。**
  - **在抽象构件中定义了访问及管理它的子构件的方法，如增加子构件、删除子构件、获取子构件等。**
- **Leaf（叶子构件）**
  - **它在组合结构中表示叶子节点对象，叶子节点没有子节点，它实现了在抽象构件中定义的行为。**
  - **对于那些访问及管理子构件的方法，可以通过异常等方式进行处理。**
- **Composite（容器构件）**
  - **它在组合结构中表示容器节点对象，容器节点包含子节点，其子节点可以是叶子节点，也可以是容器节点，它提供一个集合用于存储子节点，实现了在抽象构件中定义的行为，包括那些访问及管理子构件的方法，在其业务方法中可以递归调用其子节点的业务方法。**

**组合模式的关键是定义了一个抽象构件类，它既可以代表叶子，又可以代表容器，而客户端针对该抽象构件类进行编程，无须知道它到底表示的是叶子还是容器，可以对其进行统一处理。同时容器对象与抽象构件类之间还建立一个聚合关联关系，在容器对象中既可以包含叶子，也可以包含容器，以此实现递归组合，形成一个树形结构。**

**如果不使用组合模式，客户端代码将过多地依赖于容器对象复杂的内部实现结构，容器对象内部实现结构的变化将引起客户代码的频繁变化，带来了代码维护复杂、可扩展性差等弊端。组合模式的引入将在一定程度上解决这些问题。**

## 3. 简化

- 透明组合模式
  - 透明组合模式中，抽象构件Component中声明了所有用于管理成员对象的方法，包括add()，remove()以及getChild()等方法，这样做的好处是确保所有的构件类都有相同的接口。在客户端看来，叶子对象与容器对象所提供的方法是一致的，客户端可以相同地对待所有的对象。透明组合模式也是组合模式的标准形式，虽然上面的解决方案一在客户端可以有不透明的实现方法，但是由于在抽象构件中包含add()、remove()等方法，因此它还是透明组合模式
  - 透明组合模式的缺点是不够安全，因为叶子对象和容器对象在本质上是有区别的。叶子对象不可能有下一个层次的对象，即不可能包含成员对象，因此为其提供add()、remove()以及getChild()等方法是没有意义的，这在编译阶段不会出错，但在运行阶段如果调用这些方法可能会出错（如果没有提供相应的错误处理代码）。
- 安全组合模式
  - 安全组合模式中，在抽象构件Component中没有声明任何用于管理成员对象的方法，而是在Composite类中声明并实现这些方法。这种做法是安全的，因为根本不向叶子对象提供这些管理成员对象的方法，对于叶子对象，客户端不可能调用到这些方法，这就是解决方案二所采用的实现方式。
  - 安全组合模式的缺点是不够透明，因为叶子构件和容器构件具有不同的方法，且容器构件中那些用于管理成员对象的方法没有在抽象构件类中定义，因此客户端不能完全针对抽象编程，必须有区别地对待叶子构件和容器构件。在实际应用中，安全组合模式的使用频率也非常高，在Java AWT中使用的组合模式就是安全组合模式。

## 4. 总结

组合模式使用面向对象的思想来实现树形结构的构建与处理，描述了如何将容器对象和叶子对象进行递归组合，实现简单，灵活性好。

由于在软件开发中存在大量的树形结构，因此组合模式是一种使用频率较高的结构型设计模式，Java SE中的AWT和Swing包的设计就基于组合模式，在这些界面包中为用户提供了大量的容器构件（如Container）和成员构件（如Checkbox、Button和TextComponent等）

### 4.1. 优点

- 组合模式可以清楚地定义分层次的复杂对象，表示对象的全部或部分层次，它让客户端忽略了层次的差异，方便对整个层次结构进行控制。
- 客户端可以一致地使用一个组合结构或其中单个对象，不必关心处理的是单个对象还是整个组合结构，简化了客户端代码。
- 在组合模式中增加新的容器构件和叶子构件都很方便，无须对现有类库进行任何修改，符合“开闭原则”。
- 组合模式为树形结构的面向对象实现提供了一种灵活的解决方案，通过叶子对象和容器对象的递归组合，可以形成复杂的树形结构，但对树形结构的控制却非常简单。

### 4.2. 缺点

- 在增加新构件时很难对容器中的构件类型进行限制。有时候我们希望一个容器中只能有某些特定类型的对象，例如在某个文件夹中只能包含文本文件，使用组合模式时，不能依赖类型系统来施加这些约束，因为它们都来自于相同的抽象层，在这种情况下，必须通过在运行时进行类型检查来实现，这个实现过程较为复杂。

### 4.3. 适用场景

- 在具有整体和部分的层次结构中，希望通过一种方式忽略整体与部分的差异，客户端可以一致地对待它们。
- 在一个使用面向对象语言开发的系统中需要处理一个树形结构。
- 在一个系统中能够分离出叶子对象和容器对象，而且它们的类型不固定，需要增加一些新的类型。

## 5. 示例

- 需求

  ```java
  /**
   * 组合模式
   * 
   * <pre>
   * 软件公司欲开发一个界面控件库，界面控件分为两大类，一类是单元控件，例如按钮、文本框等，一类是容器控件，例如窗体、中间面板等，试用组合模式设计该界面控件库。
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
   * 抽象构件 - 界面控件
   *
   * @author colg
   */
  public abstract class AbstractComponent {
  
      /**
       * 显示界面控件
       *
       * @author colg
       */
      public abstract void display();
  }
  ```

- 容器构件

  ```java
  package cn.colg.learn._01;
  
  import java.util.ArrayList;
  import java.util.List;
  
  import lombok.AllArgsConstructor;
  import lombok.Getter;
  import lombok.NoArgsConstructor;
  import lombok.Setter;
  import lombok.ToString;
  import lombok.experimental.Accessors;
  import lombok.extern.slf4j.Slf4j;
  
  /**
   * 容器构件 - 窗体
   *
   * @author colg
   */
  @Getter
  @Setter
  @ToString
  @NoArgsConstructor
  @AllArgsConstructor
  @Accessors(chain = true)
  @Slf4j
  public class Form extends AbstractComponent {
  
      /** 窗体名称 */
      private String name;
  
      /** 存储AbstractComponent类型的成员 */
      private List<AbstractComponent> forms = new ArrayList<>();
  
      public Form(String name) {
          this.name = name;
      }
  
      public Form add(AbstractComponent component) {
          forms.add(component);
          return this;
      }
  
      public Form remove(AbstractComponent component) {
          forms.remove(component);
          return this;
      }
  
      public AbstractComponent getChild(int index) {
          return forms.get(index);
      }
  
      @Override
      public void display() {
          log.info("窗体名称 : {}", name);
  
          // 递归调用成员构件的display()方法
          for (AbstractComponent component : forms) {
              component.display();
          }
      }
  }
  ```

  ```java
  
  ```

- 叶子构件

  ```java
  package cn.colg.learn._01;
  
  import lombok.AllArgsConstructor;
  import lombok.Getter;
  import lombok.NoArgsConstructor;
  import lombok.Setter;
  import lombok.ToString;
  import lombok.experimental.Accessors;
  import lombok.extern.slf4j.Slf4j;
  
  /**
   * 叶子构件 - 单元控件（按钮）
   *
   * @author colg
   */
  @Getter
  @Setter
  @ToString
  @NoArgsConstructor
  @AllArgsConstructor
  @Accessors(chain = true)
  @Slf4j
  public class Button extends AbstractComponent {
  
      /** 按钮名称 */
      private String name;
  
      @Override
      public void display() {
          log.info("显示按钮 : {}", name);
      }
  }
  ```

  ```java
  package cn.colg.learn._01;
  
  import lombok.AllArgsConstructor;
  import lombok.Getter;
  import lombok.NoArgsConstructor;
  import lombok.Setter;
  import lombok.ToString;
  import lombok.experimental.Accessors;
  import lombok.extern.slf4j.Slf4j;
  
  /**
   * 叶子构件 - 单元控件（文本框）
   *
   * @author colg
   */
  @Getter
  @Setter
  @ToString
  @NoArgsConstructor
  @AllArgsConstructor
  @Accessors(chain = true)
  @Slf4j
  public class TextBox extends AbstractComponent {
  
      /** 文本框名称 */
      private String name;
  
      @Override
      public void display() {
          log.info("显示文本框 : {}", name);
      }
  }
  ```

- 客户端

  ```java
  package cn.colg.learn._01;
  
  /**
   * 客户端
   *
   * @author colg
   */
  public class Client {
      public static void main(String[] args) {
          AbstractComponent unit1, unit2, unit3, unit4;
          Form form1, form2;
          form1 = new Form("窗体_1");
          form2 = new Form("窗体_2");
          
          Panel panel1;
          panel1 = new Panel("面板_1");
          
          unit1 = new Button("按钮_1");
          unit2 = new Button("按钮_2");
          
          unit3 = new TextBox("文本框_1");
          unit4 = new TextBox("文本框_2");
          
          form2.add(unit1)
               .add(unit2)
               .add(unit3)
               .add(unit4);
          
          form1.add(form2)
               .add(panel1);
          
          form1.display();
      }
  }
  ```

- 编译运行

  ```ini
  2018-12-06 03:17:35.672 - INFO [           main] cn.colg.learn._01.Form                   : 窗体名称 : 窗体_1
  2018-12-06 03:17:35.680 - INFO [           main] cn.colg.learn._01.Form                   : 窗体名称 : 窗体_2
  2018-12-06 03:17:35.680 - INFO [           main] cn.colg.learn._01.Button                 : 显示按钮 : 按钮_1
  2018-12-06 03:17:35.681 - INFO [           main] cn.colg.learn._01.Button                 : 显示按钮 : 按钮_2
  2018-12-06 03:17:35.681 - INFO [           main] cn.colg.learn._01.TextBox                : 显示文本框 : 文本框_1
  2018-12-06 03:17:35.681 - INFO [           main] cn.colg.learn._01.TextBox                : 显示文本框 : 文本框_2
  2018-12-06 03:17:35.681 - INFO [           main] cn.colg.learn._01.Panel                  : 面板名称 : 面板_1
  ```
