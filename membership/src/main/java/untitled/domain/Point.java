package untitled.domain;

import java.time.LocalDate;
import java.util.Date;
import java.util.List;
import javax.persistence.*;
import lombok.Data;
import untitled.MembershipApplication;
import untitled.domain.CountInitialized;
import untitled.domain.PointFail;
import untitled.domain.PointSucces;

@Entity
@Table(name = "Point_table")
@Data
//<<< DDD / Aggregate Root
public class Point {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private Integer pointCount;

    private String userId;

    private String orderId;

    private String status;

    @PostPersist
    public void onPostPersist() {
        PointSucces pointSucces = new PointSucces(this);
        pointSucces.publishAfterCommit();

        PointFail pointFail = new PointFail(this);
        pointFail.publishAfterCommit();

        CountInitialized countInitialized = new CountInitialized(this);
        countInitialized.publishAfterCommit();
    }

    public static PointRepository repository() {
        PointRepository pointRepository = MembershipApplication.applicationContext.getBean(
            PointRepository.class
        );
        return pointRepository;
    }

    //<<< Clean Arch / Port Method
    public static void decreaseCount(PayApproval payApproval) {
        //implement business logic here:

        /** Example 1:  new item 
        Point point = new Point();
        repository().save(point);

        PointSucces pointSucces = new PointSucces(point);
        pointSucces.publishAfterCommit();
        PointFail pointFail = new PointFail(point);
        pointFail.publishAfterCommit();
        */

        /** Example 2:  finding and process
        
        repository().findById(payApproval.get???()).ifPresent(point->{
            
            point // do something
            repository().save(point);

            PointSucces pointSucces = new PointSucces(point);
            pointSucces.publishAfterCommit();
            PointFail pointFail = new PointFail(point);
            pointFail.publishAfterCommit();

         });
        */

    }

    //>>> Clean Arch / Port Method
    //<<< Clean Arch / Port Method
    public static void increaseCount(StockIncreased stockIncreased) {
        //implement business logic here:

        /** Example 1:  new item 
        Point point = new Point();
        repository().save(point);

        */

        /** Example 2:  finding and process
        
        repository().findById(stockIncreased.get???()).ifPresent(point->{
            
            point // do something
            repository().save(point);


         });
        */

    }
    //>>> Clean Arch / Port Method

}
//>>> DDD / Aggregate Root
