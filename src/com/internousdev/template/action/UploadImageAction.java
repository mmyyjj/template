package com.internousdev.template.action;

import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.apache.commons.io.FileUtils;
import org.apache.struts2.interceptor.ServletRequestAware;
import org.apache.struts2.interceptor.SessionAware;

import com.internousdev.template.dao.InsertImagePathDAO;
import com.opensymphony.xwork2.ActionSupport;

/**
 * 商品画像のアップロードに使用するアクション
 * @author YUKA MATSUMURA
 * @since 2017/10/30
 * @version 1.0
 * */
public class UploadImageAction extends ActionSupport implements SessionAware, ServletRequestAware{

	/**
	 * シリアルバージョンID
	 */
	private static final long serialVersionUID = -2802101219829458324L;

	/**
	 * アップロードする画像ファイル
	 * */
	private File uploadFile;

	/**
	 * アップロードする画像の画像名
	 * */
	private String uploadFileFileName;

	/**
	 * アップロードする画像の形式
	 * */
	private String uploadFileContentType;

    /**
     * 画像の転送先を指定するためのリクエスト
     */
    private HttpServletRequest request;

	/**
	 * セッション
	 * */
	private Map<String ,Object> session = new HashMap<String, Object>();


	public String execute(){
		String result = ERROR;

		try{
			/*送られてきたリクエストから、画像の送り先ディレクトリを取得する*/
			String basePath = request.getServletContext().getRealPath("/");

			File destFile = new File(basePath + "img", uploadFileFileName);//このパスの場所に、この名前で画像を保存したい。
			FileUtils.copyFile(uploadFile, destFile);

		} catch (IOException e1) {
			e1.printStackTrace();
		} catch (NullPointerException e2){
			e2.printStackTrace();
		}

		uploadFileFileName = "img/" + uploadFileFileName;

		InsertImagePathDAO iipdao = new InsertImagePathDAO();

		int successed_num = iipdao.InsertImagePath(uploadFileFileName);

		if(successed_num > 0){
			result = SUCCESS;


		}

		return result;



	}


	/**
	 * @return uploadFile
	 */
	public File getUploadFile() {
		return uploadFile;
	}


	/**
	 * @param uploadFile セットする uploadFile
	 */
	public void setUploadFile(File uploadFile) {
		this.uploadFile = uploadFile;
	}


	/**
	 * @return uploadFileFileName
	 */
	public String getUploadFileFileName() {
		return uploadFileFileName;
	}


	/**
	 * @param uploadFileFileName セットする uploadFileFileName
	 */
	public void setUploadFileFileName(String uploadFileFileName) {
		this.uploadFileFileName = uploadFileFileName;
	}


	/**
	 * @return uploadFileContentType
	 */
	public String getUploadFileContentType() {
		return uploadFileContentType;
	}


	/**
	 * @param uploadFileContentType セットする uploadFileContentType
	 */
	public void setUploadFileContentType(String uploadFileContentType) {
		this.uploadFileContentType = uploadFileContentType;
	}

    /**リクエストを取得するメソッド
     * @return request リクエスト
     */
    public HttpServletRequest getRequest() {
        return request;
    }

	@Override
	public void setServletRequest(HttpServletRequest request) {
		this.request = request;

	}


	/**
	 * @return session
	 */
	public Map<String, Object> getSession() {
		return session;
	}


	/**
	 * @param session セットする session
	 */
	public void setSession(Map<String, Object> session) {
		this.session = session;
	}




}
