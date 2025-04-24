# 📚 简易图书管理系统（Java SE 项目练习）
一个基于 Java SE 编写的控制台版图书管理系统，支持管理员与普通用户两种角色，涵盖图书增删查借还功能，并使用 IO 流实现图书数据持久化。

> 🎯 项目目标:系统性练习 JavaSE 基础，包括类与对象、继承、多态、接口、集合、IO流、异常处理等内容。

---

## 🚀 功能概览
- 支持 **管理员 / 普通用户登录**
- 管理员功能：
    - 添加图书
    - 删除图书
    - 查找图书
    - 显示图书列表
- 普通用户功能：
    - 查找图书
    - 借出图书
    - 归还图书
    - 显示图书列表
- 图书数据 **持久化存储**，使用 Java 对象序列化
- 支持命令循环操作，按编号选择操作
- 使用 **多态 + 接口 + 命令模式** 封装操作逻辑

---
## 🧱 项目结构设计
```agsl
📦 simple-library-system
├── Main.java                         // 入口类，负责整体流程控制
│
├── book/                            // 图书实体与图书集合
│   ├── Book.java                    // 单本图书对象类
│   └── BookList.java                // 图书列表管理类（使用 List<Book>）
│
├── user/                            // 用户体系（继承 + 多态）
│   ├── User.java                    // 抽象父类
│   ├── AdminUser.java               // 管理员用户
│   ├── NormalUser.java              // 普通用户
│
├── login/
│   ├── Login.java                   // 登录模块，返回具体用户实例
│
├── operation/                       // 操作体系（命令模式）
│   ├── IOperation.java              // 所有操作的接口规范
│   ├── AddOperation.java            // 添加图书
│   ├── DelOperation.java            // 删除图书
│   ├── FindOperation.java           // 查找图书
│   ├── BorrowOperation.java         // 借出图书
│   ├── ReturnOperation.java         // 归还图书
│   ├── DisplayOperation.java        // 显示图书列表
│   └── ExitOperation.java           // 退出系统
│
├── util/                            // 工具类
│   └── FileIOUtil.java              // 负责图书列表的文件读写（IO流序列化）
│
└── booklist.data                    // 持久化保存的图书数据文件（运行时自动生成）
```

---
## 💡 技术点亮点
- 🎯 **面向对象设计**：抽象类、继承、接口与多态使用明确
- 🔁 **命令模式结构**：每个操作独立成类，结构清晰、易维护
- 📚 **集合类使用**：使用 List<Book> 管理图书
- 💾 **IO 流支持**：使用 ObjectInputStream / ObjectOutputStream 实现图书序列持久化
- 🧪 **易于测试**：每个功能模块清晰，便于分阶段测试

---
## 🛠️ 使用方式
### 1. 克隆项目
```agsl
git clone https://github.com/luna2liu/simple-library-system.git
cd simple-library-system
```

### 2. 编译运行
使用 IDEA 打开项目，直接运行 Main.java 即可（无需手动 Maven 命令）

### 3. Maven 项目（可选）
已配置 pom.xml，使用 IDEA 自带 Maven 插件即可构建项目。

---
## 📄 示例演示（命令行界面）
```agsl
欢迎使用图书管理系统
请输入你的姓名：softluna
请选择你的身份：1-管理员  2-普通用户
> 2

Hello softluna，欢迎使用普通用户系统：
1. 查找图书
2. 借阅图书
3. 归还图书
4. 显示图书
0. 退出系统
请选择操作：
```