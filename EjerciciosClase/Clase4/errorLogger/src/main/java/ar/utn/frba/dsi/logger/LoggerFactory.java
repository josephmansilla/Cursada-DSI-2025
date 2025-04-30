package ar.utn.frba.dsi.logger;

import ar.utn.frba.dsi.logger.stratergies.FileErrorLoggingStrategy;
import ar.utn.frba.dsi.logger.stratergies.TerminalErrorLoggingStrategy;

public class LoggerFactory {
    public static Logger createTerminalLogger() {
        return new Logger(new TerminalErrorLoggingStrategy());
    }
    public static Logger createFileLogger() {
        return new Logger(new FileErrorLoggingStrategy());
    }
    public static Logger switchToFile(Logger logger) {
        logger.setErrorLoggingStrategy(new FileErrorLoggingStrategy());
    }
    public static Logger switchToTerminal(Logger logger) {
        logger.setErrorLoggingStrategy(new TerminalErrorLoggingStrategy());
    }

    private static
}
