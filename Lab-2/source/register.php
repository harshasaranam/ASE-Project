<?php
$con = mysqli_connect(3306,"root","Fuckdude.0032");
if (!$con) {
    die("Connection failed: " . mysqli_connect_error());
}
echo "Connected successfully";
if (mysqli_query(" CREATE DATABASE lab2",$con))
echo "Database created";
else
echo "Error creating database: " . mysqli_error();
$sql="CREATE TABLE persons(firstname CHAR(30),lastname CHAR(30),emailid CHAR(30),password CHAR(30))";
if (mysqli_query($con,$sql))
{
echo "Table persons created successfully";
}
else
{
echo "Error creating table: " . mysqli_error();
}
$sql="INSERT INTO persons(firstName, lastName, emailid, password)VALUES('$_POST[firstname]','$_POST[lastname]','$_POST[emailid]','$_POST[password]')";
mysqli_close($con);

?>