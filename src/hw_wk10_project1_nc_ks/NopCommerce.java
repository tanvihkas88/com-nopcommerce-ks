package hw_wk10_project1_nc_ks;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

/*
Project-1 - ProjectName : com-nopcommerce
BaseUrl = https://demo.nopcommerce.com/
1. Setup chrome browser.
2. Open URL.
3. Print the title of the page.
4. Print the current url.
5. Print the page source.
6. Navigate to Url.
“https://demo.nopcommerce.com/login?returnUrl=
%2F”
7. Print the current url.
8. Navigate back to the home page.
9. Navigate to the login page.
10. Print the current url.
11. Refresh the page.
12. Enter the email to email field.
13. Enter the password to password field.
14. Click on Login Button.
15. Close the browser.
 */
public class NopCommerce {
    public static void main(String[] args) throws InterruptedException {
        String baseurl = "https://demo.nopcommerce.com/";

        // 1. Setup Chrome browser.
        WebDriver driver = new ChromeDriver();

        //2. open the url
        driver.get(baseurl);

        //3. Print the title of the page
        System.out.println("The title of the page is   :" + driver.getTitle());

        //4. Print the current url.
        System.out.println("The URL of the page is  :" + driver.getCurrentUrl());

        //5. Print the page source
        System.out.println("Page source:  " + driver.getPageSource());

        //6. Navigate to URL
        String loginUrl = "https://demo.nopcommerce.com/login?returnUrl=%2F";
        driver.navigate().to(loginUrl);

        //7. Print the current URL
        System.out.println("Get navigated URL : " + driver.getCurrentUrl());

        //8. Navigate back to the home page.
        driver.navigate().back();
        System.out.println("Get new navigated URL : " + driver.getCurrentUrl());

        //9. Navigate to the login page.
        driver.navigate().forward();
        System.out.println("Navigation to login page:  " + driver.getCurrentUrl());

        //10. Print the current url.
        System.out.println("Current URL : " + driver.getCurrentUrl());

        //11. Refresh the page.
        driver.navigate().refresh();

        // 12. Enter the email to email field
        WebElement email = driver.findElement(By.id("Email"));
        email.sendKeys("prime123@gmail.com");

        // 13. Enter the password to password field
        WebElement passwordBox = driver.findElement(By.id("Password"));
        passwordBox.sendKeys("Prime1");

        // 14. Click on Login Button
        WebElement loginButton = driver.findElement(By.xpath("//button[contains(text(),'Log in')]"));
        loginButton.click();

        //15. Close the browser
        driver.quit();

    }
}
