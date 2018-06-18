-- phpMyAdmin SQL Dump
-- version 4.7.4
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Jun 18, 2018 at 05:12 AM
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
(1, 'IT', 'Software Development', 2),
(2, 'IT', 'Hardware', 3),
(10, 'Admin', 'Admin', 1),
(14, 'IT', 'Software Development', 4);

-- --------------------------------------------------------

--
-- Table structure for table `clientunitdata`
--

CREATE TABLE `clientunitdata` (
  `id` int(11) NOT NULL,
  `units` varchar(50) DEFAULT NULL,
  `date` varchar(50) DEFAULT NULL,
  `result` varchar(10) DEFAULT NULL,
  `note` varchar(100) DEFAULT NULL,
  `clientID` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `clientunitdata`
--

INSERT INTO `clientunitdata` (`id`, `units`, `date`, `result`, `note`, `clientID`) VALUES
(1, 'test', '2018-06-11', 'A++', 'Test note 123', 2),
(2, 'testunit', 'testdate', 'F-', 'Test note ', 1),
(3, 'test123', '2018-06-11', 'A++', 'Test note 123', 2),
(5, 'ICT50715', '2018-06-18', 'S', 'Completed first try', 2),
(10, 'ICTSAD502', '2018-06-15', 'S', 'Well Done', 2),
(12, 'testUnit123', '2018-06-06', 'F', 'test note', 1),
(14, 'adadas', 'asdad', 'asdad', 'asdad', 1),
(16, 'gdfgd', 'dgfdg', 'v', 'sdff', 1),
(18, 'hdfdfhdfh', 'dfhdh', 'dfv', 'dvdvd', 1),
(21, 'hfghfh', 'fhfh', 'fhf', 'hfffgh', 1),
(23, 'hfgfhf', 'fhgfhf', 'fghfhf', 'fhfhfg', 1);

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
(10, '2018-06-12', 'Admin', 'Guy'),
(11, '2018-06-14', 'Admin', 'Guy'),
(12, '2018-06-14', 'Admin', 'Guy'),
(13, '2018-06-15', 'Connor', 'Aitken'),
(14, '2018-06-15', 'Admin', 'Guy'),
(15, '2018-06-15', 'Admin', 'Guy'),
(16, '2018-06-15', 'Admin', 'Guy'),
(17, '2018-06-15', 'Admin', 'Guy'),
(18, '2018-06-15', 'Admin', 'Guy'),
(19, '2018-06-15', 'Admin', 'Guy'),
(20, '2018-06-15', 'Admin', 'Guy'),
(21, '2018-06-15', 'Connor', 'Aitken'),
(22, '2018-06-15', 'Admin', 'Guy'),
(23, '2018-06-18', 'Connor', 'Aitken'),
(24, '2018-06-18', 'Admin', 'Guy'),
(25, '2018-06-18', 'Admin', 'Guy'),
(26, '2018-06-18', 'Connor', 'Aitken'),
(27, '2018-06-18', 'Connor', 'Aitken'),
(28, '2018-06-18', 'Connor', 'Aitken'),
(29, '2018-06-18', 'Connor', 'Aitken'),
(30, '2018-06-18', 'Connor', 'Aitken'),
(31, '2018-06-18', 'Connor', 'Aitken'),
(32, '2018-06-18', 'Connor', 'Aitken'),
(33, '2018-06-18', 'Connor', 'Aitken'),
(34, '2018-06-18', 'Connor', 'Aitken'),
(35, '2018-06-18', 'Connor', 'Aitken'),
(36, '2018-06-18', 'Connor', 'Aitken');

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
  `email` varchar(50) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `usercaseworker`
--

INSERT INTO `usercaseworker` (`id`, `username`, `password`, `firstname`, `lastname`, `email`) VALUES
(1, 'jsmith', 'pass', 'John', 'Smith', 'jsmith@email.com.au'),
(2, 'dhunt', 'pass', 'David', 'Hunt', 'dhunt@email.com.au');

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
  `email` varchar(50) DEFAULT NULL,
  `contactNo` varchar(50) DEFAULT NULL,
  `address` varchar(50) DEFAULT NULL,
  `guardianName` varchar(50) DEFAULT NULL,
  `guardianContact` varchar(50) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `userclient`
--

INSERT INTO `userclient` (`id`, `username`, `password`, `firstname`, `lastname`, `age`, `email`, `contactNo`, `address`, `guardianName`, `guardianContact`) VALUES
(1, 'admin', 'pass', 'Admin', 'Guy', 100, 'N/A', 'N/A', 'N/A', 'N/A', 'N/A'),
(2, 'connor', 'pass', 'Connor', 'Aitken', 18, 'connor@email.com', 'N/A', 'Somewhere Street', 'Bill', 'N/A'),
(3, 'wick', 'pass', 'John', 'Wick', 40, 'N/A', 'N/A', 'N/A', 'N/A', 'N/A'),
(4, 'bill', 'pass', 'Bill', 'Smith', 45, 'bill@email.com', 'N/A', 'N/A', 'N/A', 'N/A');

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
  ADD PRIMARY KEY (`id`),
  ADD UNIQUE KEY `clientID` (`clientID`),
  ADD UNIQUE KEY `clientID_2` (`clientID`);

--
-- Indexes for table `clientunitdata`
--
ALTER TABLE `clientunitdata`
  ADD PRIMARY KEY (`id`),
  ADD UNIQUE KEY `units` (`units`);

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
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=22;

--
-- AUTO_INCREMENT for table `clientunitdata`
--
ALTER TABLE `clientunitdata`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=25;

--
-- AUTO_INCREMENT for table `clientusage`
--
ALTER TABLE `clientusage`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=37;

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
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT for table `usercaseworker`
--
ALTER TABLE `usercaseworker`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=3;

--
-- AUTO_INCREMENT for table `userclient`
--
ALTER TABLE `userclient`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=5;

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
