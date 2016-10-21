package org.com.xsx.actions;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;

import org.apache.commons.codec.digest.DigestUtils;
import org.apache.struts2.ServletActionContext;
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
		FileInputStream in = null;

		try {
			out = new FileOutputStream(getSavePath()+"/updatefile/"+updatefileFileName);
			in = new FileInputStream(updatefile);
			softVersion.setMD5(DigestUtils.md5Hex(in));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			resultstr = "�ϴ�ʧ��";
			return ERROR;
		}
		
		byte[] buffer = new byte[4096];
		int len = 1;
		
		while(len > 0){
			try {
				len = in.read(buffer);
				if(len > 0){
					out.write(buffer, 0, len);
				}
				else
					break;
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				resultstr = "�ϴ�ʧ��";
				return ERROR;
			}
		}
		
		try {
			out.close();
			in.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			resultstr = "�ϴ�ʧ��";
			return ERROR;
		}
		
		
		
		
		updateClientSoftService.UpdateClientSoft(softVersion);
		
		resultstr = "�ϴ��ɹ�";
		return SUCCESS;
	}
}
