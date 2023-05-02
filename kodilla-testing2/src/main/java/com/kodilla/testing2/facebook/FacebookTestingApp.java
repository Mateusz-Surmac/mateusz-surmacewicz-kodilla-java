package com.kodilla.testing2.facebook;

import com.kodilla.testing2.config.WebDriverConfig;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class FacebookTestingApp {

    public static final String XPATH_ACCEPT_COOKIES = "/html/body/div[3]/div[2]/div/div/div/div/div[4]/button[2]";
    public static final String XPATH_NEW_ACCOUNT = "/html/body/div[1]/div[1]/div[1]/div/div/div/div[2]/div/div[1]/form/div[5]/a";
    public static final String XPATH_SELECT_DAY = "/html/body/div[3]/div[2]/div/div/div[2]/div/div/div[1]/form/div[1]/div[5]/div[2]/span/span/select[1]";
    public static final String XPATH_SELECT_MONTH = "/html/body/div[3]/div[2]/div/div/div[2]/div/div/div[1]/form/div[1]/div[5]/div[2]/span/span/select[2]";
    public static final String XPATH_SELECT_YEAR = "/html/body/div[3]/div[2]/div/div/div[2]/div/div/div[1]/form/div[1]/div[5]/div[2]/span/span/select[3]";

    public static void main(String[] args) {

        WebDriver webDriver = WebDriverConfig.getDriver(WebDriverConfig.CHROME);
        webDriver.get("https://www.facebook.com");

        WebElement acceptCookies = webDriver.findElement(By.xpath(XPATH_ACCEPT_COOKIES));
        acceptCookies.click();

        WebElement createAccountField = webDriver.findElement(By.xpath(XPATH_NEW_ACCOUNT));
        createAccountField.click();

        WebDriverWait wait = new WebDriverWait(webDriver,5);

        WebElement selectDay = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(XPATH_SELECT_DAY)));
        Select selectDay20 = new Select(selectDay);
        selectDay20.selectByIndex(19);

        WebElement selectMonth = webDriver.findElement(By.xpath(XPATH_SELECT_MONTH));
        Select selectMonthAugust = new Select(selectMonth);
        selectMonthAugust.selectByIndex(7);

        WebElement selectYear = webDriver.findElement(By.xpath(XPATH_SELECT_YEAR));
        Select selectYear2000 = new Select(selectYear);
        selectYear2000.selectByValue("2000");
    }
}
