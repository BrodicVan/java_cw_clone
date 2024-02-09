/**
 * A zoneAffinity defines zone affinity (true) or anti-affinity rules (false).
 */
public ZoneAffinityClusterResolver(
        ClusterResolver<AwsEndpoint> delegate,
        String myZone,
        boolean zoneAffinity,
        EndpointRandomizer randomizer
){
    this.delegate = delegate;
    this.myZone = myZone;
    this.zoneAffinity = zoneAffinity;
    this.randomizer = randomizer;
}