package com.ty.log4j_example;



import org.apache.log4j.Appender;
import org.apache.log4j.ConsoleAppender;
import org.apache.log4j.Layout;
import org.apache.log4j.Logger;
import org.apache.log4j.SimpleLayout;

public class Log4jExample {
	public static void main(String[] args) {
		Logger logger=Logger.getLogger(Log4jExample.class);
		Layout layout=new SimpleLayout();
		Appender appender=new ConsoleAppender(layout);
		
		logger.addAppender(appender);
		
		logger.info("info message the DB connection done");
		logger.debug("Debug Message");
		logger.warn("warn message");
		logger.error("Error message");
		logger.fatal("fatal message");
		
		
	}

}
