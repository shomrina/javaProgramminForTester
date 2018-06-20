package ru.stqa.pft.addressbook.appmanager;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ContactHelper extends HelperBase {

    public ContactHelper(FirefoxDriver wd) {
        super(wd);
    }

    public void initContactCreation() {
        click(By.linkText("add new"));
    }

    public void fillContactForm() {

        type(By.name("firstname"), "firstName");
        type(By.name("middlename"), "middleName");
        type(By.name("lastname"), "lastName");
        type(By.name("nickname"), "nickName");
        type(By.name("title"), "title");
        type(By.name("company"), "comp");

        type(By.name("address"), "addr");
        type(By.name("home"), "111-11-11");
        type(By.name("mobile"), "+7(911)111-11-11");
        type(By.name("work"), "23455");
        type(By.name("fax"), "1234567");

        type(By.name("email"), "mail@mr.ru");
        type(By.name("email2"), "mail2@mr.ru");
        type(By.name("email3"), "mail3@mr.ru");
        type(By.name("homepage"), "ghht:\\\\google.com");


        if (!wd.findElement(By.xpath("//div[@id='content']/form/select[1]//option[5]")).isSelected()) {
            wd.findElement(By.xpath("//div[@id='content']/form/select[1]//option[5]")).click();
        }
        if (!wd.findElement(By.xpath("//div[@id='content']/form/select[2]//option[3]")).isSelected()) {
            wd.findElement(By.xpath("//div[@id='content']/form/select[2]//option[3]")).click();
        }
        wd.findElement(By.name("byear")).click();
        wd.findElement(By.name("byear")).clear();
        wd.findElement(By.name("byear")).sendKeys("1987");
        if (!wd.findElement(By.xpath("//div[@id='content']/form/select[3]//option[4]")).isSelected()) {
            wd.findElement(By.xpath("//div[@id='content']/form/select[3]//option[4]")).click();
        }
        if (!wd.findElement(By.xpath("//div[@id='content']/form/select[4]//option[2]")).isSelected()) {
            wd.findElement(By.xpath("//div[@id='content']/form/select[4]//option[2]")).click();
        }
        wd.findElement(By.name("ayear")).click();
        wd.findElement(By.name("ayear")).clear();
        wd.findElement(By.name("ayear")).sendKeys("2000");
        wd.findElement(By.name("theform")).click();
        if (!wd.findElement(By.xpath("//div[@id='content']/form/select[5]//option[3]")).isSelected()) {
            wd.findElement(By.xpath("//div[@id='content']/form/select[5]//option[3]")).click();
        }

        wd.findElement(By.name("address2")).click();
        wd.findElement(By.name("address2")).clear();
        wd.findElement(By.name("address2")).sendKeys("addr2");
        wd.findElement(By.name("phone2")).click();
        wd.findElement(By.name("phone2")).clear();
        wd.findElement(By.name("phone2")).sendKeys("home");
        wd.findElement(By.name("notes")).click();
        wd.findElement(By.name("notes")).clear();
        wd.findElement(By.name("notes")).sendKeys("notes");
    }

    public void submitContactCreation() {
        click(By.name("submit"));
        //wd.findElement(By.xpath("//div[@id='content']/form/input[21]")).click();
    }

    public void returnToHomePage() {
        click(By.linkText("home page"));
    }
}
