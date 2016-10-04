package test2;

import com.mongodb.*;

/**
 * Created by minah on 2016-10-04.
 */
public class TestMethod extends AbstractMongoDB {

  public void inserUser(String name, String role, boolean isEmployee) {

    DBCollection col = getDBCollection();
    DBObject doc = createDBObject(name, role, isEmployee);
    WriteResult result = col.insert(doc);

  }

  private DBObject createDBObject(String name, String role, boolean isEmployee) {

    BasicDBObjectBuilder docBuilder = BasicDBObjectBuilder.start();
    docBuilder.append("name", name);
    docBuilder.append("role", role);
    docBuilder.append("isEmployee", isEmployee);

    return docBuilder.get();
  }

  protected DBCollection getDBCollection() {
//    mongoClient.getDatabase("trivialuser").getCollection("users");
    DB db = mongoClient.getDB("trivialuser");
    return db.getCollection("users");
  }
}
