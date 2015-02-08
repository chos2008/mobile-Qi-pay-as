(function() {
	window.onload = function() {
		function unbind(dom, type, listener) {
			if (dom.removeEventListener) {
				dom.removeEventListener(type, listener, false);
			} else {
				dom.detachEvent(type, listener);
			}
		}
		
		function bind(dom, type, listener) {
			if (dom.addEventListener) {
				dom.addEventListener(type, listener, false);
			} else {
				dom.attachEvent("on" + type, listener);
			}
		}
		
		function reg_mobile() {
			var div_reg_mobile = document.getElementById("div-reg-mobile");
			var div_reg_username = document.getElementById("div-reg-username");
			div_reg_mobile.style.display = "block";
			div_reg_username.style.display = "none";
			bt_reg_un.innerHTML = "用户名注册";
			unbind(bt_reg_un, "click", reg_mobile);
			bind(bt_reg_un, "click", reg_username);
		}
		
		function reg_username() {
			var div_reg_mobile = document.getElementById("div-reg-mobile");
			var div_reg_username = document.getElementById("div-reg-username");
			div_reg_mobile.style.display = "none";
			div_reg_username.style.display = "block";
			bt_reg_un.innerHTML = "手机号码注册";
			unbind(bt_reg_un, "click", reg_username);
			bind(bt_reg_un, "click", reg_mobile);
		}
		
		var bt_reg_un = document.getElementById("bt-reg");
		bind(bt_reg_un, "click", reg_username);
	};
	
})();