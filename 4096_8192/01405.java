/**
 * Creates a decorated router for an existing router and {@link RouteMatchFilter}.
 *
 * @param router      A {@link Router} to delegate to
 * @param routeFilter A {@link RouteMatchFilter} to filter non matching routes
 */
public FilteredRouter(Router router,
                      RouteMatchFilter routeFilter){
    this.router = router;
    this.routeFilter = routeFilter;
}