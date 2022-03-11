<%--
  Created by IntelliJ IDEA.
  User: Stephen
  Date: 2022/3/8
  Time: 15:03
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<html>
<head>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-rTTiRUKnSWaDu2FjhzWFl8/JuUZMlplyWE/djenb2LoKqkgLGfEGfSrL7XDLoB1M" crossorigin="anonymous">
    <script src="https://cdn.jsdelivr.net/npm/@popperjs/core@2.11.2/dist/umd/popper.min.js" integrity="sha384-q9CRHqZndzlxGLOj+xrdLDJa9ittGte1NksRmgJKeCV9DrM7Kz868XYqsKWPpAmn" crossorigin="anonymous"></script>
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.min.js" integrity="sha384-YSu1vEueMOXZYSSiTgjRD6egOBAdWrKI6AQBdHjTtvftX42GZLCVzwlxm0RJuipa" crossorigin="anonymous"></script>
    <title>SSM_DEMO_INDEX</title>
</head>
<body>
<h1>Read all Actors</h1>
<form id="readForm" action="/ssm_demo1_war_exploded/demo/readActor" method="post">
    <input name="btnTrigger" id="btnTrigger" class= "btn btn-primary" type="submit" value="Click Me" />
</form>

${printTable}

<h1>Jump to another page and request data</h1>
<form id="jumpPage" action="/ssm_demo1_war_exploded/demo/service1" method="post">
    <input name="btnTrigger1" id="btnTrigger1" class= "btn btn-primary" type="submit" value="Click Me" />
</form>



</body>
</html>
