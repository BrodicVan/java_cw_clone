/**
 * Binlog position init.
 * 
 * @param fileName file name for binlog files: mysql-bin.000001
 */
public LogPosition(String fileName, final long position){
    this.fileName = fileName;
    this.position = position;
}