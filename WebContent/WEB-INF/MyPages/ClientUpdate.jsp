<%@ page language="java" contentType="text/html; charset=GBK"
    pageEncoding="GBK"%>
    <%@taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>客户端管理</title>
</head>
<body>
	<s:property value=" + resultstr"/><br/>
	<s:form action="xsx_struts/updateclientsoft" enctype="multipart/form-data">
		<s:textfield name="softVersion.version" label="版本"/>
		<s:textarea name="softVersion.versiondesc" label="说明"></s:textarea>
		<s:file name="updatefile" label="选择文件"/>
		<tr><td colspan="2">
		<s:submit value="上传"/>
		</td></tr>
	</s:form>

</body>
</html>