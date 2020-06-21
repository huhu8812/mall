package com.huhu.mall.config;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@MapperScan("com.huhu.mall.mbg.mapper")
public class MybatisConfig {
}
