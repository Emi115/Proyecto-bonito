-- phpMyAdmin SQL Dump
-- version 5.2.1
-- https://www.phpmyadmin.net/
--
-- Servidor: 127.0.0.1
-- Tiempo de generación: 10-05-2023 a las 17:52:15
-- Versión del servidor: 10.4.28-MariaDB
-- Versión de PHP: 8.0.28

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de datos: `re4`
--

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `inventario_buhonero`
--

CREATE TABLE `inventario_buhonero` (
  `id` int(11) NOT NULL,
  `articulo` varchar(255) DEFAULT NULL,
  `cantidad` int(11) DEFAULT NULL,
  `pesetas` bigint(20) DEFAULT NULL,
  `descripcion` varchar(255) DEFAULT NULL,
  `cadencia` int(11) DEFAULT NULL,
  `capacidad` int(11) DEFAULT NULL,
  `potencia` int(11) DEFAULT NULL,
  `recarga` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Volcado de datos para la tabla `inventario_buhonero`
--

INSERT INTO `inventario_buhonero` (`id`, `articulo`, `cantidad`, `pesetas`, `descripcion`, `cadencia`, `capacidad`, `potencia`, `recarga`) VALUES
(1, 'Red9', 1, 20000, 'Pistola Mauser Alemana (9mm)', 3, 8, 2, 2),
(2, 'Tmp', 1, 30000, 'Subfusil Compacto (9Parabellum)', 5, 30, 1, 2),
(3, 'Rifle Francotirador', 1, 25000, 'Rifle de Francotirador (7,62mm)', 1, 5, 3, 1),
(4, 'Escopeta Antidisturbios', 1, 35000, 'Escopeta Pesada (Cartuchos)', 2, 7, 6, 1),
(5, 'Lanzacohetes', 1, 300000, 'Mata de un tiro', 1, 1, 1000, 0);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `inventario_jugador`
--

CREATE TABLE `inventario_jugador` (
  `id` int(11) NOT NULL,
  `articulo` varchar(255) DEFAULT NULL,
  `cantidad` int(11) DEFAULT NULL,
  `pesetas` bigint(20) DEFAULT NULL,
  `descripcion` varchar(255) DEFAULT NULL,
  `cadencia` int(11) DEFAULT NULL,
  `capacidad` int(11) DEFAULT NULL,
  `potencia` int(11) DEFAULT NULL,
  `recarga` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Volcado de datos para la tabla `inventario_jugador`
--

INSERT INTO `inventario_jugador` (`id`, `articulo`, `cantidad`, `pesetas`, `descripcion`, `cadencia`, `capacidad`, `potencia`, `recarga`) VALUES
(255, 'Red9', 1, 2000, 'Pistola Mauser Alemana (9mm)', 96, 8, 2, 2),
(8000, 'Candil de Mariposas', 3, 20000, 'Un candil con piedras preciosas incrustadas', 0, 0, 0, 0),
(8001, 'Estatua de los Castellanos', 10, 30000, 'Una peque�a estatua , parece pertenecer a la casa real', 0, 0, 0, 0),
(8002, 'Caliz de Reina', 2, 25000, 'Caliz de la Reina', 0, 0, 0, 0),
(8003, 'Emblema de los iluminados', 6, 35000, 'Un medallon de cuarzo rojo con un simbolo grabado en el ', 0, 0, 0, 0),
(8004, 'Corona del rey', 1, 300000, 'La corona del rey con varias gemas incrustadas', 0, 0, 0, 0);

--
-- Índices para tablas volcadas
--

--
-- Indices de la tabla `inventario_buhonero`
--
ALTER TABLE `inventario_buhonero`
  ADD PRIMARY KEY (`id`);

--
-- Indices de la tabla `inventario_jugador`
--
ALTER TABLE `inventario_jugador`
  ADD PRIMARY KEY (`id`);

--
-- AUTO_INCREMENT de las tablas volcadas
--

--
-- AUTO_INCREMENT de la tabla `inventario_buhonero`
--
ALTER TABLE `inventario_buhonero`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=8005;

--
-- AUTO_INCREMENT de la tabla `inventario_jugador`
--
ALTER TABLE `inventario_jugador`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=8005;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
