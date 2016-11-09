/**
 * Created by mani on 11/1/2016.
 */
var MongoClient = require('mongodb').MongoClient;
var assert = require('assert');
var url = "mongodb://harshasaranam:fuckdude123@ds015760.mlab.com:15760/labs";
var insertDocument = function(db, callback) {
    db.collection('demoase').insert( {
        "fname" : "harsha",
        "lname" : "saranam",
        "email": "asdfg526813@mail.umkc.edu",

        "password":"qwerty12"
    }, function(err, result) {
        assert.equal(err, null);
        console.log("Inserted a document into harsha's collection.");
        callback();
    });
};

MongoClient.connect(url, function(err, db) {
    assert.equal(null, err);
    insertDocument(db, function() {
        db.close();
    });
});