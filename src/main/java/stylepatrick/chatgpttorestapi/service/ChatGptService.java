package stylepatrick.chatgpttorestapi.service;

import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import stylepatrick.chatgpttorestapi.config.AppConfig;
import stylepatrick.chatgpttorestapi.controller.dto.ChatGptRequest;
import stylepatrick.chatgpttorestapi.controller.dto.ChatGptResponse;

@Service
public class ChatGptService {

    private final AppConfig appConfig;
    private final HttpHeaders httpHeaders;
    private final RestTemplate restTemplate;

    public ChatGptService(AppConfig appConfig) {
        this.appConfig = appConfig;
        this.restTemplate = new RestTemplate();
        httpHeaders = generateHeader();
    }

    private HttpHeaders generateHeader() {
        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.APPLICATION_JSON);
        headers.set("Authorization", "Bearer " + appConfig.getApiKey());
        return headers;
    }

    public ResponseEntity<ChatGptResponse> sendToChatGpt(ChatGptRequest chatGptRequest) {
        HttpEntity<ChatGptRequest> request = new HttpEntity<>(chatGptRequest, httpHeaders);
        return restTemplate.postForEntity(appConfig.getEngineUrl(), request, ChatGptResponse.class);
    }

}
