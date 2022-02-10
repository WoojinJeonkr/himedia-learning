package poject06;

import java.io.File;
import java.io.IOException;
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

@WebServlet("/upload")
public class Fileupload extends HttpServlet {
	
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
						}
						String fileName = fileitem.getName().substring(idx+1);
						System.out.println("filename:"+fileName);
						File uploadFile = new File(currentDirPath+"\\"+fileName);
						fileitem.write(uploadFile); // 디렉토리에 저장
					}
				}
			}
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
