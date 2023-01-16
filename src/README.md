student - teacher (many-to-many)

student: 1. stu_id(pk), 2. stu_name, 3. stu_grade
teacher: 1. tea_id(pk), 2. tea_name, 3. course
stu_teacher: 1. id(pk), 2. stu_id(fk) 3. tea_id(fk)


rest-api design:

MVC-pattern:
Model: Student(id, name, grade), Teacher(id, name, course)

Controller: 

student:
prefix: /student

/all: getRequest, return all students in db
/get/{id}: getRequest, return student with id = id
/save    : postRequest, create new student in db
/delete/{id}: deleteRequest, delete student with id=id in db
/update:        putRequest, update specific student in db


prefix: /teacher
/all: getRequest, return all teachers in db
/get/{id}: getRequest, return teacher with id = id
/save:     postRequest, create new teacher in db
/delete/{id}: deleteRequest, delete teacher with id=id in db
/update:        putRequest, update specific teacher in db



