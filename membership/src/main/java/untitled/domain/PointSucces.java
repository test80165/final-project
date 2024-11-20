package untitled.domain;

import java.time.LocalDate;
import java.util.*;
import lombok.*;
import untitled.domain.*;
import untitled.infra.AbstractEvent;

//<<< DDD / Domain Event
@Data
@ToString
public class PointSucces extends AbstractEvent {

    private Long id;
    private Integer pointCount;
    private String userId;
    private String status;
    private Long orderId;

    public PointSucces(Point aggregate) {
        super(aggregate);
    }

    public PointSucces() {
        super();
    }
}
//>>> DDD / Domain Event
