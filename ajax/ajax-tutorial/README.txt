README.txt

To build and run the ajax-tutorial application, you need to download Maven2
(http://maven.apache.org/download.html) and add it to your path.  You can test
your installation by executing 'mvn -v'.  

After installing Maven2, you can build and run the application by executing
'mvn jetty:run'.  This will do a couple things.  First, it will download the 
necessary dependencies from the central Maven2 repository, which may take a 
minute or two.  Second, it will start Jetty, a lightweight servlet container.
Then you are ready to go.

You can access the application by entering the following URL into a browser:
http://localhost:8080/ajax-tutorial.

A cool feature of testing with Jetty is that if you decide to modify the Java 
source (servlet, JSP, etc.), Jetty will detect the changes and automatically
redeploy the application (really, there is no deployment at all, but don't 
worry about that).