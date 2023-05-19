-- phpMyAdmin SQL Dump
-- version 5.2.1
-- https://www.phpmyadmin.net/
--
-- Servidor: 127.0.0.1
-- Tiempo de generación: 19-05-2023 a las 16:56:28
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
-- Estructura de tabla para la tabla `dinero_jugador`
--

CREATE TABLE `dinero_jugador` (
  `Dinero` int(255) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_general_ci;

--
-- Volcado de datos para la tabla `dinero_jugador`
--

INSERT INTO `dinero_jugador` (`Dinero`) VALUES
(0);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `inventario_buhonero`
--

CREATE TABLE `inventario_buhonero` (
  `id` int(11) NOT NULL,
  `articulo` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci DEFAULT NULL,
  `cantidad` int(11) DEFAULT NULL,
  `pesetas` bigint(20) DEFAULT NULL,
  `descripcion` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci DEFAULT NULL,
  `cadencia` int(11) DEFAULT NULL,
  `capacidad` int(11) DEFAULT NULL,
  `potencia` int(11) DEFAULT NULL,
  `recarga` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_general_ci;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `inventario_jugador`
--

CREATE TABLE `inventario_jugador` (
  `id` int(11) NOT NULL,
  `articulo` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci DEFAULT NULL,
  `cantidad` int(11) DEFAULT NULL,
  `pesetas` bigint(20) DEFAULT NULL,
  `descripcion` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci DEFAULT NULL,
  `cadencia` int(11) DEFAULT NULL,
  `capacidad` int(11) DEFAULT NULL,
  `potencia` int(11) DEFAULT NULL,
  `recarga` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_general_ci;

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
