<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Apache CXF + Spring Sample</title>
</head>
<body>

<h2>Sample application integrating Spring & Apache CXF</h2>

<p>
<ul>
	<li><a href="services">View list of available services</a></li>
</ul>
</p>

<h3>Apache CXF JAX-RS RESTful Test</h3>

<p>
<ul>
	<li><a href="services/samplerest/testrest/hello">Fetch RESTful hello message</a></li>
</ul>
</p>

<p>
<ul>
	<li><a href="services/samplerest/testrest/count">Fetch RESTful sample count</a></li>
</ul>
</p>

<p>
<ul>
	<li><a href="services/samplerest/testrest/sample/1">Fetch RESTful sample by ID 1</a></li>
	<li><a href="services/samplerest/testrest/sample/2">Fetch RESTful sample by ID 2</a></li>
	<li><a href="services/samplerest/testrest/sample/3">Fetch RESTful sample by ID 3</a></li>
	<li><a href="services/samplerest/testrest/sample/4">Fetch RESTful sample by ID 4</a></li>
	<li><a href="services/samplerest/testrest/sample/5">Fetch RESTful sample by ID 5</a></li>
	<li><a href="services/samplerest/testrest/sample/6">Fetch RESTful sample by ID 6 (Unknown)</a></li>
</ul>
</p>

<h3>Apache CXF JAX-WS SOAP Test</h3>

<p>
<ul>
	<li><a href="services/SampleSoapImplPort/getHello">Fetch SOAP envelope for getHello message</a></li>
</ul>
</p>

</body>
</html>