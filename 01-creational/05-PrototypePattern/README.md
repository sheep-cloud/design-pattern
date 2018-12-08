# 原型模式 - Prototype Pattern

## 1. 概述

在使用原型模式时，需要首先创建一个原型对象，再通过复制这个原型对象来创建更多同类型的对象。

- 原型模式的定义如下：
  - 使用原型实例指定创建对象的种类，并且通过拷贝这些原型创建新的对象。原型模式是一种对象创建型模式。
- 原型模式的工作原理：
  - 将一个原型对象传给那个要发动创建的对象，这个要发动创建的对象通过请求原型对象拷贝自己来实现创建过程。
  - 原型模式是一种“另类”的创建型模式，创建克隆对象的工厂就是原型类自身，工厂方法由克隆方法来实现。
  - 通过克隆方法所创建的对象是全新的对象，它们在内存中拥有新的地址，通常对克隆所产生的对象进行修改对原型对象不会造成任何影响，每一个克隆对象都是相互独立的。通过不同的方式修改可以得到一系列相似但不完全相同的对象。

## 2. 结构图

**在原型模式结构图中包含如下几个角色：**

- **Prototype（抽象原型类）**
  - **它是声明克隆方法的接口，是所有具体原型类的公共父类，可以是抽象类也可以是接口，甚至还可以是具体实现类。**
- **ConcretePrototype（具体原型类）**
  - **它实现在抽象原型类中声明的克隆方法，在克隆方法中返回自己的一个克隆对象。**
- **Client（客户类）**
  - **让一个原型对象克隆自身从而创建一个新的对象，在客户类中只需要直接实例化或通过工厂方法等方式创建一个原型对象，再通过调用该对象的克隆方法即可得到多个相同的对象。由于客户类针对抽象原型类Prototype编程，因此用户可以根据需要选择具体原型类，系统具有较好的可扩展性，增加或更换具体原型类都很方便。**

## 3. 分类

### 3.1. 浅克隆

- 在浅克隆中，如果原型对象的成员变量是值类型，将复制一份给克隆对象；

- 如果原型对象的成员变量是引用类型，则将引用对象的地址复制一份给克隆对象，也就是说原型对象和克隆对象的成员变量指向相同的内存地址。

- 简单来说，在浅克隆中，当对象被复制时只复制它本身和其中包含的值类型的成员变量，而引用类型的成员对象并没有复制
- 在Java语言中，通过覆盖Object类的clone()方法可以实现浅克隆。

#### 3.1.1. 通用方式

通用的克隆实现方法是在具体原型类的克隆方法中实例化一个与自身类型相同的对象并将其返回，并将相关的参数传入新创建的对象中，保证它们的成员属性相同。

#### 3.1.2. JDK方式

所有的Java类都继承自java.lang.Object。事实上，Object类提供一个clone()方法，可以将一个Java对象复制一份。因此在Java中可以直接使用Object提供的clone()方法来实现对象的克隆，Java语言中的原型模式实现很简单。

需要注意的是能够实现克隆的Java类必须实现一个标识接口Cloneable，表示这个Java类支持被复制。如果一个类没有实现这个接口但是调用了clone()方法，Java编译器将抛出一个CloneNotSupportedException异常。

### 3.2. 深克隆

- 在深克隆中，无论原型对象的成员变量是值类型还是引用类型，都将复制一份给克隆对象，深克隆将原型对象的所有引用对象也复制一份给克隆对象。

- 简单来说，在深克隆中，除了对象本身被复制外，对象所包含的所有成员变量也将复制
- 在Java语言中，如果需要实现深克隆，可以通过序列化(Serialization)等方式来实现。

## 4. 总结

原型模式作为一种快速创建大量相同或相似对象的方式，在软件开发中应用较为广泛，很多软件提供的复制(Ctrl + C)和粘贴(Ctrl + V)操作就是原型模式的典型应用，下面对该模式的使用效果和适用情况进行简单的总结。

### 4.1. 优点

- 当创建新的对象实例较为复杂时，使用原型模式可以简化对象的创建过程，通过复制一个已有实例可以提高新实例的创建效率。
- 扩展性较好，由于在原型模式中提供了抽象原型类，在客户端可以针对抽象原型类进行编程，而将具体原型类写在配置文件中，增加或减少产品类对原有系统都没有任何影响。
- 原型模式提供了简化的创建结构，工厂方法模式常常需要有一个与产品类等级结构相同的工厂等级结构，而原型模式就不需要这样，原型模式中产品的复制是通过封装在原型类中的克隆方法实现的，无须专门的工厂类来创建产品。
- 可以使用深克隆的方式保存对象的状态，使用原型模式将对象复制一份并将其状态保存起来，以便在需要的时候使用（如恢复到某一历史状态），可辅助实现撤销操作。

### 4.2. 缺点

- 需要为每一个类配备一个克隆方法，而且该克隆方法位于一个类的内部，当对已有的类进行改造时，需要修改源代码，违背了“开闭原则”。
- 在实现深克隆时需要编写较为复杂的代码，而且当对象之间存在多重的嵌套引用时，为了实现深克隆，每一层对象对应的类都必须支持深克隆，实现起来可能会比较麻烦。

### 4.3. 适用场景

- 创建新对象成本较大（如初始化需要占用较长的时间，占用太多的CPU资源或网络资源），新的对象可以通过原型模式对已有对象进行复制来获得，如果是相似对象，则可以对其成员变量稍作修改。
- 如果系统要保存对象的状态，而对象的状态变化很小，或者对象本身占用内存较少时，可以使用原型模式配合备忘录模式来实现。
- 需要避免使用分层次的工厂类来创建分层次的对象，并且类的实例对象只有一个或很少的几个组合状态，通过复制原型对象得到新实例可能比使用构造函数创建一个新实例更加方便。

## 5. 示例

- 需求

  ```java
  /**
   * 原型模式
   * 
   * <pre>
   * 设计并实现一个客户类Customer，其中包含一个名为客户地址的成员变量，客户地址的类型为Address，
   * 用浅克隆和深克隆分别实现Customer对象的复制并比较这两种克隆方式的异同。
   * </pre>
   *
   * @author colg
   */
  package cn.colg.learn._01
  ```

- 抽象原型类可以是具体实现类

  ```java
  package cn.colg.learn._01;
  
  import java.io.Serializable;
  
  import lombok.AllArgsConstructor;
  import lombok.Getter;
  import lombok.NoArgsConstructor;
  import lombok.Setter;
  import lombok.ToString;
  
  /**
   * 地址类
   *
   * @author colg
   */
  @Getter
  @Setter
  @ToString
  @NoArgsConstructor
  @AllArgsConstructor
  public class Address implements Serializable {
  
      private static final long serialVersionUID = 1L;
  
      /** 国家 */
      private String country;
  }
  ```

  ```java
  package cn.colg.learn._01;
  
  import java.io.ByteArrayInputStream;
  import java.io.ByteArrayOutputStream;
  import java.io.IOException;
  import java.io.ObjectInputStream;
  import java.io.ObjectOutputStream;
  import java.io.Serializable;
  
  import lombok.Getter;
  import lombok.Setter;
  import lombok.ToString;
  import lombok.experimental.Accessors;
  
  /**
   * 客户类 - 抽象原型类可以是具体实现类
   *
   * @author colg
   */
  @Getter
  @Setter
  @ToString
  @Accessors(chain = true)
  public class Customer implements Serializable, Cloneable {
  
      private static final long serialVersionUID = 1L;
  
      /** 客户名称 */
      private String name;
  
      /** 客户地址 */
      private Address address;
  
      /**
       * 浅克隆
       *
       * @return
       * @throws CloneNotSupportedException
       * @author colg
       */
      public Customer shallowClone() throws CloneNotSupportedException {
          Customer customer = (Customer)super.clone();
          return customer;
      }
  
      /**
       * 深克隆
       *
       * @return
       * @throws IOException
       * @throws ClassNotFoundException
       * @author colg
       */
      public Customer deepClone() throws IOException, ClassNotFoundException {
          // 写入对象
          ByteArrayOutputStream baos = new ByteArrayOutputStream();
          ObjectOutputStream oos = new ObjectOutputStream(baos);
          oos.writeObject(this);
  
          // 读取对象
          ByteArrayInputStream bais = new ByteArrayInputStream(baos.toByteArray());
          ObjectInputStream ois = new ObjectInputStream(bais);
          return (Customer)ois.readObject();
      }
  }
  ```

- 客户端

  ```java
  package cn.colg.learn._01;
  
  import java.io.IOException;
  
  import lombok.extern.slf4j.Slf4j;
  
  /**
   * 客户端
   *
   * @author colg
   */
  @Slf4j
  public class Client {
      public static void main(String[] args) throws CloneNotSupportedException, ClassNotFoundException, IOException {
          Customer customer1, customer2, customer3, customer4;
          // 浅克隆
          customer1 = new Customer();
          customer1.setAddress(new Address("chian"));
          customer2 = customer1.shallowClone();
          log.info("customer1 : {}", customer1);
          log.info("customer2 : {}", customer2);
          log.info("浅克隆 : customer1 == customer2 : {}", customer1 == customer2);
          // true；浅克隆比较的是内存引用地址
          log.info("浅克隆 : customer1.getAddress() == customer2.getAddress() : {}", customer1.getAddress() == customer2.getAddress());
          log.info("----------------------------------------------------------------------------------------------------");
  
          // 深克隆
          customer3 = new Customer();
          customer3.setAddress(new Address("english"));
          customer4 = customer3.deepClone();
          log.info("customer3 : {}", customer3);
          log.info("customer4 : {}", customer4);
          log.info("深克隆 : customer3 == customer4 : {}", customer3 == customer4);
          // false；深克隆比较的是地址值
          log.info("深克隆 : customer3.getAddress() == customer4.getAddress() : {}", customer3.getAddress() == customer4.getAddress());
      }
  }
  ```

- 编译运行

  ```java
  2018-12-08 18:53:27.414 - INFO [           main] cn.colg.learn._01.Client                 : customer1 : Customer(name=null, address=Address(country=chian))
  2018-12-08 18:53:27.418 - INFO [           main] cn.colg.learn._01.Client                 : customer2 : Customer(name=null, address=Address(country=chian))
  2018-12-08 18:53:27.418 - INFO [           main] cn.colg.learn._01.Client                 : 浅克隆 : customer1 == customer2 : false
  2018-12-08 18:53:27.418 - INFO [           main] cn.colg.learn._01.Client                 : 浅克隆 : customer1.getAddress() == customer2.getAddress() : true
  2018-12-08 18:53:27.419 - INFO [           main] cn.colg.learn._01.Client                 : ----------------------------------------------------------------------------------------------------
  2018-12-08 18:53:27.428 - INFO [           main] cn.colg.learn._01.Client                 : customer3 : Customer(name=null, address=Address(country=english))
  2018-12-08 18:53:27.428 - INFO [           main] cn.colg.learn._01.Client                 : customer4 : Customer(name=null, address=Address(country=english))
  2018-12-08 18:53:27.428 - INFO [           main] cn.colg.learn._01.Client                 : 深克隆 : customer3 == customer4 : false
  2018-12-08 18:53:27.428 - INFO [           main] cn.colg.learn._01.Client                 : 深克隆 : customer3.getAddress() == customer4.getAddress() : false
  ```