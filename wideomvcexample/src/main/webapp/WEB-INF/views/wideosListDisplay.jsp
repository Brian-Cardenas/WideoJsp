<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>

<html>
<head>
	<title>Spring MVC Hello World</title>
</head>

<body>
	<h2>All Wideos in System</h2>

	<table border="1">
		<tr>
			<th>Wideo Id</th>
			<th>Wideo name</th>
			<th>Wideo Json</th>
		</tr>
		<c:forEach items="${wideos}" var="wideo">
			<tr>
				<td>${wideo.id}</td>
				<td>${wideo.name}</td>
				<td>${wideo.json}</td>
			</tr>
		</c:forEach>
	</table>

</body>
</html>