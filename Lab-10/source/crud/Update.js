/**
 * Created by mani on 11/1/2016.
 */
var MongoClient = require('mongodb').MongoClient;
var assert = require('assert');
var url = "mongodb://harshasaranam:fuckdude123@ds015760.mlab.com:15760/labs";

var updateUserwithName = function(db,callback) {
    db.collection('demoase').update( {

        "fname":"gupta"
         // "_id": {"5823acbd7f3c51436c89fc41"}
}, {
            $set: { "fname": "harshasaranam","lname": "gupta", type: 0,  },
            $currentDate: { lastModified: true }
        },

        function(err, result) {
        assert.equal(err, null);
        console.log("updated a document into harsha's collection.");
        callback();
    });
};
MongoClient.connect(url, function(err, db) {
    assert.equal(null, err);
    updateUserwithName(db, function() {
        db.close();
    });
});
