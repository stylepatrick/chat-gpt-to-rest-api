package stylepatrick.chatgpttorestapi.controller.dto;

public record ChatGptRequest(String model, String prompt, Integer max_tokens, Double temperature) {
}
