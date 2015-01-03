package com.m11n.hermes.persistence;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.inject.Inject;

@FixMethodOrder
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:META-INF/spring/applicationContext-hermes.xml"})
public class AuswertungRepositoryTest {
    private static final Logger logger = LoggerFactory.getLogger(AuswertungRepositoryTest.class);

    @Inject
    private AuswertungRepository auswertungRepository;

    @Test
    public void test() {
        auswertungRepository.findOrderByFilter("abcdefghijklmnopqrstuvwxyz", "%", true, true, true, true);
    }
}
