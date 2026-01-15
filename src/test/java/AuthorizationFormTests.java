import org.junit.jupiter.api.Test;

import com.microsoft.playwright.*;

public class AuthorizationFormTests {

    public static void main(String[] args) {
        // Инициализация Playwright
        Playwright playwright = Playwright.create();

        // Запуск браузера
        Browser browser = playwright.chromium().launch(new BrowserType.LaunchOptions().setHeadless(false));
        // Создание контекста
        BrowserContext context = browser.newContext();
        //Создание страницы
        Page page = context.newPage();

        //Your tests

        // Закрытие ресурсов
        page.close();
        context.close();
        browser.close();
        playwright.close();
    }
}
