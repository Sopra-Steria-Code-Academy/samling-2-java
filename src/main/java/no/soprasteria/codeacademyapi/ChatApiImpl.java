package no.soprasteria.codeacademyapi;

import no.soprasteria.generated.api.ChatApi;
import no.soprasteria.generated.models.ChatMessageDTO;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ChatApiImpl implements ChatApi {

    @Override
    public ResponseEntity<List<ChatMessageDTO>> getChats(Integer chatId) {
        return null;
    }

    @Override
    public ResponseEntity<List<ChatMessageDTO>> writeChatMessage(ChatMessageDTO chatMessageDTO) {
        return null;
    }
}
