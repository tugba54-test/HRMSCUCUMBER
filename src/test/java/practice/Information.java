package practice;


public class Information {
//import org.openqa.selenium.By;
//import org.openqa.selenium.JavascriptExecutor;
//import org.openqa.selenium.support.ui.ExpectedConditions;
//import org.openqa.selenium.support.ui.WebDriverWait;
/*
* Scenario: there is a submit button on the page it has id property. 
* By using id we got an element not found exception, how will you handle this situation? 
* What might be the problem in this case?
*/
/*
* We can handle this exception  5 ways 
* 
* 
* 1--->We can use xpath, css or parent child 
* 
* driver.findElement(By.id("id value")).click();
* driver.findElement(By.xpath(//tagname[@id='idvalue'])).click();
* driver.findElement(By.css(tagname[id='idvalue'])).click();
* 
* 
* 
* 
* 2--->We can  check that  if the button is inside the frame 
*     we can switch the frame first and find the elements
* 
		 * We can switch to a frame using three different methods
		 * driver.switchTo().frame();
		 * . By Index. 
		 * . By NameOrID
		 * . By WebElement
* 
* 
* 
* 3--->We can use submit() method  rather than click() method.
*      element.submit();
*      driver.findElement(By.id("id value")).click();
*      driver.findElement(By.id("id value")).submit();
* 
* 
* 
* 4--->We can use the javaScriptExecutor for this submit button to click. 
*      create object of JavascriptExecutor interface and down-cast web-driver to it.
		JavascriptExecutor js=(JavascriptExecutor)driver;
		click on on id button  using js
		js.executeScript("arguments[0].click()", idButton);
* 
* 
* 
* 
* 5--->Sometimes element takes  extra time for the button to get loaded in DOM. 
*      So we can add Explicit wait until the element becomes clickable.
* 
*      create object of WebDriverWait
*      WebDriverWait wait= new WebDriverWait (driver,10);
		wait.until(ExpectedConditions.elementToBeClickable(By.id("id value"));
* 
* 
*/

}