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

### 2.6 运算符
#### 算数运算符

##### 一元运算符

算术一元运算一共有 3 个，分别是 -、++ 和 --。具体说明参见表 1。  


| 运 算 符 | 名 称 | 说 明 | 例 子 |
| --- | --- | --- | --- |
| \-  | 取反符号 | 取反运算 | b=-a |
| ++ | 自加一 | 先取值再加一，或先加一再取值 | a++ 或 ++a |
| \-- | 自减一 | 先取值再减一，或先减一再取值 | a-- 或 --a |


##### 二元运算符

Java 语言中算术运算符的功能是进行算术运算，除了经常使用的加（+）、减（-）、乘（\*）和除（\\）外，还有取模运算（％）。加（+）、减（-）、乘（\*）、除（\\）和我们平常接触的数学运算具有相同的含义。具体说明参见表 2。  


| 运 算 符 | 名 称 | 说 明 | 例 子 |
| --- | --- | --- | --- |
| + | 加 | 求 a 加 b 的和，还可用于 String 类型，进行字符串连接操作 | a + b |
| \- | 减 | 求 a 减 b 的差 | a - b |
| \* | 乘 | 求 a 乘以 b 的积 | a \* b |
| /  | 除 | 求 a 除以 b 的商 | a / b |
| % | 取余 | 求 a 除以 b 的余数  | a % b |


##### 算术赋值运算符

算术赋值运算符只是一种简写，一般用于变量自身的变化，具体说明参见表 3。  


| 运 算 符 | 名 称 | 例 子 |
| --- | --- | --- |
| += | 加赋值 | a += b、a += b+3 |
| \-= | 减赋值 | a -= b |
| \*= | 乘赋值 | a \*= b |
| /= | 除赋值 | a /= b |
| %= | 取余赋值 | a %= b |


#### 赋值运算符


#### 逻辑运算符

逻辑运算符是对布尔型变量进行运算，其结果也是布尔型，具体如表 1 所示。  


| 运算符 | 用法 | 含义 | 说明 | 实例 | 结果 |
| --- | --- | --- | --- | --- | --- |
| && | a&&b | 短路与 | ab 全为 true 时，计算结果为 true，否则为 false。 | 2>1&&3<4 | true |
| \|\| | a\|\|b | 短路或 | ab 全为 false 时，计算结果为 false，否则为 true。 | 2<1\|\|3>4 | false |
| ! | !a | 逻辑非 | a 为 true 时，值为 false，a 为 false 时，值为 true | !(2>4) | true |
| \| | a\|b | 逻辑或 | ab 全为 false 时，计算结果为 false，否则为 true | 1>2\|3>5 | false |
| & | a&b | 逻辑与 | ab 全为 true 时，计算结果为 true，否则为 false | 1<2&3<5 | true |

#### 关系运算符



#### 自增 & 自减运算符


#### 位运算符

位逻辑运算符包含 4 个：&（与）、|（或）、~（非）和 ^（异或）。除了 ~（即位取反）为单目运算符外，其余都为双目运算符。表 1 中列出了它们的基本用法。  


##### 位逻辑运算符
| 运算符 | 含义 | 实例 | 结果 |
| --- | --- | --- | --- |
| & | 按位进行与运算（AND） | 4 & 5 | 4 |
| \| | 按位进行或运算（OR） | 4 | 5 | 5 |
| ^ | 按位进行异或运算（XOR） | 4 ^ 5 | 1 |
| ~ | 按位进行取反运算（NOT） | ~ 4 | \-5 |


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

### 3.1 流程控制
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

