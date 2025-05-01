package ar.utn.frba.dsi.logger;

import ar.utn.frba.dsi.logger.stratergies.FileErrorLoggingStrategy;
import ar.utn.frba.dsi.logger.stratergies.TerminalErrorLoggingStrategy;

public class LoggerFactory {
    public static Logger createTerminalLogger() {
        return new Logger(createTerminalStrategy());
    }
    public static Logger createFileLogger() {
        return new Logger(createFileStrategy());
    }

    public static Logger createDatabaseLogger() {
        return new Logger(createDatabaseStrategy());
    }

    public static Logger switchToDatabase(Logger logger){
        logger.setErrorLoggingStrategy(createDatabaseStrategy());
        return logger;
    }
    public static Logger switchToFile(Logger logger) {
        logger.setErrorLoggingStrategy(createFileStrategy());
        return logger;
    }
    public static Logger switchToTerminal(Logger logger) {
        logger.setErrorLoggingStrategy(createTerminalStrategy());
        return logger;
    }

    private static ErrorLoggingStrategy createTerminalStrategy() {
        return new TerminalErrorLoggingStrategy();
    }

    private static ErrorLoggingStrategy createFileStrategy() {
        return new FileErrorLoggingStrategy();
    }

    private static ErrorLoggingStrategy createDatabaseStrategy() {
        return new DatabaseErrorLoggingStrategy(new MySQLDatabaseAdapter());
    }
}
