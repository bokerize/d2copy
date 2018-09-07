package com.bok.d2copy.basics.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

@Service
public class JobService {

    private Logger logger = LoggerFactory.getLogger(getClass());

    public void executeSampleJob() {

        logger.info("The sample job has begun...");
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            logger.error("Error while executing sample job", e);
        } finally {
            logger.info("Sample job has finished...");
        }
    }
}
