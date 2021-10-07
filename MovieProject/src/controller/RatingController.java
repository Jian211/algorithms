package controller;

import java.util.ArrayList;
import java.util.Random;

import model.RatingDTO;

public class RatingController {
	private RatingDTO ratingDTO;
	private int nextId;
	private static ArrayList<RatingDTO> ratingList;
	
	public void ratingConnection() {
		ratingDTO = new RatingDTO();
		ratingList = new ArrayList<>();
		nextId = 1;
		
		ratingDTO.setMovieId(1);
		ratingDTO.setId(0);
		ratingDTO.setReviewerRating(randomNum());
		
		ratingList.add(ratingDTO);
		
		for (int i = 2; i <= 9; i++) {
			ratingDTO.setMovieId(i);
			ratingDTO.setId(nextId++);
			ratingDTO.setUserRating(randomNum());
			
			ratingList.add(ratingDTO);
		}
	}
	public void show(int movieId){
		ArrayList<RatingDTO> idList = new ArrayList<>();
		for(RatingDTO r : ratingList) {
			if(r.getId() == movieId) {
				idList.add(r);
			}
		}
		
		for (int i = 0; i < idList.size(); i++) {
			System.out.println(idList.get(i).getUserRating());
		}
	}
	
	public double ratingAvg() {
		
		
		return 0.1;
	}
	
	public int randomNum() {
		Random random = new Random();
		return random.nextInt(5);
	}
	
	public void setRating(RatingDTO temp) {
		ratingList.add(temp);
	}
	
	public RatingDTO selectOne(int movieId) {
		RatingDTO temp = new RatingDTO();
		for(RatingDTO r : ratingList) {
			if(r.getMovieId() == movieId) {
				temp = r;
			}
		}
		return temp;
	}
	
	public int getReviewerRating(int movieId) {
		RatingDTO ratingDTO = ratingList.get(movieId);
		return ratingDTO.getReviewerRating();
	}

	public int getUserRating(int movieId) {
		RatingDTO temp = selectOne(movieId);
		return temp.getUserRating();
	}
	
	public void addUserRating(int movieId, int loggerId, int rating) {
		RatingDTO temp = new RatingDTO();
		temp.setId(nextId++);
		temp.setMovieId(movieId);
		temp.setWriterId(loggerId);
		temp.setUserRating(rating);
		
		ratingList.add(temp);
	}
}
