/**
 * 释放jedis资源
 * @param jedis
 */
public void returnResource(final Jedis jedis){
	if (jedis != null) {
		jedisPool.returnResource(jedis);
	}
}