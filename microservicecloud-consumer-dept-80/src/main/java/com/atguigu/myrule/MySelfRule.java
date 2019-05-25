package com.atguigu.myrule;

import com.netflix.loadbalancer.IRule;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Created by ZeroV on 2018/11/6.
 */
@Configuration
public class MySelfRule {

    @Bean
    public IRule myRule() {
       // return new RandomRule();
        return new RandomRule_LW();
    }
}
