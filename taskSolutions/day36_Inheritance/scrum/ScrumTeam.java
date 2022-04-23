package day36_Inheritance.scrum;

import java.util.ArrayList;
import java.util.Arrays;

public class ScrumTeam {
    private String PO, BA, SM;
    private ArrayList<Tester> testers;
    private  ArrayList<Developer> developers;

    public ScrumTeam(String PO, String BA, String SM) {
        setPO(PO);
        setBA(BA);
        setSM(SM);
        testers = new ArrayList<>();
        developers = new ArrayList<>();
    }

    public String getPO() {
        return PO;
    }

    public void setPO(String PO) {
        this.PO = PO;
    }

    public String getBA() {
        return BA;
    }

    public void setBA(String BA) {
        this.BA = BA;
    }

    public String getSM() {
        return SM;
    }

    public void setSM(String SM) {
        this.SM = SM;
    }

    public ArrayList<Tester> getTesters() {
        return testers;
    }

    public ArrayList<Developer> getDevelopers() {
        return developers;
    }

    public void addTester(Tester tester){
        testers.add(tester);
    }

    public void addTesters(Tester[] testers){
        this.testers.addAll(Arrays.asList(testers));
    }

    public void removeTester(int id){
        testers.removeIf( p -> p.getId() == id);
    }

    public void addDeveloper(Developer developer){
        developers.add(developer);
    }

    public void addDevelopers(Developer[] Developers){
        this.developers.addAll(Arrays.asList(Developers));
    }

    public void removeDeveloper(int id){
        developers.removeIf(p -> p.getId() == id);
    }

    public String toString() {
        return "ScrumTeam{" +
                "PO='" + PO + '\'' +
                ", BA='" + BA + '\'' +
                ", SM='" + SM + '\'' +
                ", number of testers=" + testers.size() +
                ", number of developers=" + developers.size() +
                '}';
    }
}