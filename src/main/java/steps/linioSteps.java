package steps;

import static org.junit.Assert.assertEquals;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Map;
import org.openqa.selenium.By;
import driver.seleniumWebDriver;
import org.openqa.selenium.WebDriver;
import pages.linioPage;
import utils.excel;

public class linioSteps {
    public static WebDriver driver;
    private ArrayList<Map<String, String>> lecturaExcel = new ArrayList<Map<String,String>>();

    public void escribirEnTexto(By elemento, String texto) {
        boolean validarElemento = false;
        while (validarElemento == false) {
            try {
                seleniumWebDriver.driver.findElement(elemento).sendKeys(texto);
                validarElemento = true;
            } catch (Exception e) {

            }
        }
    }

    public void clicEnElemento(By elemento) {
        boolean validarElemento = false;
        while (validarElemento == false) {
            try {
                seleniumWebDriver.driver.findElement(elemento).click();
                validarElemento = true;
            } catch (Exception e) {

            }
        }
    }

    public String obtenerTextoDeElemento(By elemento) {
        boolean validarElemento = false;
        String textElemento = "";
        while (validarElemento == false) {
            try {
                textElemento = seleniumWebDriver.driver.findElement(elemento).getText();
                validarElemento = true;
            } catch (Exception e) {

            }
        }
        return textElemento;
    }

    public void validarTextoEnPantalla(By elemento, String texto) {
        boolean validarTexto = false;
        if(obtenerTextoDeElemento(elemento).contains(texto)) {
            validarTexto = true;
        }
        assertEquals(true, validarTexto);
    }

    public void buscarProductoEnLinio () {
        try {
        lecturaExcel = excel.readExcel("C:\\Users\\Alvea\\IdeaProjects\\libro1.xlsx", "Hoja1");
        } catch (IOException e) {
            e.printStackTrace();
        }

        for (int i = 0; i < lecturaExcel.size(); i++) {
            escribirEnTexto(linioPage.getTxtBuscarLinio(), lecturaExcel.get(i).get("Productos"));
            clicEnElemento(linioPage.getBtnBuscarLinio());
            linioPage.setBtnProducto(lecturaExcel.get(i).get("Productos"));
            clicEnElemento(linioPage.getBtnProducto());
            linioPage.setLblProducto(lecturaExcel.get(i).get("Productos"));
            validarTextoEnPantalla(linioPage.getLblProducto(), lecturaExcel.get(i).get("Productos"));
        }
    }
}
