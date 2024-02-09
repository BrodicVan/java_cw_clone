/**
 * Create ReactiveRedisLockProvider
 *
 * @param redisTemplate ReactiveStringRedisTemplate
 * @param environment   environment is part of the key and thus makes sure there is not key conflict between
 *                      multiple ShedLock instances running on the same Redis
 * @param keyPrefix     prefix of the key in Redis.
 */
public ReactiveRedisLockProvider(@NonNull ReactiveStringRedisTemplate redisTemplate, @NonNull String environment, @NonNull String keyPrefix){
    this.redisTemplate = redisTemplate;
    this.environment = environment;
    this.keyPrefix = keyPrefix;
}