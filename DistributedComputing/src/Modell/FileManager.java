package Modell;

import java.io.File;
import java.io.IOException;
import java.net.URI;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class FileManager {
	private String md5Hash = new String("");
	private char fileMode;
	
	public boolean checkDataAvailable(String txtDictionaryPath, String txtMD5hash) {
		Path path_full = Paths.get(txtDictionaryPath);
		
		if(Files.exists(path_full) && txtMD5hash.matches("^[a-fA-F0-9]{32}$")){
			return true;
		}
		else {
			return false;
		}
	}
	public void fileOpen(char mode) {
	/*	try {
			
		} catch (FileSystemException ex) {
			
		} catch (IOException ioex) {
			
		} finally {
			if(file != null)
				file.close();
		}
		
		this.fileMode = mode;*/
	}
	public void setMD5Hash(String md5Hash) {
		this.md5Hash = md5Hash;
	}
	public String getMD5Hash() {
		return this.md5Hash;
	}
}
