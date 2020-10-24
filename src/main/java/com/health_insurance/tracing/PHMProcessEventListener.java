package com.health_insurance.tracing;

//import org.apache.logging.log4j.LogManager;
//import org.apache.logging.log4j.Logger;
import org.kie.api.event.process.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class PHMProcessEventListener extends DefaultProcessEventListener {
    //private static final Logger LOG = LogManager.getLogger(PHMProcessEventListener.class);
    private static final Logger LOG = LoggerFactory.getLogger(PHMProcessEventListener.class);

    /**
     * Constructor
     */
    public PHMProcessEventListener() {
        LOG.info("Registered PHMProcessEventListener.");
    }

    /**
     * @param event being logged before a process is started
     */
    @Override
    public void beforeProcessStarted(ProcessStartedEvent event) {
        LOG.info("Process <<" + event.getProcessInstance().getProcessName() + ">>-<"
                + event.getProcessInstance().getId() + "> is about to start.");
    }

    /**
     * @param event being logged after a process is started
     */
    @Override
    public void afterProcessStarted(ProcessStartedEvent event) {
        LOG.info("Process <<" + event.getProcessInstance().getProcessName() + ">>-<"
                + event.getProcessInstance().getId() + "> has started.");
    }

    /**
     * @param event being logged before a process is completed
     */
    @Override
    public void beforeProcessCompleted(ProcessCompletedEvent event) {
        LOG.info("Process <<" + event.getProcessInstance().getProcessName() + ">>-<"
                + event.getProcessInstance().getId() + "> is about to complete.");
    }

    /**
     * @param event being logged after a process is completed
     */
    @Override
    public void afterProcessCompleted(ProcessCompletedEvent event) {
        LOG.info("Process <<" + event.getProcessInstance().getProcessName() + ">>-<"
                + event.getProcessInstance().getId() + "> has completed.");
    }

    /**
     * @param event being logged before a node is triggered
     */
    @Override
    public void beforeNodeTriggered(ProcessNodeTriggeredEvent event) {
        LOG.info("Process <<" + event.getProcessInstance().getProcessName() + ">>-<"
                + event.getProcessInstance().getId() + "> ->Node <<" + event.getNodeInstance().getNodeName() + ">>-<"
                + event.getNodeInstance().getNodeId() + ">-<" + event.getNodeInstance().getId()
                + "> is about to be triggered.");
    }

    /**
     * @param event being logged after a node is triggered
     */
    @Override
    public void afterNodeTriggered(ProcessNodeTriggeredEvent event) {
        LOG.info("Process <<" + event.getProcessInstance().getProcessName() + ">>-<"
                + event.getProcessInstance().getId() + "> ->Node <<" + event.getNodeInstance().getNodeName() + ">>-<"
                + event.getNodeInstance().getNodeId() + ">-<" + event.getNodeInstance().getId()
                + "> has been triggered.");
    }

    /**
     * @param event being logged before a node is left
     */
    @Override
    public void beforeNodeLeft(ProcessNodeLeftEvent event) {
        LOG.info("Process <<" + event.getProcessInstance().getProcessName() + ">>-<"
                + event.getProcessInstance().getId() + "> ->Node <<" + event.getNodeInstance().getNodeName() + ">>-<"
                + event.getNodeInstance().getNodeId() + ">-<" + event.getNodeInstance().getId()
                + "> is about to be left.");
    }

    /**
     * @param event being logged after a node is left
     */
    @Override
    public void afterNodeLeft(ProcessNodeLeftEvent event) {
        LOG.info("Process <<" + event.getProcessInstance().getProcessName() + ">>-<"
                + event.getProcessInstance().getId() + "> ->Node <<" + event.getNodeInstance().getNodeName() + ">>-<"
                + event.getNodeInstance().getNodeId() + ">-<" + event.getNodeInstance().getId() + "> has been left.");
    }

    /**
     * @param event being logged before a variable is changed
     */
    @Override
    public void beforeVariableChanged(ProcessVariableChangedEvent event) {
        LOG.info("Process <<" + event.getProcessInstance().getProcessName() + ">>-<"
                + event.getProcessInstance().getId() + "> ->Variable <<" + event.getVariableId() + ">>-<"
                + event.getVariableInstanceId() + "> is about to be changed from \n" + "<<" + event.getOldValue()
                + ">> \nto \n<<" + event.getNewValue() + ">>");
    }

    /**
     * @param event being logged after a variable is changed
     */
    @Override
    public void afterVariableChanged(ProcessVariableChangedEvent event) {
        LOG.info("Process <<" + event.getProcessInstance().getProcessName() + ">>-<"
                + event.getProcessInstance().getId() + "> ->Variable <<" + event.getVariableId() + ">>-<"
                + event.getVariableInstanceId() + "> has been changed from \n" + "<<" + event.getOldValue()
                + ">> \nto \n<<" + event.getNewValue() + ">>");
    }

    /**
     * @param event being logged before a SLA is violated
     */
    @Override
    public void beforeSLAViolated(SLAViolatedEvent event) {
        LOG.info("Process <<" + event.getProcessInstance().getProcessName() + ">>-<"
                + event.getProcessInstance().getId() + "> ->SLA <<" + event.getNodeInstance().getNodeName() + ">>-<"
                + event.getNodeInstance().getNodeId() + ">-<" + event.getNodeInstance().getId()
                + "> SLA is about to be violated.");
    }

    /**
     * @param event being logged after a SLA is violated
     */
    @Override
    public void afterSLAViolated(SLAViolatedEvent event) {
        LOG.info("Process <<" + event.getProcessInstance().getProcessName() + ">>-<"
                + event.getProcessInstance().getId() + "> ->SLA <<" + event.getNodeInstance().getNodeName() + ">>-<"
                + event.getNodeInstance().getNodeId() + ">-<" + event.getNodeInstance().getId()
                + "> SLA has been violated.");
    }

}
