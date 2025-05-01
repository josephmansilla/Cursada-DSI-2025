package ar.utn.frba.dsi.logger.stratergies;

import ar.utn.frba.dsi.logger.Error;

public interface ErrorLoggingStrategy {
  void logError(Error error);
}
