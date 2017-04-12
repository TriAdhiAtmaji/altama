
import com.altama.forecast.application.C_ElementvalueService;
import com.altama.forecast.domain.c_elementvalue.C_ElementvalueRepository;
import com.altama.forecast.interfaces.web.facade.dto.c_elementvalue.C_ElementvalueDTO;
import java.util.List;
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
public class C_ElementvalueTest {

    @Autowired
    private C_ElementvalueRepository dataHistoryRepository;

    @Autowired
    private C_ElementvalueService dataHistoryService;

    @Test
    public void DataHistoryServiceTest() {
        Validate.notNull(dataHistoryRepository);
        print("Order Processing");

        /* Order get Dummy */
        C_ElementvalueDTO dataHistory = dataHistoryService.getDummy();
        System.out.println("Order :" + dataHistory.toString());

        dataHistoryService.saveC_Element(dataHistory);
        System.out.println("Order has been saved succesfully");

        System.out.println("");
        System.out.println("Find by ID");
        C_ElementvalueDTO d = dataHistoryService.findByID(dataHistory.getC_elementvalue_id());
        System.out.println("Order :" + d.toString());

        System.out.println("");
        System.out.println("Find ALL");
        List<C_ElementvalueDTO> listOrder = dataHistoryService.findAll();
        for (C_ElementvalueDTO tk : listOrder) {
            System.out.println("Order :" + tk.toString());
        }
    }

    private void print(String msg) {
        System.out.println("------------------------------------------------------------------------");
        System.out.println(msg);
        System.out.println("------------------------------------------------------------------------");
    }
}
