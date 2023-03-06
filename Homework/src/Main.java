public class Main {
    public static void main(String[] args) {

        //student1 details
        Student student1 = new Student();       //obj
        Name name = new Name("Muhammad","Fakhrul","Hafiz");
        student1.setIc("030112140743");
        student1.setSchool("SMKA Maahad Hamidiah");
        student1.setAddress("Sungai Ramal, Kajang");
        student1.setYear(17);
        System.out.println(name.toString());
        System.out.println(student1.toString());

        //student2 details
        Student student2 = new Student();       //obj
        name = new Name("Muhammad","Ammar","Razali");
        student2.setIc("030912145743");
        student2.setSchool("SMK Bandar Baru");
        student2.setAddress("Ampang, Selangor");
        student2.setYear(17);
        System.out.println(name.toString());
        System.out.println(student2);


        //tutor1
        Teacher tutor1 = new Teacher();
        name = new Name("Mohammad", "Aiman","Mustaffa");
        tutor1.setName(name);
        tutor1.setQualification("Degree");
        tutor1.setDateJoined("12 January 2023");

        //tutor2
        Teacher tutor2 = new Teacher();
        name = new Name("Muhammad", "Rizzuan","Syah");
        tutor2.setName(name);
        tutor2.setQualification("Degree");
        tutor2.setDateJoined("31 August 2022");

        //batch for the tutor and its max students that he/she can teach
        StudentBatch batch1 = new StudentBatch(tutor1,3);
        batch1.goBatch(student1, batch1);
        StudentBatch batch2 = new StudentBatch(tutor2,4);
        batch2.goBatch(student2, batch2);

        //headmaster for centre1 and centre2
        Centre centre1 = new Centre();
        centre1.setHeadmasterName(new Name("Muhammad", "Hafizuddin", "Akhtar"));
        Centre centre2 = new Centre();
        centre2.setHeadmasterName(new Name("Wan", "Muhammad", "Firdaus"));

        //tutor for centre1 and centre2
        centre1.addTuto(new Name("Mohammad", "Aiman", "Mustaffa"));
        centre2.addTuto(new Name("Muhammad", "Rizzuan","Syah"));

        //address for centre1 and centre2
        centre1.setAddress(new Address("No. 12", "Jalan Merdeka", "Ampang", "Selangor","68000"));
        centre2.setAddress(new Address("No. 6", "Jalan Permai 1", "Cheras", "Selangor","52000"));

        //Student1 scores
        student1.setScores(0,65);
        student1.setScores(1,75);
        student1.setScores(2,50);
        student1.setScores(3,40);
        student1.setScores(4,80);

        //student2 scores
        student2.setScores(0,90);
        student2.setScores(1,65);
        student2.setScores(2,40);
        student2.setScores(3,75);
        student2.setScores(4,35);

        System.out.println("\nStudent1 performance: ");
        System.out.println(student1.toString2());
        System.out.println("\nStudent 2 performance: ");
        System.out.println(student2.toString2());

    }
}