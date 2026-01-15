import com.microsoft.playwright.*;
import org.junit.jupiter.api.*;


public class LandingPageForm {
    public static Playwright playwright;
    public static Browser browser;
    public BrowserContext context;
    public Page page;

    @BeforeAll
    public static void setUp() {
        playwright = Playwright.create();
        browser = playwright.chromium().launch(new BrowserType.LaunchOptions()
                .setHeadless(false)
                .setSlowMo(50));
    }

    @BeforeEach
    public void createContextAndPage() {
        context = browser.newContext();
        page = context.newPage();
    }

    @AfterEach
    public void closeContext() {
        if (context != null) {
            context.close();
        }
    }

    @AfterAll
    public static void tearDown() {
        if (browser != null) {
            browser.close();
        }
        if (playwright != null) {
            playwright.close();
        }
    }


    @Test
    public void setValues() {

        page.navigate("https://edu.neoflex.ru/");
        page.fill("#input_4410197938860", "Alex Alexov");
        page.fill("#input_4410197938861", "alex_alexov@gmail.com");
        page.fill("#input_4410197938862", "9999999999");
        page.fill("#input_4410197938863", "Не обращаем внимания. Идет разработка автотестов на форму.");
        page.click(".t-checkbox__indicator");
        //page.click(".t-btnflex__text");
        //page.pause();
    }
}