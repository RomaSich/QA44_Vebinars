import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Start {
    WebDriver wd;
    @Test
    public void Test()
    {
        wd = new ChromeDriver();
        wd.get("https://drive.google.com/drive/folders/1jI7qnogOJudTwNMOsitY4m5zxIFQ_Hq3?ths=true");
    }
}
