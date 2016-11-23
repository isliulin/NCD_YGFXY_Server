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
//上传检测卡信息
	function uploadcardinfo(){

		var json = {
				"cardBean.id": $("#id").val(),
		        "cardBean.item": $("#item").val(),
		        "cardBean.n_v": $("#normal").val(),
		        "cardBean.l_v": $("#low").val(),
		        "cardBean.h_v": $("#high").val(),
		        "cardBean.dw": $("#danwei").val(),
		        "cardBean.tl": $("#t_l").val(),
		        "cardBean.bq_n": $("#bqnum").val(),
		        "cardBean.fend": $("#fenduan").val(),
		        "cardBean.bq1_a": $("#bq1_a").val(),
		        "cardBean.bq1_b": $("#bq1_b").val(),
		        "cardBean.bq1_c": $("#bq1_c").val(),
		        "cardBean.bq2_a": $("#bq2_a").val(),
		        "cardBean.bq2_b": $("#bq2_b").val(),
		        "cardBean.bq2_c": $("#bq2_c").val(),
		        "cardBean.waitt": $("#wt").val(),
		        "cardBean.cl": $("#c_l").val(),
		        "cardBean.outdate": $("#time").val()
		    };

		$.ajax(
			{
				url : "upcard.action",
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
 	
 	<br><br>
	<table border="1" cellpadding="0" cellspacing="0">
		<tr>
			<th colspan="3" bgcolor="lightblue">检测卡信息提交</th>
		</tr>
		  
		<tr>
			<th>检测卡编号</th>
		    <td><input id="id" type="text"></td>
		    <td rowspan="14" ><input name="Submit1" type="button" value="提交信息" onClick="uploadcardinfo();"></td>
		</tr>
		
		<tr>
			<th>测试项目</th>
		    <td><input id="item" type="text"></td>
		</tr>
		
		<tr>
			<th>正常值</th>
		    <td><input id="normal" type="text"></td>
		</tr>
		
		<tr>
			<th>最低检测线</th>
		    <td><input id="low" type="text"></td>
		</tr>
		<tr>
			<th>最高检测线</th>
		    <td><input id="high" type="text"></td>
		</tr>
		<tr>
			<th>测试项目单位</th>
		    <td><input id="danwei" type="text"></td>
		</tr>
		<tr>
			<th>T线位置</th>
		    <td><input id="t_l" type="text"></td>
		</tr>
		<tr>
			<th>标准曲线数目</th>
		    <td><input id="bqnum" type="text"></td>
		</tr>
		<tr>
			<th>分段峰高比</th>
		    <td><input id="fenduan" type="text"></td>
		</tr>
		<tr>
			<th>标准曲线1</th>
		    <td><input id="bq1_a" type="text" style="width: 50px;"> x^2  <input id="bq1_b" type="text" style="width: 50px;"> x  <input id="bq1_c" type="text" style="width: 50px;"></td>
		</tr>
		<tr>
			<th>标准曲线2</th>
		    <td><input id="bq2_a" type="text" style="width: 50px;"> x^2  <input id="bq2_b" type="text" style="width: 50px;"> x  <input id="bq2_c" type="text" style="width: 50px;"></td>
		</tr>
		<tr>
			<th>反应时间</th>
		    <td><input id="wt" type="text"></td>
		</tr>
		<tr>
			<th>C线位置</th>
		    <td><input id="c_l" type="text"></td>
		</tr>
		<tr>
			<th>检测卡过期时间</th>
		    <td><input id="time" type="text"></td>
		</tr>
		
	</table>
</body>
</html>