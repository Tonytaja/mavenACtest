import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class seleniumWebDriver {
    public static void main(String[] args) {
        WebDriver driver;
        System.setProperty("webdriver.edge.driver","E:\\EdgeDriver\\msedgedriver.exe");
        driver= new EdgeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.amazon.pl/");

    }
}
