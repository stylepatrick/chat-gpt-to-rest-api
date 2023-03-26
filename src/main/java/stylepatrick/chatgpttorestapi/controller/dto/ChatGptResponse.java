package stylepatrick.chatgpttorestapi.controller.dto;

import java.util.List;

public record ChatGptResponse(String id, String object, Long created,
                              String model, List<ChatGptChoice> choices, ChatGptUsage usage) {
}
