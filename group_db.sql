-- phpMyAdmin SQL Dump
-- version 4.7.9
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Jun 10, 2018 at 10:51 AM
-- Server version: 10.1.31-MariaDB
-- PHP Version: 7.2.3

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
  `id` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Table structure for table `clientquestions`
--

CREATE TABLE `clientquestions` (
  `id` int(11) NOT NULL,
  `firstname` varchar(25) DEFAULT NULL,
  `lastname` varchar(25) DEFAULT NULL,
  `client_email` varchar(50) DEFAULT NULL,
  `guardian_name` varchar(25) NOT NULL DEFAULT 'N/A',
  `guardian_email` varchar(50) NOT NULL DEFAULT 'N/A'
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
(1, 'jsmith', 'pass', 'John', 'Smith', 'jsmith@email.com'),
(2, 'jdoe', 'pass', 'Jane', 'Doe', 'jdoe@email.com');

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
  `age` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `userclient`
--

INSERT INTO `userclient` (`id`, `username`, `password`, `firstname`, `lastname`, `age`) VALUES
(1, 'admin', 'pass', 'Admin', 'Guy', 100),
(2, 'connor', 'pass', 'Connor', 'Aitken', 18);

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
-- Indexes for table `clientquestions`
--
ALTER TABLE `clientquestions`
  ADD PRIMARY KEY (`id`);

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
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT for table `clientquestions`
--
ALTER TABLE `clientquestions`
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
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=3;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
