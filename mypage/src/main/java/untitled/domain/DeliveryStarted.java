package untitled.domain;

import java.time.LocalDate;
import java.util.*;
import lombok.Data;
import untitled.infra.AbstractEvent;

@Data
public class DeliveryStarted extends AbstractEvent {

    private Long id;
    private Long orderId;
    private String userId;
    private String address;
    private String quantity;
    private String status;
    private Long productId;
}
