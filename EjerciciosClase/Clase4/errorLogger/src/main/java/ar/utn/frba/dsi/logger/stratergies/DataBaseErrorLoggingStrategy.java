package ar.utn.frba.dsi.logger.stratergies;

import ar.utn.frba.dsi.logger.Error;
import ar.utn.frba.dds.logger.utils.ObjectToMapConversor;
import ar.utn.frba.dsi.logger.adapters.databaseAdapter;

public class DataBaseErrorLoggingStrategy implements ErrorLoggingStrategy {

    private databaseAdapter db;
    @Override
    public void logError(Error error){
        this.db.connect();
        this.db.insert("error_log", ObjectToMapConversor.convertObjectToMap(error));
        this.db.disconnect();
    }
}
