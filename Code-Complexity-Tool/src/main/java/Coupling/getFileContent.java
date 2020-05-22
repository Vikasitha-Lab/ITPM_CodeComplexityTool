/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Coupling;

import java.io.File;  
import java.io.FileNotFoundException;  
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner; 


public class getFileContent {
    
    public List<File> getFileList(String directoryName) {
        File directory = new File(directoryName);
        
        List<File> resultList = new ArrayList<File>();

        
        File[] fList = directory.listFiles();
        resultList.addAll(Arrays.asList(fList));
        for (File file : fList) {
            if (file.isFile()&&file.getName().contains(".java")) {
                
            } else if (file.isDirectory()) {
                resultList.addAll(getFileList(file.getAbsolutePath()));
            }
        }

        List<File> rList = new ArrayList<File>();
        File f ;
        String Line;
        for(int i =0; i < resultList.size(); i++){
            f = resultList.get(i);
            Line = f.getAbsolutePath();
            if(Line.contains(".java"))
                rList.add(f);
        }
        
        return rList;
    } 
    
    public ArrayList<String> readFileToArrayList(String fpath){
        
        ArrayList content = new ArrayList<String>();
        content.clear();
        boolean multiLineComment=false;
        try {
            File myObj = new File(fpath);
            Scanner myReader = new Scanner(myObj);
            
            while (myReader.hasNextLine()) {
              String data = myReader.nextLine();
              
              if(data.startsWith("/*")){
                  multiLineComment = true;
                  if(data.contains("*/")){
                      multiLineComment = false;
                      continue;
                  }
              }
              if(data.endsWith("*/")){
                  multiLineComment = false;
              }
              
              if(multiLineComment){
                  continue;
              }
              
              if(!data.startsWith("/")){
                content.add(data.trim());
              }
               
            }
   
            myReader.close();
          }catch (FileNotFoundException e) {
            System.out.println("File "+fpath+" could not be found");
            e.printStackTrace();
          }
        
        return content;
    }
    
    public String getClassNameFromFilePath(String path){
        return path.substring((path.lastIndexOf("\\")+1),path.lastIndexOf("."));
    }
    
}
