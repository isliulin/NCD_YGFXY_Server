<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<script src="<%=request.getContextPath()%>/js/jquery-3.1.0.min.js"></script>

<script type="text/javascript">

	//添加用户
	function adduser(){
		var devicestr = "[";
		var element=document.getElementById("devicelist");
		var elementlist = element.children;
		
		for (var i=0;i<elementlist.length-1;i++)
			{
				var node = elementlist[i].firstChild;
				devicestr += "\"";
				devicestr += node.value;
				devicestr += "\",";
			}
		var node = elementlist[elementlist.length-1].firstChild;
		devicestr += "\"";
		devicestr += node.value;
		devicestr += "\"]";
		
		var json = {
				"managerBean.account": $("#account").val(),
		        "managerBean.password": $("#password").val(),
		        "managerBean.name": $("#name").val(),
		        "managerBean.age": $("#age").val(),
		        "managerBean.sex": $('input:radio[name="sex"]:checked').val(),
		        "managerBean.phone": $("#phone").val(),
		        "managerBean.job": $("#job").val(),
		        "managerBean.dsctext": $("#desc").val(),
		        "managerBean.devicelist": devicestr,
		        "ncd_password": $("#ncdword").val()
		    };

		$.ajax(
			{
				url : "addmanager.action",
				type : "POST",
				data : json,
				success : function(data, testStatus){
					alert(data, testStatus);
				}
			}
		);
	}

	//添加设备栏
	function adddevicefield(){
	
		var element=document.getElementById("devicelist");

		var id = "device-";
		id += element.children.length;;
		
		var li=document.createElement("dt");
		var input=document.createElement("input");
		input.setAttribute('id', id);
		li.appendChild(input);
		
		var child=element.firstChild;
		element.insertBefore(li,child);
	}
</script>
</head>
<body>
	
		<p bgcolor="lightblue">添加用户</p>

		  
		<p>用户账户<input id="account" type="text"></p>
		<p>用户密码<input id="password" type="text"></p>
		<p>姓名<input id="name" type="text"> </p>
 		<p>性别<input name="sex" id="sex" type="radio" value="男"/>男
		    <input name="sex" id="sex" type="radio" value="女"/>女
		</p>
		<p>年龄<input id="age" type="text"></p>
		<p>联系方式<input id="phone" type="text"></p>
		<p>备注<input id="desc" type="text"></p>
		<p>所管辖设备id
		    <dl id="devicelist">
				<dt><input id="device-0" type="text"><input type="button" value="+" onClick="adddevicefield();"></dt>
			</dl>
		</p>
		<p>销售密码<input id="ncdword" type="password"></p>
		<input name="Submit1" type="button" value="提交信息" onClick="adduser();">
</body>
</html>