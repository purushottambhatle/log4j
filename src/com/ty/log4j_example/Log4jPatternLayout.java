package com.ty.log4j_example;

import java.io.IOException;

import org.apache.log4j.Appender;
import org.apache.log4j.FileAppender;
import org.apache.log4j.Layout;
import org.apache.log4j.Logger;
import org.apache.log4j.PatternLayout;

public class Log4jPatternLayout {
	public static void main(String[] args) throws IOException {

		Logger logger=Logger.getLogger(Log4jPatternLayout.class);
		Layout layout=new PatternLayout("%d %p %c %m %c %l %n");
		Appender appender=new FileAppender(layout, "C:/Users/91963/OneDrive/Desktop/Log4j/examplelogs.log");
		logger.addAppender(appender);
		logger.info("2nd info");

	}
}