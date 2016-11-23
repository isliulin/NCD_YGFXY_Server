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
	//上传测试数
	function uploadtestinfo(){
	
		var json = {
				"tdata.cid": $("#cid").val(),
				"tdata.citem": $("#citem").val(),
				"tdata.cdw": $("#cdw").val(),
				"tdata.did": $("#did").val(),
				"tdata.t_name": $("#t_name").val(),
				"tdata.sampleid": $("#sampleid").val(),
				"tdata.testtime": $("#testtime").val(),
				"tdata.e_t": $("#e_t").val(),
				"tdata.o_t": $("#o_t").val(),
				"tdata.outt": $("#outt").val(),
				"tdata.c_l": $("#c_l").val(),
				"tdata.t_l": $("#t_l").val(),
				"tdata.b_l": $("#b_l").val(),
				"tdata.t_c_v": $("#t_c_v").val(),
				"tdata.a_p": $("#a_p").val(),
				"tdata.b_v": $("#b_v").val(),
				"tdata.a_v": $("#a_v").val(),
				"tdata.t_re": $("#t_re").val()
		    };
	
		$.ajax(
			{
				url : "uptestdata.action",
				type : "POST",
				data : json,
				success : function(data, testStatus){
					alert(data, testStatus);
				}
			}
		);
	}

	//分段上传测试曲线
	function uploadseriesinfo(){

		var json = {
				"tdata.cid": $("#s_cid").val(),
		        "sindex": $("#s_index").val(),
		        "series": $("#s_series").val()
		    };

		$.ajax(
			{
				url : "upseriesdata.action",
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
			<th colspan="3" bgcolor="lightblue">测试数据提交</th>
		</tr>
		  
		<tr>
			<th>检测卡编号</th>
		    <td><input id="cid" type="text"></td>
		    <td rowspan="18" ><input name="Submit1" type="button" value="提交信息" onClick="uploadtestinfo();"></td>
		</tr>
		
		<tr>
			<th>测试项目</th>
		    <td><input id="citem" type="text"></td>
		</tr>
		
		<tr>
			<th>单位</th>
		    <td><input id="cdw" type="text"></td>
		</tr>
		
		<tr>
			<th>设备id</th>
		    <td><input id="did" type="text"></td>
		</tr>
		
		<tr>
			<th>操作人姓名</th>
		    <td><input id="t_name" type="text"></td>
		</tr>
		
		<tr>
			<th>样品编号</th>
		    <td><input id="sampleid" type="text"></td>
		</tr>
		
		<tr>
			<th>测试时间</th>
		    <td><input id="testtime" type="text"></td>
		</tr>
		
		<tr>
			<th>环境温度</th>
		    <td><input id="e_t" type="text"></td>
		</tr>
		<tr>
			<th>检测卡温度</th>
		    <td><input id="o_t" type="text"></td>
		</tr>
		<tr>
			<th>测试超时时间</th>
		    <td><input id="outt" type="text"></td>
		</tr>
		<tr>
			<th>C线位置</th>
		    <td><input id="c_l" type="text"></td>
		</tr>
		<tr>
			<th>T线位置</th>
		    <td><input id="t_l" type="text"></td>
		</tr>
		<tr>
			<th>基线位置</th>
		    <td><input id="b_l" type="text"></td>
		</tr>
		<tr>
			<th>峰高比</th>
		    <td><input id="t_c_v" type="text"></td>
		</tr>
		<tr>
			<th>校准参数</th>
		    <td><input id="a_p" type="text"></td>
		</tr>
		<tr>
			<th>原始结果</th>
		    <td><input id="b_v" type="text"></td>
		</tr>
		<tr>
			<th>校准后结果</th>
		    <td><input id="a_v" type="text"></td>
		</tr>
		<tr>
			<th>设备诊断结果</th>
		    <td><input id="t_re" type="text"></td>
		</tr>
	</table>
	
	<br><br><br><br>
	<table border="1" cellpadding="0" cellspacing="0">
		<tr>
			<th colspan="3" bgcolor="lightblue">测试曲线分段提交</th>
		</tr>
		
		<tr>
			<th>检测卡编号</th>
		    <td><input id="s_cid" type="text"></td>
		    <td rowspan="3" ><input name="Submit1" type="button" value="提交信息" onClick="uploadseriesinfo();"></td>
		</tr>
		
		<tr>
			<th>当前数据为第几段数据</th>
		    <td><input id="s_index" type="text"></td>
		</tr>
		
		<tr>
			<th>当前段数的曲线数据</th>
		    <td><input id="s_series" type="text"></td>
		</tr>
	</table>
	
</body>
</html>