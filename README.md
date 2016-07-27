About AEM Solr Search Sample
=============================

This project is completely based on aem-solr-search (headwire Inc.) that not only includes the AEM and Solr Integration example, it also includes how to add and/or customize the relevancy of search results and make the search results more meaningful.

Requirements
------------

* Java 7 or greater
* Adobe AEM 6.1 or greater (with the Geometrixx Media Site)
* Maven 3.2.x
* aem-solr-search (https://github.com/headwirecom/aem-solr-search)
* ACS Commons Package (https://github.com/Adobe-Consulting-Services/acs-aem-commons)


Getting Started
---------------

These instructions assume that AEM is running on localhost on port 4502 with the default admin/admin credentials.

1. Start AEM.

2. Clone, compile and install [AEM Solr Search 2.0.0](https://github.com/headwirecom/aem-solr-search) to AEM author.
      You may want to clone this project in another directory (i.e., outside of this project).
   
           $ git clone https://github.com/headwirecom/aem-solr-search.git
           $ cd aem-solr-search
           $ mvn clean install -Pauto-deploy-all   

3. Clone and Install the most recent ACS Commons Package [https://github.com/Adobe-Consulting-Services/acs-aem-commons](https://github.com/Adobe-Consulting-Services/acs-aem-commons)
   Referring : https://github.com/Adobe-Consulting-Services/acs-aem-commons
           
4. The ui.apps module is a good example of how to add a new search controller, that inherits from the aem-solr-search search contoller. Just include and configure this new defined search controller component into your page.

        $ mvn clean install -PautoInstallPackage
        
        
Running An Example
===================        
        
5. For testing purpose, to run with example data in Solr and to see how the newly installed search controller works. Run the following commands(Before running the following script, make sure to verify/update the CQ and Solr details.) 

        $ cd geometrixx-media-sample
        $ mvn install -Pauto-deploy-geo
        
   Execute the following script
   
        $ ./index-geometrixx-media-articles.sh
        
6. The ui.content-sample module contains the already configured the search controller page, use the following to get it installed:
        
        $ cd ../
        $ mvn clean install -Pauto-deploy-sample

7. Open a browser and visit:
    * Sample Geometrixx Media Search Page: [http://localhost:4502/cf#/content/aemsolrsearch/aem-solr-search-sample.html](http://localhost:4502/cf#/content/aemsolrsearch/aem-solr-search-sample.html)
    * Solr: [http://localhost:8888/solr/](http://localhost:8888/solr/)
    

Improve Search Relevancy
=========================     
    
8. The aem-solr-search configurations allow to customize the request handler and improve the search boosts on any particular field.
   Refer https://github.com/headwirecom/aem-solr-search/blob/master/aemsolrsearch-vagrant/solr-home/configsets/geomtrixx/conf/solrconfig.xml
   
   To run an example, add the following request handler in solrconfig.xml of your Solr instance for enhancing the search results relevancy, based on the example you are running with the test data.
   
   Example: Request Handler
   https://github.com/DevDh/aemsolrsearch-sample/blob/master/requestHandler-solrconfigXml.png
   
   Restart your Solr Instance
         
9. Refresh to see the updated search results
         
   Sample Geometrixx Media Search Page: [http://localhost:4502/cf#/content/aemsolrsearch/aem-solr-search-sample.html](http://localhost:4502/cf#/content/aemsolrsearch/aem-solr-search-sample.html) 
     

For More Information
--------------------

Send an email to <pd@headwire.com>.
