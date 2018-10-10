package com.iopipe.logger.log4j2;

import com.iopipe.plugin.logger.LoggerUtil;
import org.apache.logging.log4j.core.appender.AbstractAppender;
import org.apache.logging.log4j.core.Filter;
import org.apache.logging.log4j.core.Layout;
import org.apache.logging.log4j.core.LogEvent;

/**
 * This implements the appender for Log4j2.
 *
 * @since 2018/10/10
 */
public class IOpipeAppender
	extends AbstractAppender
{
	/**
	 * Initializes the appender.
	 *
	 * @since 2018/10/10
	 */
	public IOpipeAppender()
	{
		super("iopipe", null, null);
	}
	
	/**
	 * Appends the given log entry to IOpipe.
	 *
	 * @param __e The event to log.
	 * @since 2018/10/10
	 */
	public void append(LogEvent __e)
	{
		// Do nothing if not specified
		if (__e == null)
			return;
		
		throw new Error("TODO");
	}
}

