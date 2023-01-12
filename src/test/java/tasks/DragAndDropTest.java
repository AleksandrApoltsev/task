//package tasks;
//
//import com.codeborne.selenide.Configuration;
//import org.junit.jupiter.api.BeforeAll;
//import org.junit.jupiter.api.Test;
//
//import static com.codeborne.selenide.Condition.text;
//import static com.codeborne.selenide.Selenide.*;
//
//public class DragAndDropTest {
//
//    @BeforeAll
//    static void configuration() {
//        Configuration.baseUrl = "https://the-internet.herokuapp.com";
//        Configuration.browserSize = "1920x1080";
//        Configuration.holdBrowserOpen = true;
//    }
//
//    @Test
//    void dragAndDropTest() {
//        open("/drag_and_drop");
//        $("#column-a").dragAndDropTo($("#column-b"));
//        $("#column-b").shouldHave(text("A"));
//        $("#column-a").shouldHave(text("B"));
//    }
//}
