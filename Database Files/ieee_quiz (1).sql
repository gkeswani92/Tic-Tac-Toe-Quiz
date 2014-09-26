-- phpMyAdmin SQL Dump
-- version 3.4.10.1
-- http://www.phpmyadmin.net
--
-- Host: localhost
-- Generation Time: Sep 16, 2012 at 04:39 AM
-- Server version: 5.1.59
-- PHP Version: 5.3.10

SET SQL_MODE="NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;

--
-- Database: `ieee_quiz`
--

-- --------------------------------------------------------

--
-- Table structure for table `abbr`
--

CREATE TABLE IF NOT EXISTS `abbr` (
  `question` varchar(1000) NOT NULL,
  `answer` varchar(100) NOT NULL,
  `flag` int(11) NOT NULL,
  PRIMARY KEY (`flag`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `abbr`
--

INSERT INTO `abbr` (`question`, `answer`, `flag`) VALUES
('UNICEF', 'United Nations International  Children’s  Emergency Fund', 0),
('TOEFL', 'Test Of English as a Foreign Language ', 1),
('https', 'Hyper Text  Transfer Protocol Secure', 2),
('SARS', 'Severe Acute Respiratory Syndrome ', 3),
('IPS', 'Intrusion Prevention System', 4);

-- --------------------------------------------------------

--
-- Table structure for table `countries`
--

CREATE TABLE IF NOT EXISTS `countries` (
  `question` varchar(1000) NOT NULL,
  `answer` varchar(100) NOT NULL,
  `flag` int(11) NOT NULL,
  PRIMARY KEY (`flag`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `countries`
--

INSERT INTO `countries` (`question`, `answer`, `flag`) VALUES
('Land of rising sun: Japan :: Rooftop of world:', 'Tibet.', 0),
('If you are in a country where St. Patrick?s day is regarded as national day , You are in which country?', 'Ireland.', 1),
('Ruble is currency of?', 'Russia.', 2),
('People ethnic to this country are called Dutch?', 'Netherlands', 3),
('Land of lakes?', 'Finland', 4);

-- --------------------------------------------------------

--
-- Table structure for table `gadgets`
--

CREATE TABLE IF NOT EXISTS `gadgets` (
  `question` varchar(1000) NOT NULL,
  `answer` varchar(100) NOT NULL,
  `flag` int(11) NOT NULL,
  PRIMARY KEY (`flag`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `gadgets`
--

INSERT INTO `gadgets` (`question`, `answer`, `flag`) VALUES
('How many iPhone''s have been launched till date?', '6', 0),
('What was the verdict of the Apple vs Samsung case in Korea?', 'Both companies product''s were banned', 1),
('Which was the world''s first ever Android phone?', 'T-Mobile G1', 2),
('What is the full form of RIM (Blackberry)?', 'Research in Motion', 3),
('With the iPhone 4 and 4S having 8MP cameras, what is that of the iPhone 5?', '8MP', 4);

-- --------------------------------------------------------

--
-- Table structure for table `movies`
--

CREATE TABLE IF NOT EXISTS `movies` (
  `question` varchar(100) NOT NULL,
  `answer` varchar(50) NOT NULL,
  `flag` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `movies`
--

INSERT INTO `movies` (`question`, `answer`, `flag`) VALUES
('Which actress made her debut in the film "Rocket Singh-Salesman of the year"?', 'Shazahn Padamsee', 2),
('With whom is kajol''s marriage fixed in the movie Dilwale dulhaniya le jayenge?', 'Parmeet Sethi', 0),
('Which 1990''s movies had the tagline Someone Somewhere Is Made For You', 'Dil toh pagal hai', 1),
('Which Jim Carrey film has the tagline He''s got the power? ', 'Bruce Almighty', 3),
('In Mr. and Mrs. Khiladi, who plays the role of Mrs khiladi', 'Juhi Chawla', 4);

-- --------------------------------------------------------

--
-- Table structure for table `mumbai`
--

CREATE TABLE IF NOT EXISTS `mumbai` (
  `question` varchar(1000) NOT NULL,
  `answer` varchar(100) NOT NULL,
  `flag` int(11) NOT NULL,
  PRIMARY KEY (`flag`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `mumbai`
--

INSERT INTO `mumbai` (`question`, `answer`, `flag`) VALUES
('The first metro line in Mumbai will run from?', 'Vesova-Andheri-Ghatkopar', 0),
('Name of forest reserve within the limits of Mumbai?', 'SGNP', 1),
('It is a clock tower in South Mumbai. It is located in the confines of fort campus of university of Mumbai. ', 'Rajabai clock tower', 2),
('Name of goddess on whose name Mumbai is kept?', 'Mumba Devi', 3),
('The security of Mumbai is in the hands of which division of military?', 'Western naval command.', 4);

-- --------------------------------------------------------

--
-- Table structure for table `olympics`
--

CREATE TABLE IF NOT EXISTS `olympics` (
  `question` varchar(100) NOT NULL,
  `answer` varchar(50) NOT NULL,
  `flag` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `olympics`
--

INSERT INTO `olympics` (`question`, `answer`, `flag`) VALUES
('Which country secured a gold medal in football (men’s) at London 2012?', 'Mexico', 0),
('2008 Summer Olympic Games was hosted by which country? ', 'China', 1),
('Which medal did Saina Nehwal win at London 2012?', 'Bronze', 2),
('Which country secured silver in basketball at London 2012???', 'Spain', 3);

-- --------------------------------------------------------

--
-- Table structure for table `sports`
--

CREATE TABLE IF NOT EXISTS `sports` (
  `question` varchar(100) NOT NULL,
  `answer` varchar(50) NOT NULL,
  `flag` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `sports`
--

INSERT INTO `sports` (`question`, `answer`, `flag`) VALUES
('Who was the 1st cricketer to be given out by the 3rd umpire? ', 'Sachin Tendulkar', 0),
('Which city hosts the F1 race at night?', 'Singapore', 1),
('2022 cricket world cup would be co-hosted by which nations?', 'India, Sri Lanka and Bangladesh', 3),
('Who is the youngest driver to be F1 world champion?', 'Sebastian vettel', 4),
('Kagawa who joined Manchester united, previously played for which club?', 'Borussia Dortmund', 4);

-- --------------------------------------------------------

--
-- Table structure for table `television`
--

CREATE TABLE IF NOT EXISTS `television` (
  `question` varchar(100) NOT NULL,
  `answer` varchar(50) NOT NULL,
  `flag` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `television`
--

INSERT INTO `television` (`question`, `answer`, `flag`) VALUES
('Which is the show in which Shah Rukh Khan made his debut?', 'Fauji', 0),
('What is the real name of the man who played the role of Shaktiman? ', 'Mukesh Khanna', 1),
('What is the Real name of Sheldon cooper from the American series The Big Bang theory?', 'Jim Parsons ', 2),
('Which tvshow did Shekhar Suman host which was on the lines of tonight show with jay leno?', 'Movers and Shakers', 3),
('Which american tv show did actor Anil kapoor gave his guest appearance?', '24', 4);

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
