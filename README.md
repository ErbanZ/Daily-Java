# JavaGuide练习

## Java泛型

- 泛型类
- 泛型接口
- 泛型方法

## Java基础

### 2.1 标识符 & 关键字

** 在 eclipse 创建一个新包时，java 中 package-info.java 作用？ **

总结下，大概的情况就是 `package-info.java` 文件为包级文档和包级别注释提供一个地方。而且该文件唯一必须包含的是包的声明。

- 包文档
- 包注释

#### 标识符

标识符的第一个符号为字母、下划线和美元符号，后面可以是任何字母、数字、美元符号或下划线。

Java 区分大小写，因此 myvar 和 MyVar 是两个不同的标识符。

提示：标识符命名时，切记不能以数字开头，也不能使用任何 Java 关键字作为标识符，而且不能赋予标识符任何标准的方法名。

例如以下合法与不合法标识符。

- 合法标识符：date、$2011、\_date、D\_$date 等。
- 不合法的标识符：123.com、2com、for、if 等。

#### 关键字

关键字（或者保留字）是对编译器有特殊意义的固定单词，不能在程序中做其他目的使用。关键字具有专门的意义和用途，和自定义的标识符不同，不能当作一般的标识符来使用。

Java 语言目前定义了 51 个关键字，这些关键字不能作为变量名、类名和方法名来使用。以下对这些关键字进行了分类。

1. 数据类型：boolean、int、long、short、byte、float、double、char、class、interface
2. 流程控制：if、else、do、while、for、switch、case、default、break、continue、return、try、catch、finally
3. 修饰符：public、protected、private、final、void、static、strict、abstract、transient、synchronized、volatile、native
4. 动作：package、import、throw、throws、extends、implements、this、supper、instanceof、new
5. 保留字：true、false、null、goto、const

### 2.2 注释

- 单行注释

```
// 这是单行注释
// 以双斜杠 “//” 标识，只能注释一行内容，用在注释信息内容少的地方

```

- 多行注释

```
/*
 * 这是多行注释
 * 包含在 “/\*” 和 “\*/” 之间，能注释很多行的内容。为了可读性比较好，一般首行和尾行不写注释信息（这样也比较美观好看）
 */
 
```

- 文档注释

```
/**
 * 这是文档注释
 * 包含在 “/\*\*” 和 “\*/” 之间，也能注释多行内容，一般用在类、方法和变量上面，用来描述其作用。
 * 注释后，鼠标放在类和变量上面会自动显示出我们注释的内容
 */

```

在 Java 中，一行注释以双斜杠 “//” 标识；多行注释包含在 “/\*” 和 “\*/” 之间；文档注释包含在 “/\*\*” 和 “\*/” 之间。当编译器执行到 “//” 时，就会忽略该行 “//” 之后的所有文本；当执行到 “/\*” 时，会扫描下一个 “\*/” 并忽略 “/\*” 和 “\*/” 之间的任何文本；当执行到 “/\*\*” 时，也会扫描下一个 “\*/” 并忽略 “/\*\*” 和 “\*/” 之间的任何文本内容。

### 2.3 Javadoc文档注释

[Javadoc简介](http://c.biancheng.net/view/6262.html)

### 2.4 常量

#### 常量值

##### 整型常量值

##### 实型常量值

##### 布尔型常量值

##### 字符型 & 字符串常量值

#### 定义常量

Java 语言使用 final 关键字来定义一个常量，其语法如下所示：

```
final dataType variableName = value
```

** 常量类型： **

- 静态常量
  使用在 final 之前 public static 修饰。public static 修饰的常量作用域是全局的，不需要创建对象就可以访问它

- 成员常量
  作用域类似于成员变量，但不能修改

- 局部常量
  作用域类似于局部变量，但不能修改

** 在定义常量时，需要注意如下内容： **

- 在定义常量时就需要对该常量进行初始化。
- final 关键字不仅可以用来修饰基本数据类型的常量，还可以用来修饰对象的引用或者方法。
- 为了与变量区别，常量取名一般都用大写字符。


### 2.5 变量

#### 变量声明

#### 变量赋值

#### 变量的作用域

##### 成员变量

- 全局变量
- 静态变量

##### 局部变量

### 2.6 数据类型

#### 基本数据类型

- 整数类型
- 浮点类型
- 布尔类型
- 字符类型


#### 引用数据类型

- 数组
- 类
- 接口
- null
  ···

#### 数据类型转换

[类型转换](http://c.biancheng.net/view/796.html)

### 2.7 运算符

#### 算数运算符

##### 一元运算符

算术一元运算一共有 3 个，分别是 -、++ 和 --。具体说明参见表 1。


| 运 算 符 | 名 称    | 说 明                        | 例 子      |
| -------- | -------- | ---------------------------- | ---------- |
| \-       | 取反符号 | 取反运算                     | b=-a       |
| ++       | 自加一   | 先取值再加一，或先加一再取值 | a++ 或 ++a |
| \--      | 自减一   | 先取值再减一，或先减一再取值 | a-- 或 --a |


##### 二元运算符

Java 语言中算术运算符的功能是进行算术运算，除了经常使用的加（+）、减（-）、乘（\*）和除（\\）外，还有取模运算（％）。加（+）、减（-）、乘（\*）、除（\\）和我们平常接触的数学运算具有相同的含义。具体说明参见表 2。


| 运 算 符 | 名 称 | 说 明                                                    | 例 子  |
| -------- | ----- | -------------------------------------------------------- | ------ |
| +        | 加    | 求 a 加 b 的和，还可用于 String 类型，进行字符串连接操作 | a + b  |
| \-       | 减    | 求 a 减 b 的差                                           | a - b  |
| \*       | 乘    | 求 a 乘以 b 的积                                         | a \* b |
| /        | 除    | 求 a 除以 b 的商                                         | a / b  |
| %        | 取余  | 求 a 除以 b 的余数                                       | a % b  |


##### 算术赋值运算符

算术赋值运算符只是一种简写，一般用于变量自身的变化，具体说明参见表 3。


| 运 算 符 | 名 称    | 例 子            |
| -------- | -------- | ---------------- |
| +=       | 加赋值   | a += b、a += b+3 |
| \-=      | 减赋值   | a -= b           |
| \*=      | 乘赋值   | a \*= b          |
| /=       | 除赋值   | a /= b           |
| %=       | 取余赋值 | a %= b           |


#### 赋值运算符


#### 逻辑运算符

逻辑运算符是对布尔型变量进行运算，其结果也是布尔型，具体如表 1 所示。


| 运算符 | 用法   | 含义   | 说明                                               | 实例       | 结果  |
| ------ | ------ | ------ | -------------------------------------------------- | ---------- | ----- |
| &&     | a&&b   | 短路与 | ab 全为 true 时，计算结果为 true，否则为 false。   | 2>1&&3<4   | true  |
| \|\|   | a\|\|b | 短路或 | ab 全为 false 时，计算结果为 false，否则为 true。  | 2<1\|\|3>4 | false |
| !      | !a     | 逻辑非 | a 为 true 时，值为 false，a 为 false 时，值为 true | !(2>4)     | true  |
| \|     | a\|b   | 逻辑或 | ab 全为 false 时，计算结果为 false，否则为 true    | 1>2\|3>5   | false |
| &      | a&b    | 逻辑与 | ab 全为 true 时，计算结果为 true，否则为 false     | 1<2&3<5    | true  |

#### 关系运算符



#### 自增 & 自减运算符


#### 位运算符

位逻辑运算符包含 4 个：&（与）、|（或）、~（非）和 ^（异或）。除了 ~（即位取反）为单目运算符外，其余都为双目运算符。表 1 中列出了它们的基本用法。


##### 位逻辑运算符

| 运算符 | 含义                    | 实例  | 结果 |
| ------ | ----------------------- | ----- | ---- |
| &      | 按位进行与运算（AND）   | 4 & 5 | 4    |
| \|     | 按位进行或运算（OR）    | 4     | 5    |
| ^      | 按位进行异或运算（XOR） | 4 ^ 5 | 1    |
| ~      | 按位进行取反运算（NOT） | ~ 4   | \-5  |


##### 位移运算符

##### 复合位赋值运算符

#### 条件运算符

##### 三目运算符

#### 运算符优先级

#### 直接量

[直接量](http://c.biancheng.net/view/5732.html)

关于字符串直接量有一点需要指出，当程序第一次使用某个字符串直接量时，Java 会使用常量池（constant pool）来缓存该字符串直接量，如果程序后面的部分需要用到该字符串直接量时，Java 会直接使用常量池（constantpool）中的字符串直接量。

提示：

- 由于 String 类是一个典型的不可变类，因此 String 对象创建出来的就不可能改变，因此无需担心共享 String 对象会导致混乱。
- 常量池（constant pool）指的是在编译期被确定，并被保存在已编译的 .class 文件中的一些数据，它包括关于类、方法、接口中的常量，也包括字符串直接量。

### 3 流程控制

#### if else & switch case

#### while & do while & for & for-each

- while：

![img](http://c.biancheng.net/uploads/allimg/180928/3-1P92QHR5F9.jpg)

- do while：

  ![img](http://c.biancheng.net/uploads/allimg/180928/3-1P92QH615B1.jpg)

- for：

  ![img](http://c.biancheng.net/uploads/allimg/180929/3-1P92Z93211K2.jpg)

- for each：

  ![img](http://c.biancheng.net/uploads/allimg/180929/3-1P929101250L5.jpg)

#### return & break & continue



**return**：return 关键字并不是专门用于结束循环的，return 语句用于终止函数的执行或退出类的方法，并把控制权返回该方法的调用者。如果这个方法带有返回类型，return 语句就必须返回这个类型的值；如果这个方法没有返回值，可以使用没有表达式的 return 语句。



**break**：某些时候需要在某种条件出现时强行终止循环，而不是等到循环条件为 false 时才退出循环。此时，可以使用 break 来完成这个功能。break 用于完全结束一个循环，跳出循环体。不管是哪种循环，一旦在循环体中遇到 break，系统将完全结束该循环，开始执行循环之后的代码。

- 带标签的break



**continue**：continue 语句是跳过循环体中剩余的语句而强制执行下一次循环，其作用为结束本次循环，即跳过循环体中下面尚未执行的语句，接着进行下一次是否执行循环的判定。

continue 语句类似于 break 语句，但它只能出现在循环体中。它与 break 语句的区别在于：continue 并不是中断循环语句，而是中止当前迭代的循环，进入下一次的迭代。简单来讲，continue 是忽略循环语句的当次循环。

- 带标签的continue



### 4 字符串处理

#### 4.1 定义字符串

#### 4.2 String <-> int

valueOf()

parse()

toString()

#### 4.3 字符串拼接

#### 4.4 字符串长度

#### 4.5 大小写转换

#### 4.6 去掉空格

String.trim()方法

#### 4.7 截取子串

1. String.substring(int beginIndex) 形式
2. String.substring(int beginIndex，int endIndex) 形式

#### 4.8 分割子串

String.split()

#### 4.9 字符串替换

String.replace(String oldChar, String newChar)

replaceFirst()

replaceAll()



实例：

```java
public static void main(String[] args) {
        // 定义原始字符串
        String intro = "今天时星其天，外面时下雨天。妈米去买菜了，漏网在家写作业。" + "语文作业时”其”写 5 行，数学使第 10 页。";

        // 将文本中的所有"时"和"使"都替换为"是"
        String newStrFirst = intro.replaceAll("[时使]", "是");

        // 将文本中的所有"妈米"改为"妈妈"
        String newStrSecond = newStrFirst.replaceAll("妈米", "妈妈");

        // 将文本中的所有"漏网"改为"留我"
        String newStrThird = newStrSecond.replaceAll("漏网", "留我");

        // 将文本中第一次出现的"其"改为"期"
        String newStrFourth = newStrThird.replaceFirst("[其]", "期");

        // 输出最终字符串
        System.out.println(newStrFourth);
        }

// 输出：今天是星期天，外面是下雨天。妈妈去买菜了，留我在家写作业。语文作业是”其”写 5 行，数学是第 10 页。
```



#### 4.10 字符串比较

equals() 和 == 区别：理解 equals() 方法和`==`运算符执行的是两个不同的操作是重要的。如同刚才解释的那样，equals() 方法比较字符串对象中的字符。而`==`运算符比较两个对象引用看它们是否引用相同的实例。

```java
String s1 = "Hello";
        String s2 = new String(s1);
        System.out.println(s1.equals(s2)); // 输出true
        System.out.println(s1 == s2); // 输出false
```



#### 4.11 字符串查找

```java
str.indexOf(value)
        str.indexOf(value,int fromIndex)
```

其中，str 表示指定字符串；value 表示待查找的字符（串）；fromIndex 表示查找时的起始索引，如果不指定 fromIndex，则默认从指定字符串中的开始位置（即 fromIndex 默认为 0）开始查找。



#### 4.12 StringBuffer类

StringBuffer 类是可变字符串类，创建 StringBuffer 类的对象后可以随意修改字符串的内容。每个 StringBuffer 类的对象都能够存储指定容量的字符串，如果字符串的长度超过了 StringBuffer 类对象的容量，则该对象的容量会自动扩大。StringBuffer 类可以比 String 类更高效地处理字符串。

构造函数：

```java
// 定义一个空的字符串缓冲区，含有16个字符的容量
StringBuffer str1 = new StringBuffer();

// 定义一个含有10个字符容量的字符串缓冲区
        StringBuffer str2 = new StringBuffer(10);

// 定义一个含有(16+4)的字符串缓冲区，"青春无悔"为4个字符
        StringBuffer str3 = new StringBuffer("青春无悔");
        /*
         *输出字符串的容量大小
         *capacity()方法返回字符串的容量大小
         */
        System.out.println(str1.capacity());    // 输出 16
        System.out.println(str2.capacity());    // 输出 10
        System.out.println(str3.capacity());    // 输出 20
```



- 追加字符串

  ```java
  StringBuffer 对象.append(String str);
  ```

- 替换字符

  ```java
  StringBuffer 对象.setCharAt(int index, char ch);
  ```

- 反转字符串

  ```java
  StringBuffer 对象.reverse();
  ```

- 删除字符串

  1. deleteCharAt() 方法

     ```java
     StringBuffer 对象.deleteCharAt(int index);
     ```

  2. delete() 方法

     ```java
     StringBuffer 对象.delete(int start,int end);
     ```



#### 4.13 String、StringBuffer和StringBuilder类

Java 提供了 String 类来创建和操作字符串。String 类是不可变类，即一旦一个 String 对象被创建以后，包含在这个对象中的字符序列是不可改变的，直至这个对象被销毁。

Java 提供了两个可变字符串类 StringBuffer 和 StringBuilder，中文翻译为“字符串缓冲区”。

StringBuilder 类是 JDK 1.5 新增的类，它也代表可变字符串对象。实际上，StringBuilder 和 StringBuffer 功能基本相似，方法也差不多。不同的是，StringBuffer 是线程安全的，而 StringBuilder 则没有实现线程安全功能，所以性能略高。因此在通常情况下，如果需要创建一个内容可变的字符串对象，则应该优先考虑使用 StringBuilder 类。

StringBuffer、StringBuilder、String 中都实现了 CharSequence 接口。CharSequence 是一个定义字符串操作的接口，它只包括 length()、charAt(int index)、subSequence(int start, int end) 这几个 API。

StringBuffer、StringBuilder、String 对 CharSequence 接口的实现过程不一样，如图所示：

![对CharSequence接口的实现](http://c.biancheng.net/uploads/allimg/190924/5-1Z9241JI1449.png)

String 直接实现了 CharSequence 接口，StringBuilder 和 StringBuffer 都是可变的字符序列，它们都继承于 AbstractStringBuilder，实现了 CharSequence 接口。



##### 总结

String 是 Java 中基础且重要的类，被声明为 final class，是不可变字符串。因为它的不可变性，所以拼接字符串时候会产生很多无用的中间对象，如果频繁的进行这样的操作对性能有所影响。

StringBuffer 就是为了解决大量拼接字符串时产生很多中间对象问题而提供的一个类。它提供了 append 和 add 方法，可以将字符串添加到已有序列的末尾或指定位置，它的本质是一个线程安全的可修改的字符序列。

在很多情况下我们的字符串拼接操作不需要线程安全，所以 StringBuilder 登场了。StringBuilder 是 JDK1.5 发布的，它和 StringBuffer 本质上没什么区别，就是去掉了保证线程安全的那部分，减少了开销。

###### 线程安全：

StringBuffer：线程安全
StringBuilder：线程不安全

###### 速度：

一般情况下，速度从快到慢为 StringBuilder > StringBuffer > String，当然这是相对的，不是绝对的。

###### 使用环境：

操作少量的数据使用 String。
单线程操作大量数据使用 StringBuilder。
多线程操作大量数据使用 StringBuffer。



#### 4.14 正则表达式 (Regular Expression)

String 类里也提供了如下几个特殊的方法。

- boolean matches(String regex)：判断该字符串是否匹配指定的正则表达式。
- String replaceAll(String regex, String replacement)：将该字符串中所有匹配 regex 的子串替换成 replacement。
- String replaceFirst(String regex, String replacement)：将该字符串中第一个匹配 regex 的子串替换成 replacement。
- String[] split(String regex)：以 regex 作为分隔符，把该字符串分割成多个子串。



##### 正则表达式支持字符

[Java正则表达式详解 (biancheng.net)](http://c.biancheng.net/view/5812.html)



### 5 数字 &  日期

#### 5.1 Math类

[Java Math类的常用方法 (biancheng.net)](http://c.biancheng.net/view/866.html)

#### 5.2 随机数

[Java生成随机数（random()和Random类） (biancheng.net)](http://c.biancheng.net/view/867.html)

#### 5.3 数字格式化

[Java数字格式化 (biancheng.net)](http://c.biancheng.net/view/869.html)

#### 5.4 大数运算

[Java大数字运算（BigInteger类和BigDecimal类） (biancheng.net)](http://c.biancheng.net/view/871.html)

#### 5.5 时间、日期

Date类

Calender类

DateFormat类

SimpleDateFormat类

### 6 包装类

#### 6.1 包装类、装箱和拆箱

在 [Java](http://c.biancheng.net/java/) 的设计中提倡一种思想，即一切皆对象。但是从数据类型的划分中，我们知道 Java 中的数据类型分为基本数据类型和引用数据类型，但是基本数据类型怎么能够称为对象呢？于是 Java 为每种基本数据类型分别设计了对应的类，称之为包装类（Wrapper Classes）

**装箱和拆箱：**基本数据类型转换为包装类的过程称为装箱，例如把 int 包装成 Integer 类的对象；包装类变为基本数据类型的过程称为拆箱，例如把 Integer 类的对象重新简化为 int。

```java
public class Demo {
    public static void main(String[] args) {
        int m = 500;
        Integer obj = m;  // 自动装箱
        int n = obj;  // 自动拆箱
        System.out.println("n = " + n);
      
        Integer obj1 = 500;
        System.out.println("obj等价于obj1返回结果为" + obj.equals(obj1));
    }
}
```



#### 6.2 Object类

- toString()
- equals()
- getClass()
- **接受任意引用类型的对象**



#### 6.3 Integer类

[Java Integer类详解 (biancheng.net)](http://c.biancheng.net/view/890.html)



#### 6.4 Float类

[Java Float类 (biancheng.net)](http://c.biancheng.net/view/892.html)



#### 6.5 Double类

[Java Double类 (biancheng.net)](http://c.biancheng.net/view/894.html)



#### 6.6 Number类

Number 是一个抽象类，也是一个超类（即父类）。Number 类属于 java.lang 包，所有的包装类（如 Double、Float、Byte、Short、Integer 以及 Long）都是抽象类 Number 的子类。

[Java Number类 (biancheng.net)](http://c.biancheng.net/view/895.html)



#### 6.7 Character类

[Java Character类 (biancheng.net)](http://c.biancheng.net/view/899.html)



#### 6.8 Boolean类

[Java Boolean类 (biancheng.net)](http://c.biancheng.net/view/901.html)



#### 6.9 Byte类

[Java Byte类 (biancheng.net)](http://c.biancheng.net/view/902.html)



### 7 数组

#### 7.1 一维数组

[Java一维数组的定义、赋值和初始化 (biancheng.net)](http://c.biancheng.net/view/5852.html)

注意：一旦声明了数组的大小，就不能再修改。这里的数组长度也是必需的，不能少。



#### 7.2 二维数组

[Java二维数组详解 (biancheng.net)](http://c.biancheng.net/view/5857.html)



#### 7.3 Arrays类

[Java Arrays工具类 (biancheng.net)](http://c.biancheng.net/view/5885.html)



#### 7.4 二分查找



```java
	public static int mybinarysearch(int[] arr, int key){
        int low = 0;
        int high = arr.length;

        while (low <= high){
            int mid = (low + high) >>> 1;

            int middlevalue = arr[mid];

            if (middlevalue < key){
                low = mid + 1;
            }
            else if (middlevalue > key){
                high = mid - 1;
            }
            else{
                // key found
                return mid;
            }
        }
        // not found
        return -1;
    }
```



#### 7.5 数组复制

[Java复制（拷贝）数组的4种方法：arraycopy()方法、clone() 方法、copyOf()和copyOfRan (biancheng.net)](http://c.biancheng.net/view/924.html)



#### 7.6 数组排序

[Java sort()数组排序（升序和降序） (biancheng.net)](http://c.biancheng.net/view/925.html)



- 冒泡排序

  ```java
      public static int[] bubblesort(int[] arr){
          int[] res = new int[arr.length];
          for (int i = 0; i < arr.length-1; i++){
              for (int j = 0; j < arr.length-1-i; j++){
                  int tmp = 0;
                  if (arr[j] > arr[j+1]){
                      tmp = arr[j+1];
                      arr[j+1] = arr[j];
                      arr[j] = tmp;
                  }
  
              }
          }
          for (int i = 0; i < arr.length; i++){
              res[i] = arr[i];
          }
          return res;
      }
  ```

  

- 快速排序

  ```java
      public static int middlevalue(int[] arr, int low, int high){
          // arr的第1个数作为中值
          int tmp = arr[low];
          int mid = 0;
  
          while (low < high){
              while (low < high && arr[high] > tmp){
                  high--;
              }
              // 比中值小，放到中值左边
              arr[low] = arr[high];
  
              while (low < high && arr[low] < tmp){
                  low++;
              }
              // 比中值大，放到中值右边
              arr[high] = arr[low];
          }
  
          arr[low] = tmp;
          mid = low;
  
          return mid;
      }
  
      // 快速排序
      public static void quicksort(int[] arr, int low, int high){
  //        int[] res = new int[arr.length];
          if (low < high){
              int mid = middlevalue(arr, low, high);
              quicksort(arr, low, mid-1);
              quicksort(arr, mid+1, high);
  
          }
      }
  ```

  

- 选择排序

  ```java
      // 选择排序
      public static void selectsort(int[] arr){
          int[] res = new int[arr.length];
          int tmp = 0;
          for (int i = 1; i < arr.length; i++){
              // 当前循环最大值下标
              int maxindex = 0;
  
              // 找到arr[0:arr.length - i]的最大值下标
              for (int j = 1; j <= arr.length - i; j++){
                  if (arr[j] > arr[maxindex]){
                      maxindex = j;
                  }
              }
              tmp = arr[arr.length-i];
              arr[arr.length-i] = arr[maxindex];
              res[arr.length-i] = arr[maxindex];
              arr[maxindex] = tmp;
  
          }
      }
  ```

  

- 插入排序

  ```java
      // 直接插入排序
      public static void insertsort(int[] arr){
          int tmp, j;
          for (int i = 1; i < arr.length; i++){
              tmp = arr[i];
              for (j = i - 1; j >= 0 && arr[j] > tmp; j--){
                  arr[j+1] = arr[j];
              }
              arr[j+1] = tmp;
          }
      }
  ```

  

- ··· ···



### 8 类和对象

