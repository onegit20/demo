CREATE TABLE `tb_order` (
  `id` int NOT NULL AUTO_INCREMENT,
  `order_time` timestamp NOT NULL,
  `total` double NOT NULL,
  `uid` int NOT NULL,
  `create_time` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP,
  `update_time` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;