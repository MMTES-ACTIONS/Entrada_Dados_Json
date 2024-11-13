import org.json.JSONObject;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.io.IOException;

public class App {
    public static void main(String[] args) {
        Path filePath = Paths.get("src/main/java/input.json"); // Caminho do arquivo

        // Verificar se o arquivo existe
        if (!Files.exists(filePath)) {
            System.out.println("Error: input.json file not found.");
            return;
        }

        try {
            // Lê o conteúdo do arquivo input.json
            String content = new String(Files.readAllBytes(filePath));
            JSONObject json = new JSONObject(content);
            
            // Extrai o campo "name" do JSON
            String name = json.getString("name");
            System.out.println("Olá, " + name + "!");
        } catch (IOException e) {
            System.out.println("Erro ao ler arquivo.");
        } catch (Exception e) {
            System.out.println("Erro ao analisar JSON.");
        }
    }
}
