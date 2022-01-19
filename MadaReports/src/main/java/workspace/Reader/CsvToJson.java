package workspace.Reader;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.google.gson.GsonBuilder;
import org.apache.commons.lang3.StringUtils;
import workspace.Saver.Upload;
import workspace.object.Report;
import com.google.gson.Gson;

public class CsvToJson extends Upload {
    public static void main(String[] args) {
       readCsvUsingScanner("C:\\Users\\linoy\\IdeaProjects\\MadaReports\\src\\main\\resources");

       readCsvUsingBufferReader("C:\\Users\\linoy\\IdeaProjects\\MadaReports\\src\\main\\resources");
    }

    public static void readCsvUsingScanner(String filePath) {
        try {
            Scanner scanner=new Scanner(new File(filePath));
            List<Report>reportList=new ArrayList<Report>();
            while (scanner.hasNext()){
                String[] userData=scanner.next().toString().split(",");
                reportList.add(new Report(userData[0],Integer.getInteger(userData[1]),Integer.getInteger(userData[2]),userData[3],userData[4],userData[5],userData[6],Integer.getInteger(userData[7]),userData[8],userData[9],userData[10],userData[11]));
            }
            scanner.close();
            System.out.println("User json scanner: "+ new GsonBuilder().setPrettyPrinting().create().toJson(reportList));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }


    }

    public static Report readCsvUsingBufferReader(String filePath){
        String line="";
        String deleimeter= ",";
        List<Report>reportList=new ArrayList<Report>();
        try {
            BufferedReader reader = new BufferedReader(new FileReader(filePath));
            line = reader.readLine();
            while(!StringUtils.isEmpty(line)){
              //  System.out.println("User data:"+line);

                String[] userData=line.split(deleimeter);
                reportList.add(new Report(userData[0],Integer.valueOf(userData[1]),Integer.valueOf(userData[2]),userData[3],userData[4],userData[5],userData[6],Integer.valueOf(userData[7]),userData[8],userData[9],userData[10],userData[11]));
            }
            System.out.println("User json : "+ new GsonBuilder().setPrettyPrinting().create().toJson(reportList));
        }
        catch (FileNotFoundException e){
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return (Report) reportList;

    }
    @Override
    public void WriteToJson(String filePath)
    {
        try (FileWriter file= new FileWriter("reports.json")){
            file.write(readCsvUsingBufferReader(filePath).toString());
            file.flush();
        } catch (IOException e){
            e.printStackTrace();
        }
    }



}
