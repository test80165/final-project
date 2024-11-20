package untitled.external;

import java.util.Date;
import lombok.Data;

@Data
public class Inventory {

    private Long id;
    private String stockName;
    private Long stockCount;
    private String status;
    private Long price;
}
