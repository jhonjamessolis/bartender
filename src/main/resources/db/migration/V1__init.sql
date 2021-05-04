use bartender;

CREATE TABLE `pilas` (
  `id` int(11) NOT NULL,
  `input_array` varchar(20) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

INSERT INTO `pilas` (`id`, `input_array`) VALUES
(1, '2,4,5,6,7,8'),
(2, '3,7,9,5,4,2'),
(3, '5,7,9,11,13'),
(4, '6,4,2,12,15'),
(5, '7,10,15,11,9');

ALTER TABLE `pilas`
  ADD PRIMARY KEY (`id`);

ALTER TABLE `pilas`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=6;

