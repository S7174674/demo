# Demo Spring Boot 项目

功能：
- 提供 /test/hi 接口，返回 "Hello World!"
- 包含每日早上 08:00 运行的定时任务（示例日志）
- 包含接口单元测试

运行：
1. 使用 Maven 构建并启动：
   mvn spring-boot:run

2. 运行测试：
   mvn test

接口示例：
GET http://localhost:8080/test/hi
返回：Hello World!

定时任务：
- 定时表达式为 `0 0 8 * * ?`（每天 08:00:00）
- 如需按特定时区执行，请在注解中加 `zone = "Asia/Shanghai"` 或你需要的时区
