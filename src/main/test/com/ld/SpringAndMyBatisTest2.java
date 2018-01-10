package com.ld;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import redis.clients.jedis.JedisCluster;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:applicationContext.xml")
public class SpringAndMyBatisTest2 {

    @Autowired
    private JedisCluster jedisCluster;

    @Test
    public void test() throws Exception {
        jedisCluster.set("大脚","老谢");
        System.out.println( jedisCluster.get("大脚"));
    }
}
