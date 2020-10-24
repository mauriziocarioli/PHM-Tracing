package com.health_insurance.kafka;

/**
 * Constants needed by the Kafka producer
 * TODO read constants from configuration file instead
 */
public interface Constants {
    public static String KAFKA_BROKERS = "localhost:9092";
    public static Integer MESSAGE_COUNT=1000;
    public static String CLIENT_ID="phm";
    public static String TOPIC_NAME="PHM-Audit";
    public static String GROUP_ID_CONFIG="consumerGroup1";
    public static Integer MAX_NO_MESSAGE_FOUND_COUNT=100;
    public static String OFFSET_RESET_LATEST="latest";
    public static String OFFSET_RESET_EARLIER="earliest";
    public static Integer MAX_POLL_RECORDS=1;
}