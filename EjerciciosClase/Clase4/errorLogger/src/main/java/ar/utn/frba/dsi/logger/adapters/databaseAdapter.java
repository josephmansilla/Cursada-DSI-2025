package ar.utn.frba.dsi.logger.adapters;

import java.util.Map;

public interface databaseAdapter {
    void connect();
    void disconnect();
    void insert(String tableName, Map<String, Object> object);
}
