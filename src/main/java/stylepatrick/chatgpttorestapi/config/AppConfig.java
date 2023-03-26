package stylepatrick.chatgpttorestapi.config;

import lombok.Getter;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
@Getter
public class AppConfig {

    @Value("${openai.api-key}")
    private String apiKey;
    @Value("${openai.engine-url}")
    private String engineUrl;
}
