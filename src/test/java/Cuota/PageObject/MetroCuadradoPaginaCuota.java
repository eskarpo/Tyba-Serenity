package Cuota.PageObject;

import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.support.FindBy;


@DefaultUrl("https://www.metrocuadrado.com/calculadora-credito-hipotecario-vivienda/")
public class MetroCuadradoPaginaCuota extends PageObject {

    @FindBy(xpath="/html/body/div[3]/div[2]/div/ul/li[2]/div[1]/a")
    private
    WebElementFacade ingresarACalculoCuota;
    public void ingresaLayoutCalcularCuota () {
      ingresarACalculoCuota.click();
    }

    @FindBy(name="loadAmount")
    private
    WebElementFacade ingresarValorCredito;
    public void ingresaValorDeCredito() {
        ingresarValorCredito.type("500000000");

    }
    @FindBy(xpath="//*[@id=\"tabcordion-body-2\"]/div/div[1]/form/div[2]/select")
    private
    WebElementFacade valorCreditoPlazo;
    public void plazoDeCredito() {
        valorCreditoPlazo.type("10");
    }
    @FindBy(xpath="//*[@id=\"tabcordion-body-2\"]/div/div[1]/form/div[2]/select")
    private
    WebElementFacade botonCalcularCuota;
    public void calcularCuotas() {
      botonCalcularCuota.click();
    }
    @FindBy(xpath="//*[@id=\"tabcordion-body-2\"]/div/div[1]/form/div[2]/select")
    private
    WebElementFacade ingresosCalculo;
    public void ingresosNecesarios() {
        ingresosCalculo.getText();
    }
    @FindBy(xpath="//*[@id=\"tabcordion-body-2\"]/div/div[3]/div[1]/dl[3]/dd")
    private
    WebElementFacade cuotaMinimaInicial;
    public void cuotaInicial(String minimaCuota) {
       minimaCuota = cuotaMinimaInicial.getText();
    }


}
