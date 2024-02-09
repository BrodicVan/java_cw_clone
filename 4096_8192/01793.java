/**
 * <p>Directory to output JVM memory usage metrics CSV files to when outputMemoryUsageCsv enabled</p>
 *
 * @param memoryUsageCsvDirectory directory to save JVM memory metrics CSV files
 */
public Configuration memoryUsageCsvDirectory(String memoryUsageCsvDirectory){
    this.memoryUsageCsvDirectory = memoryUsageCsvDirectory;
    return this;
}