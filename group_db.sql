-- phpMyAdmin SQL Dump
-- version 4.7.4
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Jun 12, 2018 at 04:05 AM
-- Server version: 10.1.28-MariaDB
-- PHP Version: 7.1.11

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `group_db`
--

-- --------------------------------------------------------

--
-- Table structure for table `caseworkerdata`
--

CREATE TABLE `caseworkerdata` (
  `id` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Table structure for table `clientcoursedata`
--

CREATE TABLE `clientcoursedata` (
  `id` int(11) NOT NULL,
  `industry` varchar(50) NOT NULL,
  `course` varchar(50) NOT NULL,
  `clientID` int(15) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `clientcoursedata`
--

INSERT INTO `clientcoursedata` (`id`, `industry`, `course`, `clientID`) VALUES
(1, 'IT', 'Software', 2);

-- --------------------------------------------------------

--
-- Table structure for table `clientusage`
--

CREATE TABLE `clientusage` (
  `id` int(11) NOT NULL,
  `date` date DEFAULT NULL,
  `firstname` varchar(25) DEFAULT NULL,
  `lastname` varchar(25) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `clientusage`
--

INSERT INTO `clientusage` (`id`, `date`, `firstname`, `lastname`) VALUES
(3, '2018-06-11', 'Connor', 'Aitken'),
(4, '2018-06-11', 'Admin', 'Guy'),
(5, '2018-06-11', 'Connor', 'Aitken'),
(6, '2018-06-11', 'Admin', 'Guy'),
(7, '2018-06-11', 'Admin', 'Guy'),
(8, '2018-06-11', 'Admin', 'Guy'),
(9, '2018-06-11', 'Admin', 'Guy'),
(10, '2018-06-12', 'Admin', 'Guy');

-- --------------------------------------------------------

--
-- Table structure for table `courses`
--

CREATE TABLE `courses` (
  `idCourses` varchar(15) NOT NULL,
  `Title` varchar(45) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Table structure for table `courses_has_courses`
--

CREATE TABLE `courses_has_courses` (
  `Courses_idCourses` varchar(15) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Table structure for table `industry`
--

CREATE TABLE `industry` (
  `id` int(11) NOT NULL,
  `Title` varchar(45) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Table structure for table `job`
--

CREATE TABLE `job` (
  `Id` int(11) NOT NULL,
  `Title` varchar(45) NOT NULL,
  `Industry_id` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Table structure for table `temp`
--

CREATE TABLE `temp` (
  `id` int(11) NOT NULL,
  `username` varchar(25) DEFAULT NULL,
  `password` varchar(25) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `temp`
--

INSERT INTO `temp` (`id`, `username`, `password`) VALUES
(1, 'admin', 'pass');

-- --------------------------------------------------------

--
-- Table structure for table `units`
--

CREATE TABLE `units` (
  `idUnits` varchar(15) NOT NULL,
  `Title` varchar(45) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Table structure for table `usercaseworker`
--

CREATE TABLE `usercaseworker` (
  `id` int(11) NOT NULL,
  `username` varchar(25) DEFAULT NULL,
  `password` varchar(25) DEFAULT NULL,
  `firstname` varchar(25) DEFAULT NULL,
  `lastname` varchar(25) DEFAULT NULL,
  `email` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `usercaseworker`
--

INSERT INTO `usercaseworker` (`id`, `username`, `password`, `firstname`, `lastname`, `email`) VALUES
(1, 'jsmith', 'pass', 'John', 'Smith', 'jsmith@email.com');

-- --------------------------------------------------------

--
-- Table structure for table `userclient`
--

CREATE TABLE `userclient` (
  `id` int(11) NOT NULL,
  `username` varchar(100) DEFAULT NULL,
  `password` varchar(100) DEFAULT NULL,
  `firstname` varchar(100) DEFAULT NULL,
  `lastname` varchar(100) DEFAULT NULL,
  `age` int(11) DEFAULT NULL,
  `email` varchar(50) NOT NULL,
  `contactNo` varchar(50) NOT NULL,
  `address` varchar(50) NOT NULL,
  `guardianName` varchar(50) NOT NULL,
  `guardianContact` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `userclient`
--

INSERT INTO `userclient` (`id`, `username`, `password`, `firstname`, `lastname`, `age`, `email`, `contactNo`, `address`, `guardianName`, `guardianContact`) VALUES
(1, 'admin', 'pass', 'Admin', 'Guy', 100, '', '', '', '', ''),
(2, 'connor', 'pass', 'Connor', 'Aitken', 18, 'email@email.com', '0412345678', 'Address Drive', 'Mary Little', '0418655678');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `caseworkerdata`
--
ALTER TABLE `caseworkerdata`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `clientcoursedata`
--
ALTER TABLE `clientcoursedata`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `clientusage`
--
ALTER TABLE `clientusage`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `courses`
--
ALTER TABLE `courses`
  ADD PRIMARY KEY (`idCourses`);

--
-- Indexes for table `courses_has_courses`
--
ALTER TABLE `courses_has_courses`
  ADD PRIMARY KEY (`Courses_idCourses`),
  ADD KEY `fk_Courses_has_Courses_Courses1_idx` (`Courses_idCourses`);

--
-- Indexes for table `industry`
--
ALTER TABLE `industry`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `job`
--
ALTER TABLE `job`
  ADD PRIMARY KEY (`Id`,`Industry_id`),
  ADD KEY `fk_Job_Industry1_idx` (`Industry_id`);

--
-- Indexes for table `temp`
--
ALTER TABLE `temp`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `units`
--
ALTER TABLE `units`
  ADD PRIMARY KEY (`idUnits`);

--
-- Indexes for table `usercaseworker`
--
ALTER TABLE `usercaseworker`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `userclient`
--
ALTER TABLE `userclient`
  ADD PRIMARY KEY (`id`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `caseworkerdata`
--
ALTER TABLE `caseworkerdata`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT for table `clientcoursedata`
--
ALTER TABLE `clientcoursedata`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=2;

--
-- AUTO_INCREMENT for table `clientusage`
--
ALTER TABLE `clientusage`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=11;

--
-- AUTO_INCREMENT for table `industry`
--
ALTER TABLE `industry`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT for table `job`
--
ALTER TABLE `job`
  MODIFY `Id` int(11) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT for table `temp`
--
ALTER TABLE `temp`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=2;

--
-- AUTO_INCREMENT for table `usercaseworker`
--
ALTER TABLE `usercaseworker`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=2;

--
-- AUTO_INCREMENT for table `userclient`
--
ALTER TABLE `userclient`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=3;

--
-- Constraints for dumped tables
--

--
-- Constraints for table `courses_has_courses`
--
ALTER TABLE `courses_has_courses`
  ADD CONSTRAINT `fk_Courses_has_Courses_Courses1` FOREIGN KEY (`Courses_idCourses`) REFERENCES `courses` (`idCourses`) ON DELETE NO ACTION ON UPDATE NO ACTION;

--
-- Constraints for table `job`
--
ALTER TABLE `job`
  ADD CONSTRAINT `fk_Job_Industry1` FOREIGN KEY (`Industry_id`) REFERENCES `industry` (`id`) ON DELETE NO ACTION ON UPDATE NO ACTION;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
