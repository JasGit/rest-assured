package com.mg.apitest.apihelpers;

import com.mg.apitest.common.ReadPropertyFile;
import com.jayway.jsonpath.JsonPath;
import java.io.File;
import java.io.IOException;
import java.util.*;

/**
 * Created by jaspreetwalia on 11/10/2016.
 */
public class CeBaseTestScript {

    protected HashMap<String,String> headerMap = new HashMap<String,String>();
    ReadPropertyFile readPropertyFile = new ReadPropertyFile();
    protected String ceAPIEndPoint = null;


    /**
     * Base Test script Constructor
     */
    public CeBaseTestScript() {
        ceAPIEndPoint = readPropertyFile.getProperty("baseURL")+readPropertyFile.getProperty("ceURL");

    }

    protected  void setHeader() {
        headerMap.put("Content-Type", "application/json");
    }


    protected   String loadJsonFile(String fileName) throws IOException{
        //load json file
        String ceTestDataFolder = readPropertyFile.getProperty("costEstimateJsonDataLocation");
        fileName = ceTestDataFolder + fileName;
        fileName.replace("/", File.separator);
        File file = new File(fileName);
        return JsonPath.parse(file).jsonString();
        }
    }




