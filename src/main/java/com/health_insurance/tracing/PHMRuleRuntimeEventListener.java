package com.health_insurance.tracing;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.kie.api.event.rule.*;

public class PHMRuleRuntimeEventListener implements RuleRuntimeEventListener {
    private static final Logger LOG = LoggerFactory.getLogger(PHMRuleRuntimeEventListener.class);
    /**
     * Constructor
     */
    public PHMRuleRuntimeEventListener() {
        LOG.info("Registered PHMRuleRuntimeEventListener.");
    }


    /**
     * @param event being logged when an object is inserted in the working memory
     */
    public void objectInserted(ObjectInsertedEvent event) {
        if (event.getRule() == null) {
            LOG.info("Rule is null.");
        } else if (event.getRule().getName() == null) {
            LOG.info("Rule name is null.");
        }
        if (event.getObject() == null) {
            LOG.info("Object is null.");
        }
        LOG.info(
                "Rule <<" +
                        /**
                         * TODO: Rule appears to be null 
                         **/ 
                        //event.getRule().getName()+
                        ">> has caused Object (" +
                        event.getObject().toString()+
                        ") of class <<" +
                        event.getObject().getClass().getName()+
                        ">> to be inserted."
        );
    }


    /**
     * @param event being logged when an object is updated in the working memory
     */
    public void objectUpdated(ObjectUpdatedEvent event) {
        LOG.info(
                "Rule <<" +
                        //event.getRule().getName()+
                        ">> has caused Object (" +
                        event.getObject().toString()+
                        ") of class <<" +
                        event.getObject().getClass().getName()+
                        ">> to be updated."
        );
    }


    /**
     * @param event being logged when an object is deleted from the working memory
     */
    public void objectDeleted(ObjectDeletedEvent event) {
        LOG.info(
                "Rule <<" +
                        //event.getRule().getName() +
                        ">> has caused Object (" +
                        event.getOldObject().toString()+
                        ") of class <<" +
                        event.getOldObject().getClass().getName()+
                        ">> to be deleted."
        );
    }
}
