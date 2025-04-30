package ar.utn.frba.dsi.logger.stratergies;

public class DataBaseErrorLoggingStrategy implements ErrorLoggingStrategy {

    private DB db;
    @Override
    public void logError(Error error){
        this.db.connect();
        this.db.insert("error_log", ObjectToMapConversor.convertObjectToMap(error));
        this.db.disconnect();
    }
}
