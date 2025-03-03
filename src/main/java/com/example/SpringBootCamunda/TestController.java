package com.example.SpringBootCamunda;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.camunda.bpm.engine.ProcessEngine;
import org.camunda.bpm.engine.ProcessEngines;

@RestController
public class TestController {
	@GetMapping("/executetask")
	public String execute() {
 
		ProcessEngine engine = ProcessEngines.getDefaultProcessEngine();
		ProcessInstantiationBuilder instance = engine.getRuntimeService().createProcessInstanceByKey("javainuse-id");
		instance.executeWithVariablesInReturn();
		return "Executed Camunda BPMN";
	}
}
