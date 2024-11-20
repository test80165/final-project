package untitled.domain;

import java.time.LocalDate;
import java.util.*;
import lombok.*;
import untitled.domain.*;
import untitled.infra.AbstractEvent;

//<<< DDD / Domain Event
@Data
@ToString
public class CountInitialized extends AbstractEvent {

    private Long id;
    private Integer pointCount;
    private String userId;
    private String orderId;
    private String status;

    public CountInitialized(Point aggregate) {
        super(aggregate);
    }

    public CountInitialized() {
        super();
    }
}
//>>> DDD / Domain Event
