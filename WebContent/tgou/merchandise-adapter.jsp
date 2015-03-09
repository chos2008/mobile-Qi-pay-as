<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="/WEB-INF/c.tld"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>天天购-随意购，随处购</title>
</head>
<body>
<form id="form-proxy" action="${authorize_url}" method="post">
	<input type="hidden" name="method" value="${method}">
	<input type="hidden" name="user_id" value="${user_id}">
	<input type="hidden" name="oauth_token" value="${oauth_token}">
	<input type="hidden" name="oauth_callback" value="${oauth_callback}">
</form>
<script type="text/javascript">
	var form = document.getElementById('form-proxy');
	form.submit();
</script>
</body>
</html>