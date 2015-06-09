package cn.system.exception;

import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.HandlerExceptionResolver;
import org.springframework.web.servlet.ModelAndView;

public class ExceptionHandler implements HandlerExceptionResolver {

	public ModelAndView resolveException(HttpServletRequest request,
			HttpServletResponse response, Object handler, Exception ex) {
		Map<String, Object> model = new HashMap<String, Object>();
		model.put("ex", ex);
		
		// ���ݲ�ͬ����ת��ͬҳ��
		if(ex instanceof BusinessException) {
			return new ModelAndView("error-business", model);
		}/*else if(ex instanceof ParameterException) {
			return new ModelAndView("error-parameter", model);
		} */
		else {
			return new ModelAndView("error", model);
		}
	}
}