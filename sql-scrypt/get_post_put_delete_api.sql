create database if not exists `get_post_put_delete_api`;

use `get_post_put_delete_api`;

drop table if exists `user`;

create table `user` (
`user_id` int(11) not null auto_increment,
`first_name` varchar(45),
`last_name` varchar(45),
`e_mail` varchar(45) unique,
primary key (user_id)
) ENGINE=InnoDB AUTO_INCREMENT=1 DEFAULT CHARSET=latin1;

insert into user values(1, 'Mark', 'Twen', 'mark@example.com'),
						(2, 'Tina', 'Trump', 'tina@example.com'),
                        (3, 'Salma', 'Jones', 'salma@example.com'),
                        (4, 'Jasper', 'Totti', 'jasper@example.com'),
                        (5, 'Dmitar', 'Morris', 'dmitar@example.com');





