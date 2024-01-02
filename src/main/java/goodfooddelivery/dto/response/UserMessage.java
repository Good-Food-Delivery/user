package goodfooddelivery.dto.response;

import lombok.Data;

@Data
public class UserMessage {

    private Long userAuthId;
    private String action;

    public Long getUserAuthId() {
        return userAuthId;
    }

    public String getAction() {
        return action;
    }
}
