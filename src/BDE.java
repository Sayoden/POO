public class BDE {

    private String nom;
    private String[] members;

    public BDE(String nom){
        this.nom = nom;
        this.members = getMembers();
    }



    public String[] getMembers(){
        String[] members = new String[8];

        members[0] = "Walid Rahioui";
        members[1] = "Lucas Goulois";
        members[2] = "Gabriel Bailleul";
        members[3] = "Louis Iwinski";
        members[4] = "Tristan Fumiere";
        members[5] = "Gabriel Gressier";
        members[6] = "Cameron Delsol";
        members[7] = "Alexis Grislin";

        return members;
    }

}
