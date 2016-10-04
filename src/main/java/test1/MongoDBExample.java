package test1;


import com.mongodb.*;

import java.net.UnknownHostException;

/**
 * Created by minah on 2016-10-04.
 */
public class MongoDBExample {

  public static void main(String[] args) throws UnknownHostException {

    User user = createUser();
    DBObject doc = createDBObject(user);


    MongoClient mongoClient = new MongoClient("localhost", 27017);
    DB db = mongoClient.getDB("journaldev");

    DBCollection col = db.getCollection("users");
    WriteResult result = col.insert(doc);

    //read example
    DBObject query = BasicDBObjectBuilder.start().add("_id", user.getId()).get();
    DBCursor cursor = col.find(query);
    while(cursor.hasNext()){
      System.out.println(cursor.next());
    }

    //update example
    user.setName("Pankaj Kumar");
    doc = createDBObject(user);
    result = col.update(query, doc);
    System.out.println(result.getUpsertedId());
    System.out.println(result.getN());
    System.out.println(result.isUpdateOfExisting());
//    System.out.println(result.getLastConcern());

  }

  private static DBObject createDBObject(User user) {

    BasicDBObjectBuilder docBuilder = BasicDBObjectBuilder.start();
    docBuilder.append("name", user.getName());
    docBuilder.append("role", user.getRole());
    docBuilder.append("isEmployee", user.isEmployee());

    return docBuilder.get();
  }

  private static User createUser() {
    return new User(0,"Pankaj",true,"CEO");
  }
}
