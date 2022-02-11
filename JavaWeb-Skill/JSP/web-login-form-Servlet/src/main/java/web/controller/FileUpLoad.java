package web.controller;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.fileupload.FileItem;
import org.apache.commons.fileupload.FileUploadException;
import org.apache.commons.fileupload.disk.DiskFileItemFactory;
import org.apache.commons.fileupload.servlet.ServletFileUpload;
import org.json.simple.JSONObject;

@WebServlet("/fileupload")
public class FileUpLoad extends HttpServlet {
	
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doHandler(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doHandler(request, response);
	}
	
	public void doHandler(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		File currentDirPath = new File ("c:\\file_repo");
		
		DiskFileItemFactory factory = new DiskFileItemFactory();
		factory.setRepository(currentDirPath); // 파일이 저장되는 디렉토리 관문
		factory.setSizeThreshold(1024*1024); // 파일 용량 제한
		
		response.setContentType("application/json;charset=utf-8");
		PrintWriter out = response.getWriter();
		
		ServletFileUpload upload = new ServletFileUpload(factory);
		
		try {
			List items = upload.parseRequest(request);
			
			// 첨부파일 뿐만 아니라 폼 데이터(text)도 전송된다.
			for(int i=0;i<items.size();i++) {
				FileItem fileitem = (FileItem) items.get(i);
				
				if(fileitem.isFormField()) { // 일반 파라미터인지 구분. 일반 파라미터라면 true 
					// 일반 text 파라미터
					System.out.println(fileitem.getFieldName()+"="+fileitem.getString("utf-8"));
				} else {
					// 첨부파일 파라미터
					System.out.println("파라미터명:"+fileitem.getFieldName());
					System.out.println("파일명:"+fileitem.getName());
					System.out.println("파일크기:"+fileitem.getSize()+"bytes");
					System.out.println("첨부파일타입:"+fileitem.getContentType());
					
					//--- IE 대비해서 처리용
					System.out.println(fileitem.getName().lastIndexOf("\\"));
					System.out.println(fileitem.getName()+"");
					if(fileitem.getSize()>0) {
					int idx = fileitem.getName().lastIndexOf("\\");
					if(idx == -1) {
						idx = fileitem.getName().lastIndexOf("\\");
						fileitem.getName().indexOf("\\");
					}
					String fileName = fileitem.getName().substring(idx+1);
					System.out.println("filename:"+fileName);
					File uploadFile = new File(currentDirPath+"\\"+fileName);
					
					//--- 추가 문장
					if(uploadFile.exists()){ // 파일 저장 위치에 해당 이름의 첨부파일이 있다면
						int fileName_idx = fileName.lastIndexOf(".");
						
						SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMddhhmmss");
						Calendar c = Calendar.getInstance();
						String StrToday = sdf.format(c.getTime());
						//--- 등록되지 않은 파일명 생성
						String new_fileName  = fileName.substring(0, fileName_idx)+"_"+StrToday+
								fileName.substring(fileName_idx); // 확장자
						
						File uploadFile_new  = new File(currentDirPath+"\\"+new_fileName);
						fileitem.write(uploadFile_new); // 디렉토리에 저장
						fileName = new_fileName;
					} else {
						fileitem.write(uploadFile); // 디렉토리에 저장
					}
						
					JSONObject fileInfo = new JSONObject();
					fileInfo.put("filename", fileName);
					fileInfo.put("filesize", fileitem.getSize());
					
					String jsonInfo = fileInfo.toJSONString();
					out.print(jsonInfo);
					}
				}
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
