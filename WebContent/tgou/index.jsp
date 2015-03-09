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

<c:forEach items="${merchandises}" var="variable">
	<li style="float: left; margin: 2px 2px;" onclick="javascript: pay();">
		<div style="width: 40px; height: 60px;">
			<div style="width: 100%; height: 40px; background: url('${variable.image}') no-repeat; background-position: 0px 0px;">
				
			</div>
			<div style="width: 100%; height: 20px; line-height: 20px; text-align: center; font-size: 10px">
				<a href="${variable.url}"><label>${variable.name}</label></a>
			</div>
		</div>
	</li>
</c:forEach>

<div style="width: 100%;">
	<div style="width: 270px; margin: 0 auto; display: -moz-box; display: -webkit-box; display: box;">
		<p style="height: 36px; -moz-box-flex:1.0; -webkit-box-flex:1.0; box-flex:1.0; text-align: center;"><label title="天猫" class="icon-cc-visa">天猫</label></p>
		<p style="height: 36px; -moz-box-flex:1.0; -webkit-box-flex:1.0; box-flex:1.0; text-align: center;"><label title="1号店" class="icon-vcard">1号店</label></p>
		<p style="height: 36px; -moz-box-flex:1.0; -webkit-box-flex:1.0; box-flex:1.0; text-align: center;"><label title="京东" class="icon-cc-mastercard">京东</label></p>
		<p style="height: 36px; -moz-box-flex:1.0; -webkit-box-flex:1.0; box-flex:1.0; text-align: center;"><label title="淘宝" class="icon-cc-mastercard">淘宝</label></p>
	</div>
</div>
</body>
</html>