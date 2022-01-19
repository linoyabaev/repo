package workspace.object;

public class Report {
    public String MadaCode;
    public int  IdNum;
    public int IdType;
    public String FirstName;
    public String LastName;
    public String City;
    public String Street;
    public int BuildingNumber;
    public String BarCode;
    public String Gdate;
    public String Tdate;
    public String Rdate;

    public Report(String MadaCode, int  IdNum, int IdType,String FirstName,String LastName, String City,String Street, int BuildingNumber, String BarCode, String Gdate,String Tdate,String Rdate){
        this.MadaCode=MadaCode;
        this.IdNum=IdNum;
        this.IdType=IdType;
        this.FirstName=FirstName;
        this.LastName=LastName;
        this.City=City;
        this.Street=Street;
        this.BuildingNumber=BuildingNumber;
        this.BarCode=BarCode;
        this.Gdate=Gdate;
        this.Tdate=Tdate;
        this.Rdate=Rdate;
    }

    @Override
    public String toString() {
        return "Report{" +
                "MadaCode='" + MadaCode + '\'' +
                ", IdNum=" + IdNum +
                ", IdType=" + IdType +
                ", FirstName='" + FirstName + '\'' +
                ", LastName='" + LastName + '\'' +
                ", City='" + City + '\'' +
                ", Street='" + Street + '\'' +
                ", BuildingNumber=" + BuildingNumber +
                ", BarCode='" + BarCode + '\'' +
                ", Gdate='" + Gdate + '\'' +
                ", Tdate='" + Tdate + '\'' +
                ", Rdate='" + Rdate + '\'' +
                '}';
    }
}
