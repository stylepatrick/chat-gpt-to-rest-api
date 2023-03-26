# chat-gpt-to-rest-api
 Interaction with ChatGPT over Spring Boot 3 REST API.
 
 Example of an translation service:
 
 POST Request to .../api/chat
 ```
 {
    "model": "text-davinci-003",
    "prompt": "Translate this into 1. French, 2. Spanish and 3. Japanese:",
    "max_tokens": 100,
    "temperature": 0.3
}
```

Response:
```
{
    "id": "cmpl-6yO7gE6aW6AOA28UN1kHTRoVh2mxF",
    "object": "text_completion",
    "created": 1679850428,
    "model": "text-davinci-003",
    "choices": [
        {
            "text": "\n\n\"I am happy to help\"\n\n1. Je suis heureux de pouvoir aider.\n2. Estoy feliz de ayudar.\n3. 私が助けることを嬉しく思います。",
            "index": 0,
            "logprobs": null,
            "finish_reason": "stop"
        }
    ],
    "usage": {
        "prompt_tokens": 16,
        "completion_tokens": 65,
        "total_tokens": 81
    }
}
```

 More examples can be found here:
 https://platform.openai.com/examples
