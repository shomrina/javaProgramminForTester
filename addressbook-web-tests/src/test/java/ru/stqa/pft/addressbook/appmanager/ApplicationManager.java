package ru.stqa.pft.addressbook.appmanager;

import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

import java.util.concurrent.TimeUnit;

public class ApplicationManager {
    FirefoxDriver wd;

    private NavigationHelper navigationHelper;
    private GroupHelper groupHelper;
    private SessionHelper sessionHelper;
    private ContactHelper contactHelper;


    public void init() {
        FirefoxOptions options = new FirefoxOptions().setLegacy(true);
        wd = new FirefoxDriver(options);  //явно указываем, что нужно использовать старую схему запуска. без неё нужно устанавливатьь гекодрайвер и прописывать Path (https://selenium2.ru/news/188-firefox-esr-52.html and https://selenium2.ru/news/188-firefox-esr-52.html)
        wd.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);

        wd.get("http://localhost/addressbook/");
        groupHelper = new GroupHelper(wd); //чтобы получить ссылку на вебдрайвер конструируется внутри метода инит
        navigationHelper = new NavigationHelper(wd);
        sessionHelper = new SessionHelper(wd);
        contactHelper = new ContactHelper(wd);
        sessionHelper.login("admin", "secret");
    }



    public void stop() {
        wd.quit();
    }

    public GroupHelper getGroupHelper() {
        return groupHelper;
    }

    public NavigationHelper getNavigationHelper() {
        return navigationHelper;
    }

    public ContactHelper getContactHelper() {
        return contactHelper;
    }
}
