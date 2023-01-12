//package tasks.cleanuri;
//
//import com.codeborne.xlstest.XLS;
//import org.junit.jupiter.api.Test;
//import java.io.*;
//
//import static io.restassured.RestAssured.given;
//import static org.hamcrest.Matchers.is;
//
//public class CleanUriApiTest {
//    ClassLoader cl = CleanUriApiTest.class.getClassLoader();
//
//    @Test
//    void apiTest() throws Exception {
//        try (InputStream is = cl.getResourceAsStream("test.xls")) {
//            assert is != null;
//            XLS xls = new XLS((is));
//            String url = xls.excel.getSheetAt(0).getRow(0).getCell(0).getStringCellValue();
//            String website = xls.excel.getSheetAt(0).getRow(0).getCell(1).getStringCellValue();
//
//            given()
//                    .log().all()
//                    .contentType("multipart/form-data")
//                    .multiPart(url, website)
//                    .when()
//                    .post("https://cleanuri.com/api/v1/shorten")
//                    .then()
//                    .log().status()
//                    .log().body()
//                    .statusCode(200)
//                    .body("result_url", is("https://cleanuri.com/KDBYAq"));
//        }
//    }
//}
