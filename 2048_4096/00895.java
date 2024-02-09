/**
 * close DB connection
 *
 * @param con DB connection
 */
public static void closeConn(Connection con) throws SQLException{
    if (con != null) {
        con.close();
    }
}