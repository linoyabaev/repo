package workspace.Saver;

import com.google.gson.Gson;
import workspace.object.Report;
import workspace.Reader.CsvToJson;

import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

public abstract class Upload {

     public abstract void WriteToJson(String filePath);



}
