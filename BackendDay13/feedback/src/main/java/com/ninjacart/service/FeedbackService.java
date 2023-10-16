package com.ninjacart.service;

import java.util.List;

import com.ninjacart.dto.request.FeedbackRequest;
import com.ninjacart.dto.response.FeedbackResponse;

public interface FeedbackService {

    boolean saveFeedback(FeedbackRequest request);

    List<FeedbackResponse> getFeedbacks();

}