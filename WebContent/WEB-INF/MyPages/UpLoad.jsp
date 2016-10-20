<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>荧光分析仪设备上传数据接口</title>

<script src="<%=request.getContextPath()%>/js/jquery-3.1.0.min.js"></script>

<script type="text/javascript">

	//上传设备信息
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

	//上传检测卡信息
	function uploadcardinfo(){

		var json = {
				"tdata.cid": $("#c_id").val(),
		        "tdata.c_item": $("#c_item").val(),
		        "tdata.c_n_v": $("#c_normal").val(),
		        "tdata.c_l_v": $("#c_low").val(),
		        "tdata.c_h_v": $("#c_high").val(),
		        "tdata.c_dw": $("#c_danwei").val(),
		        "tdata.c_t_l": $("#c_t_l").val(),
		        "tdata.c_bq_n": $("#c_bqnum").val(),
		        "tdata.c_fend": $("#c_fenduan").val(),
		        "tdata.c_bq1_a": $("#c_bq1_a").val(),
		        "tdata.c_bq1_b": $("#c_bq1_b").val(),
		        "tdata.c_bq1_c": $("#c_bq1_c").val(),
		        "tdata.c_bq2_a": $("#c_bq2_a").val(),
		        "tdata.c_bq2_b": $("#c_bq2_b").val(),
		        "tdata.c_bq2_c": $("#c_bq2_c").val(),
		        "tdata.c_waitt": $("#c_wt").val(),
		        "tdata.c_c_l": $("#c_c_l").val(),
		        "tdata.c_outt": $("#c_time").val()
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
	//上传测试数
	function uploadtestinfo(){

		var json = {
				"tdata.cid": $("#t_cid").val(),
				"tdata.did": $("#t_did").val(),
				"tdata.testd": $("#t_date").val(),
				"tdata.testt": $("#t_time").val(),
				"tdata.e_t": $("#t_E_T").val(),
				"tdata.o_t": $("#t_O_T").val(),
				"tdata.outt": $("#t_otime").val(),
				"tdata.c_l": $("#t_c_l").val(),
				"tdata.t_l": $("#t_t_l").val(),
				"tdata.b_l": $("#t_b_l").val(),
				"tdata.t_c_v": $("#t_t_c").val(),
				"tdata.a_p": $("#t_a_p").val(),
				"tdata.b_v": $("#t_bresult").val(),
				"tdata.a_v": $("#t_result").val(),
				"tdata.sid": $("#t_sid").val(),
				"tdata.r_re": $("#t_rep").val(),
				"tdata.r_desc": $("#t_repdesc").val()
		    };

		$.ajax(
			{
				url : "updata.action",
				type : "POST",
				data : json,
				success : function(data, testStatus){
					alert(data, testStatus);
				}
			}
		);
	}
	//上传测试人
	function uploadtester(){

		var json = {
				"tdata.cid": $("#tester_cid").val(),
				"tdata.t_name": $("#tester_name").val(),
				"tdata.t_age": $("#tester_age").val(),
				"tdata.t_sex": $("#tester_sex").val(),
				"tdata.t_phone": $("#tester_phone").val(),
				"tdata.t_job": $("#tester_job").val(),
				"tdata.t_desc": $("#tester_desc").val(),
		    };

		$.ajax(
			{
				url : "uptester.action",
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
				"testcardid": $("#s_cid").val(),
		        "index": $("#s_index").val(),
		        "series": $("#s_series").val()
		    };

		$.ajax(
			{
				url : "upseries.action",
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
				"deviceid": $("#r_did").val(),
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
	
	<table border="1" cellpadding="0" cellspacing="0">
		<tr>
			<th colspan="4" bgcolor="lightblue">设备信息提交</th>
		</tr>
		  
		<tr>
			<th colspan="2">设备id</th>
		    <td><input id="d_id" type="text"></td>
		    <td rowspan="13" ><input name="Submit1" type="button" value="提交信息" onClick="uploaddeviceinfo();"></td>
		</tr>
		
		<tr>
			<th colspan="2">设备使用地址</th>
		    <td><input id="d_addr" type="text"></td>
		</tr>
		
		<tr>
			<th rowspan="7">设备责任人</th>
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
			<th>职务</th>
		    <td><input id="d_job" type="text"></td>
		</tr>
		<tr>
			<th>备注</th>
		    <td><input id="d_desc" type="text"></td>
		</tr>

		<tr>
			<th colspan="2">设备是否正常</th>
		    <td>
		    	<input name="d_status" id="d_status" type="radio" value="true"/>正常
		    	<input name="d_status" id="d_status" type="radio" value="false"/>异常
		    </td>
		</tr>
		
	</table>
	<br><br>
	<table border="1" cellpadding="0" cellspacing="0">
		<tr>
			<th colspan="3" bgcolor="lightblue">检测卡信息提交</th>
		</tr>
		  
		<tr>
			<th>检测卡编号</th>
		    <td><input id="c_id" type="text"></td>
		    <td rowspan="14" ><input name="Submit1" type="button" value="提交信息" onClick="uploadcardinfo();"></td>
		</tr>
		
		<tr>
			<th>测试项目</th>
		    <td><input id="c_item" type="text"></td>
		</tr>
		
		<tr>
			<th>正常值</th>
		    <td><input id="c_normal" type="text"></td>
		</tr>
		
		<tr>
			<th>最低检测线</th>
		    <td><input id="c_low" type="text"></td>
		</tr>
		<tr>
			<th>最高检测线</th>
		    <td><input id="c_high" type="text"></td>
		</tr>
		<tr>
			<th>测试项目单位</th>
		    <td><input id="c_danwei" type="text"></td>
		</tr>
		<tr>
			<th>T线位置</th>
		    <td><input id="c_t_l" type="text"></td>
		</tr>
		<tr>
			<th>标准曲线数目</th>
		    <td><input id="c_bqnum" type="text"></td>
		</tr>
		<tr>
			<th>分段峰高比</th>
		    <td><input id="c_fenduan" type="text"></td>
		</tr>
		<tr>
			<th>标准曲线1</th>
		    <td><input id="c_bq1_a" type="text" style="width: 50px;"> x^2  <input id="c_bq1_b" type="text" style="width: 50px;"> x  <input id="c_bq1_c" type="text" style="width: 50px;"></td>
		</tr>
		<tr>
			<th>标准曲线2</th>
		    <td><input id="c_bq2_a" type="text" style="width: 50px;"> x^2  <input id="c_bq2_b" type="text" style="width: 50px;"> x  <input id="c_bq2_c" type="text" style="width: 50px;"></td>
		</tr>
		<tr>
			<th>反应时间</th>
		    <td><input id="c_wt" type="text"></td>
		</tr>
		<tr>
			<th>C线位置</th>
		    <td><input id="c_c_l" type="text"></td>
		</tr>
		<tr>
			<th>检测卡过期时间</th>
		    <td><input id="c_time" type="text"></td>
		</tr>
		
	</table>
	<br><br>
	<table border="1" cellpadding="0" cellspacing="0">
		<tr>
			<th colspan="3" bgcolor="lightblue">测试数据提交</th>
		</tr>
		  
		<tr>
			<th>检测卡编号</th>
		    <td><input id="t_cid" type="text"></td>
		    <td rowspan="18" ><input name="Submit1" type="button" value="提交信息" onClick="uploadtestinfo();"></td>
		</tr>
		
		<tr>
			<th>设备id</th>
		    <td><input id="t_did" type="text"></td>
		</tr>
		
		<tr>
			<th>测试日期</th>
		    <td><input id="t_date" type="text"></td>
		</tr>
		
		<tr>
			<th>测试时间</th>
		    <td><input id="t_time" type="text"></td>
		</tr>
		
		<tr>
			<th>环境温度</th>
		    <td><input id="t_E_T" type="text"></td>
		</tr>
		<tr>
			<th>检测卡温度</th>
		    <td><input id="t_O_T" type="text"></td>
		</tr>
		<tr>
			<th>测试超时时间</th>
		    <td><input id="t_otime" type="text"></td>
		</tr>
		<tr>
			<th>C线位置</th>
		    <td><input id="t_c_l" type="text"></td>
		</tr>
		<tr>
			<th>T线位置</th>
		    <td><input id="t_t_l" type="text"></td>
		</tr>
		<tr>
			<th>基线位置</th>
		    <td><input id="t_b_l" type="text"></td>
		</tr>
		<tr>
			<th>峰高比</th>
		    <td><input id="t_t_c" type="text"></td>
		</tr>
		<tr>
			<th>校准参数</th>
		    <td><input id="t_a_p" type="text"></td>
		</tr>
		<tr>
			<th>原始结果</th>
		    <td><input id="t_bresult" type="text"></td>
		</tr>
		<tr>
			<th>校准后结果</th>
		    <td><input id="t_result" type="text"></td>
		</tr>
		<tr>
			<th>样品id</th>
		    <td><input id="t_sid" type="text"></td>
		</tr>
		<tr>
			<th>报告结果</th>
		    <td><input id="t_rep" type="text"></td>
		</tr>
		<tr>
			<th>报告说明</th>
		    <td><input id="t_repdesc" type="text"></td>
		</tr>
	</table>
	<br><br>
	<table border="1" cellpadding="0" cellspacing="0">
		<tr>
			<th colspan="3" bgcolor="lightblue">测试人提交</th>
		</tr>
		  
		<tr>
			<th>检测卡编号</th>
		    <td><input id="tester_cid" type="text"></td>
		    <td rowspan="17" ><input name="Submit1" type="button" value="提交信息" onClick="uploadtester();"></td>
		</tr>
		
		<tr>
			<th>测试人姓名</th>
		    <td><input id="tester_name" type="text"></td>
		</tr>
		
		<tr>
			<th>测试人年龄</th>
		    <td><input id="tester_age" type="text"></td>
		</tr>
		
		<tr>
			<th>测试人性别</th>
		    <td><input id="tester_sex" type="text"></td>
		</tr>
		
		<tr>
			<th>测试人联系方式</th>
		    <td><input id="tester_phone" type="text"></td>
		</tr>
		<tr>
			<th>检测人职务</th>
		    <td><input id="tester_job" type="text"></td>
		</tr>
		<tr>
			<th>测试人备注</th>
		    <td><input id="tester_desc" type="text"></td>
		</tr>
	</table>
	<br><br>
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
	<br><br>
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