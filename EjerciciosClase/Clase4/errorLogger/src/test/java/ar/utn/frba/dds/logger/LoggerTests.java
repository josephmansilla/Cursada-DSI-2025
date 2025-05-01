package ar.utn.frba.dds.logger;

import ar.utn.frba.dsi.logger.Logger;
import ar.utn.frba.dsi.logger.stratergies.ErrorLoggingStrategy;
import ar.utn.frba.dsi.logger.stratergies.TerminalErrorLoggingStrategy;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class LoggerTests {
  private Logger logger;

  @BeforeEach
  public void init(){
    ErrorLoggingStrategy loggingStrategyDefault = new TerminalErrorLoggingStrategy();

    this.logger = new Logger(loggingStrategyDefault);
  }

  @Test
  public void logWithDBTest() {

  }
}
