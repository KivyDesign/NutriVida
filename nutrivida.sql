-- phpMyAdmin SQL Dump
-- version 5.2.1
-- https://www.phpmyadmin.net/
--
-- Servidor: 127.0.0.1
-- Tiempo de generación: 21-10-2023 a las 00:14:54
-- Versión del servidor: 10.4.28-MariaDB
-- Versión de PHP: 8.2.4

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de datos: `nutrivida`
--
CREATE DATABASE IF NOT EXISTS `nutrivida` DEFAULT CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci;
USE `nutrivida`;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `calorias`
--

CREATE TABLE `calorias` (
  `idCalorias` int(11) NOT NULL,
  `idGrupoAlimenticio` int(11) NOT NULL,
  `nombre` varchar(100) NOT NULL,
  `calorias` int(11) NOT NULL,
  `proteinas` int(11) NOT NULL,
  `grasa` int(11) NOT NULL,
  `carbohidratos` int(11) NOT NULL,
  `fibra` int(11) NOT NULL,
  `colesterol` int(11) NOT NULL,
  `estado` tinyint(1) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Volcado de datos para la tabla `calorias`
--

INSERT INTO `calorias` (`idCalorias`, `idGrupoAlimenticio`, `nombre`, `calorias`, `proteinas`, `grasa`, `carbohidratos`, `fibra`, `colesterol`, `estado`) VALUES
(1, 1, 'Aceite de cacahuete', 9000, 0, 1000, 0, 0, 0, 1),
(2, 1, 'Aceite de girasol', 9000, 0, 1000, 0, 0, 0, 1),
(3, 1, 'Aceite de maíz', 9000, 0, 1000, 0, 0, 0, 1),
(4, 1, 'Aceite de oliva', 9000, 0, 1000, 0, 0, 0, 1),
(5, 1, 'Aceite de soja', 9000, 0, 1000, 0, 0, 0, 1),
(6, 1, 'Aceitunas', 1490, 7, 127, 80, 0, 0, 1),
(7, 1, 'Manteca', 6700, 100, 700, 0, 0, 1000, 1),
(8, 1, 'Mantequilla', 7520, 7, 830, 6, 0, 2500, 1),
(9, 1, 'Margarina vegetal', 7520, 0, 835, 4, 0, 0, 1),
(10, 2, 'Azúcar', 3800, 0, 0, 995, 0, 0, 1),
(11, 2, 'Cacao en polvo, con azúcar', 3660, 55, 60, 774, 0, 0, 1),
(12, 2, 'Chocolate con leche', 5500, 60, 340, 560, 0, 740, 1),
(13, 2, 'Chocolate sin leche', 5300, 20, 300, 630, 0, 740, 1),
(14, 2, 'Compota', 660, 3, 0, 173, 20, 0, 1),
(15, 2, 'Crema de chocolate con avellanas', 5490, 62, 330, 605, 12, 20, 1),
(16, 2, 'Membrillo dulce', 2150, 0, 0, 570, 0, 0, 1),
(17, 2, 'Mermelada con azúcar', 2800, 5, 1, 700, 0, 0, 1),
(18, 2, 'Mermelada sin azúcar', 1450, 4, 3, 350, 0, 0, 1),
(19, 2, 'Miel', 3000, 5, 2, 750, 0, 0, 1),
(20, 3, 'Aguardiente', 2800, 0, 0, 0, 0, 0, 1),
(21, 3, 'Anís', 3120, 0, 0, 300, 0, 0, 1),
(22, 3, 'Batido lácteo cacao', 1000, 38, 46, 109, 1, 140, 1),
(23, 3, 'Brandy', 2430, 0, 0, 0, 0, 0, 1),
(24, 3, 'Cacao en polvo sin azúcar, a la taza', 4390, 210, 217, 400, 40, 0, 1),
(25, 3, 'Café', 50, 3, 1, 8, 0, 0, 1),
(26, 3, 'Cava', 650, 0, 0, 2, 0, 0, 1),
(27, 3, 'Cerveza negra', 370, 3, 0, 40, 0, 0, 1),
(28, 3, 'Cerveza rubia', 450, 4, 0, 40, 0, 0, 1),
(29, 3, 'Coñac', 2430, 0, 0, 0, 0, 0, 1),
(30, 3, 'Ginebra', 2440, 0, 0, 0, 0, 0, 1),
(31, 3, 'Leche de almendras', 3350, 50, 110, 540, 0, 0, 1),
(32, 3, 'Malta tostada en polvo, con azúcar', 3740, 60, 1, 874, 0, 0, 1),
(33, 3, 'Refrescos carbonatados', 480, 0, 0, 120, 0, 0, 1),
(34, 3, 'Ron', 2440, 0, 0, 0, 0, 0, 1),
(35, 3, 'Sidra dulce', 400, 0, 0, 50, 0, 0, 1),
(36, 3, 'Sidra seca', 400, 0, 0, 0, 0, 0, 1),
(37, 3, 'Té', 20, 1, 0, 4, 0, 0, 1),
(38, 3, 'Vermut dulce', 1600, 3, 0, 140, 0, 0, 1),
(39, 3, 'Vino de mesa', 600, 0, 0, 2, 0, 0, 1),
(40, 3, 'Vino dulce, Jerez', 1600, 3, 0, 140, 0, 0, 1),
(41, 3, 'Vino Oporto', 1600, 3, 0, 140, 0, 0, 1),
(42, 3, 'Whisky', 2440, 0, 0, 0, 0, 0, 1),
(43, 4, 'Bacon', 6650, 84, 693, 10, 0, 1000, 1),
(44, 4, 'Buey, filete graso', 3030, 174, 253, 0, 0, 650, 1),
(45, 4, 'Buey, filete semigraso', 1760, 202, 106, 0, 0, 650, 1),
(46, 4, 'Buey, solomillo', 1110, 204, 33, 0, 0, 200, 1),
(47, 4, 'Butifarra', 3260, 130, 300, 12, 0, 1000, 1),
(48, 4, 'Butifarra cocida', 3900, 141, 360, 3, 0, 1000, 1),
(49, 4, 'Butifarra fresca/salchichas', 3260, 130, 300, 12, 0, 1000, 1),
(50, 4, 'Caballo', 1100, 210, 20, 10, 0, 780, 1),
(51, 4, 'Cerdo, chuleta', 3300, 150, 300, 0, 0, 720, 1),
(52, 4, 'Cerdo, hígado', 1540, 210, 70, 15, 0, 2600, 1),
(53, 4, 'Cerdo, lomo', 2900, 160, 250, 0, 0, 720, 1),
(54, 4, 'Chicharrón', 6010, 220, 570, 0, 0, 1000, 1),
(55, 4, 'Chorizo/Sobrasada', 4680, 176, 442, 0, 0, 1000, 1),
(56, 4, 'Codorniz', 1140, 250, 14, 5, 0, 0, 1),
(57, 4, 'Conejo', 1620, 220, 80, 0, 0, 650, 1),
(58, 4, 'Cordero, costillas', 2150, 180, 170, 0, 0, 780, 1),
(59, 4, 'Cordero, hígado', 1320, 210, 40, 30, 0, 3000, 1),
(60, 4, 'Cordero, pierna', 2480, 170, 190, 0, 0, 780, 1),
(61, 4, 'Foie-gras', 5180, 70, 500, 100, 0, 3000, 1),
(62, 4, 'Gallina', 3690, 240, 295, 0, 0, 750, 1),
(63, 4, 'Jamón País', 3800, 170, 350, 0, 0, 620, 1),
(64, 4, 'Jamón York', 2890, 209, 221, 0, 0, 890, 1),
(65, 4, 'Lomo embuchado', 3800, 170, 350, 0, 0, 620, 1),
(66, 4, 'Mortadela', 2650, 190, 210, 0, 0, 1000, 1),
(67, 4, 'Pato', 2000, 220, 140, 5, 0, 750, 1),
(68, 4, 'Pavo', 2230, 319, 96, 0, 0, 930, 1),
(69, 4, 'Perdiz', 1140, 250, 14, 5, 0, 650, 1),
(70, 4, 'Pies de cerdo', 2900, 160, 250, 5, 0, 62, 1),
(71, 4, 'Pollo deshuesado', 850, 143, 30, 0, 0, 609, 1),
(72, 4, 'Pollo sin deshuesar', 1210, 205, 43, 0, 0, 870, 1),
(73, 4, 'Pollo, hígado', 1290, 197, 37, 29, 0, 3000, 1),
(74, 4, 'Salchicha de frankfurt', 3150, 204, 250, 6, 0, 1000, 1),
(75, 4, 'Salchichas', 3260, 130, 300, 12, 0, 1000, 1),
(76, 4, 'Salchichón', 2940, 140, 260, 10, 0, 1000, 1),
(77, 4, 'Sobrasada', 4680, 176, 442, 0, 0, 1000, 1),
(78, 4, 'Ternera, bistec', 1810, 190, 110, 5, 0, 700, 1),
(79, 4, 'Ternera, chuleta', 1680, 190, 100, 0, 0, 700, 1),
(80, 4, 'Ternera, hígado', 1400, 190, 38, 53, 0, 3000, 1),
(81, 4, 'Ternera, lengua', 2070, 160, 150, 4, 0, 1400, 1),
(82, 4, 'Ternera, riñón', 860, 160, 26, 0, 0, 4000, 1),
(83, 4, 'Ternera, sesos', 1110, 104, 86, 8, 0, 20000, 1),
(84, 4, 'Ternera, solomillo', 900, 188, 17, 0, 0, 700, 1),
(85, 4, 'Tripa', 1000, 190, 20, 0, 0, 1500, 1),
(86, 5, 'Arroz blanco', 3540, 76, 17, 770, 3, 0, 1),
(87, 5, 'Arroz integral', 3500, 80, 11, 770, 12, 0, 1),
(88, 5, 'Avena', 3670, 140, 50, 665, 80, 0, 1),
(89, 5, 'Harina de trigo, integral', 3400, 105, 15, 710, 100, 0, 1),
(90, 5, 'Harina de trigo, refinada', 3530, 95, 12, 750, 40, 0, 1),
(91, 5, 'Pan de molde, blanco', 2330, 78, 17, 497, 27, 0, 1),
(92, 5, 'Pan de molde, integral. Pan tostado', 2160, 88, 27, 418, 85, 0, 1),
(93, 5, 'Pan de trigo, blanco', 2550, 70, 8, 550, 40, 0, 1),
(94, 5, 'Pan de trigo, integral', 2390, 80, 12, 490, 90, 0, 1),
(95, 5, 'Pasta', 3750, 128, 12, 765, 20, 0, 1),
(96, 5, 'Sémola de trigo', 3750, 128, 12, 765, 0, 0, 1),
(97, 5, 'Tapioca', 3380, 15, 6, 820, 0, 0, 1),
(98, 6, 'Aceitunas', 2000, 7, 200, 80, 0, 0, 1),
(99, 6, 'Aguacates', 2070, 21, 164, 47, 20, 0, 1),
(100, 6, 'Albaricoque', 440, 8, 1, 100, 20, 0, 1),
(101, 6, 'Caqui', 640, 5, 1, 150, 13, 0, 1),
(102, 6, 'Cerezas', 770, 12, 5, 170, 20, 0, 1),
(103, 6, 'Chirimoyas', 780, 10, 2, 180, 10, 0, 1),
(104, 6, 'Ciruela', 640, 8, 1, 100, 10, 0, 1),
(105, 6, 'Ciruela seca', 2900, 23, 4, 700, 160, 0, 1),
(106, 6, 'Coco', 6300, 60, 620, 160, 240, 0, 1),
(107, 6, 'Dátil', 2790, 22, 4, 710, 87, 0, 1),
(108, 6, 'Dátil seco', 3060, 22, 6, 730, 90, 0, 1),
(109, 6, 'Frambuesa', 400, 10, 6, 80, 60, 0, 1),
(110, 6, 'Fresas', 360, 7, 6, 70, 20, 0, 1),
(111, 6, 'Granada', 320, 3, 1, 70, 2, 0, 1),
(112, 6, 'Higos', 800, 10, 1, 180, 30, 0, 1),
(113, 6, 'Higos secos', 2750, 42, 10, 620, 190, 0, 1),
(114, 6, 'Kiwi', 510, 10, 6, 91, 21, 0, 1),
(115, 6, 'Limón', 390, 3, 2, 90, 0, 0, 1),
(116, 6, 'Mandarina', 400, 8, 1, 90, 20, 0, 1),
(117, 6, 'Mango', 570, 6, 5, 125, 17, 0, 1),
(118, 6, 'Manzana', 520, 3, 4, 120, 20, 0, 1),
(119, 6, 'Melocotón', 520, 5, 1, 120, 10, 0, 1),
(120, 6, 'Melocotón en almíbar', 840, 4, 0, 220, 10, 0, 1),
(121, 6, 'Melón', 310, 8, 2, 65, 10, 0, 1),
(122, 6, 'Membrillo', 330, 5, 2, 73, 0, 0, 1),
(123, 6, 'Moras', 370, 9, 10, 60, 90, 0, 1),
(124, 6, 'Naranja', 440, 11, 2, 90, 20, 0, 1),
(125, 6, 'Nectarina', 640, 6, 0, 171, 20, 0, 1),
(126, 6, 'Nísperos', 970, 4, 4, 230, 0, 0, 1),
(127, 6, 'Palosanto', 640, 5, 1, 150, 13, 0, 1),
(128, 6, 'Papaya', 450, 6, 2, 103, 8, 0, 1),
(129, 6, 'Peras', 610, 4, 4, 140, 20, 0, 1),
(130, 6, 'Piña', 510, 5, 2, 120, 10, 0, 1),
(131, 6, 'Piña en almíbar', 840, 4, 0, 220, 10, 0, 1),
(132, 6, 'Plátano', 900, 14, 5, 200, 30, 0, 1),
(133, 6, 'Pomelo', 300, 6, 3, 60, 5, 0, 1),
(134, 6, 'Sandía', 300, 4, 2, 6070, 6, 0, 1),
(135, 6, 'Uva', 810, 10, 10, 170, 5, 0, 1),
(136, 6, 'Uva pasa', 3240, 30, 13, 750, 70, 0, 1),
(137, 6, 'Zumo de naranja', 820, 6, 2, 100, 0, 0, 1),
(138, 6, 'Zumos de fruta', 450, 4, 0, 115, 0, 0, 1),
(139, 7, 'Almendra', 6200, 200, 540, 170, 140, 0, 1),
(140, 7, 'Avellana', 6560, 140, 600, 150, 100, 0, 1),
(141, 7, 'Cacahuete', 5600, 230, 400, 260, 100, 0, 1),
(142, 7, 'Castaña', 1990, 40, 26, 400, 70, 0, 1),
(143, 7, 'Nueces', 6600, 150, 600, 150, 24, 0, 1),
(144, 7, 'Piñones', 6600, 150, 600, 150, 24, 0, 1),
(145, 7, 'Pipas de girasol', 5350, 270, 430, 200, 27, 0, 1),
(146, 7, 'Pistacho', 5860, 180, 520, 110, 110, 0, 1),
(147, 8, 'Clara', 480, 110, 2, 7, 0, 0, 1),
(148, 8, 'Huevo duro', 1470, 123, 109, 0, 0, 5040, 1),
(149, 8, 'Huevo entero (1 huevo = 50 g - 70 g)', 1620, 130, 120, 6, 0, 5040, 1),
(150, 8, 'Yema', 3680, 160, 330, 6, 0, 14800, 1),
(151, 9, 'Cuajada', 960, 136, 40, 14, 0, 250, 1),
(152, 9, 'Flan de huevo', 1160, 38, 42, 158, 0, 1000, 1),
(153, 9, 'Flan de vainilla', 1020, 26, 18, 174, 0, 1000, 1),
(154, 9, 'Helados lácteos', 2040, 45, 101, 254, 0, 210, 1),
(155, 9, 'Leche condensada', 3500, 100, 104, 540, 0, 340, 1),
(156, 9, 'Leche condensada sin azúcar', 1600, 80, 93, 109, 0, 340, 1),
(157, 9, 'Leche de cabra (en ml)', 720, 39, 45, 46, 0, 140, 1),
(158, 9, 'Leche de oveja (en ml)', 960, 53, 65, 43, 0, 0, 1),
(159, 9, 'Leche de vaca en polvo, entera', 5000, 250, 260, 370, 0, 310, 1),
(160, 9, 'Leche de vaca, desnatada (en ml)', 340, 35, 10, 44, 0, 0, 1),
(161, 9, 'Leche de vaca, entera (en ml)', 680, 35, 39, 46, 0, 140, 1),
(162, 9, 'Leche de vaca, semidesnatada (en ml)', 490, 35, 17, 50, 0, 90, 1),
(163, 9, 'Mousse', 1770, 43, 82, 218, 0, 0, 1),
(164, 9, 'Nata y crema de leche', 2980, 30, 300, 40, 0, 1060, 1),
(165, 9, 'Natillas', 1160, 38, 42, 168, 0, 1000, 1),
(166, 9, 'Petit suisse, natural', 1730, 84, 136, 41, 0, 460, 1),
(167, 9, 'Petit suisse, sabores', 1640, 78, 88, 135, 0, 250, 1),
(168, 9, 'Queso blanco desnatado', 680, 105, 16, 32, 0, 0, 1),
(169, 9, 'Queso Camembert', 3120, 200, 240, 40, 0, 920, 1),
(170, 9, 'Queso de bola', 3490, 290, 250, 20, 0, 920, 1),
(171, 9, 'Queso de Burgos', 1740, 150, 110, 40, 0, 970, 1),
(172, 9, 'Queso Emmental', 4150, 280, 330, 15, 0, 1000, 1),
(173, 9, 'Queso en porciones', 2800, 180, 220, 25, 0, 930, 1),
(174, 9, 'Queso Gruyere', 3910, 290, 300, 15, 0, 1000, 1),
(175, 9, 'Queso manchego', 3760, 290, 287, 5, 0, 950, 1),
(176, 9, 'Queso parmesano', 3930, 400, 250, 20, 0, 1000, 1),
(177, 9, 'Queso Roquefort', 4050, 230, 350, 20, 0, 870, 1),
(178, 9, 'Queso Sveltesse', 1360, 160, 55, 55, 0, 100, 1),
(179, 9, 'Requesón', 960, 136, 40, 14, 0, 250, 1),
(180, 9, 'Speisequark', 1070, 92, 63, 31, 0, 100, 1),
(181, 9, 'Yogur desnatado', 420, 46, 5, 54, 0, 0, 1),
(182, 9, 'Yogur desnatado con frutas', 900, 43, 4, 189, 0, 0, 1),
(183, 9, 'Yogur enriquecido con nata', 600, 37, 36, 37, 0, 200, 1),
(184, 9, 'Yogur natural con fruta', 980, 40, 15, 170, 0, 80, 1),
(185, 9, 'Yogur natural Sveltesse', 500, 46, 4, 71, 0, 0, 1),
(186, 9, 'Yogur natural', 450, 42, 11, 45, 0, 80, 1),
(187, 10, 'Garbanzos secos', 3610, 180, 50, 610, 60, 0, 1),
(188, 10, 'Guisantes secos', 3170, 216, 23, 560, 50, 0, 1),
(189, 10, 'Habas secas', 3430, 230, 15, 590, 40, 0, 1),
(190, 10, 'Judías secas', 3300, 190, 15, 600, 70, 0, 1),
(191, 10, 'Lentejas', 3360, 240, 18, 560, 40, 0, 1),
(192, 10, 'Soja en grano', 4220, 350, 180, 300, 50, 0, 1),
(193, 11, 'Bizcocho', 4560, 56, 152, 791, 30, 1300, 1),
(194, 11, 'Croisant/ensaimada/donut', 4560, 56, 152, 791, 25, 1300, 1),
(195, 11, 'Galletas tipo María', 4360, 70, 145, 740, 30, 0, 1),
(196, 11, 'Magdalenas', 4690, 64, 220, 655, 25, 1300, 1),
(197, 11, 'Melindros', 4400, 108, 125, 758, 25, 1300, 1),
(198, 11, 'Pasta brisa cocida', 5270, 69, 322, 558, 12, 0, 1),
(199, 11, 'Pasta de hojaldre cocida', 5650, 58, 405, 474, 20, 0, 1),
(200, 11, 'Pasta de té', 4560, 56, 152, 791, 250, 1300, 1),
(201, 12, 'Almejas/Berberechos', 500, 110, 9, 0, 0, 500, 1),
(202, 12, 'Anchoas', 1750, 200, 103, 6, 0, 950, 1),
(203, 12, 'Anguila', 2000, 140, 155, 0, 0, 700, 1),
(204, 12, 'Arenque ahumado', 2240, 230, 120, 0, 0, 700, 1),
(205, 12, 'Arenque, seco', 1220, 170, 60, 0, 0, 500, 1),
(206, 12, 'Atún', 2250, 270, 130, 0, 0, 550, 1),
(207, 12, 'Atún en lata, con aceite vegetal', 2800, 250, 200, 0, 0, 550, 1),
(208, 12, 'Bacalao fresco', 860, 170, 20, 0, 0, 500, 1),
(209, 12, 'Bacalao salado', 1080, 260, 5, 0, 0, 500, 1),
(210, 12, 'Bacalao, seco', 3220, 750, 25, 0, 0, 0, 1),
(211, 12, 'Besugo', 1180, 160, 60, 0, 0, 0, 1),
(212, 12, 'Boquerón', 1510, 210, 75, 0, 0, 1000, 1),
(213, 12, 'Caballa', 1530, 150, 100, 8, 0, 570, 1),
(214, 12, 'Calamar, Sepia', 820, 170, 13, 5, 0, 0, 1),
(215, 12, 'Cangrejo', 850, 160, 16, 6, 0, 0, 1),
(216, 12, 'Caracoles', 670, 150, 8, 0, 0, 0, 1),
(217, 12, 'Caviar', 2330, 290, 130, 0, 0, 0, 1),
(218, 12, 'Chanquete', 790, 114, 30, 18, 0, 0, 1),
(219, 12, 'Chirla', 500, 110, 9, 0, 0, 500, 1),
(220, 12, 'Cigala', 700, 150, 8, 0, 0, 1500, 1),
(221, 12, 'Congrio', 1440, 200, 30, 0, 0, 0, 1),
(222, 12, 'Gallo', 730, 160, 10, 0, 0, 500, 1),
(223, 12, 'Gambas', 960, 210, 14, 0, 0, 1500, 1),
(224, 12, 'Langosta', 700, 150, 0, 0, 0, 1500, 1),
(225, 12, 'Langostinos', 960, 210, 14, 0, 0, 1500, 1),
(226, 12, 'Lenguado', 730, 160, 10, 0, 0, 500, 1),
(227, 12, 'Lubina', 1180, 160, 60, 0, 0, 0, 1),
(228, 12, 'Mejillón', 720, 120, 17, 22, 0, 500, 1),
(229, 12, 'Merluza', 860, 170, 20, 0, 0, 500, 1),
(230, 12, 'Mero', 1180, 160, 60, 0, 0, 0, 1),
(231, 12, 'Ostras', 800, 100, 18, 60, 0, 500, 1),
(232, 12, 'Pulpos', 570, 106, 110, 15, 0, 0, 1),
(233, 12, 'Rape', 860, 170, 20, 0, 0, 500, 1),
(234, 12, 'Salmón', 1140, 160, 80, 0, 0, 700, 1),
(235, 12, 'Salmón ahumado', 1700, 200, 100, 0, 0, 900, 1),
(236, 12, 'Salmonete', 970, 141, 37, 20, 0, 700, 1),
(237, 12, 'Sardina en lata, con aceite vegetal', 1920, 210, 120, 0, 0, 1200, 1),
(238, 12, 'Sardinas', 1740, 210, 100, 0, 0, 1000, 1),
(239, 12, 'Trucha', 940, 180, 30, 0, 0, 570, 1),
(240, 13, 'Azafrán', 3520, 114, 59, 615, 39, 0, 1),
(241, 13, 'Bechamel', 1150, 42, 67, 92, 0, 0, 1),
(242, 13, 'Canela', 2550, 39, 32, 256, 593, 0, 1),
(243, 13, 'Cubito de caldo', 2590, 158, 218, 0, 0, 0, 1),
(244, 13, 'Guindilla picante', 472, 19, 11, 67, 15, 0, 1),
(245, 13, 'Ketchup', 980, 21, 0, 240, 0, 0, 1),
(246, 13, 'Laurel', 3530, 76, 84, 487, 263, 0, 1),
(247, 13, 'Levadura', 1640, 278, 0, 118, 30, 0, 1),
(248, 13, 'Mayonesa', 7180, 18, 789, 1, 0, 1600, 1),
(249, 13, 'Mostaza', 150, 47, 44, 64, 0, 0, 1),
(250, 13, 'Nuez moscada', 5060, 58, 4, 285, 208, 0, 1),
(251, 13, 'Orégano', 3080, 110, 103, 216, 420, 0, 1),
(252, 13, 'Perejil', 591, 44, 4, 74, 43, 0, 1),
(253, 13, 'Pimentón', 3570, 148, 130, 348, 209, 0, 1),
(254, 13, 'Pimienta', 2800, 109, 33, 383, 265, 0, 1),
(255, 13, 'Sal', 0, 0, 0, 0, 0, 0, 1),
(256, 13, 'Salsa de tomate en conserva', 860, 24, 51, 81, 19, 0, 1),
(257, 13, 'Sofrito', 1160, 16, 85, 88, 19, 0, 1),
(258, 14, 'Acelgas', 330, 20, 6, 50, 0, 0, 1),
(259, 14, 'Ajos', 1390, 67, 1, 280, 10, 0, 1),
(260, 14, 'Alcachofa', 640, 34, 3, 120, 15, 0, 1),
(261, 14, 'Apio', 200, 13, 2, 37, 20, 0, 1),
(262, 14, 'Berenjena', 290, 13, 2, 55, 20, 0, 1),
(263, 14, 'Berro', 210, 17, 3, 30, 30, 0, 1),
(264, 14, 'Boniato', 1520, 22, 9, 320, 30, 0, 1),
(265, 14, 'Calabacín', 310, 13, 2, 60, 13, 0, 1),
(266, 14, 'Calabaza', 240, 13, 2, 54, 20, 0, 1),
(267, 14, 'Cardo', 210, 14, 2, 35, 10, 0, 1),
(268, 14, 'Cebolla', 470, 14, 2, 100, 10, 0, 1),
(269, 14, 'Cebolla tierna', 390, 9, 2, 84, 50, 0, 1),
(270, 14, 'Champiñones', 280, 24, 3, 40, 30, 0, 1),
(271, 14, 'Col', 280, 14, 2, 43, 20, 0, 1),
(272, 14, 'Col de Bruselas', 540, 40, 7, 80, 30, 0, 1),
(273, 14, 'Coliflor', 300, 24, 2, 49, 20, 0, 1),
(274, 14, 'Endivia', 220, 15, 1, 40, 20, 0, 1),
(275, 14, 'Escarola', 370, 15, 3, 40, 20, 0, 1),
(276, 14, 'Espárragos', 260, 22, 2, 39, 10, 0, 1),
(277, 14, 'Espárragos en lata', 240, 19, 3, 34, 10, 0, 1),
(278, 14, 'Espinacas', 320, 31, 6, 36, 60, 0, 1),
(279, 14, 'Espinacas congeladas', 250, 23, 2, 32, 0, 0, 1),
(280, 14, 'Grelos', 110, 27, 0, 1, 0, 0, 1),
(281, 14, 'Guisantes', 920, 60, 4, 160, 50, 0, 1),
(282, 14, 'Guisantes congelados', 710, 50, 3, 120, 50, 0, 1),
(283, 14, 'Habas tiernas', 640, 54, 3, 100, 40, 0, 1),
(284, 14, 'Judías tiernas', 390, 24, 2, 70, 30, 0, 1),
(285, 14, 'Lechuga', 180, 12, 2, 29, 96, 0, 1),
(286, 14, 'Maíz dulce', 500, 11, 2, 107, 10, 0, 1),
(287, 14, 'Menestra de verduras', 290, 9, 5, 51, 0, 0, 1),
(288, 14, 'Nabos', 290, 8, 2, 60, 20, 0, 1),
(289, 14, 'Patata cocida', 860, 20, 1, 190, 20, 0, 1),
(290, 14, 'Patatas fritas', 5440, 67, 370, 500, 20, 0, 1),
(291, 14, 'Pepino', 120, 7, 1, 20, 5, 0, 1),
(292, 14, 'Perejil', 550, 37, 10, 80, 18, 0, 1),
(293, 14, 'Pimiento', 220, 12, 2, 38, 10, 0, 1),
(294, 14, 'Puerros', 420, 20, 4, 75, 30, 0, 1),
(295, 14, 'Puré de patata', 3570, 70, 7, 800, 20, 0, 1),
(296, 14, 'Rábanos', 200, 12, 11, 42, 10, 0, 1),
(297, 14, 'Remolacha', 400, 16, 1, 80, 30, 0, 1),
(298, 14, 'Setas', 280, 24, 3, 40, 30, 0, 1),
(299, 14, 'Soja, Brotes', 500, 55, 10, 47, 24, 0, 1),
(300, 14, 'Tomate', 220, 10, 3, 40, 15, 0, 1),
(301, 14, 'Tomate triturado en conserva', 390, 23, 5, 55, 0, 0, 1),
(302, 14, 'Tomate, Zumo', 210, 10, 2, 40, 30, 0, 1),
(303, 14, 'Trufa', 920, 90, 5, 130, 0, 0, 1),
(304, 14, 'Zanahoria', 420, 12, 3, 90, 30, 0, 1);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `comida`
--

CREATE TABLE `comida` (
  `idComida` int(11) NOT NULL,
  `nombre` varchar(100) NOT NULL,
  `detalle` varchar(100) NOT NULL,
  `cantCalorias` int(11) NOT NULL,
  `estado` tinyint(4) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Volcado de datos para la tabla `comida`
--

INSERT INTO `comida` (`idComida`, `nombre`, `detalle`, `cantCalorias`, `estado`) VALUES
(1, 'Frutilla', 'Es una fruta', 33, 1),
(2, 'Lenteja', 'legumbres', 116, 1),
(3, 'Banana', 'Fruta', 89, 1),
(4, 'Atún', 'Pescado', 130, 0),
(5, 'Zanahoria', 'Verdura', 37, 1);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `dieta`
--

CREATE TABLE `dieta` (
  `idDieta` int(11) NOT NULL,
  `nombre` varchar(100) NOT NULL,
  `idPaciente` int(11) NOT NULL,
  `pesoInicial` double NOT NULL,
  `pesoFinal` double NOT NULL,
  `fechaInicial` date NOT NULL,
  `fechaFinal` date NOT NULL,
  `estado` tinyint(4) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Volcado de datos para la tabla `dieta`
--

INSERT INTO `dieta` (`idDieta`, `nombre`, `idPaciente`, `pesoInicial`, `pesoFinal`, `fechaInicial`, `fechaFinal`, `estado`) VALUES
(1, 'Intensiva', 2, 140.5, 94.7, '2023-08-23', '2023-10-16', 1),
(2, 'Masiva', 3, 150.52, 98, '2023-08-23', '2023-12-23', 1),
(3, 'Liviana', 4, 150.52, 98, '2023-08-23', '2023-12-23', 1),
(4, 'Normal', 5, 150.52, 98, '2023-08-23', '2023-12-23', 1),
(19, 'ultrarrapida', 6, 120, 80, '2023-06-01', '2023-11-21', 1),
(24, 'Cuidado Personal', 11, 120, 85, '2023-08-08', '2023-11-21', 1),
(25, 'Leve Aumento', 17, 56, 62, '2023-08-14', '2023-11-22', 0),
(26, 'Incremento secuencial', 17, 56, 62, '2023-08-07', '2023-10-31', 0),
(27, 'engorde', 17, 56, 62, '2023-10-02', '2023-06-08', 0),
(28, 'aumento relativo', 17, 56, 62, '2023-10-02', '2023-11-28', 1),
(29, 'Ligera', 1, 89, 78.5, '2023-07-21', '2023-10-25', 1),
(30, 'Rapida', 13, 85.36, 60, '2023-08-22', '2023-10-16', 1),
(31, 'progresiva', 12, 150.8, 125, '2023-08-23', '2023-10-13', 0),
(32, 'Perdedora', 14, 80, 68, '2023-09-04', '2023-12-22', 1),
(33, 'CuidadoIntensivo', 19, 89.7, 79, '2023-09-11', '2023-09-20', 1),
(34, 'Liviana', 9, 97.8, 90, '2023-08-15', '2023-11-14', 1),
(35, 'Media', 7, 60.8, 48.5, '2023-09-12', '2023-12-20', 1),
(36, 'liviana', 8, 55.35, 50, '2023-09-13', '2023-11-24', 1),
(37, 'menor', 16, 69, 58.5, '2023-09-12', '2023-12-18', 1),
(38, 'super', 18, 85.3, 79, '2023-09-12', '2023-11-14', 1);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `dietacomida`
--

CREATE TABLE `dietacomida` (
  `idDietaComida` int(11) NOT NULL,
  `idComida` int(11) NOT NULL,
  `idDieta` int(11) NOT NULL,
  `horario` enum('DESAYUNO','ALMUERZO','MERIENDA','CENA','SNACK') NOT NULL,
  `porcion` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Volcado de datos para la tabla `dietacomida`
--

INSERT INTO `dietacomida` (`idDietaComida`, `idComida`, `idDieta`, `horario`, `porcion`) VALUES
(21, 1, 28, 'MERIENDA', 25),
(25, 1, 1, 'DESAYUNO', 4),
(27, 2, 1, 'DESAYUNO', 220),
(28, 5, 1, 'MERIENDA', 3),
(29, 1, 1, 'ALMUERZO', 12),
(31, 1, 1, 'ALMUERZO', 5),
(32, 1, 1, 'DESAYUNO', 4),
(33, 1, 1, 'CENA', 8),
(34, 1, 1, 'SNACK', 12),
(35, 2, 30, 'CENA', 200);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `historial`
--

CREATE TABLE `historial` (
  `IdHistorial` int(11) NOT NULL,
  `idPaciente` int(11) NOT NULL,
  `peso` double NOT NULL,
  `fechaConsulta` date NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Volcado de datos para la tabla `historial`
--

INSERT INTO `historial` (`IdHistorial`, `idPaciente`, `peso`, `fechaConsulta`) VALUES
(2, 6, 118.32, '2023-06-22'),
(3, 6, 110.6, '2023-07-18'),
(4, 6, 105.32, '2023-08-14'),
(5, 6, 101.6, '2023-09-18'),
(6, 6, 98.7, '2023-10-11'),
(7, 6, 97.8, '2023-10-11'),
(8, 6, 97.8, '2023-10-11'),
(9, 6, 96.2, '2023-10-16'),
(10, 6, 95.2, '2023-10-16'),
(12, 1, 80.5, '2023-10-16'),
(13, 1, 84.3, '2023-08-21'),
(14, 1, 84.3, '2023-08-21'),
(15, 2, 140.5, '2023-08-23'),
(16, 1, 84.3, '2023-09-21'),
(19, 2, 132.85, '2023-09-21'),
(22, 1, 82.15, '2023-09-15'),
(23, 2, 125.3, '2023-10-16'),
(24, 13, 85, '2023-08-22'),
(25, 3, 150.82, '2023-08-23'),
(26, 3, 125.05, '2023-10-16'),
(27, 12, 150.8, '2023-08-23'),
(28, 2, 94.05, '2023-10-17'),
(29, 2, 95, '2023-10-17'),
(30, 13, 80.7, '2023-09-22'),
(31, 19, 80.3, '2023-10-19'),
(32, 19, 97.8, '2023-08-15'),
(33, 11, 120, '2023-08-08'),
(34, 3, 141.5, '2023-09-24'),
(35, 4, 150.52, '2023-08-23'),
(36, 5, 150.52, '2023-08-23'),
(37, 7, 60.8, '2023-09-12'),
(38, 8, 55.35, '2023-09-13'),
(39, 8, 52.9, '2023-10-19'),
(40, 13, 75.2, '2023-10-19'),
(41, 2, 93.5, '2023-10-19'),
(42, 1, 80.2, '2023-10-19'),
(43, 3, 132.58, '2023-10-19'),
(44, 16, 69, '2023-09-12'),
(45, 16, 65.4, '2023-10-19'),
(46, 18, 85.3, '2023-09-12'),
(47, 18, 82.5, '2023-10-20');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `paciente`
--

CREATE TABLE `paciente` (
  `idPaciente` int(11) NOT NULL,
  `dni` int(11) NOT NULL,
  `nombre` varchar(100) NOT NULL,
  `domicilio` varchar(100) NOT NULL,
  `telefono` varchar(20) NOT NULL,
  `pesoActual` double NOT NULL,
  `estado` tinyint(4) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Volcado de datos para la tabla `paciente`
--

INSERT INTO `paciente` (`idPaciente`, `dni`, `nombre`, `domicilio`, `telefono`, `pesoActual`, `estado`) VALUES
(1, 22221111, 'Gomez Pablo', '2332 Colon', '456-123', 80.2, 1),
(2, 11113333, 'Pabla Gomes', 'Union 562', '123-564', 93.5, 1),
(3, 11114444, 'Paola Guzman', 'Pellegrini 456', '423-456', 132.58, 1),
(4, 11115555, 'Paulo Salas', 'Campos 458', '123-456', 72.4, 1),
(5, 11116666, 'Paula Diaz', 'Belgrano 123', '456-456', 60.8, 1),
(6, 11117777, 'Pedro Perez', 'Talleres 789', '123-456', 95.2, 1),
(7, 11118888, 'Adrian Gil', 'Maipu 471', '123-741', 88.63, 1),
(8, 11119999, 'Adriana Ramos', 'Mitre 1447', '415-456', 52.9, 1),
(9, 11110000, 'Carlos Robledo', 'Pasco 1587', '478-456', 97.8, 1),
(10, 11111111, 'Carla Funes', 'Sarmiento 569', '100-456', 75.8, 1),
(11, 22225555, 'Francisco Peralta', 'Las Heras 1809', '123-4567', 119.5, 1),
(12, 22223333, 'Pascual Funes', 'Chubut 3450', '123-789', 148.5, 1),
(13, 11112222, 'Daniela Paso', 'Ayacucho', '123-335', 75.2, 1),
(14, 22224444, 'Horacio Larreta', 'Mitre 578', '111-234', 80, 1),
(15, 22226666, 'Roberto Calvo', 'Colon 2390', '777-8888', 90.5, 1),
(16, 22227777, 'Silvia Dorrego', 'Pasco 3456', '00', 65.4, 1),
(17, 22228888, 'Dora La Exploradora', 'Vera 490', '555-6666', 56, 0),
(18, 22229999, 'Victor Paz', 'San Luis 2332', '266-512', 82.5, 1),
(19, 88887777, 'Paco Perez', 'La paz 35', '456-123', 80.3, 1),
(20, 33330000, 'Marco Ruben', 'Gascon 562', '123-789', 74, 1);

--
-- Índices para tablas volcadas
--

--
-- Indices de la tabla `calorias`
--
ALTER TABLE `calorias`
  ADD PRIMARY KEY (`idCalorias`);

--
-- Indices de la tabla `comida`
--
ALTER TABLE `comida`
  ADD PRIMARY KEY (`idComida`);

--
-- Indices de la tabla `dieta`
--
ALTER TABLE `dieta`
  ADD PRIMARY KEY (`idDieta`),
  ADD KEY `idPaciente` (`idPaciente`);

--
-- Indices de la tabla `dietacomida`
--
ALTER TABLE `dietacomida`
  ADD PRIMARY KEY (`idDietaComida`),
  ADD KEY `idDieta` (`idDieta`),
  ADD KEY `idComida` (`idComida`);

--
-- Indices de la tabla `historial`
--
ALTER TABLE `historial`
  ADD PRIMARY KEY (`IdHistorial`),
  ADD KEY `idPaciente` (`idPaciente`);

--
-- Indices de la tabla `paciente`
--
ALTER TABLE `paciente`
  ADD PRIMARY KEY (`idPaciente`),
  ADD UNIQUE KEY `dni` (`dni`);

--
-- AUTO_INCREMENT de las tablas volcadas
--

--
-- AUTO_INCREMENT de la tabla `comida`
--
ALTER TABLE `comida`
  MODIFY `idComida` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=6;

--
-- AUTO_INCREMENT de la tabla `dieta`
--
ALTER TABLE `dieta`
  MODIFY `idDieta` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=39;

--
-- AUTO_INCREMENT de la tabla `dietacomida`
--
ALTER TABLE `dietacomida`
  MODIFY `idDietaComida` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=36;

--
-- AUTO_INCREMENT de la tabla `historial`
--
ALTER TABLE `historial`
  MODIFY `IdHistorial` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=48;

--
-- AUTO_INCREMENT de la tabla `paciente`
--
ALTER TABLE `paciente`
  MODIFY `idPaciente` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=21;

--
-- Restricciones para tablas volcadas
--

--
-- Filtros para la tabla `dieta`
--
ALTER TABLE `dieta`
  ADD CONSTRAINT `dieta_ibfk_1` FOREIGN KEY (`idPaciente`) REFERENCES `paciente` (`idPaciente`);

--
-- Filtros para la tabla `dietacomida`
--
ALTER TABLE `dietacomida`
  ADD CONSTRAINT `dietacomida_ibfk_1` FOREIGN KEY (`idDieta`) REFERENCES `dieta` (`idDieta`),
  ADD CONSTRAINT `dietacomida_ibfk_2` FOREIGN KEY (`idComida`) REFERENCES `comida` (`idComida`);

--
-- Filtros para la tabla `historial`
--
ALTER TABLE `historial`
  ADD CONSTRAINT `historial_ibfk_1` FOREIGN KEY (`idPaciente`) REFERENCES `paciente` (`idPaciente`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
