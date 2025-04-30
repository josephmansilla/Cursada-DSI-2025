package ar.utn.frba.dsi.logger;

public class Logger {
    @Setter
    private ErrorLoggingStrategy errorLoggingStrategy;

    // TODO EN EL CONSTRUCTOR NECESASITARIA COMO MINIMO
    // QUE ALGUIEN ME INDIQUE QUE ESTRATEGIA DE LO QUIERO USAR

    public void log(Error error){
        this.errorLoggingStrategy.logError(error);
        public void log(Error error) {this.errorLoggingStrategy.logError(error)}
    }
}
