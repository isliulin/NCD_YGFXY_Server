<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>荧光分析仪设备上传数据接口</title>

<script src="jquery-3.1.0.min.js"></script>

<script type="text/javascript">
	function uploaddeviceinfo(){
		
		var deviceidstr = $("#mydeviceid").val();

		$.ajax(
			{
				url : "up_info.action",
				type : "POST",
				data : "deviceInfo.deviceid="+deviceidstr,
				success : function(data, testStatus){
					alert(data, testStatus);
				}
			}
		);
	}
</script>
</head>
<body>
	
	<table>
		  <tr>
		    <td>设备id</td>
		    <td><input name="mydeviceid" id="mydeviceid" type="text"></td>
		    <td><input name="Submit1" type="button" value="提交" onClick="uploaddeviceinfo();"></td>
		  </tr>
		</table>

	<span>上传设备信息</span>
	
	<s:form action="UploadDeviceInfoAction">
		<s:textfield name="deviceInfo.deviceid" label="设备id"/>
		<s:textfield name="deviceInfo.devicename" label="设备名称"/>
		<s:textfield name="deviceInfo.makername" label="制造商"/>
		<s:textfield name="deviceInfo.makerphone" label="厂家电话"/>
		<s:textfield name="deviceInfo.deviceaddr" label="设备使用地址"/>
		<s:textfield name="deviceInfo.isok" label="是否需要维修"/>
		<tr><td colspan="2">
		<s:submit value="提交" theme="simple"/><s:reset theme="simple" value="重填"/>
		</td></tr>
	</s:form>
	
	<span>上传检测卡信息</span>
	<s:form action="UploadTestCardAction">
		<s:textfield name="testCardBean.cardid" label="检测卡id"/>
		<s:textfield name="testCardBean.item" label="测试项目"/>
		<s:textfield name="testCardBean.n_value" label="正常值"/>
		<s:textfield name="testCardBean.l_value" label="最低检测值"/>
		<s:textfield name="testCardBean.h_value" label="最高检测值"/>
		<s:textfield name="testCardBean.danwei" label="单位"/>
		<s:textfield name="testCardBean.t_l" label="T线位置"/>
		<s:textfield name="testCardBean.biaoqu_num" label="标准曲线数目"/>
		<s:textfield name="testCardBean.fenduan" label="临界峰高比"/>
		<s:textfield name="testCardBean.bq1_a" label="曲线1-参数a"/>
		<s:textfield name="testCardBean.bq1_b" label="曲线1-参数b"/>
		<s:textfield name="testCardBean.bq1_c" label="曲线1-参数c"/>
		<s:textfield name="testCardBean.bq2_a" label="曲线2-参数a"/>
		<s:textfield name="testCardBean.bq2_b" label="曲线2-参数b"/>
		<s:textfield name="testCardBean.bq2_c" label="曲线2-参数c"/>
		<s:textfield name="testCardBean.waittime" label="反应时间"/>
		<s:textfield name="testCardBean.c_l" label="C线位置"/>
		<s:textfield name="testCardBean.outtime" label="过期时间"/>
		<tr><td colspan="2">
		<s:submit value="提交" theme="simple"/><s:reset theme="simple" value="重填"/>
		</td></tr>
	</s:form>
	
	<span>上传测试数据</span>
	<s:form action="UploadTestDataAction">
		<s:textfield name="testDataBean.cardid" label="检测卡id"/>
		<s:textfield name="testDataBean.deviceid" label="设备id"/>
		<s:textfield name="testDataBean.testdate" label="测试时间"/>
		<s:textfield name="testDataBean.e_t" label="环境温度"/>
		<s:textfield name="testDataBean.o_t" label="检测卡温度"/>
		<s:textfield name="testDataBean.outtime" label="超时时间"/>
		<s:textfield name="testDataBean.c_l" label="C线位置"/>
		<s:textfield name="testDataBean.t_l" label="T线位置"/>
		<s:textfield name="testDataBean.b_l" label="基线位置"/>
		<s:textfield name="testDataBean.series" label="测试曲线"/>
		<s:textfield name="testDataBean.t_c_value" label="峰高比值"/>
		<s:textfield name="testDataBean.b_value" label="原始结果"/>
		<s:textfield name="testDataBean.a_value" label="校准后结果"/>
		<s:textfield name="testDataBean.simpleid" label="样品id"/>
		<s:textfield name="testDataBean.report_result" label="报告结果"/>
		<s:textfield name="testDataBean.report_desc" label="报告说明"/>
		<tr><td colspan="2">
		<s:submit value="提交" theme="simple"/><s:reset theme="simple" value="重填"/>
		</td></tr>
	</s:form>
	
	<span>测试曲线分段提交</span>
	<s:form action="UpLoadSeriesAction">
		<s:textfield name="testcardid" label="检测卡id"/>
		<s:textfield name="index" label="曲线第几段数据"/>
		<s:textfield name="series" label="曲线段"/>
		<tr><td colspan="2">
		<s:submit value="提交" theme="simple"/><s:reset theme="simple" value="重填"/>
		</td></tr>
	</s:form>
	
	<span>读取时间</span>
	<s:form action="ReadTimeAction">
		<s:textfield name="deviceid" label="设备id"/>
		<tr><td colspan="2">
		<s:submit value="提交" theme="simple"/><s:reset theme="simple" value="重填"/>
		</td></tr>
	</s:form>
	
</body>
</html>