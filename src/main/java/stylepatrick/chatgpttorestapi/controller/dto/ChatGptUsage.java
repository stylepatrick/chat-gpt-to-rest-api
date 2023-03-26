package stylepatrick.chatgpttorestapi.controller.dto;

public record ChatGptUsage(Integer prompt_tokens, Integer completion_tokens, Integer total_tokens) {
}
