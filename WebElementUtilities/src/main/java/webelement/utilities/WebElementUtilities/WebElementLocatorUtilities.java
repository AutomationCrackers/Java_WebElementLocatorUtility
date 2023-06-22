package webelement.utilities.WebElementUtilities;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.ElementNotVisibleException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

/**
 * Hello world!
 *
 */
public class WebElementLocatorUtilities 
{	
	 public static WebDriver driver;
     public static WebDriverWait wait =  new WebDriverWait(driver, Duration.ofSeconds(3));
     
     //Pass the Id Value and get the WebElemnt in return
     public static WebElement FindByID (String IdValue)
     {
         try
         {            
             wait.until(ExpectedConditions.stalenessOf(driver.findElement(By.id(IdValue))));
             wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.id(IdValue))));
             wait.until(ExpectedConditions.presenceOfElementLocated(By.id(IdValue)));
             if (driver.findElement(By.id(IdValue)).isDisplayed())
             {
            	 System.out.println("Element is Displayed Successfully");
             }
             return driver.findElement(By.id(IdValue));
         }
         catch(Exception ex)
         {
        	 System.out.println("Element is not Displayed "+ex.getMessage());
             throw new ElementNotVisibleException("Element is not Displayed " + ex.getMessage());
         }
     }
   
   //Pass the Name Value and get the WebElemnt in return
     public static WebElement FindByName (String NameValue)
     {
         try
         {
             wait.until(ExpectedConditions.stalenessOf(driver.findElement(By.name(NameValue))));
             wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.name(NameValue))));
             wait.until(ExpectedConditions.presenceOfElementLocated(By.name(NameValue)));
             if (driver.findElement(By.name(NameValue)).isDisplayed())
             {
            	 System.out.println("Element is Displayed Successfully");
             }
             return driver.findElement(By.name(NameValue));
         }
         catch(Exception ex)
         {
        	 System.out.println("Element is not Displayed "+ex.getMessage());
             throw new ElementNotVisibleException("Element is not Displayed " + ex.getMessage());
         }
     }
     
   //Pass the Css Value and get the WebElemnt in return
     public static WebElement FindByCssSelector (String CssSelectorValue)
     {
         try
         {
             wait.until(ExpectedConditions.stalenessOf(driver.findElement(By.cssSelector(CssSelectorValue))));
             wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.cssSelector(CssSelectorValue))));
             wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector(CssSelectorValue)));
             if (driver.findElement(By.cssSelector(CssSelectorValue)).isDisplayed())
             {
            	 System.out.println("Element is Displayed Successfully");
             }
             return driver.findElement(By.cssSelector(CssSelectorValue));
         }
         catch(Exception ex)
         {
        	 System.out.println("Element is not Displayed "+ex.getMessage());
             throw new ElementNotVisibleException("Element is not Displayed " + ex.getMessage());
         }
     }
     
   //Pass the XPath Value and get the WebElemnt in return
     public static WebElement FindByXPath (String XPath)
     {
         try
         {
             wait.until(ExpectedConditions.stalenessOf(driver.findElement(By.xpath(XPath))));
             wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath(XPath))));
             wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(XPath)));
             if (driver.findElement(By.xpath(XPath)).isDisplayed())
             {
            	 System.out.println("Element is Displayed Successfully");
             }
             return driver.findElement(By.xpath(XPath));
         }
         catch(Exception ex)
         {
        	 System.out.println("Element is not Displayed "+ex.getMessage());
             throw new ElementNotVisibleException("Element is not Displayed " + ex.getMessage());
         }
     }
    
   //Pass the TagName Value and get the WebElemnt in return
     public static WebElement FindByTagName (String TagName)
     {
         try
         {
             wait.until(ExpectedConditions.stalenessOf(driver.findElement(By.tagName(TagName))));
             wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.tagName(TagName))));
             wait.until(ExpectedConditions.presenceOfElementLocated(By.tagName(TagName)));
             if (driver.findElement(By.tagName(TagName)).isDisplayed())
             {
            	 System.out.println("Element is Displayed Successfully");
             }
             return driver.findElement(By.tagName(TagName));
         }
         catch(Exception ex)
         {
        	 System.out.println("Element is not Displayed "+ex.getMessage());
             throw new ElementNotVisibleException("Element is not Displayed " + ex.getMessage());
         }
     }
     
   //Pass the LinkText Value and get the WebElemnt in return
     public static WebElement FindByLinkText (String LinkText)
     {
         try
         {
             wait.until(ExpectedConditions.stalenessOf(driver.findElement(By.linkText(LinkText))));
             wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.linkText(LinkText))));
             wait.until(ExpectedConditions.presenceOfElementLocated(By.linkText(LinkText)));
             if (driver.findElement(By.linkText(LinkText)).isDisplayed())
             {
            	 System.out.println("Element is Displayed Successfully");
             }
             return driver.findElement(By.linkText(LinkText));
         }
         catch(Exception ex)
         {
        	 System.out.println("Element is not Displayed "+ex.getMessage());
             throw new ElementNotVisibleException("Element is not Displayed " + ex.getMessage());
         }
     }
     
   //Pass the PartialLinkText Value and get the WebElemnt in return
     public static WebElement FindByPartialLinkText (String PartialLinkText)
     {
         try
         {
             wait.until(ExpectedConditions.stalenessOf(driver.findElement(By.partialLinkText(PartialLinkText))));
             wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.partialLinkText(PartialLinkText))));
             wait.until(ExpectedConditions.presenceOfElementLocated(By.partialLinkText(PartialLinkText)));
             if (driver.findElement(By.partialLinkText(PartialLinkText)).isDisplayed())
             {
            	 System.out.println("Element is Displayed Successfully");
             }
             return driver.findElement(By.partialLinkText(PartialLinkText));
         }
         catch(Exception ex)
         {
        	 System.out.println("Element is not Displayed "+ex.getMessage());
             throw new ElementNotVisibleException("Element is not Displayed " + ex.getMessage());
         }
     }
     
     
  
}
