package ar.utn.frba.dsi.logger.adapters;

import java.io.IOException;
import java.util.Map;
import ar.utn.frba.dds.logger.utils.ConfigReader;
import org.bson.Document;

public class MongoDBDatabseAdapter implements databaseAdapter {
  private MongoDBConnector mongoDBConnector;
  private ConfigReader config;

  public MongoDBDatabseAdapter(){
    this.mongoDBConnector = new MongoDBConnector();
    this.config = new ConfigReader();
  }
  @Override
  public void connect() {
    try{
      this.mongoDBConnector.connect(this.config.getProperty("mongoConnectionString"), this.config.getProperty("mongoDatabaseName"));
    } catch (IOException e){
      throw new RuntimeException(e);
    }
  }

  @Override
  public void disconnect() {
    this.mongoDBConnector.disconnect();
  }

  @Override
  public void insert(String errorLog, Map<String, Object> object){
    Document document = new Document();
  }
}
