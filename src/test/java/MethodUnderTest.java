public class MethodUnderTest {
    public static String processData(String input) {
        // Senaryo 1: Geçerli giriş verisi
        if (input != null && !input.isEmpty()) {
            // Veriyi işle
            return "Processed data: " + input;
        } else {
            // Senaryo 2: Geçersiz giriş verisi
            throw new IllegalArgumentException("Invalid input data");
        }
    }

}
