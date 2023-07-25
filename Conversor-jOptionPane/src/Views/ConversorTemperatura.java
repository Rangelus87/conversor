package Views;

import javax.swing.JOptionPane;

public class ConversorTemperatura {

    private Object[] opcionesTemperaturas;

    public ConversorTemperatura() {
        opcionesTemperaturas = new Object[]{
            "Seleccione una Opcion",
            "Celsius a Fahrenheit",
            "Celsius a Kelvin",
            "Fahrenheit a Celsius",
            "Fahrenheit a Kelvin",
            "Kelvin a Celsius",
            "Kelvin a Fahrenheit"
        };
        Object seleccionar = JOptionPane.showInputDialog(
                null,
                "Selecciones tipo de convercion: ",
                "Tipo de conversion",
                JOptionPane.QUESTION_MESSAGE,
                null, opcionesTemperaturas,
                opcionesTemperaturas[0]
        );
    }
}
