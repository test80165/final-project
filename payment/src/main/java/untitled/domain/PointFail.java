package untitled.domain;

import java.util.*;
import lombok.*;
import untitled.domain.*;
import untitled.infra.AbstractEvent;

@Data
@ToString
public class PointFail extends AbstractEvent {

    private Long id;
    private Integer pointCount;
    private String userId;
    private String status;
    private Long orderId;
}
