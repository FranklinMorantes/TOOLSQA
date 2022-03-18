package task;


import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.annotations.DefaultUrl;

@DefaultUrl("https://demoqa.com/")
public class TaskAlerts extends PageObject {

    public static final Target CLICK_ALERTS =
            Target.the("SELECCIONAR DATE PICKER")
                    .located(By.xpath("//body/div[@id='app']/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[3]/span[1]/div[1]/div[1]"));
    public static final Target CLICK_ALERTS1 =
            Target.the("SELECCIONAR DATE ")
                    .located(By.xpath("//body/div[@id='app']/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[3]/div[1]/ul[1]/li[2]"));
    public static final Target CLICK_CLICK1 =
            Target.the("SELECCIONAR Alert")
                    .located(By.xpath("//button[@id='alertButton']"));
    public static final Target CLICK_CLICK2 =
            Target.the("SELECCIONAR Alert")
                    .located(By.xpath("//button[@id='timerAlertButton']"));
    public static final Target CLICK_CLICK3 =
            Target.the("SELECCIONAR Alert")
                    .located(By.xpath("//button[@id='confirmButton']"));
    public static final Target CLICK_CLICK4 =
            Target.the("SELECCIONAR Alert")
                    .located(By.xpath("//button[@id='promtButton']"));



}
