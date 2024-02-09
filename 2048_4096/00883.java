/**
 * close DB result set
 *
 * @param rs DB result set
 */
public static void closeRs(ResultSet rs) throws SQLException{
    if (rs != null) {
        rs.close();
    }
}