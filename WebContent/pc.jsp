<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="/WEB-INF/c.tld"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>支付中心</title>
</head>
<body topmargin="0" rightmargin="0" bottommargin="0" leftmargin="0" marginheight="0" marginwidth="0">
<div style="width: 100%; height: 35px; line-height: 35px; text-align: center; border: 0px solid silver; border-bottom: 1px solid silver;">
    <label>支付中心</label>
</div>
<div style="width: 100%; height: auto;">
    <div style="width: 320px; height: auto; margin: 0px auto;">
    	<div style="border-radius: 7px 7px 7px 7px; border: 1px solid silver; padding: 2px 3px; margin: 2px 2px;">
	    	<div style="width: 100%; height: 22px; border: 0px solid silver;">
	    		<label>来自 给力三国</label>
	    	</div>
	    	<div style="width: 100%; height: 22px; border: 0px solid silver;">
	    		<p style="margin: 2px 0px 0px 0px; padding: 0px 0px;">
	                <span style="width: 80px; display: inline-block;">
	                    <label>交易金额：</label>
	                </span>
	                <span>328元</span>
	            </p>
	    	</div>
	    	<div style="width: 100%; height: 22px; margin-top: 35px; border: 0px solid silver;">
	    		<p style="margin: 2px 0px 0px 0px; padding: 0px 0px;">
	                <span style="width: 80px; display: inline-block;">
	                    <label>账户余额：</label>
	                </span>
	                <span>100000元</span>
	            </p>
	    	</div>
    	</div>
    	
    	<script type="text/javascript">
    	function pay() {
    		window.location.href = "../../rest/p";
        }
    	</script>
    	<div style="border-radius: 7px 7px 7px 7px; border: 1px solid silver; padding: 2px 3px; margin: 2px 2px;">
	    	<div style="width: 100%; height: auto; border: 0px solid silver; border-top: 1px solid silver;">
	    		<div style="width: 100%; height: 20px; line-height: 20px; border: 0px solid silver;">
		    		<label style="font-size: 10px; color: gray;">请选择支付方式：</label>
		    	</div>
		    	<div style="width: 100%; height: auto; border: 0px solid silver; display: inline-block;">
		    		<ul style="list-style-type: none; margin: 0px 0px; padding: 0px 0px;">
		    			<c:forEach items="${tas}" var="variable">
		    			<li style="float: left; margin: 2px 2px;" onclick="javascript: pay();">
		    				<div style="width: 40px; height: 60px;">
		    					<div style="width: 100%; height: 40px; background: url('../../images/ta/icon-default.png') no-repeat; background-position: 0px 0px;">
		    						
		    					</div>
		    					<div style="width: 100%; height: 20px; line-height: 20px; text-align: center; font-size: 10px"><label>${variable.name}</label></div>
		    				</div>
		    			</li>
						</c:forEach>
		    		</ul>
		    	</div>
	    	</div>
    	</div>
    	<div style="width: 100%; height: auto; border: 0px solid silver; border-top: 1px solid silver;">
    		<label style="font-size: 10px; color: gray;">上海齐思客服热线: 021-00000000 | 问题反馈</label>
    	</div>
    </div>
</div>
</body>
</html>