package LOG4J;

import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Logger;
import org.testng.annotations.Test;

public class ReportingTool2 
{
@Test
public void console()
{
	//step1 configure log4j
	BasicConfigurator.configure();
	//step2
	Logger Log=Logger.getLogger(this.getClass().getName());
	//step3
	Log.error("tc error");
	Log.warn("warningbwhile tc runs");
	Log.info("info");
}
}
