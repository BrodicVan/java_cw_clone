/**
 * @param manager the manager
 * @param aid ac id
 * @param vid video part id
 * @param snum segment num in video part
 * @param url segment download url
 * @param fileName segment file name,can be null
 * @param savePath can be null
 * @param userAgent can be null
 * @param totalBytes -1 means resolve content-length by task itself
 * @param etag can be null
 */
public DownloadInfo(DownloadManager manager, String aid, String vid, int snum, String url, String savePath,
        String fileName, String userAgent, int totalBytes, String etag){
    this.manager = manager;
    this.aid = aid;
    this.vid = vid;
    this.snum = snum;
    this.url = url;
    this.savePath = savePath;
    this.fileName = fileName;
    this.userAgent = userAgent;
    this.totalBytes = totalBytes;
    this.etag = etag;
}