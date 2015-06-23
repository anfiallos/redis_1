import java.net.URI;



import redis.clients.jedis.Jedis;

import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.HashMap;
import java.util.Map;

import org.junit.Test;

import redis.clients.jedis.BinaryJedis;
import redis.clients.jedis.Jedis;
import redis.clients.jedis.JedisShardInfo;
import redis.clients.jedis.Protocol;
import redis.clients.jedis.exceptions.InvalidURIException;
import redis.clients.jedis.exceptions.JedisConnectionException;
import redis.clients.jedis.exceptions.JedisDataException;
import redis.clients.jedis.exceptions.JedisException;
import redis.clients.jedis.tests.commands.JedisCommandTestBase;
import redis.clients.util.SafeEncoder;

public class RedisJava {
   public static void main(String[] args) {
      //Connecting to Redis server on localhost
//      Jedis jedis = new Jedis("localhost");
      Jedis j = new Jedis("localhost", 6379);
      j.auth("foobared");
      j.select(2);
      j.set("foo", "bar");
    //  Jedis jedis = new Jedis(new URI("redis://:foobared@localhost:6379/2"));
    //  assertEquals("PONG", jedis.ping());
     // assertEquals("bar", jedis.get("foo"))
      System.out.println("Connection to server sucessfully");
      //check whether server is running or not
      System.out.println("Server is running: "+j.ping());
 }
}
