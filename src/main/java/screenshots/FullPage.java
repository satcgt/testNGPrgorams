package screenshots;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import javax.imageio.ImageIO;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import ru.yandex.qatools.ashot.AShot;
import ru.yandex.qatools.ashot.Screenshot;
import ru.yandex.qatools.ashot.shooting.ShootingStrategies;
 
public class FullPage {
 
	public static void main(String[] args) throws IOException, InterruptedException {

		WebDriver driver = new ChromeDriver();

		driver.get("http://automationbykrishna.com/");

		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));


		driver.findElement(By.id("basicelements")).click();

		Thread.sleep(1000);

		Screenshot screenshot = new AShot().

				shootingStrategy(ShootingStrategies.viewportPasting(1000))

				.takeScreenshot(driver);

 
		

//		TakesScreenshot sc = (TakesScreenshot)driver;

//		File file = sc.getScreenshotAs(OutputType.FILE);

////		File file = link.getScreenshotAs(OutputType.FILE);

//		Path dest = Paths.get("./Screenshots/sc112.jpg");

//		Files.move(file.toPath(), dest);

//		driver.close();

		ImageIO.write(screenshot.getImage(), "PNG", new File("C:\\Users\\srraturi\\Pictures\\Screenshots\screenshot11.png"));

		driver.quit();
 
	}
 
}

 