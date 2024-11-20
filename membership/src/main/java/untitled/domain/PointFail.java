package untitled.domain;

import java.time.LocalDate;
import java.util.*;
import lombok.*;
import untitled.domain.*;
import untitled.infra.AbstractEvent;

//<<< DDD / Domain Event
@Data
@ToString
public class PointFail extends AbstractEvent {

    private Long id;
    private Integer pointCount;
    private String userId;
    private String status;
    private Long orderId;

    public PointFail(Point aggregate) {
        super(aggregate);
    }

    public PointFail() {
        super();
    }
}
//>>> DDD / Domain Event
