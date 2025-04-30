package ar.utn.frba.dsi.logger;

import java.time.LocalDateTime;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder

public class Error {

    private String message;
    private String stackTrace;
    private LocalDateTime timestamp;

    public static Error of(String message){
        return error.
                builder()
                .message(message)
                .timeStamp(LocalDateTime.now())
                .build();
    }
    public static Error of(String message, String stackTrace) {
        return error.
                builder()
                .message(message)
                .stackTrace(stackTrace)
                .timeStamp(LocalDateTime.now())
                .build();
    }

    public static Error of(String message, String stackTrace, LocalDateTime timestamp) {
        return error
                .builder()
                .message(message)
                .stackTrace(stackTrace)
                .timeStamp(timestamp)
                .build();
    }
}
