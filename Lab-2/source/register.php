<?php
$con = mysql_connect("localhost",“root","Fuckdude.0032");
if (!$con)
{
die('Could not connect: ' . mysql_error());
}
/*if (mysql_query(" CREATE DATABASE lab2",$con))
echo "Database created";
else
echo "Error creating database: " . mysql_error();
$sql="CREATE TABLE persons(firstname CHAR(30),lastname CHAR(30),emailid CHAR(30),password CHAR(30))";
if (mysql_query($con,$sql))
{
echo "Table persons created successfully";
}
else
{
echo "Error creating table: " . mysql_error();
}*/
$sql="INSERT INTO persons(firstName, lastName, emailid, password)VALUES('$_POST[firstname]','$_POST[lastname]','$_POST[emailid]','$_POST[password]')";

mysql_close($con);
?>