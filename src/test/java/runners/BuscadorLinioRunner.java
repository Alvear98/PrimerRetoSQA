package runners;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/resources/feature/buscadorLinio.feature",
        glue = "stepsDefinitions",
        //Aplica estilo para eliminar el guion bajo al momento de generar los escenarios.
        snippets = SnippetType.CAMELCASE

)
public class BuscadorLinioRunner {
}
