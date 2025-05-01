package ar.utn.frba.dsi.logger.stratergies;

import ar.utn.frba.dsi.logger.Error;
import java.time.format.DateTimeFormatter;

public class TerminalErrorLoggingStrategy implements ErrorLoggingStrategy {
    @Override
    public void logError(Error error){
        System.out.printf("Error ocurred with message %s, stacktrace: %s, timestamp: %s%n",
            error.getMessage(),
            error.getStackTrace(),
            error.getTimestamp().format(DataTimeFormatter.BASIC_ISO_DATE)
            );
    }
}
