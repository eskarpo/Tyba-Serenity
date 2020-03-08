package Cuota;

import Cuota.Steps.testTyba;
import net.thucydides.core.annotations.Steps;
import org.junit.Test;

public class CuandoConsultoValorCuota {
    @Steps
    private testTyba candidato;

    @Test
    public void deberiamos_ver_valor_cuota_aproximada(){
        candidato.ingresa_a_calculadora_Metrocuadrado();
        candidato.ingresa_a_calcula_el_valor_de_las_cuotas();
        candidato.ingresa_valor_del_credito();
        candidato.ingresa_plazo_del_credito();
        candidato.da_click_boton_calcular_cuotas();
        candidato.valida_ingresos_necesarios();
        candidato.valida_cuota_inicial_minima("");

        @Test
        public void deberiamos_ver_valor_cuanto_es_prestamo(){
            candidato.ingresa_a_calculadora_Metrocuadrado();
            candidato.ingresa_a_calcula_el_valor_de_las_cuotas();
            candidato.ingresa_valor_del_credito();
            candidato.ingresa_plazo_del_credito();
            candidato.da_click_boton_calcular_cuotas();
            candidato.valida_ingresos_necesarios();
            candidato.valida_cuota_inicial_minima("");

    }

}
