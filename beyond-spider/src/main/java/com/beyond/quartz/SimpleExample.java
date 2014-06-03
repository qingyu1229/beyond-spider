package com.beyond.quartz;
import static org.quartz.DateBuilder.evenMinuteDate;
import static org.quartz.JobBuilder.newJob;
import static org.quartz.TriggerBuilder.newTrigger;
import java.util.Date;

import org.quartz.CronScheduleBuilder;
import org.quartz.CronTrigger;
import org.quartz.JobDetail;
import org.quartz.Scheduler;
import org.quartz.SchedulerFactory;
import org.quartz.SimpleTrigger;
import org.quartz.Trigger;
import org.quartz.impl.StdSchedulerFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
public class SimpleExample {
	 public void run() throws Exception {
	        SchedulerFactory sf = new StdSchedulerFactory();
	        Scheduler sched = sf.getScheduler();

	        JobDetail job = newJob(QuartzJob.class)
	            .withIdentity("job1", "group1")
	            .build();
	        CronTrigger trigger = newTrigger()
	        	    .withIdentity("trigger1", "group1")
	        	    .withSchedule( CronScheduleBuilder.cronSchedule("0/20 * * * * ?"))
	        	    .build();
	        
	      /*  Trigger trigger = newTrigger()
	            .withIdentity("trigger1", "group1").startNow()
	            .build();*/
	        sched.scheduleJob(job, trigger);

	        sched.start();
	       /* try {
	            Thread.sleep(65 * 100); 
	        } catch (Exception e) {
	        }
	        sched.shutdown(true);*/
	    }
}
