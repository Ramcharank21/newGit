package com.aem.community.core.schedulers;

import org.apache.sling.commons.scheduler.ScheduleOptions;
import org.apache.sling.commons.scheduler.Scheduler;
import org.osgi.service.component.annotations.Activate;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Deactivate;
import org.osgi.service.component.annotations.Modified;
import org.osgi.service.component.annotations.Reference;
import org.osgi.service.metatype.annotations.Designate;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


@Component(immediate = true, service = CustomScheduler.class)
@Designate(ocd = SlingSchedulerConfiguration.class)
public class CustomScheduler implements Runnable {
	
	
	private static final Logger log = LoggerFactory.getLogger(CustomScheduler.class);
	
		private String customParameter;
	
		private int schedulerId;
	
		@Reference
	private Scheduler scheduler;

	
	@Activate
	protected void activate(SlingSchedulerConfiguration config) {
		
		
		schedulerId = config.schdulerName().hashCode();
		
		customParameter = config.customParameter();
	}
	
		@Modified
	protected void modified(SlingSchedulerConfiguration config) {
		
		
		removeScheduler();
		
		
		schedulerId = config.schdulerName().hashCode();
		
		
		addScheduler(config);
	}
	
		@Deactivate
	protected void deactivate(SlingSchedulerConfiguration config) {
		
		
		removeScheduler();
	}
	
	
	private void removeScheduler() {
		
		log.info("Removing scheduler: {}", schedulerId);
		
		scheduler.unschedule(String.valueOf(schedulerId));
	}
	
	
	private void addScheduler(SlingSchedulerConfiguration config) {
		
				if(config.enabled()) {
			
			
			ScheduleOptions scheduleOptions = scheduler.EXPR(config.cronExpression());
			
			
			scheduleOptions.name(config.schdulerName());
			scheduleOptions.canRunConcurrently(false);
			
		
			scheduler.schedule(this, scheduleOptions);
			
			log.info("Scheduler added");
			
		} else {
			
			log.info("Scheduler is disabled");
			
		}
	}
	
	
	@Override
	public void run() {

		log.info("Custom Scheduler is now running using the passed custom paratmeter, customParameter {}", customParameter);
		
	}

}
