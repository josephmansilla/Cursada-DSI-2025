package ar.utn.frba.dsi.logger.adapters;

import ar.utn.frba.dsi.logger.adapters.connectors.MySQLConnector;
import ar.utn.frba.dsi.logger.utils.ConfigReader;

public class MySQLDatabaseAdapter {
  private MySQLConnector mySQLConnector;
  private ConfigReader config;

  public MySQLDatabaseAdapter(){
    this.mySQLConnector = new MySQLDatabaseAdapter();
    this.config = new ConfigReader();
  }

  @Override
  public void connect(){
    try{
      this.mySQLConnector.connect(
          this.config("mySQLurlConnection"),
          this.config("mySQLusername"),
          this.config("mySQLpassword")
      );
    } catch (Exception e){
      System.out.println(e);
    }

    @Override
    public void disconnect(){
      try {
        this.mySQLConnector.disconnect();
      }
      catch (Exception e){
        System.out.println(e);
      }
    }
  }
}
