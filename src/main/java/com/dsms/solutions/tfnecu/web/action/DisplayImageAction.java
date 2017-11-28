/**
 * 
 */
package com.dsms.solutions.tfnecu.web.action;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.dsms.solutions.tfnecu.common.MyImageDetails;
import com.dsms.solutions.tfnecu.impl.ImageServiceImpl;
import com.dsms.solutions.tfnecu.service.ImageService;

/**
 * @author Babu
 *
 */
@Controller
@RequestMapping("/displayImage.spring")
public class DisplayImageAction {

	private static Logger LOGGER = LoggerFactory.getLogger(DisplayImageAction.class);
	ImageService imageService = new ImageServiceImpl();

	@RequestMapping(method = RequestMethod.POST)
	public String getSearchedImage(HttpServletRequest request, HttpServletResponse response) {
		String searchCondition = request.getParameter("searchCondition");
		LOGGER.debug("inside getSearchedImage method");
		LOGGER.debug("searchCondition is {}", searchCondition);
		if (null != searchCondition) {
			List<MyImageDetails> imageList = (List<MyImageDetails>) imageService.fetchImage(searchCondition);
		}
		return null;

	}
}
