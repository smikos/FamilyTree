package family_tree;

import family_tree.family.FamilyTree;
import family_tree.human.Gender;
import family_tree.human.Human;


import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        FamilyTree tree = testTree();
        System.out.println(testTree());
    }

    static FamilyTree testTree(){

        FamilyTree familyTree = new FamilyTree();

        Human human1 = new Human(Gender.Male,"Alexander","Smirnov");
        Human human2 = new Human(Gender.Female,"Olga","Smirnova");
        familyTree.addFamilyMember(human1);
        familyTree.addFamilyMember(human2);
        familyTree.setWedding(human1, human2);

        Human human3 = new Human(Gender.Male, "Konstantin", "Smirnov");
        Human human4 = new Human(Gender.Female, "Anna", "Smirnova");
        familyTree.addFamilyMember(human3);
        familyTree.addFamilyMember(human4);
        familyTree.setWedding(human3, human4);

        Human human5 = new Human(Gender.Male,"Yuri","Smirnov");
        Human human6 = new Human(Gender.Female,"Maria","Smirnova");

        human3.setFather(human1);
        human3.setMother(human2);
        human1.setFather(human5);
        human1.setMother(human6);

        familyTree.addFamilyMember(human5);
        familyTree.addFamilyMember(human6);
        familyTree.setWedding(human5, human6);

        human1.setBirthDate(LocalDate.of(1967,12,8));
        human2.setBirthDate(LocalDate.of(1970,6,22));
        human3.setBirthDate(LocalDate.of(1995,1,16));
        human4.setBirthDate(LocalDate.of(1997,10,21));
        human5.setBirthDate(LocalDate.of(1939,5,5));
        human6.setBirthDate(LocalDate.of(1943,6,6));
        human1.addChild(human3);
        human2.addChild(human3);
      human5.addChild(human1);
      human6.addChild(human1);

        return familyTree;
    }
}