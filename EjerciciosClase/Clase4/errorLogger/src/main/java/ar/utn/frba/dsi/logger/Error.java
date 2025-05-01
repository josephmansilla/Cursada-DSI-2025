package ar.utn.frba.dsi.logger;

import static com.sun.org.apache.xalan.internal.xsltc.compiler.sym.error;

import java.time.LocalDateTime;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@Builder
public class Error {

    private String message;
    private String stackTrace;
    private LocalDateTime timestamp;

    public static Error of(String message){
        return Error
                .builder()
                .message(message)
                .timestamp(LocalDateTime.now())
                .build();
    }
    public static Error of(String message, String stackTrace) {
        return Error.
                builder()
                .message(message)
                .stackTrace(stackTrace)
                .timestamp(LocalDateTime.now())
                .build();
    }

    public static Error of(String message, String stackTrace, LocalDateTime timestamp) {
        return Error
                .builder()
                .message(message)
                .stackTrace(stackTrace)
                .timestamp(timestamp)
                .build();
    }
}
