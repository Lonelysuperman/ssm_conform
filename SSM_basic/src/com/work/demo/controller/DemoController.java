/**
 * 
 */
package com.work.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
* @author liC
* @version 创建时间：Mar 17, 2019 8:37:26 PM
* @explain 
* @params
*/
/**
 * @author Thinkpad
 *
 */
@Controller
@RequestMapping("/demo")
public class DemoController {
	
	@RequestMapping("communication")
	public String communication() {
		
		return "comm";
	}
}
