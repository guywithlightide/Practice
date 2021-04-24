package main;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.MalformedURLException;
import java.net.URL;
import java.nio.file.FileSystem;
import java.nio.file.FileSystems;
import java.nio.file.Files;
import java.nio.file.OpenOption;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.Collection;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.glassfish.jersey.media.multipart.FormDataContentDisposition;
import org.glassfish.jersey.media.multipart.FormDataContentDisposition.FormDataContentDispositionBuilder;
import org.glassfish.jersey.media.multipart.FormDataParam;

@Path("practice")
public class MainClass {

	@GET
	@Path("hello")
	@Produces(MediaType.TEXT_PLAIN)
	public String helloWorld() {
		System.out.println("Hello world");
		return "Hello world";
	}
	
	final String uploadFileLocation = "C:\\Users\\Soham\\SpringWorkspace\\jaxrspractice\\src\\main\\resources\\UploadedFiles\\";
	@POST
	@Path("upload")
	@Consumes(MediaType.MULTIPART_FORM_DATA)
	public void uploadFile(@FormDataParam(value = "file") InputStream inputStream, 
			@FormDataParam("file") FormDataContentDisposition disposition) {
				
		String fileNameWithPath = uploadFileLocation+disposition.getFileName();
		System.out.println("Full file path = "+fileNameWithPath);
		
		System.out.println("disposition.getType() = "+disposition.getType()+" disposition.getParameters() = "+disposition.getParameters()+" disposition.getSize() = "+disposition.getSize()+" disposition.getType()"+disposition.getType());
		usingFileswrite(inputStream, disposition);
		
//		readUsingInputStream(inputStream, fileNameWithPath);
		

		
	}
	/**
	 * @param inputStream
	 * @param disposition
	 */
	private void usingFileswrite(InputStream inputStream, FormDataContentDisposition disposition) {
		try {
			Files.write(Paths.get(uploadFileLocation, disposition.getFileName()),inputStream.readAllBytes(),StandardOpenOption.CREATE );
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	/**
	 * @param inputStream
	 * @param fileNameWithPath
	 */
	private void readUsingInputStream(InputStream inputStream, String fileNameWithPath) {
		try {
			FileOutputStream fileOutputStream = new FileOutputStream(new File(fileNameWithPath));
			int read = 0;
			byte bytes[] = new byte[1024];
			
			while ((read=inputStream.read(bytes))!=-1) {
				fileOutputStream.write(bytes);
			}
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	

}
