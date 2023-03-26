package stylepatrick.chatgpttorestapi.controller;

import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import stylepatrick.chatgpttorestapi.controller.dto.ChatGptRequest;
import stylepatrick.chatgpttorestapi.controller.dto.ChatGptResponse;
import stylepatrick.chatgpttorestapi.service.ChatGptService;

@ApiRestController
@AllArgsConstructor
public class RestController {

    private final ChatGptService chatGptService;

    @PostMapping(value = "chat")
    public ResponseEntity<ChatGptResponse> chat(
            @RequestBody ChatGptRequest chatGptRequest
    ) {
        return chatGptService.sendToChatGpt(chatGptRequest);
    }
}
