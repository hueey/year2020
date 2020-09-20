package com.cloud.kailuan.yjindex.config;

import cn.hutool.core.lang.Snowflake;
import cn.hutool.core.util.IdUtil;
import com.cloud.kailuan.yjindex.dao.IIDGenerate;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author pjh
 * @Title: IdGenerateConfig
 * @Description: id生成器
 * @date 2020/9/20 15:15
 */
@Configuration
public class IdGenerateConfig {

    Snowflake snowflake = IdUtil.getSnowflake(1, 1);

    @Bean
    public IIDGenerate createGenerate(){
        IIDGenerate generateService = ()->{
            return snowflake.nextId();
        };
        return generateService;
    }

}
