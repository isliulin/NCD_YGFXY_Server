package org.com.xsx.actions;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.regex.Pattern;

import org.apache.commons.codec.digest.DigestUtils;
import org.com.xsx.beans.SoftVersion;
import org.com.xsx.services.UpdateClientSoftService;

import com.opensymphony.xwork2.ActionSupport;

public class UpdateClientSoftAction extends ActionSupport {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	//���������Ϣ
	private SoftVersion softVersion;
	
	//�����Ϣ
	private File updatefile;
	private String updatefileContentType;
	private String updatefileFileName;
	private String savePath;
	
	//service
	private UpdateClientSoftService updateClientSoftService;
	
	//���ص���Ϣ
	private String resultstr;
	

	public SoftVersion getSoftVersion() {
		return softVersion;
	}

	public void setSoftVersion(SoftVersion softVersion) {
		this.softVersion = softVersion;
	}

	public File getUpdatefile() {
		return updatefile;
	}

	public void setUpdatefile(File updatefile) {
		this.updatefile = updatefile;
	}

	public String getUpdatefileContentType() {
		return updatefileContentType;
	}

	public void setUpdatefileContentType(String updatefileContentType) {
		this.updatefileContentType = updatefileContentType;
	}

	public String getUpdatefileFileName() {
		return updatefileFileName;
	}

	public void setUpdatefileFileName(String updatefileFileName) {
		this.updatefileFileName = updatefileFileName;
	}


	public String getSavePath() {
		try {
			URI uri = new URI(this.getClass().getClassLoader().getResource("/").toString());
			
			String path = uri.getPath();
			
			return path.substring(0, path.indexOf("/WEB-INF"));
		} catch (URISyntaxException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return null;
		}

	}

	public void setSavePath(String savePath) {
		this.savePath = savePath;
	}

	public void setUpdateClientSoftService(UpdateClientSoftService updateClientSoftService) {
		this.updateClientSoftService = updateClientSoftService;
	}

	public String getResultstr() {
		return resultstr;
	}

	public void setResultstr(String resultstr) {
		this.resultstr = resultstr;
	}

	public String UpdateClientSoftFile(){

		FileOutputStream out = null;
		InputStream in = null;
		byte[] buffer = new byte[4096];
		int len = 0;

		try {
			out = new FileOutputStream(getSavePath()+"/updatefile/"+updatefileFileName);
			in = new FileInputStream(updatefile);
			
			//������md5���������ѵ�ĩβ
			softVersion.setMD5(DigestUtils.md5Hex(in));
			
			//�൱��������������λ�ã���ͷ��ʼ��ȡ
			in = new FileInputStream(updatefile);
			
			while((len = in.read(buffer)) > 0){
				out.write(buffer, 0, len);
			}
		
			out.flush();
			
			out.close();
			in.close();
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			resultstr = "�ϴ�ʧ��";
			return ERROR;
		}
		
		
		
		updateClientSoftService.UpdateClientSoft(softVersion);
		
		resultstr = "�ϴ��ɹ�";
		return SUCCESS;
	}
	
	public InputStream getClientFile() throws Exception{
		File dir = new File(getSavePath()+"/updatefile");
		InputStream in = null;
		File[] filelist = dir.listFiles();
		
		for (File file : filelist) {
			String fileName = file.getName();
			
            if (fileName.startsWith("NCD_YGFXY_Client")) {
            	updatefileFileName = fileName;
            	in = new FileInputStream(file);
            	return in;
            }
		}
		return in;
	}
	
	public InputStream getClientLabFile() throws Exception{
		File dir = new File(getSavePath()+"/updatefile");
		InputStream in = null;
		File[] filelist = dir.listFiles();
		
		for (File file : filelist) {
			String fileName = file.getName();
			
            if (fileName.startsWith("NCD_TesterForLab")) {
            	updatefileFileName = fileName;
            	in = new FileInputStream(file);
            	return in;
            }
		}
		return in;
	}
	
	public String downloadClientFile() {

		return SUCCESS;
	}
}
