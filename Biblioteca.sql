-- phpMyAdmin SQL Dump
-- version 3.4.9
-- http://www.phpmyadmin.net
--
-- Servidor: localhost
-- Tiempo de generación: 14-06-2012 a las 06:39:01
-- Versión del servidor: 5.1.61
-- Versión de PHP: 5.3.10-pl0-gentoo

SET SQL_MODE="NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;

--
-- Base de datos: `Biblioteca`
--

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `Administradores`
--

CREATE TABLE IF NOT EXISTS `Administradores` (
  `AdminID` int(11) NOT NULL AUTO_INCREMENT,
  `UserID` int(11) NOT NULL,
  PRIMARY KEY (`AdminID`),
  UNIQUE KEY `UserID` (`UserID`)
) ENGINE=MyISAM  DEFAULT CHARSET=utf8 AUTO_INCREMENT=17 ;

--
-- Volcado de datos para la tabla `Administradores`
--

INSERT INTO `Administradores` (`AdminID`, `UserID`) VALUES
(2, 4);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `Copias_Libros`
--

CREATE TABLE IF NOT EXISTS `Copias_Libros` (
  `CopiaID` int(11) NOT NULL AUTO_INCREMENT,
  `BookID` int(11) NOT NULL,
  PRIMARY KEY (`CopiaID`)
) ENGINE=MyISAM  DEFAULT CHARSET=utf8 AUTO_INCREMENT=4 ;

--
-- Volcado de datos para la tabla `Copias_Libros`
--

INSERT INTO `Copias_Libros` (`CopiaID`, `BookID`) VALUES
(2, 10),
(3, 10);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `Historial_Prestamos`
--

CREATE TABLE IF NOT EXISTS `Historial_Prestamos` (
  `LoanID` int(11) NOT NULL AUTO_INCREMENT,
  `UserID` int(11) NOT NULL,
  `CopiaID` int(11) NOT NULL,
  `Fecha_Prestamo` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP,
  `Fecha_Tope` date NOT NULL,
  `Fecha_Devolucion` timestamp NULL DEFAULT '0000-00-00 00:00:00',
  PRIMARY KEY (`LoanID`)
) ENGINE=MyISAM  DEFAULT CHARSET=utf8 AUTO_INCREMENT=12 ;

--
-- Volcado de datos para la tabla `Historial_Prestamos`
--

INSERT INTO `Historial_Prestamos` (`LoanID`, `UserID`, `CopiaID`, `Fecha_Prestamo`, `Fecha_Tope`, `Fecha_Devolucion`) VALUES
(11, 4, 2, '2012-06-13 18:49:29', '2012-06-28', '2012-06-13 18:49:35');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `Libros`
--

CREATE TABLE IF NOT EXISTS `Libros` (
  `BookID` int(11) NOT NULL AUTO_INCREMENT,
  `Titulo` varchar(150) NOT NULL,
  `ISBN` varchar(20) NOT NULL,
  `Autor` varchar(50) NOT NULL,
  `Editorial` varchar(50) NOT NULL,
  `Paginas` int(11) NOT NULL,
  `Especial` int(1) NOT NULL,
  `Portada` blob,
  `Active` tinyint(1) NOT NULL DEFAULT '1',
  PRIMARY KEY (`BookID`),
  UNIQUE KEY `Titulo` (`Titulo`)
) ENGINE=MyISAM  DEFAULT CHARSET=utf8 AUTO_INCREMENT=11 ;

--
-- Volcado de datos para la tabla `Libros`
--

INSERT INTO `Libros` (`BookID`, `Titulo`, `ISBN`, `Autor`, `Editorial`, `Paginas`, `Especial`, `Portada`, `Active`) VALUES
(10, 'prueba', '00002', 'prueba', 'prueba', 100, 1, NULL, 1);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `Prestamos`
--

CREATE TABLE IF NOT EXISTS `Prestamos` (
  `LoanID` int(11) NOT NULL AUTO_INCREMENT,
  `UserID` int(11) NOT NULL,
  `CopiaID` int(11) NOT NULL,
  `Fecha_Prestamo` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP,
  `Fecha_Tope` date NOT NULL,
  `Fecha_Devolucion` timestamp NULL DEFAULT '0000-00-00 00:00:00',
  PRIMARY KEY (`LoanID`)
) ENGINE=MyISAM  DEFAULT CHARSET=utf8 AUTO_INCREMENT=13 ;

--
-- Volcado de datos para la tabla `Prestamos`
--

INSERT INTO `Prestamos` (`LoanID`, `UserID`, `CopiaID`, `Fecha_Prestamo`, `Fecha_Tope`, `Fecha_Devolucion`) VALUES
(12, 4, 2, '2012-05-31 22:00:00', '2012-06-04', '2012-06-07 22:00:00');

--
-- Disparadores `Prestamos`
--
DROP TRIGGER IF EXISTS `Log_Prestamo_Trigger`;
DELIMITER //
CREATE TRIGGER `Log_Prestamo_Trigger` AFTER DELETE ON `Prestamos`
 FOR EACH ROW BEGIN
insert into Historial_Prestamos values(old.LoanID, old.UserID, old.CopiaID, old.Fecha_Prestamo, old.Fecha_Tope, old.Fecha_Devolucion);
 END
//
DELIMITER ;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `Reservas`
--

CREATE TABLE IF NOT EXISTS `Reservas` (
  `ReserveID` int(11) NOT NULL AUTO_INCREMENT,
  `UserID` int(11) NOT NULL,
  `CopiaID` int(11) NOT NULL,
  `Fecha_Inicio` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
  `Fecha_Fin` date NOT NULL,
  PRIMARY KEY (`ReserveID`)
) ENGINE=MyISAM  DEFAULT CHARSET=utf8 AUTO_INCREMENT=9 ;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `Sanciones`
--

CREATE TABLE IF NOT EXISTS `Sanciones` (
  `WarnID` int(11) NOT NULL AUTO_INCREMENT,
  `LoanID` int(11) NOT NULL,
  `Descripcion` text NOT NULL,
  `Fecha_Inicio` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP,
  `Fecha_Fin` date NOT NULL,
  PRIMARY KEY (`WarnID`)
) ENGINE=MyISAM  DEFAULT CHARSET=utf8 AUTO_INCREMENT=4 ;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `Temas`
--

CREATE TABLE IF NOT EXISTS `Temas` (
  `TemaID` int(11) NOT NULL AUTO_INCREMENT,
  `Tema` varchar(20) NOT NULL,
  PRIMARY KEY (`TemaID`)
) ENGINE=MyISAM  DEFAULT CHARSET=utf8 AUTO_INCREMENT=14 ;

--
-- Volcado de datos para la tabla `Temas`
--

INSERT INTO `Temas` (`TemaID`, `Tema`) VALUES
(1, 'Aventura'),
(2, 'Biografia'),
(3, 'Ciencia Ficcion'),
(4, 'Novela'),
(5, 'Poesía'),
(11, 'Informática'),
(12, 'Sistemas Operativos'),
(13, 'Linux');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `Temas_Libros`
--

CREATE TABLE IF NOT EXISTS `Temas_Libros` (
  `Id` int(11) NOT NULL AUTO_INCREMENT,
  `BookID` int(11) NOT NULL,
  `TemaID` int(11) NOT NULL,
  PRIMARY KEY (`Id`)
) ENGINE=MyISAM  DEFAULT CHARSET=utf8 AUTO_INCREMENT=21 ;

--
-- Volcado de datos para la tabla `Temas_Libros`
--

INSERT INTO `Temas_Libros` (`Id`, `BookID`, `TemaID`) VALUES
(20, 10, 3);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `Usuarios`
--

CREATE TABLE IF NOT EXISTS `Usuarios` (
  `UserID` int(11) NOT NULL AUTO_INCREMENT,
  `Username` varchar(15) NOT NULL,
  `Password` varchar(40) NOT NULL,
  `Nombre` varchar(20) NOT NULL,
  `Apellidos` varchar(60) NOT NULL,
  `Dni` varchar(10) NOT NULL,
  `Direccion` varchar(100) NOT NULL,
  `Email` varchar(100) NOT NULL,
  `Fecha_Registro` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP,
  `Active` tinyint(1) NOT NULL DEFAULT '1',
  `bolLogged` tinyint(1) NOT NULL,
  PRIMARY KEY (`UserID`)
) ENGINE=MyISAM  DEFAULT CHARSET=utf8 AUTO_INCREMENT=15 ;

--
-- Volcado de datos para la tabla `Usuarios`
--

INSERT INTO `Usuarios` (`UserID`, `Username`, `Password`, `Nombre`, `Apellidos`, `Dni`, `Direccion`, `Email`, `Fecha_Registro`, `Active`, `bolLogged`) VALUES
(4, 'toteisla', '478800a2b4584bf72f54d1978cd0a206eab32208', 'Francisco', 'Cancelo Garcia', '49074093M', 'francisco ruiz miguel', 'toteisla@gmail.com', '2012-05-15 14:14:33', 1, 0),
(14, 'alastor', '7c222fb2927d828af22f592134e8932480637c0d', 'Francisco', 'Cancelo Garcia', '49074093M', 'avenida puente zuazo', 'alastor@gmail.com', '2012-06-13 20:00:13', 1, 0);

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
