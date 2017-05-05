
import com.altama.forecast.application.Ad_treenodeu1Service;
import com.altama.forecast.domain.ad_treenodeu1.Ad_treenodeu1Repository;
import com.altama.forecast.interfaces.web.facade.dto.ad_treenodeu1.Ad_treenodeu1DTO;
import java.util.List;
import org.apache.commons.lang.Validate;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 *
 * @author 3AD
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {
    "classpath:/altama-context-application.xml",
    "classpath:/altama-context-infrastructure.xml"})
public class Ad_treenodeu1Test {

    @Autowired
    private Ad_treenodeu1Repository dataHistoryRepository;

    @Autowired
    private Ad_treenodeu1Service dataHistoryService;

    @Test
    public void DataHistoryServiceTest() {
        Validate.notNull(dataHistoryRepository);
        print("Order Processing");

        /* Order get Dummy */
//        Ad_treenodeu1DTO dataHistory = dataHistoryService.getDummy();
//        System.out.println("Order :" + dataHistory.toString());
//
//        dataHistoryService.saveAd_treenodeu1(dataHistory);
//        System.out.println("Order has been saved succesfully");

//        System.out.println("");
//        System.out.println("Find by ID");
//        Ad_treenodeu1DTO d = dataHistoryService.findByID(dataHistory.getAd_tree_id());
//        System.out.println("Order :" + d.toString());

        System.out.println("");
        System.out.println("Find ALL");
        List<Ad_treenodeu1DTO> listOrder = dataHistoryService.findAll();
        for (Ad_treenodeu1DTO tk : listOrder) {
            System.out.println("Order :" + tk.toString());
        }
    }

    private void print(String msg) {
        System.out.println("------------------------------------------------------------------------");
        System.out.println(msg);
        System.out.println("------------------------------------------------------------------------");
    }

}
