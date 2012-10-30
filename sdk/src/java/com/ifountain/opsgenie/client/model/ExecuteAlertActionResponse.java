package com.ifountain.opsgenie.client.model;

/**
 * Represents the OpsGenie service response for an execute alert action request.
 *
 * @author Sezgin Kucukkaraaslan
 * @version 10/30/12 5:01 PM
 * @see com.ifountain.opsgenie.client.IOpsGenieClient#executeAlertAction(ExecuteAlertActionRequest)
 */
public class ExecuteAlertActionResponse implements Response {
    private String result;

    /**
     * Action execution result.
     */
    public String getResult() {
        return result;
    }

    /**
     * Sets the action execution result.
     */
    public void setResult(String result) {
        this.result = result;
    }
}
