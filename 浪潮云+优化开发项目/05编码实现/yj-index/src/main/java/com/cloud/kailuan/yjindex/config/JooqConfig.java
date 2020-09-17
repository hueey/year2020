package com.cloud.kailuan.yjindex.config;


import org.jooq.conf.RenderKeywordCase;
import org.jooq.conf.Settings;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class JooqConfig {

    @Bean
    public Settings settings() {
        var settings = new Settings();
        settings
                //关键字设置成大写，方便阅读，默认为小写
                .withRenderKeywordCase(RenderKeywordCase.UPPER)
                //开启乐观锁
                .withExecuteWithOptimisticLocking(true)
                //使用版本号做乐观锁（也可以选择时间戳）
                .withUpdateRecordVersion(true);
        return settings;
    }
}
