package sample_java_error_handling;

import org.activiti.engine.delegate.BpmnError;
import org.activiti.engine.delegate.DelegateExecution;
import org.activiti.engine.delegate.JavaDelegate;

public class SampleJavaDelegate implements JavaDelegate {

	@Override
	public void execute(DelegateExecution execution) throws Exception {
		String inputVar = (String) execution.getVariable("input_var");
		if("error1".equals(inputVar)){
			throw new BpmnError("error_pattern1");
		}else if("error2".equals(inputVar)) {
			throw new BpmnError("error_pattern2");
		}
		
	}

}
