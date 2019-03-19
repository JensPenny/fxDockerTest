Purpose
=======

The purpose of this project is to see if we can create a test project that can capture a screenshot of a javafx app. 
Following components are included: 
* A javaFX app that will write a .png to a temporary file and that will check this file. 
* A docker image based on alpine and java8, that will run this code 
* A sacrifice to the X11 - gods, so they will spare me of their wrath by trying to bypass their teachings

The JavaFX code
=======
* Create a hello world app
* Create an image in the temp folder
* Print the absolute path to the image

Use display /temp/path-to-test to check the image