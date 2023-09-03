-- Группируем по опыту и нумируем людей внурти каждой группы и сортируем в порядке убывания опыта
WITH buff_table as (
  	SELECT
      	id,
		surname,
  		experience,
    	row_number () over (partition by experience ORDER by id ) as pos_partition
    FROM student
  	ORDER by experience DESC
  )

-- Выбираем топ1 из каждой группы и нумеруем новый список, после чего выводим топ 2
SELECT
	surname
FROM (
  	SELECT
  		surname,
  		row_number () over () as pos
  	FROM buff_table
  	WHERE pos_partition = 1
  )
WHERE pos = 2;