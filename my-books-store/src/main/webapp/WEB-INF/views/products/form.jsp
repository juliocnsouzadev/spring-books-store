<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>My Book Store</title>
</head>
<body>
	<h1>My Book Store - New Product</h1>
	<form action="/products" method="post">
		<div>
			<label>Title</label>
			<input type="text" name="title">
		</div>
		<div>
			<label>Description</label>
			<textarea rows="10" cols="20" name="description"></textarea>
		</div>
		<div>
			<label>Pages</label>
			<input type="text" name="pages">
		</div>
		<button type="submit">Save</button>
	</form>
</body>
</html>