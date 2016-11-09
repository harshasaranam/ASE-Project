/**
 * Created by mani on 11/1/2016.
 */
var MongoClient = require('mongodb').MongoClient;
var assert = require('assert');
var url = "mongodb://harshasaranam:fuckdude123@ds015760.mlab.com:15760/labs";

var deleteUserwithName = function(db,callback) {
    db.collection('demoase').remove( {

            "fname":"harshasaranam"

        },

        function(err, result) {
            assert.equal(err, null);
            console.log("deleted a document from harsha's collection.");
            callback();
        });
};
MongoClient.connect(url, function(err, db) {
    assert.equal(null, err);
    deleteUserwithName(db, function() {
        db.close();
    });
});
/**
 * Created by rAj on 11/1/2016.
 */
