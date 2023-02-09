package com.ty.log4j_example;

import org.apache.log4j.Appender;
import org.apache.log4j.ConsoleAppender;
import org.apache.log4j.Layout;
import org.apache.log4j.Logger;
import org.apache.log4j.PatternLayout;

public class Log4jExamplePatternLayout {

	public static void main(String[] args) {
//		Logger logger=Logger.getLogger(Log4jExamplePatternLayout.class);
//		Layout layout=new PatternLayout("%d %p %c %m %c %l %n");
		Logger logger=Logger.getLogger(Log4jExamplePatternLayout.class);
		Layout layout=new PatternLayout("%n");
		Appender appender=new ConsoleAppender(layout);
		logger.addAppender(appender);
		logger.info("hi");

	}

}
