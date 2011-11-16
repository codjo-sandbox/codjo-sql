package net.codjo.sql.spy;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.SQLWarning;
import java.sql.Statement;

public class StatementDecorator implements Statement {
    private Statement statement;


    public StatementDecorator(Statement statement) {
        this.statement = statement;
    }


    public ResultSet executeQuery(String sql) throws SQLException {
        return statement.executeQuery(sql);
    }


    public int executeUpdate(String sql) throws SQLException {
        return statement.executeUpdate(sql);
    }


    public void close() throws SQLException {
        statement.close();
    }


    public int getMaxFieldSize() throws SQLException {
        return statement.getMaxFieldSize();
    }


    public void setMaxFieldSize(int max) throws SQLException {
        statement.setMaxFieldSize(max);
    }


    public int getMaxRows() throws SQLException {
        return statement.getMaxRows();
    }


    public void setMaxRows(int max) throws SQLException {
        statement.setMaxRows(max);
    }


    public void setEscapeProcessing(boolean enable) throws SQLException {
        statement.setEscapeProcessing(enable);
    }


    public int getQueryTimeout() throws SQLException {
        return statement.getQueryTimeout();
    }


    public void setQueryTimeout(int seconds) throws SQLException {
        statement.setQueryTimeout(seconds);
    }


    public void cancel() throws SQLException {
        statement.cancel();
    }


    public SQLWarning getWarnings() throws SQLException {
        return statement.getWarnings();
    }


    public void clearWarnings() throws SQLException {
        statement.clearWarnings();
    }


    public void setCursorName(String name) throws SQLException {
        statement.setCursorName(name);
    }


    public boolean execute(String sql) throws SQLException {
        return statement.execute(sql);
    }


    public ResultSet getResultSet() throws SQLException {
        return statement.getResultSet();
    }


    public int getUpdateCount() throws SQLException {
        return statement.getUpdateCount();
    }


    public boolean getMoreResults() throws SQLException {
        return statement.getMoreResults();
    }


    public void setFetchDirection(int direction) throws SQLException {
        statement.setFetchDirection(direction);
    }


    public int getFetchDirection() throws SQLException {
        return statement.getFetchDirection();
    }


    public void setFetchSize(int rows) throws SQLException {
        statement.setFetchSize(rows);
    }


    public int getFetchSize() throws SQLException {
        return statement.getFetchSize();
    }


    public int getResultSetConcurrency() throws SQLException {
        return statement.getResultSetConcurrency();
    }


    public int getResultSetType() throws SQLException {
        return statement.getResultSetType();
    }


    public void addBatch(String sql) throws SQLException {
        statement.addBatch(sql);
    }


    public void clearBatch() throws SQLException {
        statement.clearBatch();
    }


    public int[] executeBatch() throws SQLException {
        return statement.executeBatch();
    }


    public Connection getConnection() throws SQLException {
        return statement.getConnection();
    }


    public boolean getMoreResults(int current) throws SQLException {
        return statement.getMoreResults(current);
    }


    public ResultSet getGeneratedKeys() throws SQLException {
        return statement.getGeneratedKeys();
    }


    public int executeUpdate(String sql, int autoGeneratedKeys) throws SQLException {
        return statement.executeUpdate(sql, autoGeneratedKeys);
    }


    public int executeUpdate(String sql, int[] columnIndexes) throws SQLException {
        return statement.executeUpdate(sql, columnIndexes);
    }


    public int executeUpdate(String sql, String[] columnNames) throws SQLException {
        return statement.executeUpdate(sql, columnNames);
    }


    public boolean execute(String sql, int autoGeneratedKeys) throws SQLException {
        return statement.execute(sql, autoGeneratedKeys);
    }


    public boolean execute(String sql, int[] columnIndexes) throws SQLException {
        return statement.execute(sql, columnIndexes);
    }


    public boolean execute(String sql, String[] columnNames) throws SQLException {
        return statement.execute(sql, columnNames);
    }


    public int getResultSetHoldability() throws SQLException {
        return statement.getResultSetHoldability();
    }
}
