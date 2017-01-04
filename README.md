## Patient Expert

Patient Expert is a desktop application written in Java, which uses the Apache Derby Client Driver and JavaDB as a database. 
The main purpose behind this project was to create an application that would allow physicians around the world to manage patients, consultations, 
specialists, tasks and notes. Patient Expert uses an encrypted database connection and also has a password-protected interface, for which administrators
can be added or removed.

## Login

In order to protect confidential data, a login has been implemented, as shown below.

![Login](/screenshots/login.png?raw=true "Login")

## Functionality

Patients, consultations, specialists, tasks and notes can be added, modified and removed. It is also possible to search for a specific item based on any criteria provided by the physician.

![Patients](/screenshots/patients.png?raw=true "Patients")

## Printing

In addition to the main functionalities of the application, any table, such as a patient table, can be printed using the standard printer connected to the computer.

![Printing](/screenshots/print.png?raw=true "Printing")

## Exporting

Patient Expert also allows you to export any of the tables to an Excel spreadsheet.

![Export](/screenshots/export.png?raw=true "Export")

## Starting over

It's fairly easy to start over in Patient Expert. By clicking on "New" and "New database...", you can easily discard / truncate all existing database
tables and start fresh.

![New](/screenshots/newdatabase.png?raw=true "New Database")

## Required APIs

The required APIs are listed in the dist/lib folder. 

