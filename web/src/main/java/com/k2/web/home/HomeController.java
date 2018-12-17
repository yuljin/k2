/**
 * @(#) HomeController.class 1.0.0 2018. 12. 17.
 *
 * Copyright 2018 NAVER Corp. All rights Reserved.
 * NAVER PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
 */
package com.k2.web.home;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author jeongin Kim (kim.jeongin@navercorp.com)
 */
@RestController
public class HomeController {


	@GetMapping("/")
	public String home() {
		return "success";
	}
}
