package pages;

import org.openqa.selenium.By;

public class linioPage {

    private static By txtBuscarLinio = By.xpath("//div[@class='input-group']//input[@type='search']");
    private static By btnBuscarLinio = By.xpath("//button[@class='btn btn-primary btn-search']");
    private static By btnProducto;
    private static By lblProducto;

    public static By getBtnProducto() {
        return btnProducto;
    }

    public static void setBtnProducto(String producto) {
        linioPage.btnProducto = By.xpath("//*[@id='catalogue-product-container']//span[contains(text(),'"+producto+"')]");
    }

    public static By getLblProducto() {
        return lblProducto;
    }

    public static void setLblProducto(String producto) {
        linioPage.lblProducto = By.xpath("//div[@class='product-title']//span[contains(text(),'"+producto+"')]");
    }

    public static By getTxtBuscarLinio() {
        return txtBuscarLinio;
    }

    public static By getBtnBuscarLinio() {
        return btnBuscarLinio;
    }

}
