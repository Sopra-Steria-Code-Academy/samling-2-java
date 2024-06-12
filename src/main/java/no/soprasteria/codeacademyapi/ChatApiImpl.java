package no.soprasteria.codeacademyapi;

import lombok.extern.slf4j.Slf4j;
import no.soprasteria.generated.api.ChatApi;
import no.soprasteria.generated.models.ChatMessageDTO;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ChatApiImpl implements ChatApi {
    private static final Logger log = LoggerFactory.getLogger(ChatApiImpl.class);

    @Override
    public ResponseEntity<ChatMessageDTO> createChat(ChatMessageDTO chatMessageDTO) {
        log.info("Chat created {}", chatMessageDTO);
        return ResponseEntity.ok(chatMessageDTO);
    }

    @Override
    public ResponseEntity<List<ChatMessageDTO>> getChats() {
        ChatMessageDTO dto = new ChatMessageDTO()
                .message("Dette er en chat melding")
                .author("Magnus")
                .messageTime("now");
        return ResponseEntity.ok(List.of(dto));
    }
}
