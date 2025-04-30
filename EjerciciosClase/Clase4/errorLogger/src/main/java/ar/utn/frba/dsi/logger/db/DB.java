package ar.utn.frba.dsi.logger.db;

public interface DB {
    void connect();
    void disconnect();
    void insert(String tableName, Map<String> object);
}
