package com.kodilla.patterns2.facade.api;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class LoggerFacade {
    private static final Logger LOGGER = LoggerFactory.getLogger(LoggerFacade.class);

    @Before("execution(* com.kodilla.patterns2.facade.api.OrderFacade.processOrder(..))" +
        "&& args(order, id) && target(object)")
    public void logEvent(OrderDto order, Long id, Object object) {
        LOGGER.info("Class: " + order.getClass().getName() + "Args: UserId " +  id  + ", order " + order);
    }
}
