package io.numaproj.numaflow.sinker;

import java.time.Instant;

/**
 * Datum contains methods to get the payload information.
 */
public interface Datum {
    /**
     * method to get the payload keys
     *
     * @return returns the datum keys.
     */
    String[] getKeys();

    /**
     * method to get the payload value
     *
     * @return returns the payload value in byte array
     */
    byte[] getValue();

    /**
     * method to get the event time of the payload
     *
     * @return returns the event time of the payload
     */
    Instant getEventTime();

    /**
     * method to get the watermark information
     *
     * @return returns the watermark
     */
    Instant getWatermark();

    /**
     * method to get the ID for the Payload
     *
     * @return returns the ID
     */
    String getId();
}
