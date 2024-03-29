package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class DataProcessor {

    public String processData(String input) throws DataValidationException, DependencyFailureException, ResourceExhaustionException, TimeOutException {
        // Senaryo 1: Geçerli Giriş Verisi
        if (input != null && !input.isEmpty()) {
            // Veriyi işle
            return "İşlenmiş veri: " + input;
        } else {
            throw new DataValidationException("Geçersiz giriş verisi");
        }
    }
}

