<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>

<html>
<head>
<title>Save Wideo</title>
</head>

<body>
	<h2>Save Wideo</h2>
	
	<form action="${pageContext.request.contextPath}/wideo-module/savedWideo" method="get">
		<table>
			<tr>
				<td>name Wideo:</td>
				<td><input name="namewideo" /></td>
			</tr>
			<tr>
				<td>Wideo JSON:</td>
				<td><input name="jsonwideo" /></td>
			</tr>
		</table>
		<input type="submit" />
	</form>
	

</body>
</html>