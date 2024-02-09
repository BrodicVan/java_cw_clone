/**
 * Return the next page from pageBuffer that has a non-zero position count, or null if none available
 */
private static Page extractNonEmptyPage(PageBuffer pageBuffer){
    Page page = pageBuffer.poll();
    while (page != null && page.getPositionCount() == 0) {
        page = pageBuffer.poll();
    }
    return page;
}