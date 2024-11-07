package iteso.libs.models;

import java.util.List;

public class ErrorManager {
    
    public static void validateK(int k) {
        if (k <= 0) {
            throw new IllegalArgumentException("El valor de k debe ser positivo y mayor que cero.");
        }
    }

    public static void checkDataNotEmpty(List<DataPoint> data) {
        if (data == null || data.isEmpty()) {
            throw new IllegalArgumentException("El dataset no debe estar vacío.");
        }
    }

    public static void validateFeatureDimension(double[] sample, double[] reference) {
        if (sample.length != reference.length) {
            throw new IllegalArgumentException("La dimensión de la muestra no coincide con la del dataset.");
        }
    }

    public static void validateDataAndLabelsSize(List<double[]> data, List<String> labels) {
        if (data.size() != labels.size()) {
            throw new IllegalArgumentException("Los datos y las etiquetas deben tener el mismo tamaño.");
        }
    }

    public static void validateLabelsAndPredictionsSize(List<String> trueLabels, List<String> predictedLabels) {
        if (trueLabels.size() != predictedLabels.size()) {
            throw new IllegalArgumentException("Las listas de etiquetas verdaderas y predichas deben tener el mismo tamaño.");
        }
    }
}
