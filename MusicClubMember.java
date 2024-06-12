public interface MusicClubMember {
    default String printMClubName(){
        return "The music club is called Louisiana";
    }
    public int memberRankM();
    public String[] instrumentTypes();
}

