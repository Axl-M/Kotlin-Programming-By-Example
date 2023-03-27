fun main() {
    data class Student(val name: String, val age: Int, val school: String)

    val prospectiveStudents: ArrayList<Student> = ArrayList()
    val admittedStudents: ArrayList<Student> = ArrayList()

    prospectiveStudents.add(Student("Daniel Martinez", 12, "Hogvards"))
    prospectiveStudents.add(Student("Jorjeta", 22, "HogWart"))
    prospectiveStudents.add(Student("Matveika", 18, "Maryland"))
    prospectiveStudents.add(Student("Jid", 22, "Ibadan"))
    prospectiveStudents.add(Student("Tom Cruz", 88, "Harward"))

    for (student in prospectiveStudents) {
        if (student.age < 16) {
            continue
        }
        admittedStudents.add(student)
        if (admittedStudents.size >= 3) {
            break
        }
    }
    println(admittedStudents)
}