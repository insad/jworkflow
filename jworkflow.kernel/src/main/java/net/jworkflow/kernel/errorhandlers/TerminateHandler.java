package net.jworkflow.kernel.errorhandlers;

import com.google.inject.Singleton;
import java.util.Queue;
import net.jworkflow.kernel.interfaces.*;
import net.jworkflow.kernel.models.*;

@Singleton
public class TerminateHandler implements StepErrorHandler {
    
    @Override
    public ErrorBehavior getErrorBehavior() {
        return ErrorBehavior.TERMINATE;
    }

    @Override
    public void handle(WorkflowInstance workflow, WorkflowDefinition def, ExecutionPointer pointer, WorkflowStep step, Queue<ExecutionPointer> bubleupQueue) {
        workflow.setStatus(WorkflowStatus.TERMINATED);
    }
    
}
