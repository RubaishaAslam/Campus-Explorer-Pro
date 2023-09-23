### To run Points Of Interest App do the following in directeory handin-Poi

```bash
java -jar poi.jar
```

To login there are 2 users:
- user, user_password
- root, root_password

To create a poi press create poi and then select anywhere on the map
To edit a just select a poi on the map
user can not edit root created pois
it takes a bit of time to load the help and about pdfs  
it takes bit of time to load the weather
A poi can have multiple layers, to edit them select the poi -> press layer
There is model README.md that describes the functionality of the backend and that is within the src/main/java/com/u3/model
    It extensively describes how the model works and was built using jackson

Extra Features:
Sys-00514	Test that user can login as either root or general -- passes   
Sys-00515	Test that the current weather for london can be displayed -- passes
Login page added
MultiUser Added


Required Features: 
Sys-00501	Test that map loads properly  -- passes
Sys-00502	Test that a given map can be scrolled -- passes
Sys-00503	Test that selecting layer can display only those layers on the map -- passes now
Sys-00504	Test tha searching can display only those items -- fail
Sys-00505	Test that POIs are displayed according to what is input into the search bar -- fail
Sys-00506	Test that all default POIs are present on the map -- passes now
Sys-00507	Test that a popup containing the POI metadata pops up on click -- passes now
Sys-00508	Tests that any POI that the user clicks the favourite button on is added to the favourite layer -- passes
Sys-00509	Test that a POI can be created -- passes
Sys-00510	Test whether the POIs created, persist even after closing the program -- passes
Sys-00511	Test if the software closes -- passes now
Sys-00512	Test whether the help meue PDF opens on click -- passes
Sys-00513	Test that the default POIs can be created, edited, and deleted -- passes now

