# 单例模式 - SingletonPattern

## 1. 概述

- 单例模式定义如下：
  - 确保某一个类只有一个实例，而且自行实例化并向整个系统提供这个实例，这个类称为单例类，它提供全局访问的方法。单例模式是一种对象创建型模式。
- 单例模式有三个要点：
  - 某个类只能有一个实例；
  - 它必须自行创建这个实例；
  - 它必须自行向整个系统提供这个实例。

## 2. 结构图

**单例模式结构图中只包含一个单例角色：**

- **Singleton（单例）**
  - **在单例类的内部实现只生成一个实例，同时它提供一个静态的getInstance()工厂方法，让客户可以访问它的唯一实例；**
  - **为了防止在外部对其实例化，将其构造函数设计为私有；**
  - **在单例类内部定义了一个Singleton类型的静态对象，作为外部共享的唯一实例。**

​	

## 3. 分类

### 3.1. 恶汉式 - Easer

当类被加载时，静态变量instance会被初始化，此时类的私有构造函数会被调用，单例类的唯一实例将被创建。如果使用饿汉式单例来实现负载均衡器LoadBalancer类的设计，则不会出现创建多个单例对象的情况，可确保单例对象的唯一性。

### 3.2. 懒汉式 - Lazy

懒汉式单例在第一次调用getInstance()方法时实例化，在类加载时并不自行实例化，这种技术又称为延迟加载(Lazy Load)技术

### 3.3. 初始化需求持有者 - IoDH

在IoDH中，在单例类中增加一个静态(static)内部类，在该内部类中创建单例对象，再将该单例对象通过getInstance()方法返回给外部使用

## 4. 总结

单例模式作为一种目标明确、结构简单、理解容易的设计模式，在软件开发中使用频率相当高，在很多应用软件和框架中都得以广泛应用。

### 4.1. 优点

- 单例模式提供了对唯一实例的受控访问。因为单例类封装了它的唯一实例，所以它可以严格控制客户怎样以及何时访问它。
- 由于在系统内存中只存在一个对象，因此可以节约系统资源，对于一些需要频繁创建和销毁的对象单例模式无疑可以提高系统的性能。
- 允许可变数目的实例。基于单例模式我们可以进行扩展，使用与单例控制相似的方法来获得指定个数的对象实例，既节省系统资源，又解决了单例单例对象共享过多有损性能的问题。

### 4.2. 缺点

- 由于单例模式中没有抽象层，因此单例类的扩展有很大的困难。
- 单例类的职责过重，在一定程度上违背了“单一职责原则”。因为单例类既充当了工厂角色，提供了工厂方法，同时又充当了产品角色，包含一些业务方法，将产品的创建和产品的本身的功能融合到一起。
- 现在很多面向对象语言(如Java、C#)的运行环境都提供了自动垃圾回收的技术，因此，如果实例化的共享对象长时间不被利用，系统会认为它是垃圾，会自动销毁并回收资源，下次利用时又将重新实例化，这将导致共享的单例对象状态的丢失。

### 4.3. 适用场景

- 系统只需要一个实例对象，如系统要求提供一个唯一的序列号生成器或资源管理器，或者需要考虑资源消耗太大而只允许创建一个对象。
- 客户调用类的单个实例只允许使用一个公共访问点，除了该公共访问点，不能通过其他途径访问该实例。

## 5. 示例

### 5.1. 需求

```java
/**
 * 单例模式
 * 
 * <pre>
 * 分别使用饿汉式单例、带双重检查锁定机制的懒汉式单例以及IoDH技术实现单例模式。
 * </pre>
 *
 * @author colg
 */
package cn.colg.learn._01;
```

### 5.2. 饿汉式 - Easer

```java
package cn.colg.learn._01.singleton;

/**
 * 单例模式（饿汉式）
 *
 * @author colg
 */
public class EagerSingleton {

    /** 私有静态成员变量，存储唯一实例 */
    public static EagerSingleton instance = new EagerSingleton();

    /** 私有构造函数 */
    private EagerSingleton() {}

    /**
     * 获取唯一实例；类加载时创建单例对象
     *
     * @return
     * @author colg
     */
    public static EagerSingleton getInstance() {
        return instance;
    }
}
```

### 5.3. 懒汉式 - Lazy

```java
package cn.colg.example.learn._01.singleton;

/**
 * 负载均衡服务器 - 单例模式（懒汉式，带双重检查锁定）
 *
 * @author colg
 */
public class LazySingleton {

    /** 私有静态变量，存储唯一实例 */
    private static volatile LazySingleton instance = null;

    /** 私有构造函数 */
    private LazySingleton() {}

    /**
     * 获取唯一实例，调用时创建单例对象
     *
     * @return
     * @author colg
     */
    public static LazySingleton getInstance() {
        // 双重检查
        if (instance == null) {
            synchronized (LazySingleton.class) {
                if (instance == null) {
                    instance = new LazySingleton();
                }
            }
        }
        return instance;
    }
}
```

### 5.4. 初始化需求持有者 - IoDH

```java
package cn.colg.learn._01.singleton;

/**
 * 单例模式（IoDH技术）
 *
 * @author colg
 */
public class IodhSingleton {

    /** 私有构造函数 */
    private IodhSingleton() {}

    /**
     * 通过静态内部类持有唯一实例，由Java虚拟机来保证其线程安全性。
     *
     * @author colg
     */
    private static class HolderClass {
        private static IodhSingleton instance = new IodhSingleton();
    }

    /**
     * 获取唯一实例，调用时创建单例对象
     *
     * @return
     * @author colg
     */
    public static IodhSingleton getInstance() {
        return HolderClass.instance;
    }

```

### 5.4. 客户端

```java
package cn.colg.example.learn._01;

import cn.colg.example.learn._01.singleton.EagerSingleton;
import cn.colg.example.learn._01.singleton.IodhSingleton;
import cn.colg.example.learn._01.singleton.LazySingleton;
import lombok.extern.slf4j.Slf4j;

/**
 * 客户端
 *
 * @author colg
 */
@Slf4j
public class Client {
    public static void main(String[] args) {
        EagerSingleton eagerSingleton1, eagerSingleton2;
        eagerSingleton1 = EagerSingleton.getInstance();
        eagerSingleton2 = EagerSingleton.getInstance();
        log.info("单例 ? {}", eagerSingleton1 == eagerSingleton2);

        LazySingleton lazySingleton1, lazySingleton2;
        lazySingleton1 = LazySingleton.getInstance();
        lazySingleton2 = LazySingleton.getInstance();
        log.info("单例 ? {}", lazySingleton1 == lazySingleton2);

        IodhSingleton iodhSingLeton1, iodhSingLeton2;
        iodhSingLeton1 = IodhSingleton.getInstance();
        iodhSingLeton2 = IodhSingleton.getInstance();
        log.info("单例 ? {}", iodhSingLeton1 == iodhSingLeton2);
    }
}
```

### 5.5. 编译运行

```ini
2018-12-05 02:10:53.475 - INFO [main] cn.colg.example.learn._01.Client         : 单例 ? true
2018-12-05 02:10:53.481 - INFO [main] cn.colg.example.learn._01.Client         : 单例 ? true
2018-12-05 02:10:53.482 - INFO [main] cn.colg.example.learn._01.Client         : 单例 ? true

```

