/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Coupling;

import java.util.ArrayList;


public class Extraction {

    public ArrayList<Integer> calcDepth(ArrayList<String> arr){
        
        ArrayList<Integer> depthInfo = new ArrayList();
        String line = null;
        int depth = 0;
        
        for(int i = 0; i < arr.size(); i++){
            line=arr.get(i);
            
            if(line.contains("{"))
                depth++;
            if(line.contains("}"))
                depth--;
            
            depthInfo.add(depth);
        }
        
        return depthInfo;
    }
    
    public ArrayList<String> extractFunctionNames(ArrayList<String> contentArr, ArrayList<Integer> depthArr, String cname){
        String line = "";
        int depth = 0;
        ArrayList<String> functions = new ArrayList();
        String className = cname;
        
        System.out.println("--Extracting Functions");
        for(int i = 0; i < contentArr.size(); i++){
            line = contentArr.get(i).toLowerCase();
            depth = depthArr.get(i);
            String[] tkns = line.split(" ", line.length());
            
            if((tkns[0].equals("public")||tkns[0].equals("private")||
                    tkns[0].equals("protected"))&& depth>1){
                System.out.println("--- FunctionLine : "+line);
                
                if(line.contains(" static ")){
                    System.out.println("--- Static signature : "+line+" --> "+tkns[3].substring(0, tkns[3].indexOf("("))+"\n");
                    if(tkns[3].contains("(")){
                        functions.add(tkns[3].substring(0, tkns[3].indexOf("(")).trim());
                        System.out.println("--- Static signature : "+line+" --> "+tkns[3].substring(0, tkns[3].indexOf("("))+"\n");
                    }else{
                        functions.add(tkns[3].substring(0, tkns[3].length()).trim());
                        System.out.println("--- Static signature : "+line+" --> "+tkns[3].substring(0, tkns[3].length())+"\n");

                    }
                    continue;
                }

                if(line.contains(" "+className+"(" ) || line.contains(" "+className+" (")){
                            System.out.println("--- <--> Constructor <-->");
                            if(tkns[1].contains("(")){
                                functions.add(tkns[1].substring(0,tkns[1].indexOf("(")).trim());
                                System.out.println("--- <--> " +tkns[1].substring(0,tkns[1].indexOf("(")));
                            }else{
                                functions.add(tkns[1].substring(0,tkns[1].length()).trim());
                                System.out.println("--- <--> " +tkns[1].substring(0,tkns[1].length()));
                            }

                }else{
                        
                        if(tkns[2].contains("(")){
                            functions.add(tkns[2].substring(0,tkns[2].indexOf("(")).trim());
                            System.out.println("--- Normal signature : "+tkns[2].substring(0,tkns[2].indexOf("("))+"\n");
                        }else{
                            functions.add(tkns[2].substring(0,tkns[2].length()));
                            System.out.println("--- Normal signature : "+tkns[2].substring(0,tkns[2].length())+"\n");
                        }
                }
            }
        }

        return functions;
    }
    
    public ArrayList<String> extractFunctionBody(ArrayList<String> wholeFileArr, ArrayList<Integer> depthArr, String functionName){
        ArrayList<String> body = new ArrayList();
        String line = "";
        int depth = 0;
        boolean matched = false;
        
        for(int i= 0 ; i < wholeFileArr.size(); i++){
            line = wholeFileArr.get(i).toLowerCase();
            depth = depthArr.get(i);
            
            if(line.contains(functionName.trim()) && depth==2){
               
                matched=true;
            }
            
            if(line.contains("}") && depth == 1){
                
                matched=false;
               
            }
            
            if(matched){
                
                body.add(line);
            }
        }
        
        body.add("}");
        return body;
    }
    
    public ArrayList<String> extractRecursiveFunctionNames(Method[] _methods){
           
            ArrayList<String> Names = new ArrayList();
            int count = 0;
           
            for(int i = 0; i < _methods.length; i++){
            
                String name = _methods[i].MethodName;
               
                ArrayList<String> mContent = new ArrayList();
                
                mContent = _methods[i].getMethod();
                
                
                for(int j = 0; j < mContent.size(); j++){
                   
                    if(mContent.get(j).contains(name)){
                        count++;
                    }
                }
                if(count>1){
                    Names.add(name);
                }
                count=0;
            }
            
            return Names;
    }
    
    public ArrayList<String> extractRegularFunctionNames(ArrayList<String> functionList, ArrayList<String> recursiveList){
        ArrayList<String> regularFunctions = new ArrayList();
        
        for(int i =0; i < functionList.size(); i++){
            String fName = functionList.get(i);
            
            if(!recursiveList.contains(fName)){
                regularFunctions.add(fName);
            }
        
        }
        
        return regularFunctions;
    }
    
    public ArrayList<String> extractGlobalVariables(ArrayList<String> ClassContent, ArrayList<Integer> _depth){
    
        ArrayList<String> vars = new ArrayList();
        
        for(int i = 0 ; i < ClassContent.size(); i++){
        
            String line = ClassContent.get(i);
            int depth = _depth.get(i);
            
            if(depth!=1){
                continue;
            }
            
            if(line.contains("int")||line.contains("float")||
               line.contains("char")||line.contains("long")||
               line.contains("double")||line.contains("boolean")||line.contains("String")){
                String firstHalf = line.substring(0,line.indexOf("="));
                String []tkns = firstHalf.split(" ");
                int size = tkns.length;
                
                vars.add(tkns[size-1]);
            }
        }
        return vars;
    }
    
    public ArrayList<String> initMethodContent(ArrayList<String> content, ArrayList<Integer> depthArrOri){
        ArrayList<String>methods = new ArrayList();
        ArrayList<Integer>depthArr = depthArrOri;
        
        String line = "";
        int depth=0;
        
       
        for(int i = 0; i < depthArr.size(); i++){
            depth = depthArr.get(i);
            if (depth>2){
                depthArr.set(i, 2);
            }
        }
        
        return methods;
    }
}
