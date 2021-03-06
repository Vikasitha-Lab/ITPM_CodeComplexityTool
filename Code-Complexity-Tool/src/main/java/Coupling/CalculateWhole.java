/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Coupling;

import java.util.ArrayList;

public class CalculateWhole {
    
    ClassObj classes[];
    int Nmcmd = 0;
    int Nmcrmd = 0;
    int Nrmcrmd = 0;
    int Nrmcmd = 0;
    

    public CalculateWhole(ClassObj[] _cobj){
        this.classes = _cobj;
    }
    
   
    public void calculateComplexity(){
    
    for(int i = 0 ; i < classes.length; i ++){
        String className = classes[i].getName();
        for(int j = 0; j < classes.length; j++){
        
            if(className.equals(classes[j].getName())){
                continue;
            }
            boolean checkThis = checkHit(classes[j].getContent(), className);
            
            if(checkThis){
                
                ArrayList<String> fClassFunctions = new ArrayList();
                ArrayList<String> sClassContent = new ArrayList();
                ArrayList<String> sClassRecursiveList = new ArrayList();
                Method [] sClassFunctions;
                
                fClassFunctions = classes[i].getRegularFunctionsList();
                sClassContent = classes[j].getContent();
                sClassRecursiveList = classes[j].getRecursiveFunctionsList();
                sClassFunctions = classes[j].getAllMethods();
                
                for(int k =0; k < sClassFunctions.length; k++){
                    
                    if(sClassRecursiveList.contains(sClassFunctions[k].MethodName)){
                        int x = countCrossHits(fClassFunctions,sClassFunctions[k].getMethod());
                        
                    }else{
                        int x = countCrossHits(fClassFunctions,sClassFunctions[k].getMethod());
                        
                    }
                }
                
                ArrayList<String> sClassRegularList = new ArrayList();
                fClassFunctions.clear();
                fClassFunctions = classes[i].getRecursiveFunctionsList();
                sClassRegularList = classes[j].getRegularFunctionsList();
                
                
                for(int k = 0; k < sClassFunctions.length; k++){
                
                    if(sClassRecursiveList.contains(sClassFunctions[k].MethodName)){
                    
                    
                    
                    }
                }
                
                
                
            }
            
        }
    
    }    
        
        
    }
    
    
    public void CC(){
    
        int NoOfClasses = classes.length;
        
       
        for(int x = 0; x < NoOfClasses; x++){
        
            ArrayList<String> fClassMethodRegular = new ArrayList();
            ArrayList<String> fClassMethodRecursive = new ArrayList();
            
        
            fClassMethodRegular = classes[x].getRegularFunctionsList();
            fClassMethodRecursive = classes[x].getRecursiveFunctionsList();
           
        
            for(int y = 0; y <NoOfClasses; y++){
                if(x==y){continue;}
                
                ArrayList<String> sClassMethodRegular = new ArrayList();
                ArrayList<String> sClassMethodRecursive = new ArrayList();
                Method []sClassMethodBodies;

                sClassMethodRegular = classes[y].getRegularFunctionsList();
                sClassMethodRecursive = classes[y].getRecursiveFunctionsList();
                sClassMethodBodies = classes[y].getAllMethods();
                
                Nmcmd = checkFunctionHits(fClassMethodRegular,sClassMethodBodies,sClassMethodRecursive);
                Nmcrmd = checkFunctionHits(fClassMethodRegular,sClassMethodBodies,sClassMethodRegular);
                Nrmcrmd = checkFunctionHits(fClassMethodRecursive,sClassMethodBodies,sClassMethodRegular);
                Nrmcmd = checkFunctionHits(fClassMethodRecursive,sClassMethodBodies,sClassMethodRecursive);
                
            }
        }
        
    }
    
    public int checkFunctionHits(ArrayList<String>main, Method[] method, ArrayList<String> excludeList){
        int count = 0;
        for(int i=0; i<main.size(); i++){
            
            for(int j=0; j<method.length; j++){
                
                if(excludeList.contains(method[j].MethodName)){
                    continue;
                }
                int x = countHits(method[j].getMethod(), main.get(i));
                count = count+x;
            }
    
        }
        
        return count;
    }
    
    private boolean checkHit(ArrayList<String> arr, String find){
        for(int i = 0; i < arr.size(); i++){
            if(arr.get(i).contains(find)){
                return true;
            }
        }
        return false;
    }
    
    private int countHits(ArrayList<String> arr, String find){
        int count = 0;
        for(int i = 0; i < arr.size(); i++){
            if(arr.get(i).contains(find)){
                count++;
            }
        }
        return count;
    }
    
    private int countCrossHits(ArrayList<String> arr1, ArrayList<String> arr2){
    
        int count = 0;
        
        for(int i =0; i < arr1.size(); i++){
            int x = countHits(arr2,arr1.get(i));
            count = count + x;
        }
        return count;
    }
    
}
