select id, name, age
from t1
where id not in (select id from t2 )
and name not in (select name from t2)
and age not in (select age from t2)
order by id;
