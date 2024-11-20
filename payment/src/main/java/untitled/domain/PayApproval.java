package untitled.domain;

import java.time.LocalDate;
import java.util.*;
import lombok.*;
import untitled.domain.*;
import untitled.infra.AbstractEvent;

//<<< DDD / Domain Event
@Data
@ToString
public class PayApproval extends AbstractEvent {

    private Long id;
    private String orderId;
    private Integer payAmount;
    private String userId;
    private String status;

    public PayApproval(Pay aggregate) {
        super(aggregate);
    }

    public PayApproval() {
        super();
    }
}
//>>> DDD / Domain Event
