package com.iopipe.logger.log4j2;

import com.iopipe.plugin.logger.LoggerUtil;
import java.io.Serializable;
import org.apache.logging.log4j.core.Appender;
import org.apache.logging.log4j.core.appender.AbstractAppender;
import org.apache.logging.log4j.core.config.plugins.Plugin;
import org.apache.logging.log4j.core.config.plugins.PluginAttribute;
import org.apache.logging.log4j.core.config.plugins.PluginElement;
import org.apache.logging.log4j.core.config.plugins.PluginFactory;
import org.apache.logging.log4j.core.Core;
import org.apache.logging.log4j.core.Filter;
import org.apache.logging.log4j.core.Layout;
import org.apache.logging.log4j.core.layout.PatternLayout;
import org.apache.logging.log4j.core.LogEvent;

/**
 * This implements the appender for Log4j2.
 *
 * @since 2018/10/10
 */
@Plugin(name="IOpipe",
	category=Core.CATEGORY_NAME,
	elementType=Appender.ELEMENT_TYPE,
	printObject=true)
public class IOpipeAppender
	extends AbstractAppender
{
	/**
	 * Initializes the appender.
	 *
	 * @param __name The name of the appender.
	 * @param __filter The filter to use.
	 * @param __layout The layout used.
	 * @param __supexp Are exceptions suppressed?
	 * @since 2018/10/10
	 */
	public IOpipeAppender(String __name, Filter __filter,
		Layout<? extends Serializable> __layout, boolean __supexp)
	{
		super(__name, __filter, __layout, __supexp);
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
		
		throw new Error("Called with event " + __e);
	}
	
	/**
	 * Factory for initializing the logger.
	 *
	 * @param __name The name.
	 * @param __filter The filter.
	 * @param __layout The layout.
	 * @return The logger adapter.
	 * @since 2018/10/10
	 */
	 @PluginFactory
	 public static IOpipeAppender createAppender(
	 	@PluginAttribute("name") String __name,
	 	@PluginElement("Filter") Filter __filter,
	 	@PluginElement("Layout") Layout<? extends Serializable> __layout)
	 {
	 	return new IOpipeAppender(
	 		(__name != null ? __name : "IOpipe"),
	 		__filter,
	 		(__layout != null ? __layout :
	 			PatternLayout.createDefaultLayout()),
	 		true);
	 		
	 }
}

