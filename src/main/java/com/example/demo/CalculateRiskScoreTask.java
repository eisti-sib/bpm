package com.example.demo;

import org.camunda.bpm.engine.delegate.DelegateExecution;
import org.camunda.bpm.engine.delegate.JavaDelegate;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class CalculateRiskScoreTask implements JavaDelegate{

	private Logger LOG = LoggerFactory.getLogger(LookupRiskDBTask.class);
	
	@Override
	public void execute(DelegateExecution execution) throws Exception {
		
		LOG.info("Calculation Risk Score");
		
		int userOverdraft= (int) execution.getVariable("User overdraft");
		int userCreditAmount= (int) execution.getVariable("Credit amount");
		int userCreditDuration= (int) execution.getVariable("Credit duration");
		
		
		
		//TODO : implements rules
		
		execution.setVariable("approuved", false);
		execution.setVariable("approuved", true);
		execution.setVariable("denied", true);
		execution.setVariable("denied", false);

		
	}

}
