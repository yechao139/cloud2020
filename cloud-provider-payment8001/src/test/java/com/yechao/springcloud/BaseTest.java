package com.yechao.springcloud;

import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * @author ：yechao
 * @date ：Created in 2021/1/21 10:18
 * @version: 1.0
 */
@SpringBootTest(classes = PaymentMain8001.class)
@RunWith(SpringRunner.class)
@ActiveProfiles("test")
public class BaseTest {

}
