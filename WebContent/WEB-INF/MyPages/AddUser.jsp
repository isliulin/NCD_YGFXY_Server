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
	function uploaddeviceinfo(){

		var json = {
				"dfo.id": $("#d_id").val(),
		        "dfo.daddr": $("#d_addr").val(),
		        "dfo.dname": $("#d_name").val(),
		        "dfo.dage": $("#d_age").val(),
		        "dfo.dsex": $('input:radio[name="d_sex"]:checked').val(),
		        "dfo.dphone": $("#d_phone").val(),
		        "dfo.djob": $("#d_job").val(),
		        "dfo.ddesc": $("#d_desc").val(),
		        "dfo.disok": $('input:radio[name="d_status"]:checked').val()
		    };

		$.ajax(
			{
				url : "up_info.action",
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

		var para=document.createElement("p");
		var node=document.createTextNode("This is new.");
		para.appendChild(node);

		var element=document.getElementById("div1");
		var child=document.getElementById("p1");
		element.insertBefore(para,child);
	}
</script>
</head>
<body>
	<table border="1" cellpadding="0" cellspacing="0">
		<tr>
			<th colspan="4" bgcolor="lightblue">添加用户</th>
		</tr>
		  
		<tr>
			<th >用户账户</th>
		    <td ><input id="d_id" type="text"></td>
		    <td rowspan="13" ><input name="Submit1" type="button" value="提交信息" onClick="uploaddeviceinfo();"></td>
		</tr>
		
		<tr>
			<th >用户密码</th>
		    <td><input id="d_addr" type="text"></td>
		</tr>
		<tr>
			<th>姓名</th>
		    <td><input id="d_name" type="text"></td>
		</tr>
		<tr>
			<th>性别</th>
		    <td>
		    	<input name="d_sex" id="d_sex" type="radio" value="男"/>男
		    	<input name="d_sex" id="d_sex" type="radio" value="女"/>女
		    </td>
		</tr>
		<tr>
			<th>年龄</th>
		    <td><input id="d_age" type="text"></td>
		</tr>
		<tr>
			<th>联系方式</th>
		    <td><input id="d_phone" type="text"></td>
		</tr>
		<tr>
			<th>备注</th>
		    <td><input id="d_desc" type="text"></td>
		</tr>

		<tr>
			<th>所管辖设备id</th>
		    <dl id="devicelist">
				
			</dl>
		</tr>
		
	</table>
	
	<div id="div1">
	<p id="p1">This is a paragraph.</p>
	<p id="p2">This is another paragraph.</p>
	<input type="button" value="+" onClick="adddevicefield();">
	</div>
</body>
</html>