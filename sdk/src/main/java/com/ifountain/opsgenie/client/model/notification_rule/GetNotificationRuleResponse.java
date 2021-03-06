package com.ifountain.opsgenie.client.model.notification_rule;

import com.ifountain.opsgenie.client.model.BaseResponse;
import com.ifountain.opsgenie.client.model.beans.NotificationRule;
import org.codehaus.jackson.annotate.JsonUnwrapped;

/**
 * Represents OpsGenie service response for get notificationRule request.
 *
 * @author Mehmet Mustafa Demir
 * @see com.ifountain.opsgenie.client.INotificationRuleOpsGenieClient#getNotificationRule(GetNotificationRuleRequest)
 */
public class GetNotificationRuleResponse extends BaseResponse {
    @JsonUnwrapped
    private NotificationRule notificationRule;

    /**
     * Details of notificationRule
     *
     * @see NotificationRule
     */
    public NotificationRule getNotificationRule() {
        return notificationRule;
    }

    /**
     * Sets details of notificationRule
     *
     * @see NotificationRule
     */
    public void setNotificationRule(NotificationRule notificationRule) {
        this.notificationRule = notificationRule;
    }

}
