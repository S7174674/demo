package com.example.demo.task;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
public class ScheduledTasks {
    private static final Logger logger = LoggerFactory.getLogger(ScheduledTasks.class);

    /**
     * 每日上午 8 点执行一次。
     * cron 表达式 "0 0 8 * * ?" 表示每天 08:00:00 执行。
     * 如需指定时区，可加上 zone 参数，例如 zone = "Asia/Shanghai"。
     */
    @Scheduled(cron = "0 0 8 * * ?")
    public void runDailyAt8am() {
        logger.info("Scheduled task executed at daily 08:00 - Hello from ScheduledTasks");
        // 在这里加入你需要定时执行的逻辑
    }
}