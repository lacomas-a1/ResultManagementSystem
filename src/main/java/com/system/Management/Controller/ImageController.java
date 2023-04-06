package com.system.Management.Controller;

import java.io.File;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.ClassPathResource;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import com.system.Management.Model.Image;
import com.system.Management.Repository.ImageRepository;

import jakarta.servlet.http.HttpSession;

@Controller
public class ImageController {
	
	@Autowired
	private ImageRepository imageRepository;
	
	@PostMapping("/Upload")
	public String imageUpload (@RequestParam MultipartFile img, HttpSession session) {
		Image image = new Image();
		image.setImageName(img.getOriginalFilename());
		Image uploadingImg = imageRepository.save(image);
		
		if (uploadingImg !=null) {
			try {
				File saveFile = new ClassPathResource("static/img").getFile(); 
				Path path =Paths.get(saveFile.getAbsolutePath() + File.separator +img.getOriginalFilename());
				
				//System.out.println(path)
//				Files.copy(image.getInputStream, path, null)
				Files.copy(img.getInputStream(), path, StandardCopyOption.REPLACE_EXISTING);
				
			} catch (Exception e) {
				e.printStackTrace();
			}
			
		} 
		session.setAttribute("msg", "Image Uploading Successfull");
		
		return "redirect:/";
		
	}
	

}
