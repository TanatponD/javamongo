import java.net.UnknownHostException;

import com.mongodb.MongoClient;
import com.mongodb.MongoClientURI;
import com.mongodb.ServerAddress;

import com.mongodb.client.MongoDatabase;
import com.mongodb.client.MongoCollection;

import org.bson.Document;
import java.util.Arrays;
import com.mongodb.Block;

import com.mongodb.client.MongoCursor;
import static com.mongodb.client.model.Filters.*;
import com.mongodb.client.result.DeleteResult;
import static com.mongodb.client.model.Updates.*;
import com.mongodb.client.result.UpdateResult;
import java.util.ArrayList;
import java.util.List;

public class Mongolabjava {
    public static void main(String[] args) {
        List<Document> seedData = new ArrayList<>();

        seedData.add(new Document("decade", "1970s")
                .append("artist", "Debby Boone")
                .append("song", "You Light Up My Life")
                .append("weeksAtOne", 10)
        );

        seedData.add(new Document("decade", "1980s")
                .append("artist", "Olivia Newton-John")
                .append("song", "Physical")
                .append("weeksAtOne", 10)
        );

        seedData.add(new Document("decade", "1990s")
                .append("artist", "Mariah Carey")
                .append("song", "One Sweet Day")
                .append("weeksAtOne", 16)
        );

        MongoClientURI uri = new MongoClientURI("mongodb://<dbuser>:<dbpassword>@ds133762.mlab.com:33762/javamongo");
        MongoClient client = new MongoClient(uri);
        MongoDatabase db = client.getDatabase(uri.getDatabase());



    }
}
