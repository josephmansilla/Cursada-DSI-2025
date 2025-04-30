package ar.utn.frba.dsi.logger.stratergies;

public class TerminalErrorLoggingStrategy implements ErrorLoggingStrategy {
    @Override
    public void logError(Error error){
        System.out.printf("Error ocurred with message %s, stacktrace: %s, timestamp: %s%n", error.getMessage(), error.getStackTrace(), );
    }
}
