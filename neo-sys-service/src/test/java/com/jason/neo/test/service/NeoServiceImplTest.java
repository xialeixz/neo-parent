package com.jason.neo.test.service;

import com.jason.neo.service.NeoServiceImpl;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:biz/biz-context.xml")
public class NeoServiceImplTest {

    private Logger logger = LoggerFactory.getLogger("MainLogger");

    @Autowired
    NeoServiceImpl service;

    @Test
    public void testService(){

        logger.info("what fuck?!!!!");

        service.service();

        logger.info("game over!!!!");
    }
}