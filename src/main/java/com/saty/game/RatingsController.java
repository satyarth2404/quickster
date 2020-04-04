package com.saty.game;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;
import java.util.List;
import edu.stanford.nlp.pipeline.CoreDocument;
import edu.stanford.nlp.pipeline.CoreSentence;
import edu.stanford.nlp.pipeline.StanfordCoreNLP;

@RestController
public class RatingsController {
	
	@GetMapping("rate")
	public ModelAndView getRatings(@RequestParam("review") String review) {
		ModelAndView mv = new ModelAndView("result");
		StanfordCoreNLP stanfordCoreNLP = Pipeline.getPipeline();
		CoreDocument coreDocument = new CoreDocument(review);
		stanfordCoreNLP.annotate(coreDocument);
		List<CoreSentence> sentences = coreDocument.sentences();
		int pos = 0, neg = 0, ntr = 0,totalSentence = 0;
		for(CoreSentence sentence: sentences) {
			totalSentence++;
			String sentiment = sentence.sentiment();
			if(sentiment.equalsIgnoreCase("positive"))
				pos++;
			else if(sentiment.equalsIgnoreCase("negative"))
				neg++;
			else
				ntr++;
		}
		double posprob = pos/totalSentence;
		double negprob = neg/totalSentence;
		
		posprob += ntr/2;
		negprob += ntr/2;
		
		String overall = "";
		
		if(posprob > negprob) {
			overall = "positive";
		}
		else if(posprob < negprob) {
			overall = "negative";
		}
		else {
			overall = "neutral";
		}
		mv.addObject("review", overall);
		return mv;
	}
}
