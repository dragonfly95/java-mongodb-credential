package test2;

import com.mongodb.DBCollection;
import com.mongodb.MongoClient;
import com.mongodb.MongoCredential;
import com.mongodb.ServerAddress;

import java.util.Arrays;

/**
 * Created by minah on 2016-10-04.
 */
public abstract class AbstractMongoDB {

  protected static MongoClient mongoClient;

  static String userId = "trivial";
  static String databaseName = "trivialuser";
  static String password = "4btrivialmongouser";


  static {



      MongoCredential mongoCredential = MongoCredential
        .createCredential(userId, databaseName, password.toCharArray());

      mongoClient = new MongoClient(new ServerAddress(),
              Arrays.asList(mongoCredential));


  }

  protected abstract DBCollection getDBCollection();

}
