package com.iopipe.logger.log4j2;

import com.iopipe.IOpipeService;
import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Test for Log4j2
 *
 * @since 2018/10/09
 */
public class Log4j2Test
{
	/** Logging. */
	private static final Logger _LOGGER =
		LogManager.getLogger(Log4j2Test.class);

	/**
	 * Tests the logging.
	 *
	 * @since 2018/10/09
	 */
	@Test
	public void test()
	{
		IOpipeService.instance().<Object>run(new MockContext("log4j2-test"),
			(__exec) ->
			{
				_LOGGER.debug("Debug");
				_LOGGER.info("Info");
				_LOGGER.warn("Warning");
				_LOGGER.error("Error", new Throwable("Oopsie!"));
				
				return null;
			});
	}
}

