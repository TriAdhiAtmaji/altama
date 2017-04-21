
import com.altama.forecast.application.M_productService;
import com.altama.forecast.domain.m_product.M_productRepository;
import com.altama.forecast.interfaces.web.facade.dto.m_productDTO.M_productDTO;
import java.math.BigDecimal;
import java.util.List;
import org.apache.commons.lang.Validate;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {
    "classpath:/altama-context-application.xml",
    "classpath:/altama-context-infrastructure.xml"})
public class M_productTest {

    @Autowired
    private M_productRepository dataHistoryRepository;

    @Autowired
    private M_productService dataHistoryService;

    @Test
    public void DataHistoryServiceTest() {
        Validate.notNull(dataHistoryRepository);
        print("Order Processing");

        /* Order get Dummy */
        M_productDTO dataHistory = dataHistoryService.getDummy();

        System.out.println("Order :" + dataHistory.toString());

        dataHistoryService.saveAd_treenodeu1(dataHistory);
        M_productDTO dataHistory2 = dataHistoryService.getDummy2();
        dataHistoryService.saveAd_treenodeu1(dataHistory2);
        System.out.println("Order has been saved succesfully");

        dataHistoryService.saveAd_treenodeu1(dataHistory);
        System.out.println("Order has been saved succesfully");
        System.out.println("");
        System.out.println("Find by ID");
        M_productDTO d = dataHistoryService.findByID(dataHistory.getM_product_id());
        System.out.println("Order :" + d.toString());

        System.out.println("");
        System.out.println("Find ALL");
        List<M_productDTO> listOrder = dataHistoryService.findAll();
        for (M_productDTO tk : listOrder) {
            System.out.println("Order :" + tk.toString());
        }
    }

    private void print(String msg) {
        System.out.println("------------------------------------------------------------------------");
        System.out.println(msg);
        System.out.println("------------------------------------------------------------------------");
    }

}
