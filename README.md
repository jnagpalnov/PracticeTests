<b> Assignment:</b>
<p>
Using the API given below create an automated test with the listed acceptance criteria:
  <br/>
  <b>API</b> = https://api.tmsandbox.co.nz/v1/Categories/6327/Details.json?catalogue=false
  <b>Acceptance Criteria:</b>>
  <ul>
    <li><b>Name</b> = "Carbon credits"</li>
    <li><b>CanRelist</b> = true</li>
<li><b>The Promotions element with Name = "Gallery" has a Description that contains the text "2x larger image"</b></li>
    </ul>
<p>
  <b>Automated Test:</b>
<p>I have created the automated test to validate the above acceptance criteria using <b>Java</b> programming language and <b>REST Assured</b> library for testing HTTP endpoints.
  <br/>
In this test I am making a get request, deserialize the response in pojo(plain old java objects) class and verifying fields contents as per acceptance criteria.
  
 </p>
  <b>Running automated test</b>
  </br>
  <b> First way:</b> 
  <ul>
  <li> Clone the reposatory and add project as a Maven project.</li>
  <li> Run the "src/test/resources/testng.xml" file. It will execute the test method stored in "src/test/java/Tests.java" class.</li>
</ul>
  </br>
  <b>Second way:</b>In case of any issue in executing above testng test, you can test the logic by directly executing the <b>main</b> method of "src/test/java/TestWithoutTestNg.java" class.
<b> 
    
  
