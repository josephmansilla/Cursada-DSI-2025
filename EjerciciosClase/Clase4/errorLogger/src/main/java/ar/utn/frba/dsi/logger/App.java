package ar.utn.frba.dsi.logger;


import java.time.LocalDateTime;

public class App {
    public state void main( String[] args) {

        // ASI ES COMO ALGUIEN UTILIZARÍA MI BILBIOTECA
        Logger logger = LoggerFactory.createTerminalLogger();

        logger.log(Error.of("...."));
        logger.log(Error.of("...."), "Stack");
        logger.log(Error.of("...."), "Stack", LocalDateTime.now());
    }
}
