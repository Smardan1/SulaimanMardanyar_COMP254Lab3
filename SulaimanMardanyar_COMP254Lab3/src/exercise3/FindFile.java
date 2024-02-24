package exercise3;

import java.io.File;


public class FindFile {

	public static void find(File path, String fileName) {

		if(path.isDirectory()) {
			for(String childName : path.list()) {
				File child = new File(path, childName);
				if(childName.equals(fileName)){
					System.out.println("File found at\n" + path);
				}
				find(child, fileName);
			}
		}
	}

	public static void main(String[] args) {
		File root = new File("E:\\Classes\\Sem 4\\Data-Structures-Algorithms\\SulaimanMardanyar_COMP254Lab3\\SulaimanMardanyar_COMP254Lab3");
		String fileToFind = "abc.txt";

		find(root, fileToFind);

	}
}
