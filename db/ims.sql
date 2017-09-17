-- phpMyAdmin SQL Dump
-- version 4.6.5.2
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Sep 17, 2017 at 07:17 PM
-- Server version: 10.1.21-MariaDB
-- PHP Version: 5.6.30

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `ims`
--

-- --------------------------------------------------------

--
-- Table structure for table `applicationmodule`
--

CREATE TABLE `applicationmodule` (
  `Id` bigint(20) NOT NULL,
  `ModuleName` varchar(255) NOT NULL,
  `Description` text,
  `IsActive` tinyint(1) NOT NULL,
  `CreatedBy` bigint(20) DEFAULT NULL,
  `CreatedOn` datetime DEFAULT NULL,
  `ModifiedBy` bigint(20) DEFAULT NULL,
  `ModifiedOn` datetime DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Table structure for table `pages`
--

CREATE TABLE `pages` (
  `Id` bigint(20) NOT NULL,
  `Name` varchar(255) NOT NULL,
  `URL` text NOT NULL,
  `ModuleId` bigint(20) NOT NULL,
  `IsActive` tinyint(1) NOT NULL,
  `CreatedBy` bigint(20) DEFAULT NULL,
  `CreatedOn` datetime DEFAULT NULL,
  `ModifiedBy` bigint(20) DEFAULT NULL,
  `ModifiedOn` datetime DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Table structure for table `profile`
--

CREATE TABLE `profile` (
  `Id` bigint(20) NOT NULL,
  `FirstName` varchar(255) NOT NULL,
  `MiddleName` varchar(255) DEFAULT NULL,
  `LastName` varchar(255) NOT NULL,
  `EmailId` varchar(512) NOT NULL,
  `Gender` varchar(50) NOT NULL,
  `MarritalStatus` varchar(255) DEFAULT NULL,
  `MobileNo` varchar(12) NOT NULL,
  `CreatedBy` bigint(20) DEFAULT NULL,
  `CreatedOn` datetime DEFAULT NULL,
  `ModifiedBy` bigint(20) DEFAULT NULL,
  `ModifiedOn` datetime DEFAULT NULL,
  `IsActive` tinyint(1) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Table structure for table `role`
--

CREATE TABLE `role` (
  `Id` bigint(20) NOT NULL,
  `Name` varchar(255) NOT NULL,
  `Description` text,
  `IsActive` tinyint(1) NOT NULL,
  `CreatedBy` bigint(20) DEFAULT NULL,
  `CreatedOn` datetime DEFAULT NULL,
  `ModifiedBy` bigint(20) DEFAULT NULL,
  `ModifiedOn` datetime DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Table structure for table `roleaccess`
--

CREATE TABLE `roleaccess` (
  `RoleId` bigint(20) NOT NULL,
  `PageId` bigint(20) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Table structure for table `user`
--

CREATE TABLE `user` (
  `Id` bigint(20) NOT NULL,
  `UserName` varchar(255) NOT NULL,
  `Password` varchar(255) NOT NULL,
  `IsActive` tinyint(1) NOT NULL,
  `IsLocked` tinyint(1) DEFAULT NULL,
  `LastSuccessfulLogin` datetime DEFAULT NULL,
  `LoginFailureAttempt` int(11) DEFAULT NULL,
  `LastLoginFailed` datetime DEFAULT NULL,
  `LockedDate` datetime DEFAULT NULL,
  `PasswordResetDate` datetime DEFAULT NULL,
  `PasswordExpiredDate` datetime DEFAULT NULL,
  `IsAccountExpired` tinyint(1) DEFAULT NULL,
  `CreatedBy` bigint(20) DEFAULT NULL,
  `CreatedOn` datetime DEFAULT NULL,
  `ModifiedBy` bigint(20) DEFAULT NULL,
  `ModifiedOn` datetime DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Table structure for table `userinrole`
--

CREATE TABLE `userinrole` (
  `UserId` bigint(20) NOT NULL,
  `RoleId` bigint(20) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Table structure for table `userprofile`
--

CREATE TABLE `userprofile` (
  `UserId` bigint(20) NOT NULL,
  `ProfileId` bigint(20) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Indexes for dumped tables
--

--
-- Indexes for table `applicationmodule`
--
ALTER TABLE `applicationmodule`
  ADD PRIMARY KEY (`Id`);

--
-- Indexes for table `pages`
--
ALTER TABLE `pages`
  ADD PRIMARY KEY (`Id`);

--
-- Indexes for table `profile`
--
ALTER TABLE `profile`
  ADD PRIMARY KEY (`Id`),
  ADD UNIQUE KEY `MobileNo` (`MobileNo`);

--
-- Indexes for table `role`
--
ALTER TABLE `role`
  ADD PRIMARY KEY (`Id`),
  ADD UNIQUE KEY `Name` (`Name`);

--
-- Indexes for table `user`
--
ALTER TABLE `user`
  ADD PRIMARY KEY (`Id`),
  ADD UNIQUE KEY `UserName` (`UserName`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `applicationmodule`
--
ALTER TABLE `applicationmodule`
  MODIFY `Id` bigint(20) NOT NULL AUTO_INCREMENT;
--
-- AUTO_INCREMENT for table `pages`
--
ALTER TABLE `pages`
  MODIFY `Id` bigint(20) NOT NULL AUTO_INCREMENT;
--
-- AUTO_INCREMENT for table `profile`
--
ALTER TABLE `profile`
  MODIFY `Id` bigint(20) NOT NULL AUTO_INCREMENT;
--
-- AUTO_INCREMENT for table `role`
--
ALTER TABLE `role`
  MODIFY `Id` bigint(20) NOT NULL AUTO_INCREMENT;
--
-- AUTO_INCREMENT for table `user`
--
ALTER TABLE `user`
  MODIFY `Id` bigint(20) NOT NULL AUTO_INCREMENT;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
