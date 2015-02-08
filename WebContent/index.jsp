<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0, user-scalable=no, minimum-scale=1.0, maximum-scale=1.0" />
<meta name="apple-mobile-web-app-capable" content="yes" />
<title>Qi支付</title>
<link rel="stylesheet" type="text/css" href="css/style.css"/>

<style> 

</style>
</head>
<body topmargin="0" rightmargin="0" bottommargin="0" leftmargin="0" marginheight="0" marginwidth="0">
<div style="width: 100%; height: 24px; line-height: 24px; border: 0px solid green; border-bottom: 1px solid green; position: relative;">
	<div style="height: 24px; line-height: 24px; position: absolute; right: 0px; top: 0px;">
		<ul style="height: 24px; line-height: 24px; margin: 0px 0px; padding: 0px 0px; list-style-type: none; list-style-position: outside;">
			<li class="icon-user2" onclick="window.location.href = 'i.jsp';" style="height: 24px; line-height: 24px; width: 14px; margin-left: 2px; margin-right: 2px; float: left;"></li>
			<li style="height: 24px; line-height: 24px; width: 32px; margin-left: 2px; margin-right: 2px; float: left; font-size: 14px; text-align: center;">
				<a href="login.jsp">登录</a>
			</li>
			<li style="height: 24px; line-height: 24px; width: 32px; margin-left: 2px; margin-right: 2px; float: left; font-size: 14px; text-align: center;">
				<a href="register.jsp">注册</a>
			</li>
			<li class="icon-qrcode" style="height: 24px; line-height: 24px; width: 14px; margin-left: 2px; margin-right: 2px; float: left;"></li>
		</ul>
	</div>
	<div style="position: absolute; left: 0px; top: 0px; display: block;">支付中心</div>
</div>
<div style="width: 270px; margin: 0 auto; display: -moz-box; display: -webkit-box; display: box;">
<p style="height: 36px; -moz-box-flex:1.0; -webkit-box-flex:1.0; box-flex:1.0; text-align: center;">
<label title="visa" class="icon-cc-visa" style="width: 100%; display: block;"></label>
<label style="width: 100%; display: block;">个人服务</label>
</p>
<p style="height: 36px; -moz-box-flex:1.0; -webkit-box-flex:1.0; box-flex:1.0; text-align: center;">
<label title="vcard" class="icon-vcard" style="width: 100%; display: block;"></label>
<label style="width: 100%; display: block;">安全</label>
</p>
<p style="height: 36px; -moz-box-flex:1.0; -webkit-box-flex:1.0; box-flex:1.0; text-align: center;">
<label title="master card" class="icon-cc-mastercard" style="width: 100%; display: block;"></label>
<label style="width: 100%; display: block;">商家服务</label>
</p>
</div>

<div style="width: 100%; height: 120px; border-top-style: solid; border-top-color: green; border-top-width: 1px;">

</div>




<div style="width: 100%; height: auto; border: 0px solid green; text-align: center; margin-top: 300px;">
	<label>Qidea 支付接入服务器</label>
</div>

<div style="width: 100%; height: 120px; border-top-style: solid; border-top-color: green; border-top-width: 1px;">

<div style="width: 100%; display: -moz-box; display: -webkit-box; display: box; box-pack: center; -moz-box-pack: center; -webkit-box-pack: center; -o-box-pack: center;">
<!--  -moz-box-flex:3; -webkit-box-flex:3; box-flex:3; -->
<p style="width: 70px; height: 36px; text-align: center;">
	<label title="paypal" class="icon-paypal" style="width: 100%; display: block;"></label>
	<label style="width: 100%; display: block;">paypal</label>
</p>
<p style="width: 70px; height: 36px; text-align: center;">
	<label title="google wallet" class="icon-google-wallet" style="width: 100%; display: block;"></label>
	<label style="width: 100%; display: block;">google wallet</label>
</p>
<p style="width: 70px; height: 36px; text-align: center;">
	<label title="stripe" class="icon-cc-stripe" style="width: 100%; display: block;"></label>
	<label style="width: 100%; display: block;">stripe</label>
</p>
<p style="width: 70px; height: 36px; text-align: center;">
	<label title="amex" class="icon-cc-amex" style="width: 100%; display: block;"></label>
	<label style="width: 100%; display: block;">amex</label>
</p>
</div>
<div style="width: 100%; display: -moz-box; display: -webkit-box; display: box; box-pack: center; -moz-box-pack: center; -webkit-box-pack: center; -o-box-pack: center;">
<p style="width: 70px; height: 36px; text-align: center;">
	<label title="discover" class="icon-cc-discover" style="width: 100%; display: block;"></label>
	<label style="width: 100%; display: block;">discover</label>
</p>
<p style="width: 70px; height: 36px; text-align: center;">
	<label title="paypal" class="icon-cc-paypal" style="width: 100%; display: block;"></label>
	<label style="width: 100%; display: block;">paypal</label>
</p>
<p style="width: 70px; height: 36px; text-align: center;">
	<label title="credit card" class="icon-creditcard" style="width: 100%; display: block;"></label>
	<label style="width: 100%; display: block;">credit card</label>
</p>
<p style="width: 70px; height: 36px; text-align: center;">
	<label title="credit card" class="icon-credit-card" style="width: 100%; display: block;"></label>
	<label style="width: 100%; display: block;">credit card</label>
</p>
</div>

<div style="width: 100%;">


<div style="width: 270px; margin: 0 auto; display: -moz-box; display: -webkit-box; display: box;">
<p style="height: 36px; -moz-box-flex:1.0; -webkit-box-flex:1.0; box-flex:1.0; text-align: center;"><label title="visa" class="icon-cc-visa"></label></p>
<p style="height: 36px; -moz-box-flex:1.0; -webkit-box-flex:1.0; box-flex:1.0; text-align: center;"><label title="vcard" class="icon-vcard"></label></p>
<p style="height: 36px; -moz-box-flex:1.0; -webkit-box-flex:1.0; box-flex:1.0; text-align: center;"><label title="master card" class="icon-cc-mastercard"></label></p>
</div>


</div>

<div class="copyright" style="text-align: center;">
	<div style="width: 100%; display: -moz-box; display: -webkit-box; display: box; box-pack: center; -moz-box-pack: center; -webkit-box-pack: center; -o-box-pack: center;">
		<!--  -moz-box-flex:3; -webkit-box-flex:3; box-flex:3; -->
		<p style="width: 70px; height: 36px; text-align: center;">
			<a href="login.jsp">登录</a>
		</p>
		<p style="width: 70px; height: 36px; text-align: center;">
			<a href="register2.jsp">注册</a>
		</p>
	</div>
	<div style="width: 100%; display: -moz-box; display: -webkit-box; display: box; box-pack: center; -moz-box-pack: center; -webkit-box-pack: center; -o-box-pack: center;">
		<!--  -moz-box-flex:3; -webkit-box-flex:3; box-flex:3; -->
		<p style="width: 70px; height: 36px; text-align: center;">
			<a href="login.jsp">触屏版</a>
		</p>
		<p style="width: 70px; height: 36px; text-align: center;">
			<a href="register.jsp">极速版</a>
		</p>
		<p style="width: 70px; height: 36px; text-align: center;">
			<a href="register.jsp">电脑版</a>
		</p>
	</div>
	正旅网络科技版权所有 2008-2014 <a href="#" target="_blank" seed="copyright-link" smartracker="on"></a>
</div>

</div>
</body>
</html>