<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>

<script src="<%=request.getContextPath()%>/js/jquery-3.1.0.min.js"></script>
<script src="<%=request.getContextPath()%>/js/menu.js"></script>
<link rel="stylesheet" href="<%=request.getContextPath()%>/css/menu.css"  type="text/css"/>

<script  type="text/javascript">
  //上传设备信息
  function uploaddeviceinfo(){

    var json = {
        "deviceBean.id": $("#device_id").val(),
        "deviceBean.daddr": $("#device_addr").val(),
        "deviceBean.disok": $('input:radio[name="d_status"]:checked').val(),
        "deviceBean.name": $("#dname").val(),
        "deviceBean.age": $("#dage").val(),
        "deviceBean.sex": $('input:radio[name="dsex"]:checked').val(),
        "deviceBean.phone": $("#dphone").val(),
        "deviceBean.job": $("#djob").val(),
        "deviceBean.dsc": $("#ddesc").val()
    };

    $.ajax(
      {
        url : "d_info.action",
        type : "POST",
        data : json,
        success : function(data, testStatus){
          alert(data, testStatus);
        }
      }
    );
  }

//上传设备操作人信息
  function uploaddeviceuserinfo(){

    var json = {
        "devicerBean.did": $("#p_did").val(),
        "devicerBean.name": $("#pname").val(),
        "devicerBean.age": $("#page").val(),
        "devicerBean.sex": $('input:radio[name="psex"]:checked').val(),
        "devicerBean.phone": $("#pphone").val(),
        "devicerBean.job": $("#pjob").val(),
        "devicerBean.dsc": $("#pdesc").val()
    };

    $.ajax(
      {
        url : "d_user.action",
        type : "POST",
        data : json,
        success : function(data, testStatus){
          alert(data, testStatus);
        }
      }
    );
  }

	//获取时间
	function readtime(){

		var json = {
				"deviceBean.id": $("#r_did").val(),
		    };

		$.ajax(
			{
				url : "rtime.action",
				type : "POST",
				data : json,
				success : function(data, testStatus){
					alert(data, testStatus);
				}
			}
		);
	}
</script>

</head>
<body>
	<!-- 把导航菜单包含进来 -->
  <%@include file="Menu.jsp" %>

  	<table border="1" cellpadding="0" cellspacing="0">
		<tr>
			<th colspan="4" bgcolor="lightblue">设备信息提交</th>
		</tr>

		<tr>
			<th>设备id</th>
		    <td><input id="device_id" type="text"></td>
		    <td rowspan="13" ><input name="Submit1" type="button" value="提交信息" onClick="uploaddeviceinfo();"></td>
		</tr>

		<tr>
			<th>设备使用地址</th>
		    <td><input id="device_addr" type="text"></td>
		</tr>
		<tr>
			<th>设备是否正常</th>
		    <td>
		    	<input name="d_status" id="d_status" type="radio" value="true"/>正常
		    	<input name="d_status" id="d_status" type="radio" value="false"/>异常
		    </td>
		</tr>
		
		<tr>
			<th>姓名</th>
		    <td><input id="dname" type="text"></td>
		</tr>
		<tr>
			<th>性别</th>
		    <td>
		    	<input name="dsex" id="dsex" type="radio" value="男"/>男
		    	<input name="dsex" id="dsex" type="radio" value="女"/>女
		    </td>
		</tr>
		<tr>
			<th>年龄</th>
		    <td><input id="dage" type="text"></td>
		</tr>
		<tr>
			<th>联系方式</th>
		    <td><input id="dphone" type="text"></td>
		</tr>
		<tr>
			<th>职务</th>
		    <td><input id="djob" type="text"></td>
		</tr>
		<tr>
			<th>备注</th>
		    <td><input id="ddesc" type="text"></td>
		</tr>

	</table>
	
	</br></br></br></br>
	<table border="1" cellpadding="0" cellspacing="0">
		<tr>
			<th colspan="3" bgcolor="lightblue">设备操作人提交</th>
		</tr>

		<tr>
			<th>设备id</th>
		    <td><input id="p_did" type="text"></td>
		    <td rowspan="13" ><input name="Submit1" type="button" value="提交信息" onClick="uploaddeviceuserinfo();"></td>
		</tr>

		<tr>
			<th>姓名</th>
		    <td><input id="pname" type="text"></td>
		</tr>
		<tr>
			<th>性别</th>
		    <td>
		    	<input name="psex" id="psex" type="radio" value="男"/>男
		    	<input name="psex" id="psex" type="radio" value="女"/>女
		    </td>
		</tr>
		<tr>
			<th>年龄</th>
		    <td><input id="page" type="text"></td>
		</tr>
		<tr>
			<th>联系方式</th>
		    <td><input id="pphone" type="text"></td>
		</tr>
		<tr>
			<th>职务</th>
		    <td><input id="pjob" type="text"></td>
		</tr>
		<tr>
			<th>备注</th>
		    <td><input id="pdesc" type="text"></td>
		</tr>

	</table>

	<br><br></br></br>
	<table border="1" cellpadding="0" cellspacing="0">
		<tr>
			<th colspan="3" bgcolor="lightblue">获取当前时间</th>
		</tr>
		
		<tr>
			<th>设备id</th>
		    <td><input id="r_did" type="text"></td>
		    <td><input name="Submit1" type="button" value="提交信息" onClick="readtime();"></td>
		</tr>
	</table>
	
</body>
</html>
