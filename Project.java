package project;
import java.util.Iterator;
import java.util.Set;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class Project{
public static void main(String[] args) throws InterruptedException {
//TODO Auto-generated method stub 
System.setProperty("webdriver.chrome.driver","C:\\Users\\Pavani\\Downloads\\chromedriver_win32\\chromedriver.exe");
WebDriver ob=new ChromeDriver();
ob.get("https://google.com");
ob.manage().window().maximize();
WebElement search=ob.findElement(By.name("q"));
search.sendKeys("tsspdcl");
search.sendKeys(Keys.ENTER);
WebElement link=ob.findElement(By.xpath("(//a[text()='Pay Your Bill'])[1]"));
link.click();
WebElement billdesk=ob.findElement(By.xpath("/html/body/section/div/div[2]/div/div[3]/figure/a/img"));
billdesk.click();
Set<String> win=ob.getWindowHandles();
Iterator<String> it=win.iterator();
while(it.hasNext()) {
String child=it.next();
if(!win.equals(child)) {
ob.switchTo().window(child);
}
}
WebElement uscno=ob.findElement(By.name("uscno"));
uscno.sendKeys("101316764");
WebElement mail=ob.findElement(By.name("txtEmailID"));
mail.sendKeys("selenium@yahoo.com");
WebElement mkp=ob.findElement(By.name("makePayment"));
mkp.click();
WebElement btn=ob.findElement(By.name("button2"));
btn.click();
ob.switchTo().alert().accept();
WebElement cnumber=ob.findElement(By.name("cnumber"));
cnumber.sendKeys("4732574274537994");
WebElement expmon=ob.findElement(By.name("expmon"));
expmon.sendKeys("1");
WebElement expyr=ob.findElement(By.name("expyr"));
expyr.sendKeys("2");
WebElement cvv=ob.findElement(By.name("cvv2"));
cvv.sendKeys("577");
WebElement cname=ob.findElement(By.name("cname2"));
cname.sendKeys("Sele Nium");
ob.close();
}
}