ALTER TABLE student
    DROP FOREIGN KEY fk_student_roomNo;

ALTER TABLE vaccination
    DROP FOREIGN KEY fk_vaccination_studentId;

ALTER TABLE rtpcr
    DROP FOREIGN KEY fk_rtpcr_studentId;

ALTER TABLE posCase
    DROP FOREIGN KEY fk_case_studenId;

ALTER TABLE posCase
    DROP FOREIGN KEY fk_case_qroomNo;

ALTER TABLE posCase
    DROP FOREIGN KEY fk_case_testId; 

DROP TABLE student;
DROP TABLE vaccination;
DROP TABLE rtpcr;
DROP TABLE hostelRoom;
DROP TABLE quarantine;
DROP TABLE posCase;
DROP TABLE dose;

    