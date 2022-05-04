package edu.dhbw.stuttgart.tinf20b.cloud.cloudproject.mattermost.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class WebhookResponse {
    private String text;
    private String username;
    private String response_type = "ephemeral";
}
