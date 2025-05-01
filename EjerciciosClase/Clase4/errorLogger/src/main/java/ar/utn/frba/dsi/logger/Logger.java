package ar.utn.frba.dsi.logger;

import ar.utn.frba.dsi.logger.stratergies.ErrorLoggingStrategy;
import lombok.Setter;

public class Logger {
    @Setter
    private ErrorLoggingStrategy errorLoggingStrategy;

    // TODO EN EL CONSTRUCTOR NECESASITARIA COMO MINIMO
    // QUE ALGUIEN ME INDIQUE QUE ESTRATEGIA DE LO QUIERO USAR

    public Logger(ErrorLoggingStrategy errorLoggingStrategy) {
        this.errorLoggingStrategy = errorLoggingStrategy;
    }

    public void log(Error error){
        this.errorLoggingStrategy.logError(error);
    }
}
