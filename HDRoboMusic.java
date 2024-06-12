public class HDRoboMusic extends HDStudent implements RoboticsClubMember, MusicClubMember{
    private int musicClubRank;
    private int roboClubRank;
    private String[] robotTypes;
    private String[] instrumentTypes;
    public HDRoboMusic(String n, String i, Major m, String sfp, String std, int mr, int rr, String[] l,String ... t){
        super(n,i,m,sfp,std);
        this.musicClubRank = mr;
        this.roboClubRank = rr;
        this.instrumentTypes = l;
        this.robotTypes = t;
    }
    public int memberRankM(){
        return this.musicClubRank;
    }
    public int memberRankR(){
        return this.roboClubRank;
    }
    public String[] instrumentTypes(){
        return this.instrumentTypes;
    }
    public String[] robotTypes(){
        return this.robotTypes;
    }
    public void printDetails(){
        String stipendDetails = "";
        if(super.stipend==0)
            stipendDetails = "recieves no scholarship";
        else
            stipendDetails = "recives a scholarship of "+super.stipend+" per month.";
        System.out.println(super.name + " is a HD student with major in "+ this.major + "\n"
                           +"The id of the student is "+super.ID+" and email is "+super.email+"\n"
                           +"The student got "+this.schoolFinalPercentage+"/% marks in 12th and "
                           +stipendDetails+".\nAlso the student is a member of the "+printMClubName()
                           +" with known "+Global.printList("instrument type", this.instrumentTypes)
                           +" having a rank of "+this.memberRankM()+ "\nAlso the student is a member of the "+printRClubName()
                           +" with known "+Global.printList("robot types", this.robotTypes)
                           +" having a rank of "+this.memberRankR());
    }
}
