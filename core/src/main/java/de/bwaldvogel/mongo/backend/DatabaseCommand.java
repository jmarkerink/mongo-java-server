package de.bwaldvogel.mongo.backend;

public class DatabaseCommand {
    private final Command command;
    private final String queryValue;

    private DatabaseCommand(String queryCommand) {
        this.command = Command.parseString(queryCommand);
        this.queryValue = queryCommand;
    }

    private DatabaseCommand(Command command) {
        this.command = command;
        this.queryValue = command.getName();
    }

    public static DatabaseCommand of(String queryValue) {
        return new DatabaseCommand(queryValue);
    }

    public static DatabaseCommand of(Command command) {
        return new DatabaseCommand(command);
    }

    public Command getCommand() {
        return command;
    }

    public String getQueryValue() {
        return queryValue;
    }
}
