use quanlysinhvien ;

-- Tính điểm trung bình của mỗi học viên bằng cách sử dụng hàm AVG
select S.StudentID, S.StudentName , avg(Mark) 
from Student S join Mark M on S.StudentId = M.StudentId
group by S.StudentId , S.StudentName ;

-- Hiển thị những bạn học viên có điểm trung bình các môn học lớn hơn 15
-- Đầu tiên hiển thị điểm  các môn học mỗi học viên 
select S.StudentId , S.StudentName , avg(Mark)
from Student S join Mark M on S.StudentId = M.StudentId 
group by S.StudentId , S.StudentName ;

-- Sử dụng having để xét điều kiện điểm trung bình các môn học phải lớn hơn 15
select S.StudentId, S.StudentName , avg(Mark)
from Student S join Mark M on S.StudentId = M.StudentId
group by S.StudentId , S.StudentName
having avg(Mark) > 15 ; 

-- Hiển thị thông tin các học viên có điểm trung bình lớn nhất.
-- Hiển thị danh sách điểm trung bình của các học viên

select S.StudentId , S.StudentName , avg(Mark)
from Student S join Mark M on S.StudentId = M.StudentId
group by S.StudentId,S.StudentName ;

-- Sử dụng Having và All để tìm học viên có điểm trung bình lớn nhất
select S.StudentId , S.StudentName , avg(Mark)
from Student S join Mark M on S.StudentId = M.StudentId
group by S.StudentId , S.StudentName
having avg(Mark) >= all ( select avg(Mark) from Mark group by Mark.StudentID) ;

-- Sử dụng hàm count để hiển thị số lượng sinh viên ở từng nơi
select Address, count(StudentId) as 'Số lượng học viên'
from Student 
group by Address ;