package com.health_insurance.tracing;

import java.util.concurrent.ExecutionException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import org.slf4j.*;
import org.apache.kafka.clients.producer.*;
import org.kie.api.event.rule.*;
import com.health_insurance.kafka.*;

public class PHMAgendaEventListener implements AgendaEventListener {
    private static final Logger LOG = LoggerFactory.getLogger(PHMAgendaEventListener.class);
    String log;
    private static final Producer<Long, String> producer = ProducerCreator.createProducer();
    DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
    /**
     * Constructor
     */
    public PHMAgendaEventListener() {
        LOG.info("Registered PHMAgendaEventListener.");
    }

    //****************/
    //* Match Events */
    //****************/

    /**
     * @param event being logged when a match is created in the agenda
     */
    public void matchCreated(MatchCreatedEvent event) {
        String ts = "["+dtf.format(LocalDateTime.now())+"] "; //2016/11/16 12:08:43
        log =
        "Match with Rule <<" +
        event.getMatch().getRule().getName() +
        ">> was created.";
        LOG.info(log);
        ProducerRecord<Long, String> record = new ProducerRecord<Long, String>(Constants.TOPIC_NAME,ts+log);
        try {
            RecordMetadata metadata = producer.send(record).get();
            LOG.info("record sent to partition "+metadata.partition()+" with offset "+metadata.offset());
        } catch (ExecutionException e) {
            LOG.error("Error in sending record to Kafka");
        } catch (InterruptedException e) {
            LOG.error("Error in sending record to Kafka");
        }
    }

    /**
     * @param event being logged when a match is cancelled in the agenda
     */
    public void matchCancelled(MatchCancelledEvent event) {
        String ts = "["+dtf.format(LocalDateTime.now())+"] "; //2016/11/16 12:08:43
        log =
        "Match with Rule <<" +
        event.getMatch().getRule().getName() +
        ">> was cancelled.";
        LOG.info(log);
        ProducerRecord<Long, String> record = new ProducerRecord<Long, String>(Constants.TOPIC_NAME,ts+log);
        try {
            RecordMetadata metadata = producer.send(record).get();
            LOG.info("record sent to partition "+metadata.partition()+" with offset "+metadata.offset());
        } catch (ExecutionException e) {
            LOG.error("Error in sending record to Kafka");
        } catch (InterruptedException e) {
            LOG.error("Error in sending record to Kafka");
        }
    }

    /**
     * @param event being logged before a match is fired in the agenda
     */
    public void beforeMatchFired(BeforeMatchFiredEvent event) {
        String ts = "["+dtf.format(LocalDateTime.now())+"] "; //2016/11/16 12:08:43
        log =
        "Match with Rule <<" +
        event.getMatch().getRule().getName() +
        ">> is about to fire.";
        LOG.info(log);
        ProducerRecord<Long, String> record = new ProducerRecord<Long, String>(Constants.TOPIC_NAME,ts+log);
        try {
            RecordMetadata metadata = producer.send(record).get();
            LOG.info("record sent to partition "+metadata.partition()+" with offset "+metadata.offset());
        } catch (ExecutionException e) {
            LOG.error("Error in sending record to Kafka");
        } catch (InterruptedException e) {
            LOG.error("Error in sending record to Kafka");
        }
    }

    /**
     * @param event being logged after a match is fired in the agenda
     */
    public void afterMatchFired(AfterMatchFiredEvent event) {
        String ts = "["+dtf.format(LocalDateTime.now())+"] "; //2016/11/16 12:08:43
        log =
        "Match with Rule <<" +
        event.getMatch().getRule().getName() +
        ">> has fired.";
        LOG.info(log);
        ProducerRecord<Long, String> record = new ProducerRecord<Long, String>(Constants.TOPIC_NAME,ts+log);
        try {
            RecordMetadata metadata = producer.send(record).get();
            LOG.info("record sent to partition "+metadata.partition()+" with offset "+metadata.offset());
        } catch (ExecutionException e) {
            LOG.error("Error in sending record to Kafka");
        } catch (InterruptedException e) {
            LOG.error("Error in sending record to Kafka");
        }
    }

    //***********************/
    //* Agenda Group Events */
    //***********************/

    /**
     * @param event being logged when a group is popped from the agenda
     */
    public void agendaGroupPopped(AgendaGroupPoppedEvent event) {
        LOG.info(
                "Agenda Group <<" +
                        event.getAgendaGroup().getName() +
                        ">> has been popped."
        );
    }

    /**
     * @param event being logged when a group is pushed to the agenda
     */
    public void agendaGroupPushed(AgendaGroupPushedEvent event) {
        LOG.info("Agenda Group <<" +
                event.getAgendaGroup().getName() +
                ">> has been pushed."
        );
    }

    //**************************/
    //* Rule Flow Group Events */
    //**************************/

    /**
     * @param event being logged before a ruleflow group is activated in the agenda
     */
    public void beforeRuleFlowGroupActivated(RuleFlowGroupActivatedEvent event) {
        LOG.info(
                "Rule Flow Group <<" +
                        event.getRuleFlowGroup().getName() +
                        ">> is about to be activated."
        );
    }

    /**
     * @param event being logged after a ruleflow group is activated in the agenda
     */
    public void afterRuleFlowGroupActivated(RuleFlowGroupActivatedEvent event) {
        LOG.info(
                "Rule Flow Group <<" +
                        event.getRuleFlowGroup().getName() +
                        ">> has been activated."
        );
    }

    /**
     * @param event being logged before a ruleflow group is deactivated in the agenda
     */
    public void beforeRuleFlowGroupDeactivated(RuleFlowGroupDeactivatedEvent event) {
        LOG.info(
                "Rule Flow Group <<" +
                        event.getRuleFlowGroup().getName() +
                        ">> is about to be deactivated."
        );
    }

    /**
     * @param event being logged after a ruleflow group is deactivated in the agenda
     */
    public void afterRuleFlowGroupDeactivated(RuleFlowGroupDeactivatedEvent event) {
        LOG.info(
                "Rule Flow Group <<" +
                        event.getRuleFlowGroup().getName() +
                        ">> has been deactivated."
        );
    }
}