package com.health_insurance.tracing;

import org.kie.api.task.TaskEvent;
import org.kie.api.task.TaskLifeCycleEventListener;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class PHMTaskLifeCycleEventListener implements TaskLifeCycleEventListener {
    //private static final Logger LOG = LogManager.getLogger(PHMProcessEventListener.class);
    private static final Logger LOG = LoggerFactory.getLogger(PHMProcessEventListener.class);

    /**
     * Constructor
     */
    public PHMTaskLifeCycleEventListener() {
        LOG.info("Registered PHMTaskLifeCycleEventListener.");
    }

    // ****************************/
    // ** TASK ACTIVATION EVENTS **/
    // ****************************/

    /**
     * @param event being logged before a task is activated
     */
    public void beforeTaskActivatedEvent(TaskEvent event) {
        LOG.info("Human Task <<" + event.getTask().getName() + ">>-(" + event.getTask().getId()
                + ") is about to be activated.");
    }

    /**
     * @param event being logged after a task is activated
     */
    public void afterTaskActivatedEvent(TaskEvent event) {
        LOG.info("Human Task <<" + event.getTask().getName() + ">>-(" + event.getTask().getId()
                + ") has been activated.");
    }

    // ****************************/
    // ** TASK ASSIGNMENT EVENTS **/
    // ****************************/

    /**
     * @param event being logged before a task is claimed
     */
    public void beforeTaskClaimedEvent(TaskEvent event) {
        LOG.info("Human Task <<" + event.getTask().getName() + ">>-(" + event.getTask().getId()
                + ") is about to be claimed.");
    }

    /**
     * @param event being logged after a task is claimed
     */
    public void afterTaskClaimedEvent(TaskEvent event) {
        LOG.info(
                "Human Task <<" + event.getTask().getName() + ">>-(" + event.getTask().getId() + ") has been claimed.");
    }

    /**
     * @param event being logged before a task is released
     */
    public void beforeTaskReleasedEvent(TaskEvent event) {
        LOG.info("Human Task <<" + event.getTask().getName() + ">>-(" + event.getTask().getId()
                + ") is about to be released.");
    }

    /**
     * @param event being logged after a task is released
     */
    public void afterTaskReleasedEvent(TaskEvent event) {
        LOG.info("Human Task <<" + event.getTask().getName() + ">>-(" + event.getTask().getId()
                + ") has been released.");
    }

    /**
     * @param event being logged before a task is reassigned
     */
    public void beforeTaskReassignedEvent(TaskEvent event) {
        LOG.info("Human Task <<" + event.getTask().getName() + ">>-(" + event.getTask().getId()
                + ") is about to be reassigned.");
    }

    /**
     * @param event being logged after a task is reassigned
     */
    public void afterTaskReassignedEvent(TaskEvent event) {
        LOG.info("Human Task <<" + event.getTask().getName() + ">>-(" + event.getTask().getId()
                + ") has been reassigned.");
    }

    /**
     * @param event being logged before a task is forwarded
     */
    public void beforeTaskForwardedEvent(TaskEvent event) {
        LOG.info("Human Task <<" + event.getTask().getName() + ">>-(" + event.getTask().getId()
                + ") is about to be forwarded.");
    }

    /**
     * @param event being logged after a task is forwarded
     */
    public void afterTaskForwardedEvent(TaskEvent event) {
        LOG.info("Human Task <<" + event.getTask().getName() + ">>-(" + event.getTask().getId()
                + ") has been forwarded.");
    }

    /**
     * @param event being logged before a task is delegated
     */
    public void beforeTaskDelegatedEvent(TaskEvent event) {
        LOG.info("Human Task <<" + event.getTask().getName() + ">>-(" + event.getTask().getId()
                + ") is about to be delegated.");
    }

    /**
     * @param event being logged after a task is delegated
     */
    public void afterTaskDelegatedEvent(TaskEvent event) {
        LOG.info("Human Task <<" + event.getTask().getName() + ">>-(" + event.getTask().getId()
                + ") has been delegated.");
    }

    /**
     * @param event being logged before a task is nominated
     */
    public void beforeTaskNominatedEvent(TaskEvent event) {
        LOG.info("Human Task <<" + event.getTask().getName() + ">>-(" + event.getTask().getId()
                + ") is about to be nominated.");
    }

    /**
     * @param event being logged after a task is nominated
     */
    public void afterTaskNominatedEvent(TaskEvent event) {
        LOG.info("Human Task <<" + event.getTask().getName() + ">>-(" + event.getTask().getId()
                + ") has been nominated.");
    }

    // ***************************/
    // ** TASK EXECUTION EVENTS **/
    // ***************************/

    /**
     * @param event being logged before a task is started
     */
    public void beforeTaskStartedEvent(TaskEvent event) {
        LOG.info("Human Task <<" + event.getTask().getName() + ">>-(" + event.getTask().getId()
                + ") is about to start.");
    }

    /**
     * @param event being logged after a task is started
     */
    public void afterTaskStartedEvent(TaskEvent event) {
        LOG.info(
                "Human Task <<" + event.getTask().getName() + ">>-(" + event.getTask().getId() + ") has started.");
    }

    /**
     * @param event being logged before a task is completed
     */
    public void beforeTaskCompletedEvent(TaskEvent event) {
        LOG.info("Human Task <<" + event.getTask().getName() + ">>-(" + event.getTask().getId()
                + ") is about to complete.");
    }

    /**
     * @param event being logged after a task is completed
     */
    public void afterTaskCompletedEvent(TaskEvent event) {
        LOG.info(
                "Human Task <<" + event.getTask().getName() + ">>-(" + event.getTask().getId() + ") has completed.");
    }

    /**
     * @param event being logged before a task is exited
     */
    public void beforeTaskExitedEvent(TaskEvent event) {
        LOG.info(
                "Human Task <<" + event.getTask().getName() + ">>-(" + event.getTask().getId() + ") is about to exit.");
    }

    /**
     * @param event being logged after a task is exited
     */
    public void afterTaskExitedEvent(TaskEvent event) {
        LOG.info(
                "Human Task <<" + event.getTask().getName() + ">>-(" + event.getTask().getId() + ") has exited.");
    }

    /**
     * @param event being logged before a task is suspended
     */
    public void beforeTaskSuspendedEvent(TaskEvent event) {
        LOG.info("Human Task <<" + event.getTask().getName() + ">>-(" + event.getTask().getId()
                + ") is about to be suspended.");
    }

    /**
     * @param event being logged after a task is suspended
     */
    public void afterTaskSuspendedEvent(TaskEvent event) {
        LOG.info("Human Task <<" + event.getTask().getName() + ">>-(" + event.getTask().getId()
                + ") has been suspended.");
    }

    /**
     * @param event being logged before a task is resumed
     */
    public void beforeTaskResumedEvent(TaskEvent event) {
        LOG.info("Human Task <<" + event.getTask().getName() + ">>-(" + event.getTask().getId()
                + ") is about to resume.");
    }

    /**
     * @param event being logged after a task is resumed
     */
    public void afterTaskResumedEvent(TaskEvent event) {
        LOG.info(
                "Human Task <<" + event.getTask().getName() + ">>-(" + event.getTask().getId() + ") has resumed.");
    }

    /**
     * @param event being logged before a task is stopped
     */
    public void beforeTaskStoppedEvent(TaskEvent event) {
        LOG.info(
                "Human Task <<" + event.getTask().getName() + ">>-(" + event.getTask().getId() + ") is about stop.");
    }

    /**
     * @param event being logged after a task is stopped
     */
    public void afterTaskStoppedEvent(TaskEvent event) {
        LOG.info(
                "Human Task <<" + event.getTask().getName() + ">>-(" + event.getTask().getId() + ") has stopped.");
    }

    /**
     * @param event being logged before a task is skipped
     */
    public void beforeTaskSkippedEvent(TaskEvent event) {
        LOG.info("Human Task <<" + event.getTask().getName() + ">>-(" + event.getTask().getId()
                + ") is about to be skipped.");
    }

    /**
     * @param event being logged after a task is skipped
     */
    public void afterTaskSkippedEvent(TaskEvent event) {
        LOG.info(
                "Human Task <<" + event.getTask().getName() + ">>-(" + event.getTask().getId() + ") has been skipped.");
    }

    /**
     * @param event being logged before a task has failed
     */
    public void beforeTaskFailedEvent(TaskEvent event) {
        LOG.info(
                "Human Task <<" + event.getTask().getName() + ">>-(" + event.getTask().getId() + ") is about to fail.");
    }

    /**
     * @param event being logged after a task has failed
     */
    public void afterTaskFailedEvent(TaskEvent event) {
        LOG.info(
                "Human Task <<" + event.getTask().getName() + ">>-(" + event.getTask().getId() + ") has failed.");
    }

    // *************************/
    // ** NOTIFICATION EVENTS **/
    // *************************/

    /**
     * @param event being logged before a task notification
     */
    public void beforeTaskNotificationEvent(TaskEvent event) {
        LOG.info("Human Task <<" + event.getTask().getName() + ">>-(" + event.getTask().getId()
                + ") is about to be notified.");
    }

    /**
     * @param event being logged after a task notification
     */
    public void afterTaskNotificationEvent(TaskEvent event) {
        LOG.info("Human Task <<" + event.getTask().getName() + ">>-(" + event.getTask().getId()
                + ") has been notified.");
    }

    // ********************/
    // ** EDITING EVENTS **/
    // ********************/

    /**
     * @param event being logged before a task is updated
     */
    public void beforeTaskUpdatedEvent(TaskEvent event) {
        LOG.info("Human Task <<" + event.getTask().getName() + ">>-(" + event.getTask().getId()
                + ") is about to be updated.");
    }

    /**
     * @param event being logged after a task is updated
     */
    public void afterTaskUpdatedEvent(TaskEvent event) {
        LOG.info(
                "Human Task <<" + event.getTask().getName() + ">>-(" + event.getTask().getId() + ") has been updated.");
    }

    /**
     * @param event being logged before a task is added
     */
    public void beforeTaskAddedEvent(TaskEvent event) {
        LOG.info("Human Task <<" + event.getTask().getName() + ">>-(" + event.getTask().getId()
                + ") is about to be added.");
    }

    /**
     * @param event being logged after a task is added
     */
    public void afterTaskAddedEvent(TaskEvent event) {
        LOG.info(
                "Human Task <<" + event.getTask().getName() + ">>-(" + event.getTask().getId() + ") has been added.");
    }

}