package controller;

import model.user.LoggerDTO;
import model.user.UserDTO;

public class LoggerController {
	private static LoggerDTO loggerDTO;
	
	public void loggerConnection() {
		loggerDTO = new LoggerDTO();
	}
	
	public boolean getLoggerStatus() {
		return loggerDTO.getStatus();
	}
	
	public int getLoggerId() {
		return loggerDTO.getId();
	}
	
	public int getLoggerRang() {
		return loggerDTO.getRank();
	}
	
	public void setLoggerInfo(UserDTO user) {
		loggerDTO.setId(user.getId());
		loggerDTO.setName(user.getName());
		loggerDTO.setNickname(user.getNickname());
		loggerDTO.setPassword(user.getPassword());
		loggerDTO.setRank(user.getRank());
		loggerDTO.setStatus(true);
		
	}
	
	public void say() {
		loggerDTO.toString();
	}
}
