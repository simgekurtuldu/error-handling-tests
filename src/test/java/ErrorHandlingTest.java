import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.fail;

public class ErrorHandlingTest { // Senaryo: Geçerli giriş verisiyle yöntemi çağırma
    @Test
    public void testValidInput() {
        // Geçerli giriş verisi
        String input = "valid_input";

        // Yöntemi çağırma
        String result = MethodUnderTest.processData(input);

        // Sonucun beklenen değere eşit olup olmadığını kontrol etme
        assertEquals("Processed data: " + input, result);
    }

    // Senaryo: Geçersiz giriş verisiyle yöntemi çağırma
    @Test
    public void testInvalidInput() {
        // Geçersiz giriş verisi
        String input = "";

        try {
            // Yöntemi çağırma
            MethodUnderTest.processData(input);

            // Eğer hata fırlatılmazsa fail
            fail("Expected exception not thrown");
        } catch (IllegalArgumentException e) {
            // Beklenen hata türünün fırlatılıp fırlatılmadığını kontrol etme
            assertEquals("Invalid input data", e.getMessage());
        }
    }


}
