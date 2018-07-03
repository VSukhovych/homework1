package com.epam.lab.homework1;

import org.apache.log4j.Logger;

public class LogClass {
    private static final Logger log = Logger.getLogger(LogClass.class);

    public static void main(String[] args) {
        log.trace("Trace");
        log.debug("Debug");
        log.info("Info");
        log.warn("Warn");
        log.error("Error");
        log.fatal("Fatal");
    }
}
