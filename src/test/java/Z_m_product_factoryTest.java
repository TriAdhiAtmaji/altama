
import com.altama.forecast.application.Z_m_product_factoryService;
import com.altama.forecast.domain.z_m_product_factory.Z_m_product_factoryRepository;
import com.altama.forecast.interfaces.web.facade.dto.z_m_product_factory.Z_m_product_factoryDTO;
import java.util.Set;
import org.apache.commons.lang.Validate;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 *
 * @author admin
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {
    "classpath:/altama-context-application.xml",
    "classpath:/altama-context-infrastructure.xml"})
public class Z_m_product_factoryTest {

    @Autowired
    private Z_m_product_factoryRepository dataHistoryRepository;

    @Autowired
    private Z_m_product_factoryService dataHistoryService;

    @Test
    public void DataHistoryServiceTest() {
        Validate.notNull(dataHistoryRepository);
        print("Order Processing");

        /* Order get Dummy */
        Z_m_product_factoryDTO dataHistory = dataHistoryService.getDummy();
        System.out.println("Order :" + dataHistory.toString());

        dataHistoryService.saveZMFactory(dataHistory);
        System.out.println("Order has been saved succesfully");

        System.out.println("");
        System.out.println("Find by ID");
        Z_m_product_factoryDTO d = dataHistoryService.findByID(dataHistory.getZ_m_product_factory_id());
        System.out.println("Order :" + d.toString());

        System.out.println("");
        System.out.println("Find ALL");
        Set<Z_m_product_factoryDTO> listOrder = dataHistoryService.findAll();
        for (Z_m_product_factoryDTO tk : listOrder) {
            System.out.println("Order :" + tk.toString());
        }
    }

    private void print(String msg) {
        System.out.println("------------------------------------------------------------------------");
        System.out.println(msg);
        System.out.println("------------------------------------------------------------------------");
    }
}
