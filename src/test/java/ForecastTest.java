import com.altama.forecast.application.ForecastService;
import com.altama.forecast.domain.forecast.ForecastRepository;
import com.altama.forecast.interfaces.web.facade.dto.forecast.ForecastDTO;
import java.util.List;
import org.apache.commons.lang.Validate;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author 3AD
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {
    "classpath:/altama-context-application.xml",
    "classpath:/altama-context-infrastructure.xml"})
public class ForecastTest {

    @Autowired
    private ForecastRepository dataHistoryRepository;

    @Autowired
    private ForecastService dataHistoryService;

    @Test
    public void DataHistoryServiceTest() {
        Validate.notNull(dataHistoryRepository);
        print("Order Processing");

        /* Order get Dummy */
        ForecastDTO dataHistory = dataHistoryService.getDummy();
        System.out.println("Order :" + dataHistory.toString());

        dataHistoryService.saveForecast(dataHistory);
        System.out.println("Order has been saved succesfully");

        System.out.println("");
        System.out.println("Find by ID");
        ForecastDTO d = dataHistoryService.findByID(dataHistory.getBrandID());
        System.out.println("Order :" + d.toString());

        System.out.println("");
        System.out.println("Find ALL");
        List<ForecastDTO> listOrder = dataHistoryService.findAll();
        for (ForecastDTO tk : listOrder) {
            System.out.println("Order :" + tk.toString());
        }
    }

    private void print(String msg) {
        System.out.println("------------------------------------------------------------------------");
        System.out.println(msg);
        System.out.println("------------------------------------------------------------------------");
    }

}
