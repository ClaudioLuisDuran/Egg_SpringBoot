/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ClaudioDuran
 */       
import tensorflow as tf;
import tensorflow_text as tf_text.*;
import tensorflow.org.*;
import java.util.*;
public class IA_Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      
        


public class Chatbot {
  private static final String MODEL_PATH = "ruta/a/mi/modelo.pb"; // Ruta al modelo pre-entrenado en formato protobuf
  private static final List<String> VOCABULARY = Arrays.asList("palabra1", "palabra2", ..., "palabraN"); // Lista de palabras que el modelo puede predecir

  private final SavedModelBundle model;

  public Chatbot() {
    model = SavedModelBundle.load(MODEL_PATH, "serve");
  }

  public String generateResponse(String inputText) {
    try (Tensor<String> inputTensor = Tensor.create(inputText);
         Tensor<Float> temperatureTensor = Tensor.create(1.0f)) {
      
      // Crear un diccionario con los tensores de entrada para el modelo
      Map<String, Tensor<?>> inputs = new HashMap<>();
      inputs.put("input_1", inputTensor);
      inputs.put("temperature", temperatureTensor);

      // Ejecutar el modelo y obtener los resultados
      Tensor<?> resultTensor = model.session().runner()
          .feed("input_1", inputTensor)
          .feed("temperature", temperatureTensor)
          .fetch("Identity")
          .run()
          .get(0);

      // Obtener los valores predichos del tensor de salida
      float[] resultValues = new float[VOCABULARY.size()];
      resultTensor.copyTo(resultValues);

      // Encontrar la palabra más probable en la lista de vocabulario
      int maxIndex = 0;
      float maxValue = resultValues[0];
      for (int i = 1; i < resultValues.length; i++) {
        if (resultValues[i] > maxValue) {
          maxIndex = i;
          maxValue = resultValues[i];
        }
      }

      return VOCABULARY.get(maxIndex);
    }
  }

  public void close() {
    model.close();
  }
}
        
        
        
    }
    
}
