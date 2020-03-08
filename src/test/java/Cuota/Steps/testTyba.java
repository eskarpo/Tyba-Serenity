package Cuota.Steps;

import Cuota.PageObject.MetroCuadradoPaginaCuota;
import net.thucydides.core.annotations.Step;
import org.junit.Assert;

public class testTyba  {

    MetroCuadradoPaginaCuota paginaCuota;
    @Step
    public void ingresa_a_calculadora_Metrocuadrado() {
        paginaCuota.open();
    }

    @Step
    public void ingresa_a_calcula_el_valor_de_las_cuotas() {
        paginaCuota.ingresaLayoutCalcularCuota();
    }

    @Step
    public void ingresa_valor_del_credito() {
        paginaCuota.ingresaValorDeCredito();
    }

    @Step
    public void ingresa_plazo_del_credito() {
        paginaCuota.plazoDeCredito();
    }

    @Step
    public void da_click_boton_calcular_cuotas() {
        paginaCuota.calcularCuotas();
    }

    @Step
    public void valida_ingresos_necesarios() {
        paginaCuota.ingresosNecesarios();
    }

    @Step
    public void valida_cuota_inicial_minima(String minimaCuota) {
        paginaCuota.cuotaInicial(minimaCuota);
        Assert.assertNotNull(minimaCuota);
    }


}
