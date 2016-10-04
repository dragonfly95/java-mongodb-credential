package test2;

import java.net.UnknownHostException;

/**
 * Created by minah on 2016-10-04.
 */
public class MongoDBExample2 {

  public static void main(String[] args) throws UnknownHostException {

    TestMethod testMethod = new TestMethod();
    testMethod.inserUser("test1","test2", true);
  }
}
